public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Xclass", "Mercedes", 2009,  230000,"black",2);

        System.out.println(car1.toString());
        System.out.println(car1.getColor());
        car1.sell(1);
        car1.delivery(2);
        System.out.println(car1.toString());


    }
}