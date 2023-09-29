/*
 * Program: Car Class
 * Programmer: s11159019
 * Date: 2023/9/24
 */

// a class called Employee
public class Car {
	private String model = "";	// variables - model (type String)
    private String year = "";	// variables - year (type String)
    private double price = 0;	// variables - price (type double)
    
    // constructor
    public Car() {
        
    }
    
    // initializes the three variables
    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;    
        if (price > 0.0) {
            this.price = price;
        }
    }
    
    //  get functions for three variables
    public String get_model() {
        return model;
    }
    public String get_year() {
        return year;
    }
    public double get_price() {
        return price;
    }
    
    // set functions for three variables
    public void set_model(String model) {
        this.model = model;
    }
    public void set_year(String year) {
        this.year = year;
    }
    public void set_price(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }


}