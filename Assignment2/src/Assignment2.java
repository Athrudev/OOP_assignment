import java.util.Scanner;  
//creating class Publication 
class Publication { 
String title; 
double price; 
int copies; 
int copiesSold; 
//using constructor 
Publication(String title, double price, int copies) { 
this.title = title; 
this.price = price; 
this.copies = copies; 
this.copiesSold = 0;  
} 
//creating method saleCopy 
void saleCopy(int number) { 
if (number <= copies) { 
copies -= number; 
copiesSold += number; 
} else { 
System.out.println("Not enough copies available."); 
} 
} 
//creating method orderCopies 
void orderCopies(int number) { 
copies += number; 
} 
String getTitle() { 
return title; 
} 
double getPrice() { 
return price; 
} 
int getCopies() { 
return copies; 
} 
int getCopiesSold() { 
return copiesSold; 
} 
double getTotalSale() { 
return price * copiesSold; 
} 
} 
//class Book inherits class Publication 
class Book extends Publication { 
String author; 
Book(String title, double price, int copies, String author) { 
super(title, price, copies); 
this.author = author; 
} 
String getAuthor() { 
return author; 
} 
} 
//class Magazine inherits Publication 
class Magazine extends Publication { 
int currentIssue; 
Magazine(String title, double price, int copies, int currentIssue) { 
super(title, price, copies); 
this.currentIssue = currentIssue; 
} 
void receiveIssue(int issueNumber) { 
this.currentIssue = issueNumber; 
} 
int getCurrentIssue() { 
return currentIssue; 
} 
} 
//main class 
public class Assignment2 { 
public static void main(String[] args) { 
//taking scanner input  
Scanner input = new Scanner(System.in); 
System.out.println("Enter the title of the book: "); 
String bookTitle = input.nextLine(); 
System.out.println("Enter the price of the book: "); 
double bookPrice = input.nextDouble(); 
System.out.println("Enter the initial number of copies of the book: "); 
int bookCopies = input.nextInt(); 
input.nextLine();  
System.out.println("Enter the author of the book: "); 
String bookAuthor = input.nextLine(); 
System.out.println("\n"); 
//creating object 
Book book = new Book(bookTitle, bookPrice, bookCopies, bookAuthor); 
System.out.println("Enter the title of the magazine: "); 
String magazineTitle = input.nextLine(); 
System.out.println("Enter the price of the magazine: "); 
double magazinePrice = input.nextDouble(); 
System.out.println("Enter the initial number of copies of the magazine: "); 
int magazineCopies = input.nextInt(); 
System.out.println("Enter the current issue number of the magazine: "); 
int currentIssue = input.nextInt(); 
System.out.println("\n"); 
//creating object 
Magazine magazine = new Magazine(magazineTitle, magazinePrice, magazineCopies,  
currentIssue); 
System.out.println("Enter number of copies to order for the book: "); 
int orderBookCopies = input.nextInt(); 
book.orderCopies(orderBookCopies); 
System.out.println("Enter number of copies to sell for the book: "); 
int sellBookCopies = input.nextInt(); 
book.saleCopy(sellBookCopies); 
System.out.println("Enter number of copies to order for the magazine: "); 
int orderMagazineCopies = input.nextInt(); 
magazine.orderCopies(orderMagazineCopies); 
System.out.println("Enter number of copies to sell for the magazine: "); 
int sellMagazineCopies = input.nextInt(); 
magazine.saleCopy(sellMagazineCopies); 
double totalSale = book.getTotalSale() + magazine.getTotalSale(); 
//displaying output 
System.out.println("\n"); 
System.out.println("Total copies ordered for Book: " + orderBookCopies); 
System.out.println("Total copies sold for Book: " + sellBookCopies); 
System.out.println("Total copies ordered for Magazine: " + orderMagazineCopies); 
System.out.println("Total copies sold for Magazine: " + sellMagazineCopies); 
System.out.println("Total sale of all publications: Rs." + totalSale); 
//closing scanner class 
input.close(); 
} 
} 