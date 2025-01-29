import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
	static ArrayList<String> Name = new ArrayList<String>();
	static ArrayList<Long> MobileNumber = new ArrayList<Long>();
	static ArrayList<String> Email = new ArrayList<String>();
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		
		do
		{
		System.out.println("Enter the corresponding value"+'\n'+"\t1.Create"+'\n'+"\t2.Read"+'\n'+"\t3.Update"+'\n'+"\t4.Delete");
		 n =s.nextInt();
		s.nextLine();
		
		switch(n)
		{
		case 1:
			create();
			break;
		case 2:
			read();
			break;
		case 3:
			update();
			break;
		case 4:
			delete();
			break;
		case 5:
			System.out.println("Exited.");
			
		}
	}while(n != 5);
		
	}
		
		
	
	static void create()
		{
		String n1;
		Long n2;
		String n3;
		//create
		boolean i = true;
		
		while (i)
		{
		System.out.println("Enter the name: ");
		n1 = s.nextLine();
		System.out.println("Mobile Number: ");
		n2 = s.nextLong();
		s.nextLine();
		System.out.println("Enter the Email address :");
		n3 = s.nextLine();
		Name.add(n1);
		MobileNumber.add(n2);
		Email.add(n3);
		System.out.println("Successfully created the contact");
		System.out.println("Enter True or False"+'\n'+" true == Create a new Contact \tfalse == Exit");
		i = s.nextBoolean(); 
		s.nextLine();
	
		}
		System.out.println("Successfully saved");
		}
		

		
	
	static void update() {	
		//update
		read();
		
		System.out.println("Enter the index of the contact to be edited: ");
		int n5 = s.nextInt();
		if(Name.size()>n5)
		{
		System.out.println("Enter the content of the contact to be updated: "+'\n'+"\t1.Name"+'\n'+"\t2.Mobile number"+'\n'+"\t3.Email");
		int n6 =s.nextInt();
		s.nextLine();
		switch(n6)
		{
		case 1:
			System.out.println("Enter the Name to be updated: ");
			Name.set(n5, s.nextLine());
			System.out.println("Successfully updated to "+Name.get(n5));
			break;
		case 2:
			System.out.println("Enter the MobileNumber to be updated: ");
			MobileNumber.set(n5, s.nextLong());
			System.out.println("Successfully updated to "+MobileNumber.get(n5));
			break;
		case 3:
			System.out.println("Enter the Email to be updated: ");
			Email.set(n5, s.nextLine());
			System.out.println("Successfully updated to "+Email.get(n5));
			break;
		default:
			System.out.println("Enter 1 2 3 accordingly to update the Name, Mobile number and Email");
			break;
			}
		}
		else
		{
			System.out.println("Enter the valid index of the contact to be updated");
		}
	}
		
		
	static void delete()
		{
			read();
			System.out.println("Enter the index to be deleted: ");  
			int n7 = s.nextInt();
			if(Name.size() > n7)
			{
			Name.remove(n7);
			MobileNumber.remove(n7);
			Email.remove(n7);
			System.out.println("Successfully deleted");
			}
			else
			{
				System.out.println("Enter a valid index to be deleted");
			}
		}
		
		
	
	static void read()	//Read operation
	{

		Iterator <String> it1 = Name.iterator();
		Iterator <Long> it2 = MobileNumber.iterator();
		Iterator <String> it3 = Email.iterator();
		int i = 0;
		
		if(!Name.isEmpty())
		{
		while(it1.hasNext() & it2.hasNext() & it3.hasNext())
		{
			
			String v1 = it1.next();
			Long v2 = it2.next();
			String v3 = it3.next();
			System.out.println("--------------------------------------");
			System.out.println(i+":"+v1);
			System.out.println(v2);
			System.out.println(v3);
			System.out.println("--------------------------------------");
			
			i++;
		
			
		}
		}
		else
		{
			System.out.println("No Contacts, Create new contacts");
			System.out.println();
		}
	
		
	}
	
	
	

}
