/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 14/10/2024 
*/

// Khai báo thư viện
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        // Tạo đối tượng scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Khởi tạo biến largest và smallest bằng giá trị của phần tử đầu tiên
        int largest = array[0];
        int smallest = array[0];

        // Duyệt qua mảng để tìm phần tử lớn nhất và nhỏ nhất
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        //Hiển thị phần tử lớn nhất và nhỏ nhất.
        System.out.println("Phan tu lon nhat la: " + largest);
        System.out.println("Phan tu nho nhat la: " + smallest);
    }
}