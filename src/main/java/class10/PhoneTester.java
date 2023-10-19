package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iPhoneObj=new Phone();
        iPhoneObj.nameBrand="Iphone";
        iPhoneObj.price=1200;
        iPhoneObj.color="Gold";
        System.out.println(iPhoneObj.nameBrand);
        System.out.println(iPhoneObj.price);
        System.out.println(iPhoneObj.color);

        iPhoneObj.calling();
        iPhoneObj.camera();
        iPhoneObj.music();

        Phone pixelObj=new Phone();
        pixelObj.nameBrand="Google Pixel";
        pixelObj.price=1000;
        pixelObj.color="White";
        System.out.println(pixelObj.nameBrand);
        System.out.println(pixelObj.price);
        System.out.println(pixelObj.color);

        pixelObj.calling();
        pixelObj.camera();
        pixelObj.music();

        Phone samsungObj=new Phone();
        samsungObj.nameBrand="Samsung Galaxy";
        samsungObj.price=1100;
        samsungObj.color="Graphite";
        System.out.println(samsungObj.nameBrand);
        System.out.println(samsungObj.price);
        System.out.println(samsungObj.color);

        samsungObj.calling();
        samsungObj.camera();
        samsungObj.music();


    }
}
