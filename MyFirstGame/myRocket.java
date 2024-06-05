import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class myRocket extends Actor
{
    int velocidade = 2;
    int pegueiCoin = 0;
    public void act()
    {
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
      if(isTouching(skyRock.class)) {
           Greenfoot.stop();   
       }
      if (isTouching(coin.class)) {
          pegueiCoin++;
          getWorld().showText("Moedas:" + pegueiCoin, 400, 200);
      }
       
       
    }
}
