import lejos.nxt.*;
import lejos.util.*;
import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * DRAW A SQUARE
 * @author ERIC CHEN
 */
public class CircleTracer
{
    public static void circle(int radius, double angle)
    {
        Button.waitForAnyPress();
        DifferentialPilot p = new DifferentialPilot (2.25f, 5.5f, Motor.A, Motor.C);
        p.steer(radius, angle);
    }

    public static void main(String[] args)
    {
        circle(60, 300);
    }
}