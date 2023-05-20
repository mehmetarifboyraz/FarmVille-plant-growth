public abstract class Plant implements IPlantActions{

    private String name;
    private int growTime;
    private boolean isHarvest;


    public Plant(String name, int growTime) {
        this.name = name;
        this.growTime = growTime;

    }
    public void setHarvestable(boolean isHarvest){
        this.isHarvest=isHarvest;
    }
    public boolean isHarvestable(){
        return isHarvest;
    }

    public int getGrowTime() {
        return growTime;
    }

    public void setGrowTime(int growTime) {
        this.growTime = growTime;
    }
    public String getName() {
        return name;
    }
    public void grow(){
    }
    public String toString() {
        return getName();
    }
}
