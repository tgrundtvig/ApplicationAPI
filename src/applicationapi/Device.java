/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationapi;

import applicationapi.graphics.Screen;
import applicationapi.input.keyboard.Keyboard;

/**
 *
 * @author tog
 */
public interface Device
{
    public Screen getScreen();
    public Keyboard getKeyboard();
}
