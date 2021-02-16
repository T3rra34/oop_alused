/* 16.02.2021
16.02 tunni ülesanne
Henri Kazbekov
ITA20
* */

import java.util.ArrayList;

//loome klassid
public class test05 {
    public static void main(String[] args) {
        // moodustame õpetatavate teemade nimekirja
        ArrayList<String> teemad = new ArrayList<>();
        teemad.add("OOP");
        teemad.add("Pärilus");
        teemad.add("Kapseldus");
        teemad.add("Kompositsioon");
        // loome õpetaja
        Opetaja opetaja = new Opetaja("Anna");

        // Loome klass
        ArrayList<Opilane> ita21 = new ArrayList<>();
        Opilane mati = new Opilane("Mati");
        Opilane kati = new Opilane("Kati");
        ita21.add(mati);
        ita21.add(kati);

        // Õpetaja õpetab oma õpilased
        oppetoo(teemad, ita21, opetaja);

        // teadmiste kontroll pärast aine lõpetamiset
        teadmisteKontroll(ita21);
        // ühe nädala pärast Mati unustab teemat Kapseldust
        mati.unusta("Kapseldus");
        // kontrollime uuesti teadmised
        teadmisteKontroll(ita21);
        // las Mati uuesti õpib kalselduse teemad
        mati.opib("Kapseldus");
        // kontrollime uuesti teadmised
        teadmisteKontroll(ita21);


    }

    public static void teadmisteKontroll(ArrayList<Opilane> grupp) {
        for (Opilane opilane : grupp) {
            System.out.println("Opilane " + opilane.getNimi() + " teadmised:");
            for (String teadmine : opilane.getTeadmised()) {
                System.out.println(teadmine);
            }
            System.out.println();
        }
    }

    public static void oppetoo(ArrayList<String> teemad, ArrayList<Opilane> grupp, Opetaja opetaja) {
        for (String teema : teemad) {
            for (Opilane opilane : grupp) {
                opetaja.opetab(opilane, teema);
            }
        }
    }

    private static class Opetaja {

        public Opetaja(String anna) {
        }

        public void opetab(Opilane opilane, String teema) {
        }
    }

    private static class Opilane {

        public Opilane(String mati) {
        }

        public void unusta(String kapseldus) {
        }

        public void opib(String kapseldus) {
        }

        public String getNimi() {
            return null;
        }

        public String[] getTeadmised() {
            return new String[0];
        }
    }
}
