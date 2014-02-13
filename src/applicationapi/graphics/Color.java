/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationapi.graphics;

/**
 *
 * @author tog
 */
public interface Color
{
    /**
     * 
     * @return The red amount in the interval 0 to 1. 
     */
    public float getRed();
    /**
     * 
     * @return The green amount in the interval 0 to 1. 
     */
    public float getGreen();
    /**
     * 
     * @return The blue amount in the interval 0 to 1. 
     */
    public float getBlue();
    /**
     * 
     * @return The alpha amount in the interval 0 to 1. 
     */
    public float getAlpha();
    
    public int getRGBA();
}
