import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controlekamer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controlekamer extends Actor
{
    /**
     * Act - do whatever the Controlekamer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        clicked();
    }    
     /** 
     * This method checks if the object is clicked.
     * If so, "Controlekamer" wil be printed.
     */
    public void clicked(){
    
    if(Greenfoot.mouseClicked(this)){
    System.out.println("Controlekamer");
    }
    
    }
}
