/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationapi;

import applicationapi.graphics.Canvas;

/**
 *
 * @author tog
 */
public interface Application
{
    public boolean initialize(Device device);
    public boolean update(long time);
    public void draw(Canvas canvas);
    public void destroy();
}
