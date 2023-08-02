import java.util.Scanner;
public class ChocoAndChilliGameUsingArray{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------------Welcome to the Game---------------------------\n");
		System.out.println("About : In this game , a bowl consist of 13 Chocolates and 1 Chilli in the last , The player who takes the Chilli will be the loser and other player will be the Winner\n");
		System.out.println("RULE : EACH PLAYER SHOULD TAKE MINIMUM OF 1 CHOCOLATE AND MAXIMUM OF 3 CHOCOLATES IN EVERY TURN\n");
		System.out.println("Enter the name of Player 1 : \n");
		String plr1=sc.next();
		System.out.println("Enter the name of Player 2 : \n");
		String plr2=sc.next();
		int user1=0;
		int user2=0;
		int pointer=0;
		int lastUser=0;
		int remain=0;
		try {
			String[]arr= {"chocolate","chocolate","chocolate","chocolate","chocolate","chocolate","chocolate","chocolate","chocolate","chocolate","chocolate","chocolate","chocolate","chilli"};
			int totalChoco = arr.length-1;
			while(true){
				System.out.println(plr1 + " , Enter the number of chocolates to take : ");
				user1=sc.nextInt();
				pointer=pointer+user1; 
				if(user1<=3 && user1>0) {
					lastUser=1;
					if(arr[pointer-1].equals("chilli")) {
						System.out.println("--------------------------------------\n" + plr1 + " got Chilli\n" + plr2 + " wins\n" + "----------Thanks for playing----------");
						break;
					 }
					else if(arr[pointer].equals("chilli")) {
						System.out.println("--------------------------------------\n" + plr2 + " got Chilli\n" + plr1 + " wins\n" + "----------Thanks for playing----------");
						break;
					}
					else {
						remain=totalChoco-pointer;
						System.out.println("Remaining Chocolates : " + remain);
					}
				}
				else {
					System.out.println("You can take maximum of 3 chocolates only Or should take minimum of 1 chocolate\n" + "Invalid input\n" + "Try again");
					break;
				}
				System.out.println(plr2 + " , Enter the number of chocolates to take : ");
				user2=sc.nextInt();
				pointer=pointer+user2;
				if(user2<=3 && user2>0) {
					lastUser=2;
					if(arr[pointer-1].equals("chilli")) {
						System.out.println("--------------------------------------\n" + plr2 + " got Chilli\n" + plr1 + " wins\n" + "----------Thanks for playing----------");
						break;
					}
					else if(arr[pointer].equals("chilli")) {
						System.out.println("--------------------------------------\n" + plr1 + " got Chilli\n" + plr2 + " wins\n" + "----------Thanks for playing----------");
						break;
					}
					else {
						remain=totalChoco-pointer;
						System.out.println("Remaining Chocolates : " + remain);
					}
				}
				else {
					System.out.println("You can take maximum of 3 chocolates only Or should take minimum of 1 chocolate\n" + "Invalid input\n" + "Try again");
					break;
				}	
		  }
		}
		catch(Exception e) {
			if(lastUser==1) {
				System.out.println("--------------------------------------\n" + plr1 + " got Chilli\n" + plr2 + " wins\n" + "----------Thanks for playing----------");
			}
			else {
				System.out.println("--------------------------------------\n" + plr2 + " got Chilli\n" + plr1 + " wins\n" + "----------Thanks for playing----------");
			}
		}
	}
}
