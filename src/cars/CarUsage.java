package cars;

public class CarUsage {
    public static void main(String[] args) {
        Car car1=new Car("Audi","R8","5,2 l V10",562);
        Car car2=new Car("Lamborghini","Aventador","6,5 l V12",730);
        Car car3=new Car("Lamborghini","Urus","4.0 l V8",641);
        Car car4=new Car("Tesla","Model 3","Electric",283);
        Car car5=new Car("Land Rover","Range Rover Sport","3,0 l I-6",355);
        System.out.print("Car1 :\n"+car1);
        car1.printHorsepower();
        car1.run();
        System.out.print("Car2 :\n"+car2);
        car2.printHorsepower();
        car2.run();
        System.out.print("Car3 :\n"+car3);
        car3.printHorsepower();
        car3.run();
        System.out.print("Car4 :\n"+car4);
        car4.printHorsepower();
        car4.run();
        System.out.print("Car5 :\n"+car5);
        car5.printHorsepower();
        car5.run();
    }
}
