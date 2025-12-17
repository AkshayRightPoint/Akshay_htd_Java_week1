package objectOrientedPrograming.abstractions;

public class Car implements Vehicle {
    @Override
    public void brandName() {
        System.out.println("Car BRAND ->   BMW");
    }

    @Override
    public void model() {
        System.out.println("Car Model ->   M5");
    }


    public static void main(String[] args){
        Vehicle car = new Car();
        car.brandName();
        car.model();

    }
}
