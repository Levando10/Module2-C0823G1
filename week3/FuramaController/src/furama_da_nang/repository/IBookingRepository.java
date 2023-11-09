package furama_da_nang.repository;

import furama_da_nang.model.Booking;
import furama_da_nang.model.model_person.Customer;

public interface IBookingRepository extends Repository{

  void bookingTest(String inputBookingId, Customer cus);

  void addBooking(Booking booking);
}
