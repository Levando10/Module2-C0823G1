package ss12.bai_tap.binary_search;


public class BinarySearch {

  public static void main(String[] args) {
    int[] arrNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int left = 0;
    int right = arrNumber.length - 1;
    int num = 9;

    System.out.println(searchArr(left, right, num, arrNumber));

  }

  public static int searchArr(int l, int r, int number, int[] arr) {
    if (r >= l) {
      int mid = (l + r) / 2;
      if (arr[mid] == number){
        return mid;
      }
      if (arr[mid] > number) {
        r = mid - 1;
        return searchArr(l , r , number , arr);
      }
      if (arr[mid] < number) {
        l = mid + 1;
        return searchArr(l , r , number , arr);
      }
    }
    return -1;

  }
}
