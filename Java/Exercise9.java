/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 14/10/2024 
*/

// Khai báo thư viện
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        // Tạo đối tượng scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap so phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhap cac phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Thực hiện sắp xếp mảng theo thứ tự tăng dần (Selection Sort) 
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        //Hiển thị kết quả.
        System.out.print("Sap xep mang theo thu tu tang dan: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}