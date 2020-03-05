/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Cycling medium
 * @author montreal.thomas
 */
public class Bicycle implements Travel {
    private final double walkmph = 5.5;
    private final double mph = 15.0;
    private double distance;
    private int[] miles;

    /**
     * Creates a bicycle object
     */
    public Bicycle() {
        int[] miles = new int[(int)distance];
        for(int counter = 0; counter<miles.length;counter++){
            miles[counter] = (int)(100*Math.random()+1);
        }
        
    }
/**
 * returns the String that will be printed to the screen
 * @return 
 */
    
    @Override
    public String toString() {
         double h =this.move(distance);
        double hours =(int) h;
        double minutes = (int)((h % 1)*60);
        double hp = this.move(distance*2);
        double dhours = (int)(hp);
        double dminutes =(int)((hp % 1.0)*60);
         
         String start = "Round Trip!\nLeaving...\n"; 
        String travel = "Cycling "+(int)(h*mph)+" miles\n";
        String time = "";
        String r = "Returning...\n";
        String dtime = "";
        //int point = startWalking();
        //if(point<0){
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
//    if(((distance/2.0)<point)&&(point<distance)){
//        double hprime = this.move(distance-point);
//        double hoursD =(int) hprime;
//        double minutesD = (int)((hprime % 1)*60);
//        double dhoursD = (int)(2*hprime);
//        double dminutesD =(int) (((2*hprime) % 1)*60);
//    }    
//    }
         
    //}
        return start+travel+time+r+travel+time+dtime;
    }
    /**
     * returns the distance at which to start walking
     * @return 
     */
    public int startWalking(){
        for(int counter = 0; counter<this.miles.length;counter++){
            if(miles[counter]==1){
                return counter;
            }
        }
        return 0;
    }
    /**
     * Prints the string for time traveled when walking
     * @param x
     * @param y
     * @return 
     */
    public String continueWalking(double x, double y){
        String r = "Returning...";
        if ((x <= 1) && (y <= 1)) {
            return r+"\nIt takes: " + x + " hour and " + y + " minute.";
        } else if (x <= 1) {
            return r+"\nIt takes: " + x + " hour and " + y + " minutes.";
        } else if (y <= 1) {
            return r+"\nIt takes: "+ x + " hours and "+ y+ "minutes.";
        }

        return r+"\nIt takes: "+ x + "hours and "+ y+ "minutes.";
        }
/**
 * sets the distance
 * @param d 
 */
    @Override
    public void setDistance(double d) {
       this.distance=distance;
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
