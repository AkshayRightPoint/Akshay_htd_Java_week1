package com.week1.assignment;

public class ReverseString {
    public static void main(String[] args) {
        String str = "s@$s%g^a"; // ->  output: a@$g%s^s
        //Way 1
        for(int i=str.length()-1; i>=0; i--){
            char reverse = str.charAt(i);
            System.out.print(reverse);
        }
//way2
        String br = new StringBuffer(str).reverse().toString();
        System.out.println("  ");
        System.out.println(br);



    }
}
