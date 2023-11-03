package furama_da_nang.utils.facility;

import furama_da_nang.model.model_service.Facility;
import furama_da_nang.model.model_service.House;
import furama_da_nang.model.model_service.Room;
import furama_da_nang.model.model_service.Villa;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class WriteFileFacility {
  private static final String PATH = "FuramaController/src/furama_da_nang/data/facilityList.csv";

  public static void writeListFacility(Map<Facility,Integer> facilityIntegerMap){

    File file = new File(PATH);
    FileWriter fileWriter;
    BufferedWriter bufferedWriter = null;
    Set<Facility> keySet;
    try {
      fileWriter = new FileWriter(file);
      bufferedWriter = new BufferedWriter(fileWriter);
      keySet = facilityIntegerMap.keySet();
      for (Facility temp : keySet){
        if (temp instanceof Villa){
          bufferedWriter.write(temp.getIdService() + "," + temp.getNameService() + "," + temp.getAreaUseArea() + "," +
              temp.getLeasePrice() + "," + temp.getMaximumPeople() + "," + temp.getRentalType() + "," + ((Villa) temp).getRoomStandards() + "," +
              ((Villa) temp).getFloors() + "," + ((Villa) temp).getPoolArea() + "," + facilityIntegerMap.get(temp));
          bufferedWriter.newLine();
        }
         else if (temp instanceof Room){
          bufferedWriter.write(temp.getIdService() + "," + temp.getNameService() + "," + temp.getAreaUseArea() + "," +
              temp.getLeasePrice() + "," + temp.getMaximumPeople() + "," + temp.getRentalType() + "," + ((Room) temp).getFreeService()  + facilityIntegerMap.get(temp));
          bufferedWriter.newLine();
        }
        else if (temp instanceof House){
          bufferedWriter.write(temp.getIdService() + "," + temp.getNameService() + "," + temp.getAreaUseArea() + "," +
              temp.getLeasePrice() + "," + temp.getMaximumPeople() + "," + temp.getRentalType() + "," + ((House) temp).getRoomStandards()  +((House) temp).getFloors() + "," + facilityIntegerMap.get(temp));
          bufferedWriter.newLine();
        }
      }

bufferedWriter.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    finally {
      if (bufferedWriter != null){
        try {
          bufferedWriter.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    }


  }
}
