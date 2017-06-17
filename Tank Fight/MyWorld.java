import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static int gameState = 0;
    int taskQueue = 1;
    
    private PlayerOne tankOne;
    private PlayerTwo tankTwo;
    private Tank tank;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
    }
    
    public void act()
    {
        mouseInfo();
        
        gameState();
        
        //System.out.println("Game state is now: " + gameState);
    }
    
    /**
     * This method is used to get the user's mouse actions
     */
    public void mouseInfo() 
    {
        // Gets mouse's actions
        MouseInfo mouse = Greenfoot.getMouseInfo();
        // Gets the actor that the mouse is clicking on
        if (mouse != null) {
            Actor currentActor = mouse.getActor();
            // If it is clicking on an actor
            if (currentActor != null) {
                // If it is clicking on a button
                if (currentActor.getClass() == Button.class) {
                    Button currentButton = (Button)currentActor;
                    int mouseClickCount = mouse.getClickCount();
                    // Click once, buttonToggle (in Button class)
                    if (mouseClickCount == 1) {
                        currentButton.buttonToggle();
                    }
                }
            }
        }
    }
    
    public void gameState() {
        switch (gameState) {
            case 0:
                //Generates two buttons
                for (int i = 0; i < taskQueue; i++) {
                    spawnButton();
                    
                    taskQueue = 0;
                }
                break;
            case 1:
                //Game
                
                break;
            case 2:
                //Ending screen
                break;
        }
    }
    
    /**
     * Spawns two buttons.
     * Allows the users to choose the map that they want to play on.
     * Both buttons will be removed when one of them is clicked (see code for Button).
     */
    public void spawnButton()
    {
        Button button1 = new Button("Tall Building");
        Button button2 = new Button("Temple");
        
        // Gets the world's width and height
        int worldWidth = getWidth();
        int worldHeight = getHeight();
        
        // Adds the buttons into the world
        addObject(button1, worldWidth * 1/3, worldHeight / 2);
        addObject(button2, worldWidth * 2/3, worldHeight / 2);
    }
    
    /**
     * Settings for map 1 Tall Building.
     */
    public void tallBuilding()
    {
        setBackground(new GreenfootImage("Map 1 Tall Building Zones.png"));
        tankOne = new PlayerOne();
        addObject(tankOne, 50, 500);
        tankTwo = new PlayerTwo();
        addObject(tankTwo, 1150, 500);
        tankTwo.setRotation(180);
        tankOne.mapChoice(1);
        tankTwo.mapChoice(1);
    }
    
    /**
     * Settings for map 2 Temple.
     */
    public void temple()
    {
        setBackground(new GreenfootImage("Map 2 Temple Zones.png"));
        tankOne = new PlayerOne();
        addObject(tankOne, 50, 600);
        tankTwo = new PlayerTwo();
        addObject(tankTwo, 1150, 600);
        tankTwo.setRotation(180);
        tankOne.mapChoice(2);
        tankTwo.mapChoice(2);
    }
    
    public void createTanks()
    {
        
    }
    
    public void endingScreen()
    {
    }
    
    public void endGame()
    {
    }
    
}
