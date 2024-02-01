/**
 * This class contains everything that makes the walker function such as moving and reporting position
 * 
 * @author Maroof Kazi
 */
import java.util.*;

class RandomWalker{

    // creating variables
    private int x;
    private int y;
    private int Steps;

    // default walker location
    public RandomWalker(){
        x=0;
        y=0;
    }
    // incase user wants custom location
    public RandomWalker(int x,int y){
        this.x=x;
        this.y=y;
    }
    // method to move the walker
    public void move(){
        Random rand=new Random();
        int randmove = rand.nextInt(4)+1;

        if(randmove == 1){
            x++;
        }
        else if(randmove==2){
            y++;
        }
        else if(randmove==3){
            x--;
        }
        else if(randmove==4){
            y--;
        }
        Steps++;

    }
    // method to display the x-value of the walker
    public int getX(){
        return x;
    }
    // method to display the y-value of the walker
    public int getY(){
        return y;
    }
    // method to display amounts of steps walker took
    public int getSteps(){
        return Steps;
    }
    //method to change x-value of the walker
    public void setX(int x){
        this.x=x;
    }
    // method to change the y-value of the walker
    public void setY(int y){
        this.y=y;
    }
}
