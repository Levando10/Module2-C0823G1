package furama_da_nang.service;

import furama_da_nang.model.Booking;
import furama_da_nang.model.model_person.Customer;
import furama_da_nang.repository.BookingRepository;
import furama_da_nang.repository.IBookingRepository;

public interface IBookingService extends Service{
   IBookingRepository iBookingRepository = new BookingRepository();

  void bookingTest(String inputBookingId, Customer cus);

  void addBooking(Booking booking);

}
