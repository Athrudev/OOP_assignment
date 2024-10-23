import java.io.*;
import java.util.*;

class Database{
	Scanner sc=new Scanner(System.in);
	public final String FILE_NAME="database.txt";
	
	public static String DbEntry(String id,String name,int roll,String Class,int marks,String Address) {
		return id+","+name+","+roll+","+Class+","+marks+","+Address;
	}
	public static String DbEntry(String id,String name,String roll,String Class,String marks,String Address) {
		return id+","+name+","+roll+","+Class+","+marks+","+Address;
	}
	
	  public void CreateDatabase() {
	        int n;
	        
	        try {
	            FileWriter w = new FileWriter(FILE_NAME, true);
	            System.out.println("Enter no of entries to Add:");
	            n = sc.nextInt();
	            sc.nextLine(); // Consume the newline
	            
	            for (int i = 0; i < n; i++) {
	                System.out.println("Enter Information for Student " + (i + 1));
	                System.out.println("Student name:");
	                String name = sc.nextLine();
	                System.out.println("Student ID:");
	                String id = sc.nextLine();
	                System.out.println("Roll no:");
	                int Rollno = sc.nextInt();
	                sc.nextLine(); // Consume the newline
	                System.out.println("Class:");
	                String Class = sc.nextLine();
	                System.out.println("Marks:");
	                int marks = sc.nextInt();
	                sc.nextLine(); // Consume the newline
	                System.out.println("Address:");
	                String Address = sc.nextLine();
	                String data = Database.DbEntry(id,name, Rollno, Class, marks, Address);
	                w.write(data + '\n');
	            }
	            System.out.println("Record for student "+n+" added Successfully....!");
	            w.close(); // Close the FileWriter
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	public void Display() {
		try {
			File file=new File(FILE_NAME);
			Scanner reader=new Scanner(file);
			while(reader.hasNextLine()) {
				String data=reader.nextLine();
				//.System.out.println(data);
				String[] arr=data.split(",");
				System.out.println("ID:"+arr[0]+",Name:"+arr[1]+",Roll No:"+arr[2]+",Class:"+arr[3]+
						",Marks:"+arr[4]+",Address:"+arr[5]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
    public void DeleteRecord() {
        try {
            boolean found = false;
            System.out.println("Enter Student ID to delete:");
            String id = sc.nextLine();
            List<String> list = new ArrayList<>();
            File file = new File(FILE_NAME);
            Scanner reader = new Scanner(file);
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.startsWith(id + ",")) {
                    found = true;
                    System.out.println("Deleting record: " + id);
                } else {
                    list.add(line);
                }
            }
            reader.close();
            
            if (found) {
                FileWriter w = new FileWriter(FILE_NAME);
                for (String record : list) {
                    w.write(record + '\n');
                }
                w.close();
                System.out.println("Record Deleted Successfully!");
            } else {
                System.out.println("Record Not Found");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
	public void UpdateRecord() {
		
		try {
			boolean found =true;
			System.out.println("Enter Student Id to Update:");
			String id= sc.nextLine();
			List<String> list=new ArrayList();
			Scanner reader=new Scanner(new File(FILE_NAME));
			
			while(reader.hasNextLine()) {
				String line=reader.nextLine();
				if(line.startsWith(id)) {
					found=true;
					
					String arr[]=line.split(",");
					arr[1]=updateField("Name:",arr[1]);
					arr[2]=updateField("Roll No:",arr[2]);
					arr[3]=updateField("Class",arr[3]);
					arr[4]=updateField("Marks:",arr[4]);
					arr[5]=updateField("Address:",arr[5]);
					
					String updateRecord=Database.DbEntry(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
					list.add(updateRecord);
					
				}else {
					list.add(line);
				}
			}
			
			
			if(found) {
				FileWriter w=new FileWriter(FILE_NAME);
				for(String record:list) {
					//System.out.println(record);
					w.write(record+"\n");
				}
				w.close();
				System.out.println("Record Updated Successully...!");
			}else {
				System.out.println("No changes has been made");
			}
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
    
	private String updateField(String field,String val) {
		
		System.out.println("Current "+field+" : "+val);
		System.out.println("Enter new "+field+" (or enter to skip updation of the field)");
		String input=sc.nextLine();
		return input.isEmpty()?val:input;
		
	}
    

	public void SearchRecord() {
		try {
			
			//boolean found= false;
			Scanner reader=new Scanner(new File(FILE_NAME));
			System.out.println("Enter the ID to be Search");
			String id=sc.nextLine();
			while(reader.hasNextLine()) {
				String info=reader.nextLine();
				if(info.startsWith(id)) {
					System.out.println("Record Founded...!");
					System.out.println(info);
				}else {
					System.out.println("Record not found");
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}



public class Assignment8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//File file=new File(FILE_NAME);
		Database d=new Database(); //created database class object for the DB operation
		int ch;
		
		while(true) {
			System.out.println("1. Create Database");
			System.out.println("2. Display Database");
			System.out.println("3. Delete Records");
			System.out.println("4. Update Record");
			System.out.println("5. Search Record");
			System.out.println("6. Exit");
			System.out.println("Enter your Choice:");
			
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				d.CreateDatabase();
				break;
			case 2:
				d.Display();
				break;
				
			case 3:
				d.DeleteRecord();
				break;
				
			case 4:
				d.UpdateRecord();
				break;
				
			case 5:
				d.SearchRecord();
				break;
				
			case 6:
				System.out.println("Exited Successfully...!");
				System.exit(0);
				sc.close();
				
			default:
				System.out.println("Invalid choice");
			}
			
		}

	}

}
