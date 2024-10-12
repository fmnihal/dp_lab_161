public class Main {
    public static void main (String[] args){
        Product laptop = new Product ("Laptop", 20, "HP");
        Product phone  = new Product ("Phone", 10, "Redmi");

        Bundle techBundle = new Bundle ("Tech Bundle");
        techBundle.addProduct(laptop);
        techBundle.addProduct(phone);

        techBundle.displayDetails();

    }
}
