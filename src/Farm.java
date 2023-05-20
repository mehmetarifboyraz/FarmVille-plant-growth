import java.util.ArrayList;
public class Farm{
    public int day=1;
    ArrayList <Plant> plants = new ArrayList<>();

    public Farm() {
    }

    public void addPlant(Plant plant){
        plants.add(plant);
        System.out.println(plant+" has been added to farm");
    }
    public void simulateDay(){
        System.out.println("Day "+day);
        day++;
        for (Plant plant : plants) {
            plant.water();
            plant.grow();
            plant.harvest();
        }
    }
}
