package com.week1.oops.polymorphism;

/** Polymorphism means having differnt form.
 * can be achived using method overlaoding -> Complie time
 *  Method Overriding -> Runtime
 */
 class Parent {
     public void beat(){   // method chaning(overloading -> same name with different parameter...
        System.out.println("Dad is beating");
    }

    public void beat(String belt){
        System.out.println("Dad is beating with " +belt);
    }

    private void beat(String belt, String scold){
        System.out.println("Dad is beating with" +belt + "and Scolding " +scold);
    }

    public void beat(int days, float marks){
        System.out.println("Dad kept on beating his child for " +days + " days, for scoring " +marks + " CGPA");
    }

}

  class Child extends Parent{
    @Override
      public void beat(){
        System.out.println("Dad is beating ");
    }

    @Override
      public void beat(String stick){
        System.out.println("Dad is beating with " + stick);
    }

      /** @Override   -> cannot override to subclass as private can be accessed in same class only...
      private void beat(String belt, String scold){

      } */

      @Override
      public void beat(int days, float marks){
          System.out.println("Students dad is calm now and asked to study continues " +
                  days + " days, and set a goal to score CGPA " + marks );
      }

      public static void main(String[] args) {
          Parent parent = new Parent();
          Child child = new Child();
          parent.beat();
          parent.beat("belt");
          child.beat("stick");

          parent.beat(3, 4.0f);
          child.beat(30, 7.0f);
      }
}
