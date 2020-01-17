import java.util.Stack;
public class ParenthesisMatching {
    public static void main(String[] args) {
        System.out.println(hasMatchingParenthesis(""));
        System.out.println(hasMatchingParenthesis("()"));
        System.out.println(hasMatchingParenthesis("())"));
        System.out.println(hasMatchingParenthesis("(()"));
        System.out.println(hasMatchingParenthesis("(())("));
        System.out.println(hasMatchingParenthesis("(())()()((()))"));
        System.out.println(hasMatchingParenthesis("("));
        System.out.println(hasMatchingParenthesis(")"));
    }

    public static boolean hasMatchingParenthesis(String str){
        //str.length()
        //str.charAt(i)
        Stack<String> s = new Stack<>(); //keep this line!
        return false; //replace this line
    }
}
