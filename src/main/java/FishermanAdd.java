/**
 * Технический класс для создания рыбаков в памяти. Будет заменен после обучения работе с БД
 * наполнение локальное, используя различные конструкторы класса Fisherman
 * @author Sheynin Vladislav
 */
import Enums.Fish;
import Enums.FishermanTypes;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FishermanAdd {
    private static String fileName = "fishermans";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Fishrman> fishermans = new ArrayList<>();
        ArrayList<FishermanTypes>[] fishermanTypes = new ArrayList[3];
        ArrayList<Trophy>[] trouphes = new ArrayList[3];

        fishermanTypes[0] = new ArrayList<>();
        fishermanTypes[1] = new ArrayList<>();
        fishermanTypes[2] = new ArrayList<>();
        trouphes[0] = new ArrayList<>();
        trouphes[1] = new ArrayList<>();
        trouphes[2] = new ArrayList<>();

        fishermanTypes[0].add(FishermanTypes.SPINNING);
        fishermanTypes[0].add(FishermanTypes.OCEAN);
        trouphes[0].add(new Trophy(Fish.ZANDER,0.82,4.9));
        trouphes[0].add(new Trophy(Fish.PIKE,1.05,6.5));
        trouphes[0].add(new Trophy(Fish.TAIMEN,1.45,25.0));
        fishermanTypes[1].add(FishermanTypes.FIDER);
        trouphes[1].add(new Trophy(Fish.PERCH,0.30,0.6));
        fishermanTypes[2].add(FishermanTypes.FLOAT);
        trouphes[2].add(new Trophy(Fish.PERCH,0.10,0.21));

        addFisherman(fishermans,new Person("Шейнин", "Владислав", "Эдуардович", LocalDate.of(1974,4,13)),
                fishermanTypes[0],
                trouphes[0]);
        addFisherman(fishermans, new Person("Ермаков", "Алексей", "Посмотреть", LocalDate.of(1995,4,8)),
                fishermanTypes[1],
                trouphes[1]);
        addFisherman(fishermans,"Смолльнякова", "Ольга",
                fishermanTypes[2],
                trouphes[2]);

        writeFishermansSerialization(fishermans);
        List<Fishrman> fishermansOut = new ArrayList<>();
        fishermansOut= readFishermansSerialization();
        printAllFishermans(fishermansOut);
    }

    public static void writeFishermansSerialization(List<Fishrman> fmans)  {
        try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(fmans);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Fishrman> readFishermansSerialization() throws IOException, ClassNotFoundException {
        List<Fishrman> fmans = new ArrayList<>();
        try(ObjectInputStream ois= new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<Fishrman>) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
    public static void addFisherman(List<Fishrman> fmans,String family, String name, List fisshermanTypes,List trophy)
    {
        fmans.add(new Fishrman(family,name));
        fmans.get(Fishrman.getNumber_of_fisherman()-1).setFishermanTypes(fisshermanTypes);
        fmans.get(Fishrman.getNumber_of_fisherman()-1).setTrophies(trophy);
    }
}
