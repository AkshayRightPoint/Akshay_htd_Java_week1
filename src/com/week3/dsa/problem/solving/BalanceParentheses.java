package com.week3.dsa.problem.solving;

import java.util.Stack;

public class BalanceParentheses {
    public static void main(String[] args) {
        String parentheses1 = "((a+b)*c)";
        String parentheses2 = "(a+b]*c)";

        String word = "akshay";

        System.out.println( isBalanced(parentheses1) );
        System.out.println( isBalanced(parentheses2) );

        reverseString(word);
    }



    private static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<=expression.length()-1; i++){
            char ch = expression.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if (ch == ')' || ch== '}' || ch==']'){
                char top = stack.pop();
                if(!isMatching(top, ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        return ( open == '(' && close == ')' || open == '{' && close== '}' || open == '[' && close == ']');
    }

    private static void reverseString(String word) {
        Stack<Character> ch = new Stack<>();
        System.out.println("Before Resver -> " + word );
        for(int i=0 ; i<= word.length()-1; i++){
            ch.push(word.charAt(i));
        }

        System.out.println("After Reverse  ->  " );
        while(!ch.isEmpty()){
            System.out.print( ch.pop() + " ") ;
        }

    }
}
