package Stack;

public class BrowerHistoryNavigation {
        class BrowserHistory {
            String[] history;
            int currentIndex;
            int lastIndex;
            public BrowserHistory(String homepage) {
                history = new String[5000];
                history[0] = homepage;
                currentIndex = 0;
                lastIndex = 0;
            }

            public void visit(String url) {
                currentIndex++;
                history[currentIndex] = url;
                lastIndex = currentIndex;
            }

            public String back(int steps) {
                currentIndex = Math.max(0, currentIndex - steps);
                return history[currentIndex];
            }

            public String forward(int steps) {
                currentIndex = Math.min(lastIndex, currentIndex + steps);
                return history[currentIndex];
            }
        }
}
