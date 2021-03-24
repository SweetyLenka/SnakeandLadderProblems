package snake;
public class SnakeandLadder {
	public static void main(String[] args)
	{
		System.out.println("WECOME TO SNAKE AND LADDER PROBLEMS");
		int position=0;
		System.out.println("Initial Position of Player : "+position);
		
		
		while(position<100)
		{
			//Random Function to generate values between a range
			//Formula = Math.random() * (max - min + 1) + min
			int Dice = (int) Math.floor(Math.random()*(6-1+1)+1);
			System.out.println("Number on Dice : "+Dice);
			int Option = (int) Math.floor(Math.random()*10)%3;
			
			System.out.println("====OPTIONS======\nOption 0 : No Play\nOption 1 : Ladder \nOption 2 : Snake \n");
			System.out.println("Option : "+Option);
			
			if (Option == 0)
			{
				System.out.println("No Play the player stays in the same position "+position);
			}
			else if (Option == 1)
			{
				position = position + Dice;
				//System.out.println(position);
				if(position > 100)
				{
					position=100;
					System.out.println("Player has won : "+position);
				}
				else if (position == 100)
				{
					System.out.println("Player has won : "+position);
				}
				else
				{
					System.out.println("Player moves ahead by : "+position);
				}
					
					
				
			}
			else 
			{
				position = position - Dice;
				System.out.println("Player moves behind by :" +position);
				if(position < 0)
				{
					position = 0;
					System.out.println("Player restarts from " +position);
				}
				
			}

		
		}
		
	}		
	}


