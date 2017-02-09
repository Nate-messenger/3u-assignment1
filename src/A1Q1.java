
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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kitchener
        City kitchener = new City();
        //creates aa new robot named bob
             Robot bob = new Robot(kitchener, 0, 2, Direction.WEST);
             
             //createing the walls on 1,1 
             new Wall(kitchener, 1, 1, Direction.NORTH);
              new Wall(kitchener, 1, 1, Direction.WEST);
            //createing the walls in 2,1
            new Wall(kitchener, 2, 1, WEST);
            new Wall(kitchener, 2, 1, SOUTH);
            //creatreing the walls in 2,2
            new Wall(kitchener, 2 ,2, SOUTH);
            new Wall(kitchener, 2 ,2, EAST);
            //creating the walls on 1,3
            new Wall(kitchener, 1, 2, EAST);
            new Wall(kitchener, 1, 2, NORTH);
            
            
            //makes bob walk to the corner
            bob.move();
            bob.move();
            //turns bob around the corner
            bob.turnLeft();
            //makes bob walk to the corner
            bob.move();
            bob.move();
            bob.move();
            //turns bob around the corner
            bob.turnLeft();
            //makes bob walk to the corner
            bob.move();
            bob.move();
            bob.move();
              //turns bob around the corner
            bob.turnLeft();
            //makes bob walk to the corner
            bob.move();
            bob.move();
            bob.move();
            
            bob.turnLeft();
            //returns bob bact to the start
            bob.move();
    }
    
}
