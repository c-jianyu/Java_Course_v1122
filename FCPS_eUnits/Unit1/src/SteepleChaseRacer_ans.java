
public class SteepleChaseRacer_ans extends Racer
{
    public SteepleChaseRacer()
    {
    }
    public SteepleChaseRacer(int y)
    {
        super(y);
    }

    public void jumpRight()
    {
         turnLeft();
         move();
         turnRight();
         move();
         turnRight();
         move();
         turnLeft();
    }
    public void jumpLeft()
    {
         turnRight();
         move();
         turnLeft();
         move();
         turnLeft();
         move();
         turnRight();
    }

    public void sprint(int n)
    {
         for(int k=1; k <= n; k++) move();
    }
    
    public void put(int n)
    {
         for(int k=1; k <= n; k++) putBeeper();
    }
    
    public void pick(int n)
    {
         for(int k=1; k <= n; k++) pickBeeper();
    }

}
