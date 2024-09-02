import Enums.FishermanTypes;
import java.time.LocalDate;
import java.util.List;

    public class Fishrman extends Person{
        public static int number_of_fisherman=0;
        private List<FishermanTypes> fishermanTypes;
        private List<Trophy> trophies;

        public Fishrman(String family, String name, String surname, LocalDate birthdate) {
            super(family, name, surname, birthdate);
            number_of_fisherman++;
        }
        public Fishrman(Person person) {
            super(person.getFamily(), person.getName(), person.getSurname(), person.getBirthdate());
            number_of_fisherman++;
        }

        public List<FishermanTypes> getFishermanTypes() {
            return fishermanTypes;
        }

        public void setFishermanTypes(List<FishermanTypes> fishermanTypes) {
            this.fishermanTypes = fishermanTypes;
        }

        public List<Trophy> getTrophies() {
            return trophies;
        }

        public void setTrophies(List<Trophy> trophies) {
            this.trophies = trophies;
        }

        @Override
        public String toString() {
            String fishermanTypesToLine = new String();
            String trophiesToLine = new String();

            for (Trophy trophy1 : trophies) {
                trophiesToLine = trophiesToLine + trophy1.getFish() +", length ="+trophy1.getLength() +" , weight="+trophy1.getWeight() + "\n";
            }
            for (FishermanTypes fishermanTypes1 : fishermanTypes) {
                fishermanTypesToLine = fishermanTypesToLine + fishermanTypes1.name()+"\n";
            }

            return "Fishrman -" + this.getFamily()+ " "+ this.getName() +" " + this.getSurname()+"\n" +
                    "Fisherman types:"+ "\n" + fishermanTypesToLine +
                    "Trophies=" + "\n"+ trophiesToLine +
                    "___________________________";
        }
    }
