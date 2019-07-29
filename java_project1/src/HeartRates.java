//Wli Akbar
//Project 1
//CCNY


public class HeartRates {
	private String first_name;
	private String last_name;
	private int year;
	
	HeartRates(String fname, String lname, int byear){	//Constructor
		first_name=fname;
		last_name=lname;
		year=byear;
	
	}
	
	//Set Methods
	public void set_fname(String first){
		first_name=first;	
	}
	public void set_lname(String last){
		last_name=last;
	}
	public void set_year(int birth){
		year=birth;
	}
	//Get Methods
	public String get_fname(){ return first_name;}
	public String get_lname(){ return last_name;}
	public int get_year(){ return year;}
	
	public int age(){	//Get age according to year
		return 2019-year;
	}
	
	public int max_rate(){	//Get max heart rate
		int age=age();
		return 220-age;	
	}
	
	public String target_rate(){	//Get target heart rate range
		double low=max_rate()*0.5;
		double high=max_rate()*0.85;
		String target=low+" - "+high;
		return target;
		
			
	}
	
	
	
	

}
