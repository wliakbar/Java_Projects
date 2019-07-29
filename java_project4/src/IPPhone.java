import java.util.Date;


public class IPPhone extends Landline {
	
	private String protocol;
	
	public IPPhone(String protocol, String id, String brand, double price, Date dateAvailable){
		super(id, brand, price, dateAvailable);
		this.protocol=protocol;
	}
	
	public String getProtocol(){
		return protocol;
	}
	
	public String getName(){
		return "IPPhone";
	}
	

}
