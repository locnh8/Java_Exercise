/*
    Fullname: Trương Đỗ Quỳnh Anh
    Student ID: 31231022100
    Date of birth: 16/12/2005
    Created date: 15/10/2024 
*/

// Khai báo thư viện
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        // Tạo đối tượng scanner để nhận dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        //Hiển thị thông báo và nhập vào các giá trị cần thiết.
        System.out.print("Nhap vao so phan tu cua mang thu nhat: ");
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        System.out.println("Nhap vao cac phan tu cua mang da sap xep thu nhat: ");
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Nhap vao so phan tu cua mang thu hai: ");
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        System.out.println("Nhap vao cac phan tu cua mang da sap xep thu hai: ");
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Tạo mảng mới để lưu trữ kết quả hợp nhất hai mảng đã nhập
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Hợp nhất hai mảng đã được sắp xếp
        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Thêm các phần tử còn lại của mảng thứ nhất nếu còn
        while (i < n1) {
            mergedArray[k++] = array1[i++];
        }

        // Thêm các phần tử còn lại của mảng thứ hai nếu còn
        while (j < n2) {
            mergedArray[k++] = array2[j++];
        }

        // In ra mảng đã được hợp nhất
        System.out.println("Mang da duoc hop nhat: ");
        for (int x : mergedArray) {
            System.out.print(x + " ");
        }
    }
}