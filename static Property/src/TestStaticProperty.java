public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("md1","321");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("md2","345");
        System.out.println(Car.numberOfCars);
    }
}
