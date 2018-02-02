package zahlenspiel;
import java.util.*;



public class game {
	static int buttonNr1;
	static int buttonNr2;
	static boolean tmpY;
	static boolean tmpX;
	static boolean tmpRorD;
	static boolean checkOK;
	static int distance;
	
	public game(){
		buttonNr1 = 0;
		buttonNr2 = 0;
		tmpY = false;
		tmpX = false;
		tmpRorD = false;
		checkOK = false;
		distance = 0;
		ArrayList<Integer> buttonAr = new ArrayList<Integer>();
		int[] startNumbers;
		
		startNumbers = new int[9];
		for(int tmp =0;tmp<9;tmp++){
			startNumbers[tmp]=tmp+1;
			}
		
		for(int tmp = 0;tmp<startNumbers.length;tmp++){
			buttonAr.add(startNumbers[tmp]);
			}
		buttonAr.add(1);
		buttonAr.add(1);
		buttonAr.add(1);
		buttonAr.add(2);
		buttonAr.add(1);
		buttonAr.add(3);
		buttonAr.add(1);
		buttonAr.add(4);
		buttonAr.add(1);
		buttonAr.add(5);
		buttonAr.add(1);
		buttonAr.add(6);
		buttonAr.add(1);
		buttonAr.add(7);
		buttonAr.add(1);
		buttonAr.add(8);
		buttonAr.add(1);
		buttonAr.add(9);
		
		//Testteil
		for(int i=0;i<buttonAr.size();i++){
			System.out.println(i+" ### "+buttonAr.get(i));	
		}
		System.out.println("TEST: "+checkChoice(4,22));
	}
		
	// Check if choice is conform to all the rules given
	public static boolean checkChoice(int buttonClicked1, int buttonClicked2){
		buttonNr1 = buttonClicked1;
		buttonNr2 = buttonClicked2;
		getDistance();
		return checkEmptyButtons();
		}
		
	
	
	// rewrite the non-empty Buttoncontents
	public void rewriteNumbers(){
		int i = 0;
		while( i <= buttonAr.size()){
			
			if(buttonAr.get(i)==null){
				
				buttonAr.remove(i);
				
			}
			i++;
		}
		
		
	}
	
	// get Distance between the 2 chosen Buttons
	public static void getDistance(){

		int tmpInt=buttonNr1-buttonNr2;
		
		if(tmpInt%9==0){tmpY = true; tmpX = false;}
		else{tmpY = false; tmpX = true;}
		
		if(tmpInt<0){tmpRorD = true; tmpInt = tmpInt*(-1);}
		
		if(tmpY==true && tmpX==false){
			distance=tmpInt/9;
		}
		if(tmpY==false && tmpX==true && tmpInt!=1){
			distance=tmpInt/2;
		}
		else{distance=1;}
		//Testteil
		System.out.println("X: "+tmpX);
		System.out.println("Y: "+tmpY);
		System.out.println("RorD: "+tmpRorD);
		System.out.println("Distance: "+distance);
	}
	
	// Check if buttons between Distance are all empty
	public static boolean checkEmptyButtons(){
		int i=1;
		checkOK=true;
		if(tmpY==true){
			while(i<=distance){
				if(tmpRorD==true){
					if(buttonAr.get(buttonNr1+(i*9))!=0){
						checkOK=false;
						System.out.println("checkOK: "+checkOK);
						System.out.println("checkField: "+(buttonNr1+(i*9)));
						System.out.println("checkFieldContent: "+buttonAr.get(buttonNr1+(i*9)));
					}
				}
				else{ if(buttonAr.get(buttonNr1-i*9)!=0){
						checkOK=false;
					}
				}
				i++;
			}
		}
		else{
			while(i<=distance){
				if(tmpRorD==true){
					if(buttonAr.get(buttonNr1+i*1)!=0){
						checkOK=false;
					}
				}
				else{ if(buttonAr.get(buttonNr1-i*1)!=0){
						checkOK=false;
					}
				}
				i++;
			}
		}
		return checkOK;
	}
	
	
	

}
