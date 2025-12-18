package com.week1.oops.assignment;

public class CountNumberOfObjects {
    static int countObject = 0;

    CountNumberOfObjects(){
        countObject++;
    }

    public static void main(String[] args) {
        CountNumberOfObjects count1 = new CountNumberOfObjects();
        CountNumberOfObjects count2 = new CountNumberOfObjects();
        CountNumberOfObjects count3 = new CountNumberOfObjects();

        System.out.println(" Number of time object created -> " + CountNumberOfObjects.countObject);
    }
}
