/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 13/10/2024 
*/

//Khai báo thư viện
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //Tạo đối tượng scanner để nhận dữ liệu từ người dùng.
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao mot so: ");
        int x = scanner.nextInt();

        //Khai báo flag để đánh dấu có phải là số nguyên tố hay không.
        boolean isPrime = true;

        //Kiểm tra số nguyên tố.
        if (x <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        //Kiểm tra biến cờ và in kết quả.
        if (isPrime) {
            System.out.println(x + " la so nguyen to");
        } else {
            System.out.println(x + " khong phai la so nguyen to");
        }
    }
}
