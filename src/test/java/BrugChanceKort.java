import com.BetalKort;
import com.Spiller;
import com.Start;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BrugChanceKort {

    @Test
    public void fåGratisPengeKort(){
        BetalKort kort = new BetalKort("test", -2);
        Spiller spiller = new Spiller(new Start("Start"));
        int balanceFørTest = spiller.getMoney();
        kort.brug(spiller);
        assertEquals(balanceFørTest-2, spiller.getMoney());
    }


}

