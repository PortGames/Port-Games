import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hoofdmenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hoofdmenu extends World
{

    /**
     * Constructor for objects of class Hoofdmenu.
     * 
     */
    public Hoofdmenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Kraan kraan = new Kraan();
        addObject(kraan, 283, 192);
    }
}
