package ss11.thuc_hanh.test_hasmap;

import java.util.HashMap;

public class HashMaps {

  public static void main(String[] args) {
   HashMap<Integer,String> hashMap = new HashMap<>();
   hashMap.put(1,"helo");
    hashMap.put(2,"helo");
    hashMap.put(3,"xin chao o ngoai");
    boolean check = hashMap.containsKey(3);


  if (!check){
    hashMap.put(3,"xin chao");
  } else {
    System.out.println("key ton tai");
  }
    System.out.println(hashMap);
  }
}
