import java.util.Objects;

public class Car {

    private String model;
    private String brand;
    private int year;
    private int price;
    private int quantity;
    private  String color;

     public Car( String model,String brand,int year,int price, String color, int quantity){
         this.model = model;
         this.brand = brand;
         this.year = year;
         this.price = price;
         this.color = color;
         this.quantity = quantity;

     }

     public String getModel(){return model;}
    public void setModel(String model){this.model = model;}
     public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand = brand;}

    public int getYear(){return year;}
    public void setYear(int year){this.year = year;}

    public int getQuantity(){return quantity;}
    public void setQuantity(int quantity){this.quantity = quantity;}

    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}

   public String toString(){
         return "Car{ \n"+"model = "+model+"\n" + "brand = " +brand+"\n" + "year = "+year+"\n"+"price = "+price
                 +"\n" + "color = "+color+"\n"+"quantity = "+ quantity+"\n"+"   }";
   }
   public boolean equals(Object s) {
       if (this == s) return true;
       if ( s == null || getClass() != s.getClass()) return false;
       Car car = (Car) s;
       return year == car.year && price == car.price && quantity == car.quantity && model == car.model
               && brand == car.brand && color == car.color;
   }
    public int hashCode(){return Objects.hash(model,brand,year,price,color,quantity);}

    void sell(int sold){quantity -= sold;}
    void delivery (int delivery){quantity += delivery;}




}
