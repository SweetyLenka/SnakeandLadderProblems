package snake;
public class SnakeandLadder {
	public static void main(String[] args)
	{
		System.out.println("WECOME TO SNAKE AND LADDER PROBLEMS");
		int position=0;
		System.out.println("Start Position of Player : "+position);
		//Random Function to generate values between a range
		//Formula = Math.random() * (max - min + 1) + min
		int Dice = (int) Math.floor(Math.random()*(6-1+1)+1);
		System.out.println("Number on Dice : "+Dice);
		
		//Options
		int Option = (int) Math.floor(Math.random()*10)%3;
		
		System.out.println("====OPTIONS======\nOption 0 : No Play\nOption 1 : Ladder \nOption 2 : Snake \n");
		System.out.println("Option : "+Option);
		switch(Option) {
		case 1:
			position += Dice;
			System.out.println("Player moves ahead by : "+position);
			break;
		case 2:
			position -= Dice;
			System.out.println("Player moves behind by : "+position);
			break;
		default:
			System.out.println("Player stays in the same position : "+position);
			
		
		}
	}
}


