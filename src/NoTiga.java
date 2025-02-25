import java.util.Arrays;
import java.util.Scanner;
public class NoTiga {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Silahkan masukkan 3 buah bilangan bulat yang dipisah dengan menekan spasi :");

//        Nadia Tambunan 103122400005
        int[] angka = new int[3];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = inp.nextInt();
        }
        System.out.println("Ketik 1 lalu enter jika anda ingin bila angka diurutkan dengan menggunakan sort, atau 2 lalu enter jika anda ingin angka anda diurutkan dengan menggunakan if-else");
        int a = inp.nextInt();
        if (a == 1) {
            denganSort(angka);
            print(angka);
        } else if (a == 2) {
            denganIfElse(angka);
            print(angka);
        } else {
            System.out.println("Maaf. Anda hanya bisa mengisi dengan angka 1 atau 2");
        }
    }

    private static void denganSort(int[] angka) {
        Arrays.sort(angka);
    }

    private static void denganIfElse(int[] angka) {
        if (angka[0] > angka[1]) {
            int urut = angka[0];
            angka[0] = angka[1];
            angka[1] = urut;
        }
        if (angka[1] > angka[2]) {
            int urut = angka[1];
            angka[1] = angka[2];
            angka[2] = urut;
        }
        if (angka[0] > angka[1]) {
            int urut = angka[0];
            angka[0] = angka[1];
            angka[1] = urut;
        }
    }

    private static void print(int[] data) {
        System.out.println(Arrays.toString(data));
    }
}
