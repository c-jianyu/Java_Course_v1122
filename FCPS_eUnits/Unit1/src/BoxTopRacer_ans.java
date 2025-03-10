
public class BoxTopRacer_ans extends Racer
{
    public BoxTopRacer()
    {
    }
    public BoxTopRacer(int y)
    {
        super(y);
    }

    public void jumpRight()
    {
        turnLeft();
        while(!rightIsClear()){
            move();
        }
        turnRight();
        move();
        while(!rightIsClear()){
            move();
        }
        turnRight();
        while(frontIsClear()){
            move();
        }
        turnLeft(); 
    }

}
