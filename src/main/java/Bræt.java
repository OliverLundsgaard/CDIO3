public class Bræt {

    private Felt[] felts;

    public Bræt() {
        felts = new Felt[24];
        felts[0] = new Start("Start");
        felts[1] = new Ejendomsfelt("Burgerbaren", 1);
        felts[2] = new Ejendomsfelt("Pizzaria", 1);
        felts[3] = new Chance("Chancen");
        felts[4] = new Ejendomsfelt("Slikbutikken", 1);
        felts[5] = new Ejendomsfelt("Iskiosken", 1);
        felts[6] = new Feltudenvaerdi("På besøg i fængsel");
        felts[7] = new Ejendomsfelt("Museet", 2);
        felts[8] = new Ejendomsfelt("Biblioteket", 2);
        felts[9] = new Chance("Chancen");
        felts[10] = new Ejendomsfelt("Skaterparken", 2);
        felts[11] = new Ejendomsfelt("Swimmingpoolen", 2);
        felts[12] = new Feltudenvaerdi("Gratis parkering");
        felts[13] = new Ejendomsfelt("Spillehallen", 3);
        felts[14] = new Ejendomsfelt("Biografen", 3);
        felts[15] = new Chance("Chancen");
        felts[16] = new Ejendomsfelt("Legetøjsbutikken", 3);
        felts[17] = new Ejendomsfelt("Dyrehandlen", 3);
        felts[18] = new Fængselsfelt("Gå i fængsel");
        felts[19] = new Ejendomsfelt("Bowlinghallen", 4);
        felts[20] = new Ejendomsfelt("Zoo", 4);
        felts[21] = new Chance("Chancen");
        felts[22] = new Ejendomsfelt("Vandlandet", 5);
        felts[23] = new Ejendomsfelt("Strandpromenaden", 5);
        for(int i = 0; i < felts.length-1; i++){
            felts[i].setNæstefelt(felts[i+1]);
        }
        felts[23].setNæstefelt(felts[0]);
    }

    public Felt[] getFelts() {
        return felts;
    }
    public Felt getStartFelt(){
        return felts[0];
    }
}