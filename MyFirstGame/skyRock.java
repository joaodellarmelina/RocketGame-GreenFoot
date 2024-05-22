import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skyRock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;
public class skyRock extends Actor
{
    int velocidade = 2;
    boolean criou = false;
    /**
     * Act - do whatever the skyRock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(velocidade * -1);
        if (getX() == 0){
            setLocation(1000, Greenfoot.getRandomNumber(400));
            if (velocidade < 10) {
                velocidade += 0.4; 
                getWorld().addObject(new skyRock(), 1000, Greenfoot.getRandomNumber(200)*Greenfoot.getRandomNumber(15));
                List<skyRock> allRocks = getWorld().getObjects(skyRock.class);
                Integer countAllRocks = allRocks.size();
                if (countAllRocks > 4) {
                    getWorld().removeObject(allRocks.get(1));
                }
                
            }else if(!criou){
                criou = true;
               
            }
        }
        
    }
}
