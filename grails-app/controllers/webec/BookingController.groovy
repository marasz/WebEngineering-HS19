package webec

class BookingController {

    def probiere(){
        def room = Room.findByName('1.313')
        def bookings = Booking.findAllByRoom(room)

        def lastNames = bookings.booker.lastName.unique()
        render text: lastNames
//
//        def booker = Person.findByLastName('Holz')
//        def result = Booking.findAllByBooker(booker)
//        render text: result.toString()
    }

    static scaffold = Booking
}
