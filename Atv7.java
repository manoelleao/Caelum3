package Caelum_3;

public class Atv7 {
	public static void main(String args[]){

        int x = 85;
        
       while(x>1){
            if (x % 2 !=1){
                x = x/2;
                System.out.println(x);                       
            } else {
                x = (3 * x) + 1;
                System.out.println(x);
            }
            
        }
	}

}
