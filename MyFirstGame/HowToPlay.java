import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends World
{

    
     
    public HowToPlay()
    {    
         super(800, 550, 1);
         setBackground("bg-howtoplay.png");
         
        
    }
    public void act()
    
    {
        String key = Greenfoot.getKey();
          if("enter".equals(key)) {
              Greenfoot.setWorld(new Startscreen());
          }
        
    }
}
