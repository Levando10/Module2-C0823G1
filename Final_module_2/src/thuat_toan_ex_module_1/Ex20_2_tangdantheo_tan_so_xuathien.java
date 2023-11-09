package thuat_toan_ex_module_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ex20_2_tangdantheo_tan_so_xuathien {

  public static void main(String[] args) {
    int [] arr = new int[]{1,3,4,5,7,2,3,5};
    HashMap<Integer,Integer> map = new LinkedHashMap<>();

    int count = 0;
    int temp = 0;

    for (int i = 0; i < arr.length -1 ; i++) {
      for (int j = 0; j < arr.length - 1- i; j++) {
        if (arr[j] > arr[j + 1]){
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }

    }

    for (int i = 0; i < arr.length; i++) {
      count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]){
          count++;
        }
      }
      map.put(arr[i],count);
    }


    Set<Integer> set = map.keySet();
    for (Integer integer : set) {
      if (map.get(integer) > 1)
      System.out.print(" " + integer + map.get(integer));
    }


    System.out.println("\n"+Arrays.toString(arr));





  }

}
