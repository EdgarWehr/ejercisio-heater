public class Heater
{
    private double temperature;
    private double min;
    private double max;
    private double increment;
    
    public Heater()
    {
        temperature =15.0;
        increment = 5.0;
        min = 0;
        max = 30;
    }
    
    public Heater(double minValue, double maxValue)
    {
        temperature = 15.0;
        increment = 5.0;
        min = minValue;
        max = maxValue;
    }
    
    public double getTemperature()
    {
        return temperature;
    }
    
    public void warmer()
    {
        if(temperature + increment < max){
        temperature = temperature + increment;
        }
    }
    
    public void cooler()
    {
        if(temperature - increment > min){
        temperature = temperature - increment;
        }
    }
    
    public void setIncrement(double newIncrement)
    {
        increment = newIncrement;
    }
}
