/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *The interface contains two methods meant to set the distance and 
 * return the time traveled in hours.
 * @author montreal.thomas
 */
public interface Travel {
    public double move(double miles); 
    public void setDistance(double d);
}
