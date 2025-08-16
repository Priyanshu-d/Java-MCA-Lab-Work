import java.util.Scanner;
class MCAII {
	 int sapId=1299459;
	 String name="Student1";
	 
	void display(){
	System.out.println("My SapId is"+sapId+"my name is"+name);
	System.out.println("I am in MCA AI/ML");	

}
	void details(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first no.");
	int x=sc.nextInt();
	System.out.print("ENTER  second no.");
	int y=sc.nextInt();
	int z=x+y;
	System.out.println("the sum is\t"+z);

}
public static void main(String [] args){

MCAII mca=new MCAII();
mca.display();
mca.details();
}

}