import java.util.Scanner;
public class NoEmpat {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Ada berapa buah yang anda ambil?");
        int n = inp.nextInt();
        inp.nextLine();
// Nadia Tambunan 103122400005
        int apel = 0;
        int jeruk = 0;
        int mangga = 0;
        System.out.println("Sebutkan ada buah apa saja yang anda ambil (hanya apel, jeruk, atau mangga)");
        for (int i = 0; i < n; i++) {
            String buah = inp.nextLine().toLowerCase();
            if (buah.equals("apel")) {
                apel++;
            } else if (buah.equals("jeruk")) {
                jeruk++;
            } else if (buah.equals("mangga")) {
                mangga++;
            } else {
                System.out.println("Maaf, kami tidak bisa menghitung selain 3 buah tersebut");
            }
        }
        System.out.printf(apel + " " + jeruk + " " + mangga);
    }
}
