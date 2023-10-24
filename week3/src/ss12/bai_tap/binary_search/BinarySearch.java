package ss12.bai_tap.binary_search;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] arr = createArr();

    int left = 0;
    int right = arr.length - 1;

    System.out.println("Mảng trước khi tìm kiếm : " + Arrays.toString(arr));
    sortArr(arr);
    System.out.println("Mảng sắp xếp : " + Arrays.toString(arr));
    System.out.print("Nhập phần tử muốn tìm : ");
    int numFind = scanner.nextInt();

    System.out.print(
        "Giá trị cần tìm có index trong mảng  : " + searchArr(left, right, numFind, arr));


  }

  public static void sortArr(int[] arr) {
    Arrays.sort(arr);
  }

  public static int[] createArr() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số lượng phần tử trong mảng : ");
    int elementInArray = scanner.nextInt();
    int[] arr = new int[elementInArray];
    for (int i = 0; i < elementInArray; i++) {
      System.out.print("Nhập phần tử thứ " + (i + 1) + " :");
      arr[i] = scanner.nextInt();
    }
    return arr;
  }

  public static int searchArr(int l, int r, int number, int[] arr) {
    if (r >= l) {
      int mid = (l + r) / 2;
      if (arr[mid] == number) {
        return mid;
      }
      if (arr[mid] > number) {
        return searchArr(l, mid - 1, number, arr);
      }
      if (arr[mid] < number) {

        return searchArr(mid + 1, r, number, arr);
      }
    }
    return -1;

  }
}
