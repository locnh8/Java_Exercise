/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 15/10/2024 
*/

// Khai báo thư viện
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        // Tạo đối tượng scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao so thu nhat: ");
        int x = scanner.nextInt();

        System.out.print("Nhap vao so thu hai: ");
        int y = scanner.nextInt();

        // Tìm ước chung lớn nhất (GCD) của hai số được nhập vào.
        int gcd = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }

        // Tìm bội chung nhỏ nhất (LCM) của hai số được nhập vào dựa vào GCD
        int lcm = (x * y) / gcd;

        // Hiển thị kết quả
        System.out.println("Uoc chung lon nhat cua " + x + " va " + y + " la: " + gcd);
        System.out.println("Boi chung nho nhat cua " + x + " va " + y + " la: " + lcm);
    }
}
