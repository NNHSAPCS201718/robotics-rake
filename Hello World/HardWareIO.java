import lejos.nxt.*;
import lejos.util.*;
import javax.microedition.lcdui.Graphics;

public class HardWareIO
{
    public static void main(String[] args)
    {
        Button.waitForAnyPress();
        LCD.drawString("DistanceProgram",0,0);
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S1);
        Delay d = new Delay();
        d.msDelay(2000);
        Motor.A.forward();
        Motor.C.forward();
        while (us.getDistance()>=30){
            LCD.clear();
            LCD.drawInt(us.getDistance(),0,0);
            d.msDelay(1);
        }
        Motor.A.stop();
        Motor.C.stop();
        
        Button.waitForAnyPress();
        LCD.drawString("BeepProgram",0,0);
        TouchSensor ts = new TouchSensor(SensorPort.S4);
        while (!Button.LEFT.isPressed()){
            while (ts.isPressed()){
                Sound.beep();
                d.msDelay(200);
            }
        }
    }
}
