package com.week1.oops.assignment;

public class StringIndent {
    public static void main(String[] args) {
        String text = "Line 1\nLine 2\nLine 3";

        String indented = text.indent(4); // Add 4 spaces

        System.out.println("Original:");
        System.out.println(text);
        System.out.println("Indented:");
        System.out.println(indented);
    }
}
