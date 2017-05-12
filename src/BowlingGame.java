import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int bonusEnd = 0;
	
	int score = 0;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		for(int i =0; i < frames.size(); i++)
		{
			if(frames.get(i).isSpare())
			{
				bonus = frames.get(i+1);
				bonusEnd = bonus.score();
			}
			else 
				
			if(frames.get(i).isStrike())
			{
				bonus = frames.get(i+1);
				bonusEnd = bonus.score();
			}
				
		}
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		
		for(int i=0; i<frames.size(); i++)
		{
			score += frames.get(i).getFirstThrow() + frames.get(i).getSecondThrow() + bonusEnd;
		}
		return score;
	
	}
}
