public class Abs {
    public static void main(String[] args) {
        car carr = new car();
        carr.complainReg();
        carr.speedCheck();
        carr.concreteMethod();

        /*
         * car1 carr1 = new car1();
         * carr1.complainReg();
         */ // cannot instantiate the abstract class direcly
        serviceManager manager = new serviceManager();

        // Executing the methods of interfaces implemented by serviceManager
        manager.cleanLocation();
        manager.hourlyMessage();
        manager.showId();

    }

}
/*
 * class Vehicle{
 * int vehId;
 * String name;
 * }
 */
// convert normal classs to abstract class
// abstract are not implementation only concept the child will only implement it

abstract class Vehicle { // since declared as abstract it is just a concept
    int vehId;
    String name;
    // more common attributes

    // normal way
    /*
     * public void complainReg()
     * {
     * assume compicated logic
     * System.out.println("complained");
     * }
     */

    // to make it abstract
    /*
     * public abstract void complainReg() // will have error should not have a body
     * because no implementation
     * {
     * assume compicated logic
     * System.out.println("complained");
     * }
     */

    // the class needs to be abstract in order to have abstract method
    // abstract class can have both abstract and concrete method

    public abstract void complainReg();// abstract method so no code

    public abstract void speedCheck();

    public void concreteMethod() {
        System.out.println("Thisis concrete method");
    }
}

class car extends Vehicle {

    @Override // to change the pre existing logic(eg senior software engineer.)
    public void complainReg() {

        System.out.println("Checked for comply");
    }

    @Override
    public void speedCheck() {

        System.out.println("check for speed");

    } // car should implement the methods

    // a child calls which is going to inherit the abstract calls should include all
    // the abstract method,
    // this is not a the same for concrete there is no compeltion for it to exist

}

abstract class car1 extends Vehicle { // but making it an abstract class we can just take/ override in one abstract
                                      // method

    @Override // to change the pre existing logic(eg senior software engineer.)
    public void complainReg() {

        System.out.println("Checked for comply");
    }

    /*
     * @Override
     * public void speedCheck() {
     * 
     * System.out.println("check for speed");
     * 
     * }
     */// car should implement the methods

    // a child calls which is going to inherit the abstract calls should include all
    // the abstract method,
    // this is not a the same for concrete there is no compeltion for it to exist

}

interface location {

    public void cleanLocation(); // method without logic -> abstract method without abstract keyword
                                 // by default all the methods are abstract
                                 // abstract key word can be used but not necessary

    public default void hourlyMessage() {
        System.out.println("Paathuko pa thambi");

    }
    // interface method should not have a body
    // by using key word default and static we can add logic to the abstract method

    // similar to class

}

interface defaultUser {
    public void showId();
}

class serviceManager implements location, defaultUser {

    public void cleanLocation() {
        System.out.println("Not supported yet");

    }

    /*
     * public void hourlyMessage(){
     * System.out.println("Not supported yet");
     * 
     * }
     */
    public void showId() {
        System.out.println("Not supported yet");

    }

}
