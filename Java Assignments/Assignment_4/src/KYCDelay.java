import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class KYCDelay {
    public static void main(String[] args) throws ParseException {
        Scanner input;

        try{
            input = new Scanner(new File("testCases.txt"));

            while(input.hasNext()){
                String signUpDate = input.next();
                String currentDate = input.next();

                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

                // converting string date to Date object with parsing in the form of dd/MM/yyyy
                Date signUpDateFormatted = simpleDateFormat.parse(signUpDate);
                Date currentDateFormatted = simpleDateFormat.parse(currentDate);


                // if the signUpDate is less than currentDate the just print No range
                if(signUpDateFormatted.after(currentDateFormatted)){
                    System.out.println("No range");
                    continue;
                }

                //set Calendars time represented by this Calendar’s time value, with the given or passed date as a parameter.
                calendar.setTime(currentDateFormatted);
                int currentYear = calendar.getWeekYear();

                calendar.setTime(signUpDateFormatted);
                int signUpYear = calendar.getWeekYear();


                //adding the difference between the currentYear and signUpYear
                calendar.add(Calendar.YEAR, currentYear - signUpYear);

                // subtract 30 days
                calendar.add(Calendar.DATE, -30);
                Date startDate = calendar.getTime();

                // add 60 days as we have already subtracted 30 days
                calendar.add(Calendar.DATE, 60);
                Date endDate = calendar.getTime();


                // if endDate is less than currentDate then endDate is now currentDate
                if(endDate.after(currentDateFormatted)){
                    endDate = currentDateFormatted;
                }

                System.out.println(simpleDateFormat.format(startDate) + " " + simpleDateFormat.format(endDate));
            }
        }
        catch (FileNotFoundException ignored){ }
    }
}
