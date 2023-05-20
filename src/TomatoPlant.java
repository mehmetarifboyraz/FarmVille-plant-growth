public class TomatoPlant extends Plant {

    private int waterLevel;

    Farm farm = new Farm();


    public TomatoPlant(String name, int growTime, int waterLevel) {
        super(name, growTime);
        this.waterLevel = waterLevel;
    }


    @Override
    public void water(){
        this.waterLevel++;
    }
    @Override
    public void grow(){
        if(this.waterLevel>0) {
            if ( this.farm.day<= getGrowTime()) {
                System.out.printf("%s plant is growing. Growth time: %d/%d.%n", getName(), this.farm.day, getGrowTime());
                this.waterLevel--;
                if (this.farm.day >= getGrowTime()) {
                    System.out.println(getName() + " Plant is ready to harvest.");
                    setHarvestable(true);
                }
                else {
                    System.out.println(getName() + " Plant is not ready to harvest.");
                }
                this.farm.day++;
            }
        }
        else{
            System.out.println("The plant needs water");
        }

    }
    @Override
    public void harvest(){
        if(isHarvestable()){
            System.out.println(getName()+" Plant has been harvested. Congratulations!");
        }
    }
}
