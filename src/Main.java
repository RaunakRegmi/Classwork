import models.Conversion;

public class Main {
    public static void main(String[] args) {
        Conversion distance = new Conversion(10);
        System.out.println(distance.getKilometers() + " Kilometers");
        System.out.println(distance.getCentimeters() + " Centimeters");
        System.out.println(distance.getMillimeters() + " Millimeters");
        System.out.println(distance.getDecimeters() + " Decimeters");
    }
}
