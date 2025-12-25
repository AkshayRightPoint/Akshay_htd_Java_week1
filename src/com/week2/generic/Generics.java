package com.week2.generic;

public class Generics {

  /**  Object value;

    void setValue(Object value){
        this.value =value;
    }

    Object getValue(){
        return value;
    }

   // ->   Issue: You must cast, and errors appear at runtime.

    */

  //Class
  static class Student<T> {
        T name;
        void setName(T name){
            this.name = name;
        }

        T getName(){
            return name;
        }
  }

  //Method

    public static <T> void students(T student){
        System.out.println(student);
    }
    public static void main(String[] args) {

        Generics generics = new Generics();
        // System.out.println(generics.getValue());
        Student<String> name = new Student<>();
        name.setName("Akshay");
        System.out.println("NAME -> " + name.getName());


//        Student<Integer> age = new Student<>();
//        age.setName(22);
//
//        System.out.println("AGE -> " + age.getName());

        students("Roll No -> " + 1);
        students("Name -> " + "Akshay");


    }
}
