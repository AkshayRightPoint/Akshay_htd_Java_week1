package com.week1.oops.staticdata;
/** Static varaible are the variable with keyword static
 * if not mentioned static its instance class label and method level its non static
 * static to call no need to create a object...
  */

public class Test {
    //static
    static int eId = 10;
    static String name = "Akshay";

    // Instance -> neeed to create a object to call this
    String department = "Development";

    final String COMPANY_NAME = "Right Point ";  // object cannot be modified
   //  company = "Genpact";    < --  Not allowed since final value cannot be modified
    public static void main(String[] args) {
        Test t = new Test();

        System.out.println("Employee Id -> " + eId +  " Employee Name -> " + name + " Department -> " + t.department);

        //final
        System.out.println(t.COMPANY_NAME);
    }
}
