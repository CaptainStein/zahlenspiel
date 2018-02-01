import javax.swing.JButton;

import jawa.awt.*;

package zahlenspiel;

public class game {
	
	boolean tmpY;
	boolean tmpX;
	boolean tmpRorD;
	boolean checkOK;
	public ArrayList() buttonAr;
	public int[] startNumbers;
	
	int[] startNumbers = new int[9];
	for(int tmp =0;tmp<9;tmp++){
		startNumbers[tmp]=tmp+1;
		System.out.println(startNumbers[tmp]);	
	}
	
	for(tmp = 0;tmp<=startNumbers.length();tmp++){
		buttonAr().add(startNumbers[tmp]);
	}
	
	for(tmp = 10)
	
	// Check if choice is conform to all the rules given
	public boolean checkChoice(int buttonClicked1, int buttonClicked2){
		int buttonNr1 = buttonClicked1;
		int buttonNr2 = buttonClicked2;
		getDistance();
		return checkEmptyBoxes();
		}
	}
	
	// rewrite the non-empty Buttoncontents
	public void rewriteNumbers(){
		
		while(int i <= buttonAr.size()){
			
			if(buttonAr(i).get()=="null"){
				
				buttonAr(i).remove();
				
			}
			
		}
		
		
	}
	
	// get Distance between the 2 chosen Buttons
	public void getDistance(){

		int distance;
		int tmpInt=buttonNr1-buttonNr2;
		
		if(tmpInt%9==0){tmpY = true; tmpX = false;}
		else{tmpY = false; tmpX = true}
		
		if(tmpInt<0){tmpRorD = true; tmpInt = tmpInt*(-1)}
		
		if(tmpY==true && tmpX==false){
			distance=tmpInt/9;
		}
		if(tmpY==false && tmpX==true){
			distance=tmpInt/2;
		}
	}
	
	// Check if buttons between Distance are all empty
	public boolean checkEmptyButtons(){
		if(tmpY==true && tmpX==false){
			while(int i=1<distance){
				switch(tmpRorD){
				case true: if(buttonAr(buttonNr1+i*9).get()!=null){
								checkOK=false;
								} break;;
				case false: if(buttonAr(buttonNr1-i*9).get()!= null){
								checkOK=false;
								} break;;
				}
			}
		}
		else{
			while(int i=1<distance){
				switch(tmpRoD){
				case true: if(buttonAr(buttonNr1+i*1).get()!=null){
								checkOK=false;
								} break;;
				case false: if()buttonAr(buttonNr1-i*1).get()!=null{
								checkOK=false;
								} break;;
				}
			}
		}
	}
	
	
	

}
