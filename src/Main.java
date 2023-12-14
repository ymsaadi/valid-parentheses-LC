import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("(("));
    }

    public static boolean isValid(String s) {
        try {
            Stack<Character> stack = new Stack<>();
            Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) {
                    stack.push(s.charAt(i));
                } else {
                    if (map.get(s.charAt(i)) != stack.pop()) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        } catch (Exception e) {
            return false;
        }
    }
}
