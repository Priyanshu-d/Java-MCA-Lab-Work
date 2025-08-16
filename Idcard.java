import java.util.Scanner;
class Idcard {
	 int sapId=1299459;
	 String name="Student1";
	 
	void display(){
	System.out.println("My SapId is"+sapId+"my name is"+name);
	System.out.println("I am in MCA AI/ML");
	

}
	void details(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name.");
	String name=sc.nextLine();
	System.out.print("ENTER  School  name");
	String sn=sc.nextLine();
	
	System.out.println("Enter program ");
	String prog=sc.nextLine();
	System.out.println(" enter Batch:");
	String batch=sc.nextLine();
	System.out.println("Your name is:"+name+"\n"+
	"your school name is:"+sn+"\n"+
	"your program is "+prog+"\n"+
	"your batch is:"+batch+"\n");
	
	

}
public static void main(String [] args){

Idcard mca=new Idcard();

mca.details();
}

}