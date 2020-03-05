/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *Displays times for a trip with respect to some medium(car, train, etc...)
 * @author montreal.thomas
 */
public class Runner {

    /**
     * Here is where everything gets printed out to the screen
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Train thomas = new Train();
        System.out.println(roundTrip(723,thomas));
        System.out.println("--------------------------------------");
        Car carl = new Car();
        System.out.println(roundTrip(567,carl));
        System.out.println("--------------------------------------");
        Plane perry = new Plane();
        System.out.println(roundTrip(4589,perry));
        System.out.println("--------------------------------------");
        Walking me = new Walking();
        System.out.println(roundTrip(13,me));
        
        /*
        Estimated time 8 hours, Actual time 5 hours
        I believe I got everything to work except the nuance case that was added
        for the bike class. However it still works regularly as walking and 
        roller skating do.
        */

    }
    /*
    Preforms the roundtrip
    */
    public static String roundTrip(double distance,Travel travel){
        travel.setDistance(distance);
       return travel.toString(); 
    }
    
}
