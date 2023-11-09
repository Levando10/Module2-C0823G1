package furama_da_nang.controller;

import furama_da_nang.model.Booking;
import furama_da_nang.model.model_person.Customer;
import furama_da_nang.service.BookingService;
import furama_da_nang.service.IBookingService;

public class BookingController {
  private IBookingService iBookingService = new BookingService();

  public void bookingTest(String inputBookingId, Customer cus) {
    iBookingService.bookingTest(inputBookingId,cus);
  }

  public void addBooking(Booking booking) {
    iBookingService.addBooking(booking);
  }
}
