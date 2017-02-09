
import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.EAST;
import static becker.robots.Direction.NORTH;
import static becker.robots.Direction.SOUTH;
import static becker.robots.Direction.WEST;
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kitchener
        City kitchener = new City();
        //creates aa new robot named bob
             Robot bob = new Robot(kitchener, 1, 2, Direction.SOUTH);
             
             //createing the walls on 1,1 
             new Wall(kitchener, 1, 1, Direction.NORTH);
              new Wall(kitchener, 1, 1, Direction.WEST);
            //createing the walls in 2,1
            new Wall(kitchener, 2, 1, WEST);
            new Wall(kitchener, 2, 1, SOUTH);
           
            //creating the walls on 1,3
            new Wall(kitchener, 1, 2, EAST);
            new Wall(kitchener, 1, 2, NORTH);
            new Wall(kitchener, 1, 2, SOUTH);
             new Thing(kitchener, 2, 2);
             
             
            //turns bob 
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            //bob navagates throught the house
            bob.move(); 
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.move();
            //bob picks up the news paper
            bob.pickThing();
            //navagates bob back through the house
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            //faces bob towards original position
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
    }
    
}
