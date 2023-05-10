package latihan1;

import latihan1.Latihan1;

public class CobaTayo {
    public static void main(String[] args) {

        Latihan1 mobilTayo = new Latihan1();

        mobilTayo.metode1("Tayo", "Biru", 6, 1234, "TIF");
        System.out.println();
        int totalRange = mobilTayo.metode2(60, 2);
        System.out.println("Total Jarak Tempuh  = " + totalRange + " KM/jam");
    }

}


