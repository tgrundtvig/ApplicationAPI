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
public interface Screen
{
    public int getWidth();
    public int getHeight();
    public SpriteFactory getSpriteFactory();
}
