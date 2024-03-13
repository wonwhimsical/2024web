import java.util.Scanner;

public class Ex04{

    public static void main( String[] args ) {

        int userInput;
        int randomSu ;
	int tryCnt=0;
       randomSu = (int) ( Math.random() *100 ) + 1;

       Scanner sc = new Scanner( System.in) ; 
	//System.out.println(randomSu);

       while(true) {
           userInput =sc.nextInt();
           if( userInput == randomSu) break;  
           else if( userInput  > randomSu ){
                System.out.println("down");
           }else  if( userInput < randomSu ){
                System.out.println("up");
          }
	  tryCnt++;               
       }
	if (a<3){
		System.out.println("간식"+tryCnt+"번만에 맞췄습니다.");
	}else{
		System.out.println(tryCnt+"번만에 맞췄습니다.");
	}
       System.out.println(" success !!");     
  
    }

}