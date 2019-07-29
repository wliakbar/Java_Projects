import java.util.Date;

public abstract class Phone implements Comparable<Phone> {
	private String id;
	private String brand;
	private double price;
	private Date dataAvailable;
	
	public abstract String getName();
	
	public double getPrice(){
		return this.price;
	}
	
	public Phone(String id, String brand, double price, Date dateAvailable){
		this.id=id;
		this.brand=brand;
		this.price=price;
		this.dataAvailable=dateAvailable;
	}
	
	public int compareTo(Phone temp){
		int temp_num=this.id.compareTo(temp.id);
		if(temp_num==0) {
			return 0;
		}
		else return 1;
	}
	
	public String getId(){
		return this.id;
		
	}
	
	public String getBrand(){
		return this.brand;
	}
	
	public Date getDateAvailable(){
		return this.dataAvailable;
	}
	

}
