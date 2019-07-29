//Wli Akbar

import java.util.ArrayList;
import java.io.*;


import java.util.Scanner;
public class MorseCodeConvert {
	private ArrayList<MorseCode> listCodes;
	
	public MorseCodeConvert(String file){
		listCodes=new ArrayList<MorseCode>();
		//file="Codes.txt";
		File name= new File(file);
		try{
			Scanner input=new Scanner(name);
			while(input.hasNext()){
				String temp=input.nextLine();
				if(temp.isEmpty() || temp==null){
					System.out.println("\nSkipping Line: <<EMPTY>>");
					continue;
				}
				String temparr[]=temp.split("\t");
				if(temparr.length==1) {					
						System.out.printf("\nSkipping Line: << %s %s",temp,">>");
				}
				else if(temparr[0].length()>1) {
					System.out.printf("\nSkipping Line: << %s %s",temparr[0],">>");
				}
				else{
					MorseCode str_code=new MorseCode(temparr[0].charAt(0),temparr[1]);
					listCodes.add(str_code);
					
					
				}
			}
		}
			
		catch(FileNotFoundException e){
			System.out.printf("\nInvalid file name: << %s%s", file," >>");	
		}
		
		
	}
	public void printMorseCodeList(){
		int size=listCodes.size();
		for(int i=0;i<size;i++){
			System.out.printf("\n%c\t%s",listCodes.get(i).getCh(),listCodes.get(i).getCode());
		}
		System.out.print("\n");	
	}
	
	public void convertString(String text){
		if(text==null || text=="") return;
		String answer="";
		int size=listCodes.size();
		int text_size=text.length();
		for(int i=0;i<text_size;i++){
			boolean found=false;
			int counter=0;
			char temp=Character.toUpperCase(text.charAt(i));
			while(found==false && counter<size){
				if(temp==listCodes.get(counter).getCh()){
					answer+=listCodes.get(counter).getCode();
					answer+=" ";
					found=true;
				}
				counter++;
			}
			if(found==false){
				answer+="? ";
			}
			
			
		}
		
		System.out.printf("%s", answer);	
	}
	
	public void convertFile(String file){
		File name= new File(file);
		try{
			Scanner input=new Scanner(name);
			while(input.hasNext()){
				String n_word=input.next();
				convertString(n_word);
			}
			System.out.print("\n");
			input.close();
				
		}
		catch (FileNotFoundException ex){
			System.out.printf("\nInvalid file name: << %s%s", file," >>");	
			
		}	
	}

}
