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
public interface SpriteFactory
{
    public SpriteBuilder newSprite(int width, int height);
    public Color newColor(float r, float g, float b, float alpha);
}
