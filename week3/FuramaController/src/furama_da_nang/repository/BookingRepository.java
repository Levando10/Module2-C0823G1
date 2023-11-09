package furama_da_nang.repository;

import furama_da_nang.model.Booking;
import furama_da_nang.model.model_person.Customer;
import furama_da_nang.model.model_service.Facility;
import furama_da_nang.utils.facility.ReadFileFacility;
import furama_da_nang.utils.facility.WriteFileFacility;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository{
  private static Map<Facility,Integer> facilityHashMap = ReadFileFacility.readListFacility();
  private static Set<Booking> bookings = new HashSet<>();
  private static Queue<Booking> bookingQueue = new LinkedList<>();


  @Override
  public void bookingTest(String inputBookingId, Customer cus) {
    facilityHashMap = ReadFileFacility.readListFacility();
    Set<Facility> keySet;
    keySet = facilityHashMap.keySet();
    Set<Booking> bookings;
    Queue<Booking> bookingQueue;
    Integer count;

//    for (Facility temp : keySet){
//      if ( temp.getIdService().equals(inputBookingId)){
//          count = facilityHashMap.get(temp);
//          facilityHashMap.put(temp,count+1);
//        WriteFileFacility.writeListFacility(facilityHashMap);
//        System.out.println(temp + "Số lần " + facilityHashMap.get(temp));
//        break;
//      }
//    }
//    WriteFileFacility.writeListFacility(facilityHashMap);
  }

  @Override
  public void addBooking(Booking booking) {
    // if (booking.getStartDate().after(currentDate) || booking.getStartDate().equals(currentDate)
    facilityHashMap = ReadFileFacility.readListFacility();
    Set<Facility> keySet;
    keySet = facilityHashMap.keySet();
    Integer count;

    System.out.println(booking);
    bookings.add(booking);
    bookingQueue.add(booking);

    System.out.println("que");
    System.out.println(bookingQueue);

    System.out.println("Set:");
    for (Booking temp : bookings) {
      System.out.println(temp);
    }

    for (Facility temp : keySet){
      if ( temp.getIdService().equals(booking.getServiceCode())){
        count = facilityHashMap.get(temp);
        facilityHashMap.put(temp,count+1);
        WriteFileFacility.writeListFacility(facilityHashMap);
        System.out.println(temp + "Số lần " + facilityHashMap.get(temp));
        break;
      }
    }

  }
}
