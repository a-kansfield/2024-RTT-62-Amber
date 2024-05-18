package slides._303_14;


public class NormalClass {
    /* Define an anonymous inner class implementing the interface.*/
    /*Construct an instance and invoke the method. */
    /* anonymous constructor one */
    Human hObjOne = new Human() {
        @Override
        public void say() {
            System.out.println("I am James");
        }
    };
    /* anonymous constructor two */
    Human hObjTwo = new Human() {
        @Override
        public void say() {
            System.out.println("i am Tony");
        }
    };
}
