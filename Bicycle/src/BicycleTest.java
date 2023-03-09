
class BicycleTest {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();

        // print constant
        System.out.println("version " + Bicycle.myConstant);
        b.sayHello();
        Bicycle.staticMethod();
        b.speedUp(35);
        b.applyBrakes(8);
        System.out.println(b.getSpeed() + " mph");
    }
}