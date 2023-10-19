package class10;

public class CarTester {
    public static void main(String[] args) {
        Car toyotaObj=new Car();
        toyotaObj.make="Toyota";
        toyotaObj.model="Camry Hybrid";
        toyotaObj.year=2023;
        toyotaObj.fuelType="Gas/Electric";
        System.out.println(toyotaObj.make);
        System.out.println(toyotaObj.model);
        System.out.println(toyotaObj.year);
        System.out.println(toyotaObj.fuelType);

        toyotaObj.transport();
        toyotaObj.moves();
    }
}
