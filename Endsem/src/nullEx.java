
public class nullEx {

	public static void main(String[] args) {
		String s=null;
		try {
			int l=s.length();
			System.out.println(l);
		}catch(NullPointerException e) {
			System.out.println("Exception occurs: you are trying to access the null poiner");
		}
	}

}
