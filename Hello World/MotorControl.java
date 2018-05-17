
/**
 * Write a description of class MotorControl here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import lejos.nxt.*;

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
        
        
        LCD.drawString("Program 2", 0, 0);
        Motor.B.setSpeed(2);
        Motor.B.forward();
        Delay.msDelay(2000);
        LCD.drawString(""+Motor.B.getTachoCount(),0,0);
        
    }
}
