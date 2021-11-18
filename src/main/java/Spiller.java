public class Spiller {
    private int money = 35;
    private Felt felt;
    String property;

    public Spiller(Felt startFelt){
        felt = startFelt;
    }

    public void ryk(int antal_felter){
        if(antal_felter == 0){
            felt.ramt(this);
        }else{
            felt = felt.getNæstefelt();
            ryk(antal_felter-1);
        }
    }


    public void setMoney(int money) {
        this.money = money;
    }

    public void setPosition(Felt felt) {
        this.felt = felt;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getMoney(){
        return  money;
    }

    public Felt getPosition(){
        return felt;
    }

    public String getProperty(){
        return property;
    }

    public void updateMoney(int beløb){
        money += beløb;
    }


    public void teleporterTil(Felt felt) {
    }
}