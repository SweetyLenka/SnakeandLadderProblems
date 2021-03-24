package snake;
public class SnakeandLadder {
	public static void main(String[] args)
	{
		System.out.println("WECOME TO SNAKE AND LADDER PROBLEMS");
		int position=0;
		System.out.println("Start Position of Player : "+position);
		//Random Function to generate values between a range
		//Formula = Math.random() * (max - min + 1) + min
		double Dice = Math.floor(Math.random()*(6-1+1)+1);
		System.out.println("Number on Dice : "+Dice);
		}
}


