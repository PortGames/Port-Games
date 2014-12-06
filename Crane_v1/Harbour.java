import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Harbour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Harbour extends World
{

    /**
     * Constructor for objects of class Harbour.
     * 
     */
    public Harbour()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new MainPart(), 550, 50);
    }
}
