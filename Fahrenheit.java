public class Fahrenheit extends Temperature{
    
    public Fahrenheit(int value){
        super(value);
    }
    public String toString(){
        return getValue() + " Degrees Fahrenheit "
    }
    public abstract boolean belowFreezing();{
        return getTemperature() < 32;
    }
    public abstract boolean swimmingWeather();{
        return getTemperature() > 80;
    }
}