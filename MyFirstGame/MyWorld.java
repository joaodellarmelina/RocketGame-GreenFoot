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
        super(600, 400, 1);
        
        init();
    }

    private void init() {
        skyRock rocha = new skyRock();
        addObject(rocha, 1000, 200); 
        addObject(new myRocket(), 200, 200);
                  
        
    }
}
