import java.sql.SQLOutput;
import java.util.Scanner;

public class arrey {
    public static void main(String[] args) {
        int[] vastuvoetud = {2803, 2626, 2359, 1927, 2236, 2281, 2394, 2484, 2468};
        Scanner sisend = new Scanner(System.in);
        int aasta = sisend.nextInt();
        int massiiviindex = aasta - 2011;
        System.out.println("Vastuvõeti" + vastuvoetud[massiiviindex]);

    }


}
