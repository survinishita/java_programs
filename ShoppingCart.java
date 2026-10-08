import java.util.ArrayList;
import java.util.HashSet;
public class ShoppingCart {
    public static void main(String[] args) {
        //================================
        //1.ARRAYLIST-Shopping Cart
        //================================
        ArrayList<String>cart=new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("Mouse");
        System.out.println("======ARRAYLIST======");
        System.out.println("Shopping Cart");
        System.out.println(cart);
        System.out.println("First item: " + cart.get(0));
        System.out.println("Number of items: " + cart.size());
        cart.remove("Keyboard");
        System.out.println("After removing Keyboard");
        System.out.println(cart);
    }
    
}

//===================================
//2.HASHSET-Product Categories
//===================================

 HashSet<String>categories = new HashSet<>();
 categories.add("Electronics");
 categories.add("Accessories");
 categories.add("Electronics");
 categories.add("Accessories");
 categories.add("Furniture");
 System.out.println("\n=====HASHSET=====");
  System.out.println("Product Categories:");
  System.out.println(categories);
  System.out.println("Number of unique categories:" + categories.size());




  
