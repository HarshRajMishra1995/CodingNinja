package fundamentals;

import java.util.Scanner;

public class takingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int a,b;
//			Scanner s=new Scanner(System.in);
//			a=s.nextInt();
//			b=s.nextInt();
//			int c=a+b;
//			System.out.print(c);
			
//			s.nextDouble() to take double as an input
//			s.nextFloat()  to take float as an input
//			s.next()       to take String as an input
			
		Scanner s=new Scanner(System.in);
		String str=s.next();//It take the input word by word
		//to take input as a whole sentence use
//		String str1=s.nextLine();
		System.out.print(str);
		 
	}

}
