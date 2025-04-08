// inside the my project package
package MyProject;

//importing the Scanner class from the util package
import java.util.Scanner;

//defining the Restaurant class
class Restaurant{
	
// declare the private attributes
 private int id;
 private String name;
 private String email;
 private long phone;
 private String address;
 
//building the getter method for id
 public int getId(){
  return id;
  }

//getter method for name
 public String getName() {
  return name;
  }
 
//getter method for email
 public String getEmail() {
  return email;
  }

//getter method for phone
 public long getPhone(){
  return phone;
  }
 
//getter method for address
 public String getAddress(){
  return address;
  }

//constructor to initialize all the attributes
 public Restaurant(int id, String name, String email, Long phone, String address){
  this.id=id;
  this.name=name;
  this.email=email;
  this.phone=phone;
  this.address=address;
  }
}


//main class to execute the program
class Main {

 public static void main(String[] args) {

	// creating Scanner object to take user input
  Scanner sc=new Scanner(System.in);
  
  // prompting user to enter input
  System.out.println("ID,Name,Email,Phone,Address");

  // reading the input line
  String s=sc.nextLine();

  //splitting the input string by commas
  String []a=s.split(",");

//parsing and assigning values from input
  int id=Integer.parseInt(a[0]);
  String name=a[1];
  String email=a[2];
  Long phone= Long.parseLong (a[3]);
  String address=a[4];


  // creating Restaurant object with parsed values
  Restaurant r = new Restaurant(id, name, email, phone, address);

  // printing the restaurant details using getter methods
  System.out.println(r.getId());
  System.out.println(r.getName());
  System.out.println(r.getEmail());
  System.out.println(r.getPhone());
  System.out.println(r.getAddress());
  }
}