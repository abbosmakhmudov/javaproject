package class16;

public class T1Constractor4Defferent {

    private String make;
    private String model;
    private String fuelType;
    private int year;

    public T1Constractor4Defferent(){

    }
    private T1Constractor4Defferent(String make){
        this.make=make;
    }
    T1Constractor4Defferent(String make,String model){
        this.make=make;
        this.model=model;
    }
    protected T1Constractor4Defferent(String make,String model,String fuelType,int year){
        this.make=make;
        this.model=model;
        this.fuelType=fuelType;
        this.year=year;
    }

    public static void main(String[] args) {
        new T1Constractor4Defferent();
        new T1Constractor4Defferent("Toyota");
        new T1Constractor4Defferent("Toyota","Camry");
        new T1Constractor4Defferent("Toyota","Camry","Gas",2023);
    }

}
