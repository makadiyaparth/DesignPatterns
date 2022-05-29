package singleton.analogy;

public class Bat {
    private final String brand;
    private static Bat bat;

    private Bat(String brand) {
        this.brand = brand;
    }

    public static Bat getInstance(String brand) {
        if (bat == null) {
            bat = new Bat(brand);
        }
        return bat;
    }

    public String getBrand() {
        return brand;
    }
}
