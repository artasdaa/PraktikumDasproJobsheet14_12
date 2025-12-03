import java.util.Scanner;

public class Tugas{

    public static int totalRekursif(int[] data, int index) {
        if (index == data.length) {
            return 0;
        }
        return data[index] + totalRekursif(data, index + 1);
    }

    public static int totalIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] angka = new int[N];

        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[N - i] = sc.nextInt();
        }

        int total = totalIteratif(angka);

        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total);
    }
}