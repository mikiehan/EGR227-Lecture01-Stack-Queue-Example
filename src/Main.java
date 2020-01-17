import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] data = {"four", "score", "and", "seven",
        "years", "ago"};
        Queue<String> q = new LinkedList<>();
        Stack<String> s = new Stack<>();

        for(String d : data){
            q.add(d);
            s.push(d);
        }
        System.out.println("initial queue = " + q);
        System.out.println("initial stack = " + s);

        while(!q.isEmpty()){ //as long as queue is not empty
            System.out.print(q.remove() + ", ");
        }
        System.out.println();

        while(!s.isEmpty()){ //as long as stack is not empty
            System.out.print(s.pop() + ", ");
        }
        System.out.println();
    }

    //useful helper methods
    public static void queueToStack(Queue<String> q, Stack<String> s, int num){
        for(int i = 0 ; i < num ; i++) {
            s.push(q.remove());
        }
    }

    public static void stackToQueue(Stack<String> s, Queue<String> q, int num){
        for(int i = 0 ; i < num ; i++) {
            q.add(s.pop());
        }
    }
}
