/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 16/10/2024 
*/

// Khai báo thư viện
import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao so hang ban muon: ");
        int n = scanner.nextInt();

        // Vòng lặp để duyệt qua từng dòng trong tam giác Pascal
        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++) {
                // Gọi hàm binomialCoeff để tính toán hệ số nhị thức
                System.out.print(binomialCoeff(line, i) + " ");
            }
            System.out.println();
        }
    }

    // Phương thức tính hệ số nhị thức (nCk)
    public static int binomialCoeff(int n, int k) {
        int res = 1;

        if (k > n - k) {
            k = n - k;
        }

        // Tính toán hệ số nhị thức theo công thức nCk = n! / (k! * (n-k)!)
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }
}