import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class StudentTicket extends StandardTicket {
    private static final double STUDENT_DISCOUNT = 0.50;


    StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    public double getTotalPrice() {
        return ((getBasePrice() * ticketCount) + getTax() * ticketCount * getBasePrice()) * 0.5;
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }
}
