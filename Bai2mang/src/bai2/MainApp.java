package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		System.out.print("Nhập số phần tử của mảng: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// khởi tạo arr
		int[] arr = new int[n];
		System.out.print("Nhập các phần tử của mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = sc.nextInt();
		}
		System.out.println("Sắp Xếp Nổi Bọt: ");
		int tmp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {

					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					System.out.println("Sắp xếp:" + Arrays.toString(arr));
				}
			}
		}
		// sắp xếp tuần tự
		System.out.println("Sắp Xếp Tuần Tự: ");
		Arrays.sort(arr);
		System.out.println("Sắp xếp:" + Arrays.toString(arr));
		// sắp xếp chèn
		System.out.println("Sắp xếp chèn: ");
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int t = arr[i];
			while (t < arr[j] && j >= 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = t;
			System.out.println("Sắp xếp: " + arr[j + 1]);

		}

	}
}