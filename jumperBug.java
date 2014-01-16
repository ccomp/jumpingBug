public class jumperBug extends Actor{
	


	// Plan:
	// If jumper can jump, it will jump
	// else, it will turn 45 degrees
	// 

	// tell the bug to not only check the adjacent space before jumping, but the space after
	// if the space is unoccupied, it will jump to the location
	// otherwise, if the space has a wall, or if it is beyond the wall, it will only turn
	// To do this, canMove will be modified so that the jumperBug will move two spaces instead of one
	// Make a method that will check two spaces ahead before jumping, otherwise turn the bug
	// 
	// 
	// The jumperBug should be an actor, as bugs leave behind flowers regardless of their movement
	// Using an actor will not leave behind flowers
	// 
	// 
	// To test the class, put obstacles in random areas and test if it can jump over them or avoid them
	// Specific situation: both squares vacant in front of the bug, 
	// -neighboring cell is occupied but the other one isn't
	// -neighboring cell is unoccupied but the other one isn't
	// -neighboring cell is at the edge of the grid
	// -both cells are occupied
	// -adjacent cell either occupied or not, with the next cell at the edge
	// 
	public jumperBug(int length)
	{
		steps = 0;
	}

}