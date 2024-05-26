package Fetena;

import java.util.Stack;

public class ReverseArray {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String output = reverseString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}

}
