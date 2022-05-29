package singleton.analogy;

public class Player {
    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void use(Bat bat) {
        System.out.println(name + " is using " + bat.getBrand() + " bat.");
    }
}
