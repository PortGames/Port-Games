import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainPart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainPart extends CraneParts
{
    /**
     * Act - do whatever the MainPart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        if (Greenfoot.isKeyDown("left")) {
			setLocation(getX() - 5, getY());
		}
		if (Greenfoot.isKeyDown("right")) {
			setLocation(getX() + 5, getY());
		}
		if (Greenfoot.isKeyDown("up")) {
			setLocation(getX(), getY() - 5);
		}
		if (Greenfoot.isKeyDown("down")) {
			setLocation(getX(), getY() + 5);
		}
        /*switch () {
            case Greenfoot.isKeyDown("left"):   setLocation(getX() - 5, getY());
                break;
            case Greenfoot.isKeyDown("right"):  setLocation(getX() + 5, getY());
                break;
            case Greenfoot.isKeyDown("up"):     setLocation(getX(), getY() - 5);
                break;
            case Greenfoot.isKeyDown("down"):   setLocation(getX(), getY() + 5);
                break;
        }*/
    }    
}
