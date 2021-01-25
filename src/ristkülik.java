
class ristkylik {
    private double laius;
    private double kõrgus;

    public static void main(String[] args) {
        ristkylik r1 = new ristkylik();
        r1.setKõrgus(4.6);
        r1.setLaius(1.2);
        System.out.println("====================");
        ristkylik r2 = new ristkylik();
        r2.setKõrgus(-4.6);
        r2.setLaius(7.7);
        System.out.println("===================");

    }

    public double getLaius(double laius) {
        return this.laius;
    }

    public double getKõrgus(double kõrgus) {
        return this.kõrgus;
    }

    public void setLaius(double laius) {
        this.laius = this.vaartusekontroll(laius);
    }

    public void setKõrgus(double kõrgus) {
        this.kõrgus = this.vaartusekontroll(kõrgus);
    }

    private double vaartusekontroll(double vaartus) {
        if (vaartus < 0.0) {
            return Math.abs(vaartus);
        }
        return vaartus;
    }
}

