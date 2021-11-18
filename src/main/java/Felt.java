public abstract class Felt {
    protected String navn;
    protected Felt næstefelt;
    Felt(String navn){
        this.navn = navn;
    }

    abstract void ramt(Spiller spiller);

    public Felt getNæstefelt() {
        return næstefelt;
    }

    public void setNæstefelt(Felt næstefelt) {
        this.næstefelt = næstefelt;
    }
}
