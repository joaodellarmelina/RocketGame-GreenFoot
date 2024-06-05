import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class myRocket extends Actor
{
    int velocidade = 2;
    int pegueiCoin = 0;
    public void act()
    {
        setImage("rocket.png");
        if (Greenfoot.isKeyDown("D")){
              turn(5);
      }
        
      
        if (Greenfoot.isKeyDown("A")){
              turn(-5);
      }
    
      
        if (Greenfoot.isKeyDown("W")){
              move(5);
      }
    
      
        if (Greenfoot.isKeyDown("S")){ 
              move(-5);
      }
      
        if (Greenfoot.isKeyDown("space")){ 
              move(8);
              setImage("rocket-run.png");
      }
    
      if(isTouching(skyRock.class)) {
            getWorld().showText("Voce perdeu", 400, 200);
            Greenfoot.stop();   
      }

      if (isTouching(coin.class)) {
          pegueiCoin++;
          getWorld().showText("Moedas:" + pegueiCoin, 400, 200);
      }
       
       
    }
}
