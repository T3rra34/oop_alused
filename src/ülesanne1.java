import java.util.Scanner;

public class ülesanne1 {
    public static void main(String[] args) {
        Scanner sisend = new Scanner(System.in);
        System.out.println("Palun sisestage oma vanus - ");
        double vanus = sisend.nextDouble();
        System.out.println("Palun sisestage oma sugu");
        String sugu = sisend.toString();
        System.out.println("Sisestage oma valitud treeningu tüüp(1-3): ");
        int treening = Integer.parseInt(sisend.toString());
        double M = 220 - vanus;
        double N = 206 - (vanus * 0.88);
        if (treening == 1) ;
        if (sugu == "M") ;
        double max = Math.round(0.7 * M);
        double min = Math.round(0.5 * M);
        if (sugu == "N") ;
        max = Math.round(0.7 * N);
        min = Math.round(0.5 * N);
        if (treening == 2) ;
        if (sugu == "M") ;
        max = Math.round(0.8 * M);
        min = Math.round(0.7 * M);
        if (sugu == "N") ;
        max = Math.round(0.8 * N);
        min = Math.round(0.7 * N);
        if (treening == 3) ;
        if (sugu == "M") ;
        max = Math.round(0.87 * M);
        min = Math.round(0.8 * M);
        if (sugu == "N") ;
        max = Math.round(0.87 * N);
        min = Math.round(0.8 * N);
        System.out.println("Pulsisagudes peaks olema vahemikus " + min + "kuni" + max);
    }
}