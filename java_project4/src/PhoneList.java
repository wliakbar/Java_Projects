import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PhoneList {
	
	private TreeSet<Phone> setPhone;
	
	public PhoneList(){
		setPhone=new TreeSet<Phone>();
	}
	
	public boolean add(Phone x){
		if(setPhone.contains(x)){
			return false;
		}
		else{
			setPhone.add(x);
			return true;
		}
	}
	
	public TreeSet<Landline> getListLandline(){
		TreeSet<Landline> answer= new TreeSet<Landline>();
		for(Phone value : setPhone){
			if(value instanceof Landline){
				Landline temp=(Landline)value;
				answer.add(temp);
			}
			else{
				continue;
			}
		}
		return answer;	
	}
	
	public void printFormatted(){
		for(int i=0;i<83;i++) {
			if(i==0||i==11||i==19||i==42||i==54||i==73||i==82) {
				System.out.print("+");
			}
			else {
				System.out.print("-");
			}
		}
		System.out.printf("%n|   Type   |  ID   |          Brand       |   Price   |  Date Availabe   | Notes  |%n");
		

		for(Phone value : setPhone){
			//System.out.printf("/n");
			for(int i=0;i<83;i++) {
				if(i==0||i==11||i==19||i==42||i==54||i==73||i==82) {
					System.out.print("+");
				}
				else {
					System.out.print("-");
				}
			}
			String type_name="";
			String notes="";
			DateFormat dateformat=new SimpleDateFormat("MMM dd, yyyy");
			String date=dateformat.format(value.getDateAvailable());
			
			if(value instanceof Smart) {
				Smart temp=(Smart)value;
				type_name=temp.getName();
				notes=Double.toString(temp.getCpuSpeed());
					
			}
			else if(value instanceof Wireless) {
				Wireless temp=(Wireless)value;
				type_name=temp.getName();
				notes=Double.toString(temp.getRange());
			}
			else if(value instanceof IPPhone) {
				IPPhone temp=(IPPhone)value;
				type_name=temp.getName();
				notes=temp.getProtocol();
				
			}
			
			System.out.printf("%n|%-10s|%-7s|%-22s|$%-10.2f|%-18s|%-8s|%n",type_name,value.getId(),value.getBrand(),value.getPrice(),date,notes);
			
			
		}
		
		for(int i=0;i<83;i++) {
			if(i==0||i==11||i==19||i==42||i==54||i==73||i==82) {
				System.out.print("+");
			}
			else {
				System.out.print("-");
			}
		}
		
	}
	

}
