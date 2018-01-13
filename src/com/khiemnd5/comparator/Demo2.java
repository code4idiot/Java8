package com.khiemnd5.comparator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

    public static void giaiPhuongTrinhbacNhat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hệ số a = ");
        double a = scanner.nextDouble();
        System.out.print("Hệ số b = ");
        double b = scanner.nextDouble();
        scanner.close();

        if (a == 0) {
            if (b == 0) {
                System.out.print("Vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm");
            }

        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);

        }

    }

    public static void giaiPhuongTrinhBacHai() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hệ số a = ");
        double a = scanner.nextDouble();
        scanner.close();// tại sao lại close lại? Nếu close thì scanner bên dưới có đọc được nữa ko?

        System.out.print("Hệ số b = ");
        double b = scanner.nextDouble();

        System.out.print("Hệ số c = ");
        double c = scanner.nextDouble();
        scanner.close();

        if (a == 0) {
            double x = -c / b;
            System.out.print("Phương trình có nghiệm là x = " + x);
        }

        if (a != 0) {
            double delta = b*b - 4*a*c;
            if (delta < 0) {
                System.out.println("Vô nghiệm");

            }

            else if (delta == 0) {
                double nghiem = -b / (2*a);
                System.out.println("Phương trình có nghiệm kép x = " + nghiem);
            }

            else if (delta > 0) {
                double X1 = (-b + Math.sqrt(delta))/(2 * a);
                double X2 = (-b - Math.sqrt(delta))/(2 * a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt x = %.1f, y = %.2f ", X1, X2);
            }
        }
    }

    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số điện sử dụng hàng tháng : ");
        int a = scanner.nextInt();
        scanner.close();

        if (a <= 50) {
            int sotien = a * 1000;
            System.out.print("Số tiền điện hàng tháng: " + sotien);
        } else if (a > 50) {
            int sotien2 = (50*1000) + (a - 50)*1200;
            System.out.print("Số tiền điện hàng tháng: " + sotien2);

        }
    }

    public static void main(String[] args) {

        System.out.println("+-------------------------------------+");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("+-------------------------------------+");
        System.out.print(" >> Chọn chức năng: ");

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
//        scanner.close();// lỗi là do dòng này, do chị close lại ở đầu hàm main, việc close này sẽ ảnh hưởng tới các scanner mà chị tạo đằng sau nó:D

        // nhiều if thế này thì nên dùng switch case
        if (answer == 1) {
            giaiPhuongTrinhbacNhat();
        } else if (answer == 2) {
            giaiPhuongTrinhBacHai();
        } else if (answer == 3) {
            tinhTienDien();
        } else if (answer == 4) {
            System.exit(0);
        }
    }

}