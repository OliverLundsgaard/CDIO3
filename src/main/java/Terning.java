import java.util.Random;

public class Terning {
    private int værdi;
    public int rul() {
        Random rand = new Random();
        værdi = rand.nextInt(6) + 1;
        return værdi;
    }
    public int getVærdi() {
        return værdi;
    }

    public Terning() {

        værdi = 1;


    }
}