package com.week1.oops.Inheritance;

/** Inheritating or using the property of parents (super class ) into child classes
 *  this can we achived using extend keyword
 */
public class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    static class Dog extends Animal{
        public void bark(){
            System.out.println("Dog is Barking");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
