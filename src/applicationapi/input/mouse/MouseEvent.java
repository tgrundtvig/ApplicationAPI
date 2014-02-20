/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationapi.input.mouse;

import applicationapi.input.InputEvent;

/**
 *
 * @author tog
 */
public interface MouseEvent extends InputEvent
{
    public int getX();
    public int getY();
}
