package objectOrientedPrograming.polymorphisms;

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

      public static void main(String[] args) {
          Parent parent = new Parent();
          Child child = new Child();
          parent.beat();
          parent.beat("belt");
          child.beat("stick");
      }
}
