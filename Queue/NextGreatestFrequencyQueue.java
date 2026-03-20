import java.util.HashMap;
import java.util.Stack;

public class NextGreatestFrequencyQueue {
    public int[] nextGreatestFrequency(int [] arr){
        int n =arr.length;
        int [] res=new int[n];
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for(int x:arr){
            freqMap.put(x, freqMap.getOrDefault(x,0)+1);

        }
        Stack<Integer> st=new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int currentFreq = freqMap.get(arr[i]);

            while (!st.isEmpty() && freqMap.get(st.peek()) <= currentFreq) {
                st.pop();
            }

            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        NextGreatestFrequencyQueue nfq = new NextGreatestFrequencyQueue();
        int[] arr = {1, 1, 2, 3, 4, 2, 1};
        int[] result = nfq.nextGreatestFrequency(arr);
        System.out.println(java.util.Arrays.toString(result));
    }
}
