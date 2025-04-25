import java.util.ArrayList;

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
    public void CountFever(ArrayList<Double> temperatures)
    {
        int count = 0;
        double max = 0;
        
    
       for(int count:temperatures) {
           if(temperatures > 37.5){
               count++;
            
           }
       }
       
    
    
       
       System.out.println("Number of fever cases reported:" + count);
       System.out.println("The max reported:" + max);
       
    }
}
    
    // public void Max(){
        // max temperature = ArrayList<double> temperatures.max()   ;
        // System.out.println(max temperature);
        
    // }
    // public void Sort()
    // {
        // Sort(ArrayList<double> temperatures);
    // }
    
// }
