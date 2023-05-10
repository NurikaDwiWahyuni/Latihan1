package latihan1;
public class Latihan1 {
   

    void metode1 (String merk, String warna, int jumlahroda, int nomorplat, String kodeD){
        System.out.println("Merek Mobil     : " + merk);
        System.out.println("Jumlah Roda     : " + jumlahroda);
        System.out.println("Warna Mobil     : " + warna);
        System.out.println("Plat Nomor      : " +  "BK " + nomorplat + "-" + kodeD);
    }

    int metode2(int kecepatan, int waktu){
        System.out.println("Kecepatan Mobil/jam = " + kecepatan + " KM");
        System.out.println("Waktu               = " + waktu + " Jam");
        int hasil = kecepatan * waktu;
        return hasil;
    }

}