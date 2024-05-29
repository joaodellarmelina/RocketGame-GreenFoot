import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 550, 1);
        
        init();
    }

    private void init() {
        Greenfoot.setWorld(new Startscreen());
        skyRock rocha = new skyRock(1);;
        
        addObject(rocha, 1000, 200);
        addObject(new coin(0), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        
        addObject(new myRocket(), 200, 200);
                      
        
    }
}
