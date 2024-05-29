import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class skyRock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;

class Direction {
    int x = 0;
    int y = 0;
    
    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class skyRock extends Actor
{
    int velocidade = 2;
    boolean criou = false;
    Direction direction = new Direction(0, 0);
    ArrayList<Direction> validDirections = new ArrayList<Direction>() {{
        add(new Direction(-1, 0));
        add(new Direction(-1, 1));
    }};
    
    skyRock(int movType) 
    {
        int randomIndex = Greenfoot.getRandomNumber(validDirections.size());
        direction = validDirections.get(randomIndex);
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x + direction.x * velocidade, y + direction.y * velocidade);
        
        if (isOutOffscreen()) {
            velocidade += velocidade < 10 ? 0.4 : 0;
                
            List<skyRock> allRocks = getWorld().getObjects(skyRock.class);
            Integer countAllRocks = allRocks.size();
                
            int initialX = 1000;
            int initialY = Greenfoot.getRandomNumber(200) * Greenfoot.getRandomNumber(15);
            skyRock newRock = new skyRock(Greenfoot.getRandomNumber(4));
                
            getWorld().addObject(newRock, initialX, initialY);
                
            if (countAllRocks > 4) {
                getWorld().removeObject(this);
            }
        }   
    }
    
    private boolean isOutOffscreen() {
        int x = getX();
        int y = getY();
        int xLimit = getWorld().getWidth();
        int yLimit = getWorld().getHeight();
        
        return x <= 0 || x >= xLimit || y <= 0 || y >= yLimit;
    }
}
