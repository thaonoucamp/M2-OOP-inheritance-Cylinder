public class TestCircle {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, "red", 10);
        Circle circle = new Circle(5.0, "red");

        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getArea());
    }
}
