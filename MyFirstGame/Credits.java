import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends World
{ 
    public Credits()
    {    
         super(800, 550, 1);
         setBackground("bg-creditos.png");
         
        
    }
    public void act()
    
    {
        String key = Greenfoot.getKey();
          if("enter".equals(key)) {
              Greenfoot.setWorld(new Startscreen());
          }
        
    }
}
