package com;

public class Besøgsfelt extends Felt{
    Besøgsfelt(String navn) {
        super(navn);
    }

    @Override
    public void ramt(Spiller spiller) {
        return;
    }
}
