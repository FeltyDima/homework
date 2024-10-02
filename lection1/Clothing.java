import java.lang.Math;

public class Clothing extends Product{

    private String size;
    private String material;
    private String color;

    private static int clothingCount = 0;

    public Clothing(String name, double price, String description, String size, String material, String color) {
        super(price, name, description);
        this.size = size;
        this.material = material;
        this.color = color;

        clothingCount++;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void getCategorySpecificInfo() {
        System.out.println("Material: " + getMaterial() + ", color: " + getColor() + ", size: " + getSize() + ".");
    }

    @Override
    public boolean isAvailable() {
        return Math.random() > 0.5;
    }

    public static int getClothingCount() {
        return clothingCount;
    }
}
