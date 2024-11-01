public class Electronics extends Product{

    private int memoryInGB;
    private String manufacturer;
    private int warrantyPeriod;

    private static int electronicCount = 0;

    public Electronics(String name, double price, String description, int memory, String manufacturer, int warrantyPeriod) {
        super(price, name, description);
        this.memoryInGB = memory;
        this.manufacturer = manufacturer;
        this.warrantyPeriod = warrantyPeriod;

        electronicCount++;
    }

    public int getMemoryInGB() {
        return memoryInGB;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setMemoryInGB(int memoryInGB) {
        this.memoryInGB = memoryInGB;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    void getCategorySpecificInfo() {
        System.out.println("MemoryInGB: " + getMemoryInGB() + ", manufacturer: '" + getManufacturer() + "' and warrantyPeriod - " + getWarrantyPeriod() + " months.");

    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    public static int getElectronicCount() {
        return electronicCount;
    }
}
