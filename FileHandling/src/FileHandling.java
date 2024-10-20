import java.io.*;
import java.util.*;


class FileOperation{
	final String EXTENSION=".txt";
	Scanner sc=new Scanner(System.in);
	
	public void createFile() {
		String fileName;
		System.out.println("Enter file name:");
		fileName=sc.nextLine();
		File file=new File(fileName+EXTENSION);
		try {
			if(file.createNewFile()) {
				System.out.println("File "+file.getName()+" Created Successfully...!");
			}else {
				System.out.println(file.getName()+"File already exist");
			}
		}catch(Exception e) {
			System.out.println("Unexpected Exception occur...!");
			e.printStackTrace();
		}
	}
	
	public void Insert() {
		try {
			String filename,data;
			System.out.println("Enter file name you want to open");
			filename=sc.nextLine();
			FileWriter w=new FileWriter(filename+EXTENSION,true);
			System.out.println("Enter data:");
			data=sc.nextLine();
			w.write(data+"\n");
			System.out.println("Data Inserted Successfully..!");
			w.close();
		}catch(Exception e) {
			System.out.println("Error occured");
			e.printStackTrace();
		}
	}
	
	public void Display() {
		String name;
		try {
			System.out.println("Enter File name:");
			name=sc.nextLine();
			File file=new File(name+EXTENSION);
			Scanner read=new Scanner(file);
			while(read.hasNextLine()) {
				String data=read.nextLine();
				System.out.println(data);
			}
			
			read.close();
			
		}catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		
	}
}

public class FileHandling {

	public static void main(String[] args) {
	
		while(true) {
			int ch;
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Create a new file");
			System.out.println("2. Insert data");
			System.out.println("3. Display data");
			System.out.println("4. Exit");
			System.out.println("Enter your Choice:");
			ch=sc.nextInt();
			FileOperation obj=new FileOperation();
			
			switch(ch) {
			case 1:
				obj.createFile();
				break;
			
			case 2:
				obj.Insert();
				break;
				
			case 3:
				obj.Display();
				break;
				
			case 4:
				System.out.println("Exiting the Program....");
				System.exit(0);
				sc.close();
				
			default:
				System.out.println("Invalid Choice...!");
			}
			
		}
	}

}
