import java.util.*;
import java.lang.*;
public class exceptionDemo {

	public static void main(String[] args) {

		int a[]= {1,2};
		try {
			int sum=a[0]/a[2];
			System.out.println("The sum is: "+sum);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occurs: you are trying to access the index that is out of bound");
			
		}
	}

}
