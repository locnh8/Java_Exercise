/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 12/10/2024 
*/

//Khai báo thư viện
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //Tạo đối tượng scanner để nhận dữ liệu từ người dùng.
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap so chu so ban muon :");
        int n = scanner.nextInt();

        // Khai báo các biến để lưu các số trong dãy Fibonacci
        int firstTerm = 0, secondTerm = 1;
        System.out.print(n + " chu so dau tien cua day Fibonacci la: ");
        
        //Dùng vòng lặp để in ra n chữ số đầu tiên của dãy Fibonacci.
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            // Tính số tiếp theo trong dãy Fibonacci
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
    

