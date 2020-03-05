/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Car medium, implements Travel
 * @author montreal.thomas
 */
public class Car implements Travel{
private final double mph = 60.0;
private double distance;
/**
 * Creates a car object
 */
public Car(){
}
/**
 * builds and returns a string
 * @return 
 */
    @Override
    public String toString() {
        double gasTime = getGas();
        double addMinutes = gasTime/60;
        double h =this.move(distance)+(addMinutes/60);
        double hours =(int) h;
        double minutes = (int)((h % 1)*60);
        double hp = this.move(distance*2)+2*(addMinutes/67);
        double dhours = (int)(hp);
        double dminutes =(int)((hp % 1.0)*60);
        
        String start = "Round Trip!\nLeaving...\n"; 
        String travel = "Car travels "+(int)(h*mph)+" miles\n";
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
     * returns a estimated amount of time required to get gas when traveling
     * large distances.
     * @return 
     */
    public double getGas(){
        double minutes = (this.distance/300)*20;
        return minutes;
    }
/**
 * sets the distance
 * @param d 
 */
@Override
    public void setDistance(double d){
     this.distance=d;   
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
}
