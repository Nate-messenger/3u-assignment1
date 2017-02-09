
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nate
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kitchener
        City kitchener = new City();
        
        Robot m = new Robot(kitchener, 0, 1, Direction.WEST);
        Robot k = new Robot(kitchener, 3, 3, Direction.EAST);
        
         m.setLabel("M");
         k.setLabel("K");

         
         
        //creates the walls
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 2, 3, Direction.EAST);            
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        //places all the things
        new Thing(kitchener, 0, 0);
        new Thing(kitchener, 1, 0);
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 2, 2);
        new Thing(kitchener, 1, 1);
        
        k.turnLeft();
        k.turnLeft();
       
        k.move();
        
        m.move();
        m.pickThing();
        m.turnLeft();
        m.move();
        m.pickThing();
        
        
        k.turnLeft();
        k.turnLeft();
        k.turnLeft();
        k.move();
        k.pickThing();
        
        m.turnLeft();
        m.move();
        m.pickThing();
        
        k.move();
        k.pickThing();
        k.turnLeft();
    }
    
}
