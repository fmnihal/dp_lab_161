
public class Product implements IPackage {
    
    int price;
    String name;
    String desc;
    
    public Product(String name, int price,  String desc){
        this.price = price;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product: " + name + " - " + desc + " - Price: $" + price);
    }

    @Override
    public int calculatePrice() {
        return price;
    }
    
    // @Override
    // public void displayDetails() {
    //     return desc;
    // }

    // @Override
    // public void calculatePrice(){
    // return price;
    // }
}