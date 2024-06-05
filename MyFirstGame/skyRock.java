import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class skyRock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;

public class skyRock extends Actor
{
    int velocidade;
    Direction direction = new Direction(0, 0);
    
    ArrayList<Direction> validDirections = new ArrayList<Direction>() {{
        add(new Direction(-1, 0));
        add(new Direction(-1, 1));
        add(new Direction(-1, -1));
    }};
    
    skyRock() 
    {
        int randomIndex = Greenfoot.getRandomNumber(validDirections.size());
        direction = validDirections.get(randomIndex);
        velocidade = getRandomVelocity();
    }
    
    skyRock(Direction direction) 
    {
        this.direction = direction;
        velocidade = getRandomVelocity();
    }
    
    skyRock(Direction direction, int velocidade)
    {
        this.direction = direction;
        this.velocidade = velocidade;
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
                
            Direction direction = getRandomDirection();
            int initialX = 1000;
            int initialY = Greenfoot.getRandomNumber(200) * Greenfoot.getRandomNumber(15);
            skyRock newRock = new skyRock(direction);
            
            if (direction.x == -1 && direction.y == 1) {
                initialX = 200 + Greenfoot.getRandomNumber(500);
                initialY = 15;
            }
            
            if (direction.x == -1 && direction.y == -1) {
                initialX = 200 + Greenfoot.getRandomNumber(500);
                initialY = getWorld().getHeight() - 15;
            }
                
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
        int margin = 10;
        
        return x <= 0 || x >= xLimit || y <= margin || y >= yLimit -margin;
    }
    
    private Direction getRandomDirection() {
        int randomIndex = Greenfoot.getRandomNumber(validDirections.size());
        return validDirections.get(randomIndex);
    }
    
    private int getRandomVelocity() {
        return 1 + Greenfoot.getRandomNumber(2);
    }
}
