import java.util.Scanner;
/**
 * @author 	SUBHA FAIRUZ
 *
 */
public class calculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for( i=0; i<=4;i++) {
			System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.EXIT");
			System.out.print("Choose Your Operator:");	
			Scanner input = new Scanner(System.in);
			int option= input.nextInt();
			if(option==5)
				System.exit(0);
				
			while(option>=6 || option<=0){
				System.out.println("Please select one(1) to five(5).");
				option= input.nextInt();
				
			}
			add addobj= new add();
			subtract subobj= new subtract();
			multiplication mulobj= new multiplication();
			division divobj= new division();
			
			if(option!=5)
				System.out.println("Enter two number:");
				int number1= input.nextInt();
				int number2=input.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Addition:"+"("+ number1 +") + ("+ number2 +") =  "+ addobj.result(number1,number2));
				break;
			case 2:
				System.out.println("Subtraction:"+"("+ number1 +") - ("+ number2 +") = "+ subobj.result(number1,number2));
				break;
			case 3:
				System.out.println("Multiplication:"+"("+ number1 +") * ("+ number2 +") = "+ mulobj.result(number1,number2));
				break;
			
			case 4:
				while(number1==0){
				System.out.println("Please enter non-zero value of first number:");
				number1= input.nextInt();
				number2= input.nextInt();
				}
				System.out.println("Division:"+ "("+ number1 +") / ("+ number2 +") = "+ divobj.result(number1,number2));
				break;
			case 5:
					System.exit(0);
				//break;
			default:
				break;
			}
			System.out.println("\n");
		
		}
		return ;
	}
}


