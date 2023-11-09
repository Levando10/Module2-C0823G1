package furama_da_nang.service;

import furama_da_nang.model.Booking;
import furama_da_nang.model.model_person.Customer;
import furama_da_nang.repository.BookingRepository;
import furama_da_nang.repository.IBookingRepository;

public class BookingService implements IBookingService{
  private IBookingRepository iBookingRepository = new BookingRepository();

  @Override
  public void bookingTest(String inputBookingId, Customer cus) {
iBookingRepository.bookingTest(inputBookingId,cus);
  }

  @Override
  public void addBooking(Booking booking) {
iBookingRepository.addBooking(booking);
  }
}
