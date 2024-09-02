import Enums.Fish;
import Enums.FishermanTypes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FishermanAdd {


    public static void main(String[] args)  {
        List<Fishrman> fishermans = new ArrayList<>();
        ArrayList<FishermanTypes>[] fishermanTypes = new ArrayList[2];
        ArrayList<Trophy>[] trouphes = new ArrayList[2];

        fishermanTypes[0] = new ArrayList<>();
        fishermanTypes[1] = new ArrayList<>();
        trouphes[0] = new ArrayList<>();
        trouphes[1] = new ArrayList<>();

        fishermanTypes[0].add(FishermanTypes.SPINNING);
        fishermanTypes[0].add(FishermanTypes.OCEAN);
        trouphes[0].add(new Trophy(Fish.ZANDER,82,4.9));
        trouphes[0].add(new Trophy(Fish.PIKE,86,6.5));
        fishermanTypes[1].add(FishermanTypes.FIDER);
        trouphes[1].add(new Trophy(Fish.PERCH,30,0.6));

        addFisherman(fishermans,new Person("Шейнин", "Владислав", "Эдуардович", LocalDate.of(1974,4,13)),
                fishermanTypes[0],
                trouphes[0]);
        addFisherman(fishermans, new Person("Ермаков", "Алексей", "Посмотреть", LocalDate.of(1995,4,8)),
                fishermanTypes[1],
                trouphes[1]);

        printAllFishermans(fishermans);
    }

    public static void printAllFishermans(List<Fishrman> fishrmanList){
        for (int i = 0; i < fishrmanList.size(); i++) {
            System.out.println(fishrmanList.get(i).toString());
        }
    }
    public static void addFisherman(List<Fishrman> fmans,Person person, List fisshermanTypes,List trophy)
    {
        fmans.add(new Fishrman(person));
        fmans.get(Fishrman.getNumber_of_fisherman()-1).setFishermanTypes(fisshermanTypes);
        fmans.get(Fishrman.getNumber_of_fisherman()-1).setTrophies(trophy);

    }
}
