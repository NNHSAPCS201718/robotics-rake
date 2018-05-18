
/**
 * Write a description of class MotorControl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import lejos.nxt.*;
import lejos.util.*;

public class MotorControl
{
    public static void main( String[] args )
    {
        LCD.drawString("Program 1", 0, 0);
        Button.waitForAnyPress();
        Motor.B.forward();
        LCD.drawString("FORWARD", 0, 0);
        Button.waitForAnyPress();
        Motor.B.backward();
        LCD.drawString("BACKWARD", 0, 1);
        Button.waitForAnyPress();
        Motor.B.stop();
        
        Button.waitForAnyPress();
        
        LCD.drawString("Program 2", 0, 0);
        Motor.B.setSpeed(2);
        Motor.B.forward();
        Delay d = new Delay();
        d.msDelay(2000);
        LCD.drawString(""+Motor.B.getTachoCount(),0,1);
        Motor.B.stop();
        LCD.drawString(""+Motor.B.getTachoCount(),0,2);
        Motor.B.backward();
        int tach = Motor.B.getTachoCount();
        while (tach > 0)
        {
            tach = Motor.B.getTachoCount();
        }
        LCD.drawString(""+Motor.B.getTachoCount(),0,3);
        Motor.B.stop();
        LCD.drawString(""+Motor.B.getTachoCount(),0,4);
        Button.waitForAnyPress();
    }
}
