import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Tempatures here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temperatures
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Tempatures
     */
    public Temperatures()
    {
        // initialise instance variables
        x = 0;
        
        ArrayList temperatures= new ArrayList<Double>();
        temperatures.add(24.5);
        temperatures.add(38.5);
        temperatures.add(44.8);
        temperatures.add(39.0);
        temperatures.add(31.4);
        temperatures.add(19.8);
        temperatures.add(31.8);
        temperatures.add(20.8);
        
        CountFever(temperatures);
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void CountFever(ArrayList<Double> temperatures) //Question 25
    {
        int count = 0;
        double max = 0;
        
    
       for(Double temp :temperatures) {
           if(temp > 37.5){
               count++;
            
           }
           if (temp > max){
               max = temp;
           }
       }
       
    
    
       
       System.out.println("Number of fever cases reported:" + count);
       System.out.println("The max reported:" + max);
       //Question 26 - using Collections.max
       System.out.println("Higher fever case( Collections.max):" + Collections.max(temperatures));
       
       //Question 27
       Collections.sort(temperatures);
       System.out.println("Higher fever case(Collections.sort):" + temperatures.getLast());
       
    }

    
    
    
 }

