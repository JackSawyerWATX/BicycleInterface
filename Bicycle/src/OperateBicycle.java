
public interface OperateBicycle {

    double myConstant = 3.0;

    // default method that does not need implementation
    default void sayHello() {
        System.out.println("Hello everybody!");
    }

    // static method that does not need implementation
    static void staticMethod() {
        System.out.println("This is the static method of the interface.");
    }

    void speedUp(int increment);

    void applyBrakes(int decrement);

}
