package objectOrientedPrograming.assignment;

class Parent{
    final void show(){
        System.out.println("Avoide overriding the method ");
    }
}

class Child extends Parent{
    /*void show(){
        show()' cannot override 'show()' in 'objectOrientedPrograming.assignment.Parent';
        overridden method is final
    } */
}
public class RestrictOverride {

    public static void main(String[] args) {

    }
}
