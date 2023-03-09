package rikkei.academy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ cần chuyển đổi (độ C hoặc độ F): ");
        String temp = input.nextLine();

        if (temp.endsWith("C") || temp.endsWith("c")) {
            //Double.parseDouble để ép kiểu từ chuối sang dạng double
            //temp.substring(0, temp.length() - 1) loại bỏ phần tử cuối
            double celsius = Double.parseDouble(temp.substring(0, temp.length() - 1));
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.println(celsius + " độ C = " + fahrenheit + " độ F");
        } else if (temp.endsWith("F") || temp.endsWith("f")) {
            double fahrenheit = Double.parseDouble(temp.substring(0, temp.length() - 1));
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " độ F = " + celsius + " độ C");
        } else {
            System.out.println("Không thể chuyển đổi nhiệt độ.");
        }
    }

    }

