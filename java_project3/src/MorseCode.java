//Wli Akbar

public class MorseCode {
	private char ch;
	private String code;
	
	public MorseCode(char Mchar, String scode){
		if((Mchar>=97 && Mchar<=122)){
			Mchar=Character.toUpperCase(Mchar);
		}
		try{
			if((Mchar>=32) && (Mchar<=90)){
				ch=Mchar;
				code=scode;	
			}
			else{
				throw new Exception();
			}
				
		}
		catch(Exception e){
			System.out.printf("\nOut of range character: << %c %s\n",Mchar,">>");	
		}
		
	}
	public char getCh(){
		return ch;
	}
	
	public void setCh(char Mchar){
		ch=Mchar;
	}
	
	public String getCode(){
		return code;
	}
	
	public void setCode(String scode){
		code=scode;
	}

}
