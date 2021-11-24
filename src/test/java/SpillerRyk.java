import com.Bræt;
import com.Felt;
import com.Spiller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
public class SpillerRyk {
    private Bræt bræt;
    private Spiller spiller;
    @BeforeEach
    public void setUp(){
        bræt = new Bræt();
        spiller = new Spiller(bræt.getStartFelt());
    }
    @Test
    public void teleporterTil() throws Exception {
        Felt rykTilFelt = bræt.getFelts()[5];
        spiller.teleporterTil(rykTilFelt);
        assertEquals(spiller.getPosition(), rykTilFelt);
    }

    @Test
    public void teleporterMensIFængsel() {
        spiller.setInPrison(true);
        Felt startFelt = spiller.getPosition();
        Felt rykTilFelt = bræt.getFelts()[8];
        try {
            spiller.teleporterTil(rykTilFelt);
        }catch (Exception e){
            assertEquals(spiller.getPosition(), startFelt);
        }
    }

    @Test
    public void pengeOverStart() throws Exception {
        Felt starterFelt = bræt.getFelts()[14];
        spiller.teleporterTil(starterFelt);
        int balance = spiller.getMoney();
        spiller.ryk(bræt.getFelts()[12].getNavn());
        assertEquals(spiller.getMoney(), balance+2);
    }
}