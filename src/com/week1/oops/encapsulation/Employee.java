package com.week1.oops.encapsulation;

/** Process of wrapping up of data and Methods to a single unit is called Encapsulation
 * Basic here in the class the data is hidden from accessing by different class
 *  it access the data we need to use getter setter.
 *  it can be achived using access modifer private.
 */
public class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setId(1);
        employee.setName("Akshay");
        System.out.println( "Emplyee ID : " + employee.getId() + " , Employee Name:  " + employee.getName());

    }
}
