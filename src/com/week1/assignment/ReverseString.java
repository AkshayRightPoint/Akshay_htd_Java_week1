package com.week1.assignment;

public class ReverseString {
    public static void main(String[] args) {
        String reverse = "s@$s%g^a"; // ->  output: a@$g%s^s
        char[] reverseCharacter = reverse.toCharArray();
        int left =0; int right = reverseCharacter.length-1;

        while (left<right){
            if(!Character.isLetter(reverseCharacter[left])){
                left++;
            }else if(!Character.isLetter(reverseCharacter[right])){
                right--;
            }else {
                char temp = reverseCharacter[left];
                reverseCharacter[left] = reverseCharacter[right];
                reverseCharacter[right] = temp;
                left++;
                right--;
            }

        }
        System.out.println(new String(reverseCharacter));

    }
}
