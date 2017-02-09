
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //creates a city named kitchener
        City kitchener = new City();
        //creates aa new robot named bob
             Robot bob = new Robot(kitchener, 3, 0, Direction.EAST);
             new Thing(kitchener, 3, 1); 
             //building the structure
             new Wall(kitchener, 3, 2,Direction.WEST);
             new Wall(kitchener, 3, 2,Direction.NORTH);
             
             new Wall(kitchener, 2, 3,Direction.WEST);
            
             
             new Wall(kitchener, 1, 3,Direction.WEST);
             new Wall(kitchener, 1, 3,Direction.NORTH);
             new Wall(kitchener, 1, 3,Direction.EAST);
             
             new Wall(kitchener, 2, 4,Direction.EAST);
             new Wall(kitchener, 2, 4,Direction.NORTH);
             
             new Wall(kitchener, 3, 4,Direction.EAST);
             
             //moves bob around the structure
             bob.move();
             bob.pickThing();
             bob.turnLeft();
             bob.move();
             bob.turnLeft();
             bob.turnLeft();
             bob.turnLeft();
             bob.move();
             bob.turnLeft();
             bob.move();
             bob.move();
             bob.turnLeft();
             bob.turnLeft();
             bob.turnLeft();
             bob.move();
             //places the thing
             bob.putThing();
             //moves bob around the rest of the structure
             bob.move();
             bob.turnLeft();
             bob.turnLeft();
             bob.turnLeft();
             bob.move();
             bob.turnLeft();
             bob.move();
             bob.turnLeft();
             bob.turnLeft();
             bob.turnLeft();
             bob.move();
             bob.move();
             bob.turnLeft();
    }
    
}
