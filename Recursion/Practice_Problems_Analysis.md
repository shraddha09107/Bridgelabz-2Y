# Recursion and Backtracking - Practice Problems Analysis

## Problem 1: Understanding Recursion Mechanics

### a) Recursive function structure (pseudocode)

```text
function totalSize(node, visited):
    if node is null:
        return 0

    if node in visited:          // cycle handling (symbolic links)
        return 0
    add node to visited

    if node is FILE:             // base case
        return node.size

    sum = 0                      // recursive case
    for each child in node.children:
        sum += totalSize(child, visited)
    return sum
```

- Base case: current node is a file, return file size.
- Recursive case: current node is a directory, recursively sum all children.

### b) Execution trace on given structure

Directory:
- project/
  - src/
    - main.java (100)
    - utils.java (50)
  - docs/
    - readme.txt (10)
    - guides/
      - setup.pdf (200)
  - config.xml (20)

Return sequence:
1. totalSize(project)
2. totalSize(src)
3. totalSize(main.java) -> 100
4. totalSize(utils.java) -> 50
5. totalSize(src) returns 150
6. totalSize(docs)
7. totalSize(readme.txt) -> 10
8. totalSize(guides)
9. totalSize(setup.pdf) -> 200
10. totalSize(guides) returns 200
11. totalSize(docs) returns 210
12. totalSize(config.xml) -> 20
13. totalSize(project) returns 380

Final total = 380 KB.

### c) Time complexity

- Let N be total number of files + directories.
- Each node is visited once, so time complexity is O(N).
- Space complexity is O(H) call stack depth in recursion (worst O(N) for skewed tree).

### d) Iterative alternative

Yes, can be solved iteratively using:
- Stack (DFS style), or
- Queue (BFS style)

Comparison:
- Recursive: cleaner and natural for tree-like structures.
- Iterative: avoids deep recursion stack overflow; explicit control over memory.

### e) Symbolic link cycle issue

If symbolic links create cycles, recursion can become infinite.

Fix:
- Track visited directories (by unique path/inode reference).
- Before processing a node, if already visited, skip it.

---

## Problem 2: Backtracking Template Application (Word Puzzle)

Grid:

```text
C A T S
O R E A
D E A M
E L L S
```

Target word: DREAM

### a) Backtracking algorithm design (pseudocode)

```text
function exists(grid, word):
    for each cell (r, c):
        if grid[r][c] == word[0]:
            initialize visited[][] as false
            if dfs(r, c, 0):
                return true
    return false

function dfs(r, c, index):
    if index == word.length:
        return true

    if out of bounds OR visited[r][c] OR grid[r][c] != word[index]:
        return false

    visited[r][c] = true

    for each of 8 directions (including diagonal):
        if dfs(nextR, nextC, index + 1):
            return true

    visited[r][c] = false   // backtrack
    return false
```

- State: (row, col, index, visited)
- Choices: next adjacent cell in 8 directions
- Constraints: bounds, character match, not already used
- Goal: index reaches word length

### b) Decision tree (for DREAM)

Start at D (2,0):
- Try neighbors for R:
  - (1,0)=O -> fail
  - (1,1)=R -> continue (successful branch)

From R (1,1), try E:
- (0,0)=C fail
- (0,1)=A fail
- (1,2)=E continue

From E (1,2), try A:
- (2,2)=A continue

From A (2,2), try M:
- (2,3)=M success

Successful path:
(2,0) -> (1,1) -> (1,2) -> (2,2) -> (2,3)

Backtracking points are every failed neighbor exploration before choosing the successful next cell.

### c) Trace summary

- Choose D at (2,0)
- Mark visited
- Explore neighbors recursively for R
- Several neighbors fail constraints
- Pick valid R, continue to E, then A, then M
- On failures, function returns false and unmarks visited (state restore)
- On success, returns true up call stack

### d) Worst-case complexity

- Grid size = N x M
- Word length = L
- Starting positions = N x M
- Branching factor <= 8

Worst case: O(N * M * 8^L)

(Practical is lower due to pruning and visited constraints.)

### e) Find ALL possible ways

Modify DFS:
- Do not return immediately on first success.
- Store each complete path in a list.

Additional data structure:
- List<List<Cell>> (or list of coordinate paths)

---

## Problem 3: N-Queens Optimization and Variants

### a) Search space estimates for N=8

1. Brute force (any square for each queen):
   64^8 ≈ 2.81 x 10^14 states

2. One queen per row (8 choices each row):
   8^8 = 16,777,216 states

3. Backtracking with constraints:
   Much smaller than 8^8 because invalid partial states are pruned early.
   Typical explored states are in thousands to low millions, not full 8^8.

### b) Optimized design using 1D + diagonals (pseudocode)

```text
queens[row] = col
usedCol[col]
usedDiag1[row - col + (n-1)]   // main diagonal
usedDiag2[row + col]           // anti diagonal

function place(row):
    if row == n:
        record solution
        return

    for col in [0..n-1]:
        d1 = row - col + (n-1)
        d2 = row + col
        if usedCol[col] or usedDiag1[d1] or usedDiag2[d2]:
            continue

        queens[row] = col
        mark col, d1, d2

        place(row + 1)

        unmark col, d1, d2
        queens[row] = -1
```

Why faster:
- O(1) validity checks via boolean arrays.
- Avoid scanning full board for each placement.

### c) Trace for N=4 (first solution)

One first valid solution (0-indexed columns):
- row 0 -> col 1
- row 1 -> col 3
- row 2 -> col 0
- row 3 -> col 2

Board array: [1, 3, 0, 2]

Backtracking occurs when a row has no valid column; then previous row tries next column.
Diagonal arrays flip true/false when placing/removing queens.

### d) Find ONE solution quickly

Changes:
- Use boolean return in recursion.
- As soon as row == n, return true and propagate immediately.
- Stop exploring remaining branches.

### e) Forbidden squares variant

Modification:
- Maintain forbidden[row][col].
- While trying a column, skip if forbidden[row][col] is blocked.

Complexity impact:
- Worst-case remains exponential.
- In practice can reduce branching if many squares are forbidden, or make solution impossible earlier.

---

## Summary Takeaways

- Recursion needs clear base and recursive cases.
- Backtracking = choose -> explore -> undo.
- Constraint checks and pruning are key for performance.
- 1D representation + diagonal arrays significantly optimize N-Queens.
- For production systems, consider recursion depth, cycles, and iterative alternatives where needed.
