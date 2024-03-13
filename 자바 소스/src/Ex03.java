import java.util.Scanner;

public class Ex03{

    public static void main( String[] args ) {

        int userInput;
        int randomSu ;
	int a=0;
       randomSu = (int) ( Math.random() *100 ) + 1;

       Scanner sc = new Scanner( System.in) ; 
	//System.out.println(randomSu);

       while(true) {
           userInput =sc.nextInt();
	   a=a+1;
           if( userInput == randomSu) break;  
           else if( userInput  > randomSu ){
                System.out.println("down");
           }else  if( userInput < randomSu ){
                System.out.println("up");
          }               
       }
	if (a<4){
		System.out.println("간식"+a+"번만에 맞췄습니다.");
	}else{
		System.out.println(a+"번만에 맞췄습니다.");
	}
       System.out.println(" success !!");     
  
    }

}