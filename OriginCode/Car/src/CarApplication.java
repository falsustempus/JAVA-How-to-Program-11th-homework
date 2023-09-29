/*
 * Program: Car Class
 * Programmer: s11159019
 * Date: 2023/9/24
 */
public class CarApplication {
    public static void main(String[] args) {
        
        // application CarApplication
        Car car_A = new Car("model_a","2023",39999.99);
        Car car_B = new Car("model_b","2024",49999.99);
        
        // display each object's price
        System.out.printf("Car A's price: %f", car_A.get_price());
        System.out.printf("\nCar B's price: %f", car_B.get_price());
        
        // add a 5% discount on the price of the first car
        car_A.set_price(0.95 * car_A.get_price());
        
        // add a 7% discount on the price of the second car
        car_B.set_price(0.93 * car_B.get_price());
        
        System.out.printf("\n");
        // display each Car's price again
        System.out.printf("\nCar A's price: %f", car_A.get_price());
        System.out.printf("\nCar B's price: %f", car_B.get_price());
    }
}