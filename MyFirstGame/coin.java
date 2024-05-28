import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;


public class coin extends Actor
{
    int levelAtual;
    
    public void act()
    {
        List<myRocket> rocketList = (getWorld().getObjects(myRocket.class));
        int coinsNumber = rocketList.get((rocketList.size() - 1)).pegueiCoin;
        
        if (isTouching(myRocket.class)) {
            //getWorld().addObject(new coin(levelAtual), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            setLocation(Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
        
        
    }
    
    coin(Integer level)
    {
        this.levelAtual = level;
    }
     
    
}
