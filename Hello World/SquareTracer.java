import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;

/**
 * DRAW A SQUARE
 * @author ERIC CHEN
 */
public class SquareTracer
{
    public static void square(int sideLength)
    {
        DifferentialPilot p = new DifferentialPilot (2.25f, 4.5f, Motor.A, Motor.C);
        for (int i = 0; i < 4; i++)
        {
            p.travel(sideLength);
            p.rotate(90);
        }
    }

    public static void main(String[] args)
    {
        square(10);
    }
}