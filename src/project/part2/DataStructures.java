package project.part2;

import java.util.HashMap;
import java.util.Stack;

public class DataStructures {

    public static boolean balancedParentheses(String string) {

        // convert string to `char[]` array
        char[] chars = string.toCharArray();

        int leftCount = 0;
        int rightCount = 0;

        // iterate over `char[]` array using enhanced for-loop
        for (char ch: chars) {
            if (ch == '(') {
                leftCount++;
            } else if (ch == ')') {
                rightCount++;
            }
        }

        return leftCount == rightCount;
    }

    public static boolean balancedBrackets (String s){
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put('}', '{');
        bracketPairs.put(']', '[');
        bracketPairs.put('>', '<');
        
        for (int i = 0; i < s.length(); i += 1) {
            if (bracketPairs.containsValue(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (bracketPairs.containsKey(s.charAt(i))) {
                if (stack.isEmpty()) {
                    return false;
                }

                Character mostRecentBracket = stack.pop();
                if (!mostRecentBracket.equals(bracketPairs.get(s.charAt(i)))) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main (String[] args) {
        String moreLeftParentheses = "ab((egh(sd))";
        String moreRightParentheses = "hy((asdsf)sas))";
        String balancedParentheses = "((sdass)fgdf)";
        String onlyParentheses = "((()))";
        String disorderedParentheses = ")()(()))((";

        System.out.println("Balanced when More Left: " + balancedParentheses(moreLeftParentheses));
        System.out.println("Balanced when More Right: " + balancedParentheses(moreRightParentheses));
        System.out.println("Balanced when Balanced: " + balancedParentheses(balancedParentheses));
        System.out.println("Balanced when Only: " + balancedParentheses(onlyParentheses));
        System.out.println("Balanced when Disordered: " + balancedParentheses(disorderedParentheses));


        String balancedAngleBrackets = "<<>>";
        String balancedComboBrackets = "<({})>";
        String mismatchedBrackets = "<({)}>";

        System.out.println("Balanced Brackets Testing: ");
        System.out.println(balancedBrackets(moreLeftParentheses));
        System.out.println(balancedBrackets(moreRightParentheses));
        System.out.println(balancedBrackets(balancedParentheses));
        System.out.println(balancedBrackets(onlyParentheses));
        System.out.println(balancedBrackets(disorderedParentheses));
        System.out.println(balancedBrackets(balancedAngleBrackets));
        System.out.println(balancedBrackets(balancedComboBrackets));
        System.out.println(balancedBrackets(mismatchedBrackets));
    }
}