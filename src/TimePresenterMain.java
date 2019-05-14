import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class TimePresenterMain {

    public static void main(String args[]) {

        for (String arg : args)
            System.out.println(arg);

        if (args.length < 2)
            System.out.println("Enter your birthday and name please, use ");

        String nameS = args[2].toString();
        String dateS = args[1].toString();

        System.out.println(dateS + " " + nameS);
    }
}
