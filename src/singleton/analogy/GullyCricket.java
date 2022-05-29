package singleton.analogy;

public class GullyCricket {
    public static void main(String[] args) {
        var mrfBat = Bat.getInstance("MRF");
        var parth = new Player("Parth");
        parth.use(mrfBat);

        var otherBat = Bat.getInstance("Other");
        var someone = new Player("Someone");
        someone.use(otherBat);
    }
}
