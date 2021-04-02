import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    double lad1,lad2,lad3;
    System.out.println("digite um lado do triangulo");
    lad1=teclado.nextDouble();
    System.out.println("Digite outro lado do triangulo");
    lad2=teclado.nextDouble();
    System.out.println("digite o terceiro lado do triangulo");
    lad3=teclado.nextDouble();
    if ( (lad1==lad2) && (lad2==lad3)) {
    	System.out.println("triangulo é equiliatareo");
        
    	}else if ((lad1==lad2)&&(lad2!=lad3)||(lad1==lad3)&&(lad1!=lad2)){
    		System.out.println("o triangulo é Isóceles ");
    		
    	}else if((lad1!=lad2)||(lad2!=lad3)||(lad1!=lad3)) {
    		System.out.println("o triangulo é Escaleno");
    	}
    
    
      teclado.close();
	}

}
