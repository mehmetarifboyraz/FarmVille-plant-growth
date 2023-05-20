public class FarmVille {
    public static void main(String[] args) {
        TomatoPlant tomatoPlant= new TomatoPlant("Tomato",3,5);
        CarrotPlant carrotPlant=new CarrotPlant("Carrot",5,3);
        Farm plants= new Farm();

        plants.addPlant(tomatoPlant);
        plants.addPlant(carrotPlant);
        System.out.printf("%n%n");
        plants.simulateDay();
        System.out.printf("%n%n");
        plants.simulateDay();
        System.out.printf("%n%n");
        plants.simulateDay();
        System.out.printf("%n%n");
        plants.simulateDay();
    }
}