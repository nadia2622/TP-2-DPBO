import java.util.Scanner;
public class NoDua {
    public static void main(String[] args) {
        System.out.println("Masukkan jarak dengan satuan mil untuk dikonversi ke Km");
        Scanner inp = new Scanner(System.in);
        double mil = inp.nextDouble();
        double km = mil*1.6;
        System.out.printf("%f mil adalah %f Kilometer", mil, km);
//        Nadia Tambunan 103122400005
    }
}
