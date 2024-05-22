import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class myRocket extends Actor
{
    int velocidade = 2;
    public void act()
    {
       if(Greenfoot.isKeyDown("W")) {
           setLocation(getX(), getY() - velocidade);
           velocidade += 0.2;
       } else if (Greenfoot.isKeyDown("S")) {
           setLocation(getX(), getY() + velocidade);
           velocidade += 0.2;
       }
       if(isTouching(skyRock.class)) {
           Greenfoot.stop();   
       }
       
    }
}
