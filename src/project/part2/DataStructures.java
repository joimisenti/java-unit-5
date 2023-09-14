package project.part2;

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
    }
}