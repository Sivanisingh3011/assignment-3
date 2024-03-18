import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Serialization
        serializeProduct(new Product(1, "Laptop", "Electronics", 999.99));
        
        // Deserialization
        Product product = deserializeProduct();
        if (product != null) {
            product.printDetails();
        }
    }

    private static void serializeProduct(Product product) {
        try (FileOutputStream fileOut = new FileOutputStream("product.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(product);
            System.out.println("Product serialized successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Product deserializeProduct() {
        Product product = null;
        try (FileInputStream fileIn = new FileInputStream("product.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            product = (Product) objectIn.readObject();
            System.out.println("Product deserialized successfully");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return product;
    }
}
