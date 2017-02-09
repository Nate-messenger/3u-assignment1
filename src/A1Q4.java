
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//creates a city named kitchener
        City kitchener = new City();
        //creates aa new robot named bob
             Robot bob = new Robot(kitchener, 0, 0, Direction.SOUTH);
             Robot steve = new Robot(kitchener, 0, 1, Direction.SOUTH);
             //creates the walls
             new Wall(kitchener, 0, 1,Direction.WEST);
             new Wall(kitchener, 1, 1,Direction.WEST);
             new Wall(kitchener, 1, 1,Direction.SOUTH);
             
             //alternates the the movements of the bots to get them to meet
             bob.move();
             steve.move();
             steve.turnLeft();
             steve.move();
             bob.move();
             
             steve.turnLeft();
             steve.turnLeft();
             steve.turnLeft();

             bob.turnLeft();

             steve.move();
             bob.move();
             
             steve.turnLeft();
             steve.turnLeft();
             steve.turnLeft();
             
             steve.move();

             
    }
    
}
