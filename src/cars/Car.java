package cars;

public class Car {
    String manufacturer;
    String model;
    String engine;
    int horsepower;
    Car(String manufacturer,String model,String engine,int horsepower){
        this.manufacturer=manufacturer;
        this.engine=engine;
        this.model=model;
        this.horsepower=horsepower;
    }
    void run(){
        System.out.println("The car is running");
    }
    void printHorsepower()
    {
        System.out.println("Car has "+horsepower+" hp");
    }
    public String toString(){
        return "Manufacturer : "+manufacturer+".\n"+"Model : "+model+".\n"+"Engine : "+engine+".\n"+"Horsepower : "
                +horsepower+"hp.\n";
    }
}
