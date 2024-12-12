import java.util.Scanner;

public class AngkaGanjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = scanner.nextInt();
        scanner.close();

        tampilkanAngkaGanjil(n);
    }
    public static void tampilkanAngkaGanjil(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

