import java.util.*;
import java.io.*;

public class InsertInFile {

	public static void main(String[] args) {
		try {
			
			File obj=new File("f1.txt");
			if(obj.createNewFile()) {
				System.out.println("File Created Successfully...!");
			}else {
				System.out.println("File Already Exist");
			}
			
			FileWriter fwriter=new FileWriter(obj); //created file writer object
			Scanner fread=new Scanner(obj);
			
			fwriter.write("This is the first line of file");
			fwriter.write("This is the Second line of file");
			fwriter.close();
			System.out.println("File write successfully....!");
			
			while(fread.hasNextLine()) {
				String data=fread.nextLine();
				System.out.print(data);
			}
			
			
			
		}catch(Exception e) {
			System.out.println("EXception occured"+e);
			e.printStackTrace();
		}
	}

}
