import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class myRocket extends Actor
{
    int velocidade = 2;
    int pegueiCoin = 0;
    public void act()
    {
       if(Greenfoot.isKeyDown("W")) {
           setLocation(getX(), getY() - velocidade);
           velocidade += 0.2;
       } else if (Greenfoot.isKeyDown("S")) {
           setLocation(getX(), getY() + velocidade);
           velocidade += 0.2;
       }else if (Greenfoot.isKeyDown("D")) {
           setLocation(getX() + velocidade, getY());
           velocidade += 0.2;
       }else if (Greenfoot.isKeyDown("A")) {
           setLocation(getX() - velocidade, getY());
           velocidade += 0.2;
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
