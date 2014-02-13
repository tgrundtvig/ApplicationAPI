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
public interface SpriteBuilder
{
    public void setPixel(int x, int y, Color c);
    public void setAnchor(int x, int y);
    public Sprite build();
}
