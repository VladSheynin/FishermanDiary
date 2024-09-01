import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class FishermanAdd {
    public static void main(String[] args) throws ParseException {

        Fishrman fisherman1 = new Fishrman("Шейнин", "Владислав", "Эдуардович", LocalDate.of(1974,04,13));

        System.out.println(fisherman1.toString());



    }


}
