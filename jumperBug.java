// package info.gridworld.actor;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

public class JumperBug extends Actor{
	
	private int steps;


	// Plan:
	// If jumper can jump, it will jump
	// else, it will turn 45 degrees
	

	// tell the bug to not only check the adjacent space before jumping, but the space after
	// if the space is unoccupied, it will jump to the location
	// otherwise, if the space has a wall, or if it is beyond the wall, it will only turn
	// To do this, canMove will be modified so that the jumperBug will move two spaces instead of one
	// Make a method that will check two spaces ahead before jumping, otherwise turn the bug


	// The jumperBug should be an actor, as bugs leave behind flowers regardless of their movement
	// Using an actor will not leave behind flowers


	// To test the class, put obstacles in random areas and test if it can jump over them or avoid them
	// Specific situation: both squares vacant in front of the bug, 
	// -neighboring cell is occupied but the other one isn't
	// -neighboring cell is unoccupied but the other one isn't
	// -neighboring cell is at the edge of the grid
	// -both cells are occupied
	// -adjacent cell either occupied or not, with the next cell at the edge
	// 

	public JumperBug()
	{

	}

	public void act() {
		if (canJump()) {
			jump();
		} else {
			turn();
		}
	}

	public void turn() 
	 { 
	 setDirection(getDirection() + Location.HALF_RIGHT); 
	 }



	public boolean canJump() {
	    Grid<Actor> gr = getGrid();
	    if (gr == null)
	        return false;

	    Location loc = getLocation();
	    Location next = loc.getAdjacentLocation(getDirection());
	    Location second = next.getAdjacentLocation(getDirection());
	    
	    if (!gr.isValid(next))
	        return false;

	    if (!gr.isValid(second))
	    	return false;
	    Actor neighbor = gr.get(second);
	    return (neighbor == null) || (neighbor instanceof Flower);
	}

	public void jump()
	{
		Location here = getLocation();
		Location nextLocation = here.getAdjacentLocation(getDirection());
		Location afterNext = nextLocation.getAdjacentLocation(getDirection());

		moveTo(afterNext);


		// if (canJump(second)) {
		// 	moveTo(second);
		// }
	}

}