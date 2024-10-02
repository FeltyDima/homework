public abstract class Product implements Sellable, Discountable {

    private double price;
    private String name;
    private String description;

    private static int productCount = 0;

    public Product(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
        productCount++;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100){
            this.price -= this.price * percent / 100;
        }
    }

    @Override
    public abstract boolean isAvailable();

    public void showProductInfo(){
        System.out.println("Product: " + getName() + ", in the description - " + getDescription() + ". Price - " + getPrice() + "$.");
    }

    abstract void getCategorySpecificInfo();

    public static int getProductCount() {
        return productCount;
    }

}
