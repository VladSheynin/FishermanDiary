import java.time.LocalDate;
import java.util.Date;
import java.util.List;
    public class Fishrman extends Person{
        private FishermanTypes[] fishermanTypes;
        private Trophy[] trophies;

        public Fishrman(String family, String name, String surname, LocalDate birthdate) {
            super(family, name, surname, birthdate);
        }

    }
