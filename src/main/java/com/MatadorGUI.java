package com;

import gui_fields.*;
import gui_main.GUI;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MatadorGUI {
    Map<Felt, GUI_Field> felterIGUI;
    Map<Spiller, GUI_Player> spillerIGUI;
    GUI_Player[] spillere;
    GUI gui;
    Spilklasse spilklasse;
    public MatadorGUI()
    {
        GUI.setNull_fields_allowed(true);
        this.spilklasse = new Spilklasse();
        link_felter();
        GUI_Field[] felter = lavGuiFelter();
        gui = new GUI(felter);
        int spillere = gui.getUserInteger("Tast mellem 2 og 4 spillere");
        spilklasse.setAntalSpillere(spillere);
        lavSpillere(spillere);
        kør_spillet();
    }

    private void kør_spillet(){
        flytAlleBiler();
        for (int i = 0; i < spilklasse.getSpillere().length; i++) {
            GUI_Field nuværende_felt = felterIGUI.get(spilklasse.getSpillere()[i].getPosition());
            nuværende_felt.setCar(spillerIGUI.get(spilklasse.getSpillere()[i]), true);
        }
    }

    private void flytAlleBiler(){
        for (int i = 0; i < lavGuiFelter().length; i++) {
            lavGuiFelter()[i].removeAllCars();
        }
    }

    private void lavSpillere(int antal){
        String[] navne = new String[]{"Ahmed", "Caroline", "Seier Junior", "Oline"};
        Color[] farver = new Color[]{Color.RED, Color.yellow, Color.green, Color.blue};
        spillere = new GUI_Player[antal];
        spillerIGUI = new HashMap<Spiller, GUI_Player>();
        for (int i = 0; i < antal; i++) {
            GUI_Car bil = new GUI_Car();
            bil.setPrimaryColor(farver[i]);
            spillere[i] = new GUI_Player(navne[i], spilklasse.getSpillere()[i].getMoney(), bil);
            spillerIGUI.put(spilklasse.getSpillere()[i], spillere[i]);
            gui.addPlayer(spillere[i]);
        }
    }

    private void link_felter(){
        felterIGUI = new HashMap<Felt, GUI_Field>();
        Felt[] felter = spilklasse.getBræt().getFelts();
        felterIGUI.put(felter[0], new GUI_Start());
        GUI_Street felt = new GUI_Street();
        felt.setTitle(felter[1].navn);
        String pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[1], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[2].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[2], felt);

        GUI_Chance chanceFelt = new GUI_Chance();
        chanceFelt.setTitle(felter[3].navn);
        felterIGUI.put(felter[3], chanceFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[4].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[4], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[5].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[5], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[6].navn);
        felterIGUI.put(felter[6], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[7].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[7], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[8].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[8], felt);

        chanceFelt = new GUI_Chance();
        chanceFelt.setTitle(felter[9].navn);
        felterIGUI.put(felter[9], chanceFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[10].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[10], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[11].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[11], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[12].navn);
        felterIGUI.put(felter[12], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[13].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[13], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[14].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[14], felt);

        chanceFelt = new GUI_Chance();
        chanceFelt.setTitle(felter[15].navn);
        felterIGUI.put(felter[15], chanceFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[16].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[16], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[17].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[17], felt);

        GUI_Jail fængselFelt = new GUI_Jail();
        fængselFelt.setTitle(felter[18].navn);
        felterIGUI.put(felter[18],fængselFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[19].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[19], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[20].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[20], felt);

        chanceFelt = new GUI_Chance();
        chanceFelt.setTitle(felter[21].navn);
        felterIGUI.put(felter[21], chanceFelt);

        felt = new GUI_Street();
        felt.setTitle(felter[22].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[22], felt);

        felt = new GUI_Street();
        felt.setTitle(felter[23].navn);
        pris = Integer.toString(((Ejendomsfelt) felter[1]).getPris());
        felt.setRentLabel(pris);
        felterIGUI.put(felter[23], felt);
    }

    private GUI_Field[] lavGuiFelter(){
        GUI_Field[] felter = new GUI_Field[24];
        for(int i = 0; i < spilklasse.getBræt().getFelts().length; i++){
            felter[i] = felterIGUI.get(spilklasse.getBræt().getFelts()[i]);
        }
        return felter;
    }
}
