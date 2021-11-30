package fundamentals;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int m1,m2,m3,avg;
        String str;
        Scanner s=new Scanner(System.in);
        str=s.next();
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        avg=(m1+m2+m3)/3;
        System.out.println(str);
        System.out.print(avg);
	}

}
