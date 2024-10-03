public abstract class Temperature{
    private int temp_value;

    public Temperature(int value){
        temp_value = value;
    }
    public int getValue(){
        return temp_value;
    }
    public abstract String toString();
    public abstract boolean belowFreezing();
    public abstract boolean swimmingWeather();
}