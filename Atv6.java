package Caelum_3;

public class Atv6 {
	/*1°criar uma classe */
	static long fibo(int n) {
	      /*Se o numero for menor que 2, retorna o numero*/
		if (n < 2) {
	             return n;
	         } 
		/* caso contrario ele irá subtrair por um e dois e somar os valores */
					else {
	             return fibo(n - 1) + fibo(n - 2);
	         }
	     }
	  
	     public static void main(String[] args) {   
	  
	  for (int i = 0; i < 13; i++) {
	             System.out.print(Atv6.fibo(i) + " ");
	         }
	  
	     }
	}
