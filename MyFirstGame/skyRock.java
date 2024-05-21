import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skyRock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skyRock extends Actor
{
    int velocidade = 2;
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
                velocidade += 3; 
            }
        }
        
    }
}
