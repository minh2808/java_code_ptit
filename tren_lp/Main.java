package tren_lp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Độ dài cạnh (chiều cao nửa trên)

        // Nửa trên (kể cả dòng giữa)
        for (int i = 1; i <= N; i++) {
            // In khoảng trắng đầu dòng
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // In phần thân
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Nửa dưới (không in lại dòng giữa)
        for (int i = N - 1; i >= 1; i--) {
            // In khoảng trắng đầu dòng
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // In phần thân
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

       
    }
}
