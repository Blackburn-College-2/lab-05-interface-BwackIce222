/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Train medium
 * @author montreal.thomas
 */
public class Train implements Travel{
private final double mph = 50.0;
private double distance;
/**
 * Train constructor
 */
public Train(){   
}
/**
     * calculates the time taken in hours to travel the distance
     * @param miles
     * @return 
     */
    @Override
    public double move(double miles) {
       double hours = miles/mph;
       return hours;
    }
   /**
    * Creates and returns the string for printing
    * @return 
    */ 
@Override
    public String toString(){
        double h =this.move(distance);
        double hours =(int) h;
        double minutes = (int)((h % 1)*60);
        double hp = this.move(distance*2);
        double dhours = (int)(hp);
        double dminutes =(int)((hp % 1.0)*60);
        
        String start = "Round Trip!\nLeaving...\n"; 
        String travel = "Train travels "+(int)(h*mph)+" miles\n";
        String time = "";
        String r = "Returning...\n";
        String dtime = "";
         if ((dhours <= 1) && (dminutes <= 1)) {
            dtime= "Total travel time: " + dhours + " hour and " + dminutes + " minute.\n";
        } else if (dhours <= 1) {
            dtime= "Total travel time: " + dhours + " hour and " + dminutes + " minutes.\n";
        } else if (dminutes <= 1) {
            dtime = "Total travel time: "+ dhours + " hours and "+ dminutes+ " minute.\n";
        }else{
            dtime ="Total travel time: "+ dhours + " hours and "+ dminutes+ " minutes.\n";
        }
        if ((hours <= 1) && (minutes <= 1)) {
            time= "It takes: " + hours + " hour and " + minutes + " minute.\n";
        } else if (hours <= 1) {
            time= "It takes: " + hours + " hour and " + minutes + " minutes.\n";
        } else if (minutes <= 1) {
            time = "It takes: "+ hours + " hours and "+ minutes+ " minutes.\n";
        }else{
            time ="It takes: "+ hours + " hours and "+ minutes+ " minutes.\n";
}
         return start+travel+time+r+travel+time+dtime;
    }
    /**
     * Sets the distance 
     * @param d 
     */
@Override
    public void setDistance(double d){
     this.distance=d;   
    }

}
