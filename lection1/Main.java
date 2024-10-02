public class Main {
    public static void main(String[] args) {
        Electronics smartphone = new Electronics("Honor 12X", 120, "the best model of 2024", 1024, "Branding", 36);
        Clothing jacket = new Clothing("SuperStar", 80, "the most technologically advanced jacket of this season", "L", "synthetics", "black");

        System.out.println("Product Information:");
        smartphone.showProductInfo();
        smartphone.getCategorySpecificInfo();

        jacket.showProductInfo();
        jacket.getCategorySpecificInfo();

        System.out.println("\nApplying discount to jacket:");
        jacket.applyDiscount(20);
        System.out.println("Jacket price after 15% discount: $" + jacket.getPrice());

        System.out.println("\nChecking availability of jacket:");
        boolean available = jacket.isAvailable();
        if (available) {
            System.out.println("Jacket is available in size " + jacket.getSize());
        }
        else {
            System.out.println("Jacket is out of stock in size " + jacket.getSize());
        }

        System.out.println("\nChecking availability of T-shirts in different sizes...");
        String[] sizes = {"XS", "S", "M", "L", "XL"};
        for (String size: sizes){
            Clothing jacketVariant = new Clothing("SuperStar", 80, "the most technologically advanced jacket of this season", size, "synthetics", "black");
            boolean sizeAvailable = jacketVariant.isAvailable();
            if (sizeAvailable){
                System.out.println("Size " + size + " is available.");
            }
            else{
                System.out.println("Size " + size + " is out of stock.");
            }

        }


        Product[] products = {smartphone, jacket};
        System.out.println("\nApplying discounts where applicable:");
        for (Product product: products) {
            if (product.getPrice() > 100) {
                System.out.println("Applying 10% discount to " + product.getName());
                product.applyDiscount(15);
            }
            else  {
                System.out.println("No discount applied to " + product.getName() + " due to low price.");
            }
        }

        System.out.println("\nFinal product details:");
        for (Product product: products){
            product.showProductInfo();
        }

        System.out.println("\nStatistics:");
        System.out.println("Total products created: " + Product.getProductCount());
        System.out.println("Total electronics created: " + Electronics.getElectronicCount());
        System.out.println("Total clothing created: " + Clothing.getClothingCount());

    }
}