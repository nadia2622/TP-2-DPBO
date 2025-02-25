import java.util.Scanner;
public class NoLima {
    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Masukkan 11 buah angka :");
            int[] angka = new int[11];
            for (int i = 0; i < angka.length; i++) {
                angka[i] = inp.nextInt();
            } //Nadia Tambunan 103122400005
            System.out.println("Maka\n");
            for(int i = 0; i < angka.length - 1; i++){
                if(angka[i] < angka[10]) {
                    System.out.println(angka[i] + " lebih kecil dari " + angka[10]);
                } else if (angka[i] == angka[10]) {
                    System.out.println(angka[i] + " sama dengan " + angka[10]);
                } else {
                    System.out.println(angka[i] + " lebih besar dari " + angka[10]);
                }
            }
    }
}
