import java.util.List;
import java.util.ArrayList;


public class Bundle implements IPackage {

    String bundleName;
    List<IPackage> ipackages = new ArrayList<IPackage>();
    
    public Bundle (String bundleName){
        this.bundleName = bundleName;
    }

    public void addProduct(IPackage product){
        ipackages.add(product);
    }

    //@Override
    public void displayDetails() {
        System.out.println("Bundle: " + bundleName);
        for (IPackage product : ipackages) {
            product.displayDetails();  // Display info for each product or bundle
        }
    }

    //@Override
    public int calculatePrice() {
        int total = 0;
        for (IPackage product : ipackages) {
            total += product.calculatePrice();  // Calculate total price of all items in the bundle
        }
        return total;
    }
    // @Override
    // public void displayDetails() {
    //     System.out.println("Product: " + name + ", " + desc + ", Price: $" + price);
    // }

    // @Override
    // public void calculatePrice(){
    // return price;
    // }
}