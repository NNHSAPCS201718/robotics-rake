import lejos.nxt.*;
import lejos.util.*;
public class HardWareIO
{
    public static void main(String[] args)
    {
        LCD.drawString("DistanceProgram",0,0);
        UltrasonicSensor us = new UltrasonicSensor(SensorPort.S4);
        Delay d = new Delay();
        d.msDelay(2000);
        Motor.A.forward();
        Motor.C.forward();
        while (sonic.getDistance()>=0.1){
            LCD.clear();
            LCD.drawInt(sonic.getDistance(),0,0);
            d.msDelay(200);
        }
        Button.waitforAnyPress();
        LCD.drawString("BeepProgram",0,0);
        TouchSensor ts = new TouchSensor(SensorPort.S4);
        while (true){
            while (!ts.isPressed()){
                Button.waitforAnyPress();
            }
            Sound.beep();
        }
    }
}
