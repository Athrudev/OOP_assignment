
public class Generic {

	public static <T> void display(T[] a) {
		for(T i:a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		Integer a[] = {1, 2, 3, 4, 5};
        Double b[] = {1.1, 2.2, 3.3, 1.4, 1.5};
        //Char c[] = {'a', 'b', 'c', 'd', 'e'};
        String[] c = {"apple", "banana", "cherry"};
        
        display(a);
        display(b);
        display(c);
	}

}
