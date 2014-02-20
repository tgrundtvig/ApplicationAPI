/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applicationapi.input;

import applicationapi.input.keyboard.KeyPressedEvent;
import applicationapi.input.keyboard.KeyReleasedEvent;
import applicationapi.input.mouse.MouseMovedEvent;
import applicationapi.input.mouse.MousePressedEvent;
import applicationapi.input.mouse.MouseReleasedEvent;
import applicationapi.input.mouse.MouseWheelEvent;

/**
 *
 * @author tog
 */
public interface InputEvent extends Comparable<InputEvent>
{
    public InputEventType getType();
    public long getWhen();
    
    //Downcasts
    public KeyPressedEvent asKeyPressedEvent();
    public KeyReleasedEvent asKeyReleasedEvent();
    public MousePressedEvent asMousePressedEvent();
    public MouseReleasedEvent asMouseReleasedEvent();
    public MouseMovedEvent asMouseMovedEvent();
    public MouseWheelEvent asMouseWheelEvent();
}
