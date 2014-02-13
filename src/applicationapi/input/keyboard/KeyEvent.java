/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationapi.input.keyboard;

import applicationapi.input.InputEvent;

/**
 *
 * @author tog
 */
public interface KeyEvent extends InputEvent
{
    public Key getKey();
}
