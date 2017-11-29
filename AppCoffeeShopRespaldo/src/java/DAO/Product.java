
package Modelo;

/**
 *
 * @author diego
 */
public class Product {
    
    int id;
    private String NameProduct;
    private String Units_Availables;
    private float price;
    private String Description;

    public Product(int id, String NameProduct, String Units_Availables, float price, String Description) {
        this.id = id;
        this.NameProduct = NameProduct;
        this.Units_Availables = Units_Availables;
        this.price = price;
        this.Description = Description;
    }
    public Product(){
        
    }

    public Product(int id, String NameProduct) {
        this.id = id;
        this.NameProduct = NameProduct;
    }

    public Product(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String NameProduct) {
        this.NameProduct = NameProduct;
    }

    public String getUnits_Availables() {
        return Units_Availables;
    }

    public void setUnits_Availables(String Units_Availables) {
        this.Units_Availables = Units_Availables;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    @Override
    public String toString() {
        return NameProduct;
    }
    
    
}
