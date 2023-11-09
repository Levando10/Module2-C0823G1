package furama_da_nang.utils.facility;

import furama_da_nang.model.model_service.Facility;
import furama_da_nang.model.model_service.House;
import furama_da_nang.model.model_service.Room;
import furama_da_nang.model.model_service.Villa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileFacility {
  private static final String PATH = "FuramaController/src/furama_da_nang/data/facilityList.csv";
  public static Map<Facility,Integer> readListFacility(){
    Map<Facility,Integer> maps = new LinkedHashMap<>();
    File file = new File(PATH);
    FileReader fileReader;
    BufferedReader bufferedReader = null;

    try {
      fileReader = new FileReader(file);
      bufferedReader = new BufferedReader(fileReader);
      String [] tempString;
      String temp;
      Facility facility;
      while ((temp = bufferedReader.readLine()) != null){
        tempString = temp.split(",");
          if (tempString.length == 9){
            facility = new House(tempString[0],tempString[1],Double.parseDouble(tempString[2]),Long.parseLong(tempString[3]),Integer.parseInt(tempString[4]),tempString[5],tempString[6],Integer.parseInt(tempString[7]));
            maps.put(facility,Integer.parseInt(tempString[8]));

          } if (tempString.length == 10){
          facility = new Villa(tempString[0],tempString[1],Double.parseDouble(tempString[2]),Long.parseLong(tempString[3]),Integer.parseInt(tempString[4]),tempString[5],tempString[6],Integer.parseInt(tempString[7]),Double.parseDouble(tempString[8]));
          maps.put(facility,Integer.parseInt(tempString[9]));

        }
          if (tempString.length == 8){
            facility = new Room(tempString[0],tempString[1],Double.parseDouble(tempString[2]),Long.parseLong(tempString[3]),Integer.parseInt(tempString[4]),tempString[5],tempString[6]);
            maps.put(facility,Integer.parseInt(tempString[7]));
          }
      }
      return maps;
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (bufferedReader != null){
        try {
          bufferedReader.close();

        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }

  }

}
