package ide;
import java.util.Scanner;
public class t3p1menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String frase;
		int reinicio;
		String frase2="a";
		
		do {
		
		System.out.println("dame una frase ");
		frase=sc.next();
	int k;
		int i;
		
		
		System.out.println("      MENU DE OPCIONES");
		System.out.println("-------------------------------");
		System.out.println("1. Elimina espacios en blanco.");
		System.out.println("2. Invierte cadena.");
		System.out.println("3. Concatena dos cadenas");
		System.out.println( "4. Busca una subcadena.");
		System.out.println("5. Mayúsculas");
		System.out.println("6. Minúsculas");
		System.out.println("7. Salir");
	
		System.out.println("dame un numero de 1 a 7 ");
		reinicio=sc.nextInt();
	if (reinicio==1)
	{
		System.out.println(frase.replace(" ",""));	
		
		
	}
	if (reinicio==2)
	{
		
		k=frase.length()-1;
		
	
		for (i=k;i>=0;i--)
		{
			System.out.println(frase.charAt(i));
			
			
		}
		
	}
		
	if (reinicio==3) {
		System.out.println("dame una palabra ");
		String a=sc.next();
		System.out.println("dame otra palabra");
		String b=sc.next();
		
	    String frase3 = a.concat(b);
		System.out.println("resultado "+frase3 );
			
		
	}
		if (reinicio==4) 
		{
			
			System.out.println("resultado "+frase.indexOf(frase2) );
			
		}
		
		if (reinicio==5){
			
			
			System.out.println("resultado "+(frase.toUpperCase()) );
			
		}
		
		if (reinicio==6)
		{
			System.out.println("resultado "+(frase.toLowerCase()) );
		}
	
		}while (!(reinicio==7));
		
		
	}

}
