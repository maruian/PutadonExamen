import java.util.Scanner;

/*
 * CSI Florida
 * Reto Putadon
 * 
 * El siguiente código busca una letra dentro de una frase
 * y devuelve dónde se ha encontrado y ctas veces
 * 
 * Hay dos errores
 * 
 */
public class Putadon {
	//Variables inicialización EN EL CONSTRUCTOR
			public static String frase="";
			public static int numPos=0;
			public static int numRepeticiones=0;
			public static char letra=0;
	
	public static void main(String[] args) {
		
		
		pideDatos();//Pedimos datos
		buscaLetra(letra, frase);				
		//Buscamos las letras
	
	}
	public static void pideDatos(){
        Scanner sc=new Scanner(System.in); 
		System.out.println("Introduce tu frase");
		frase = sc.nextLine();
		System.out.println("Introduce la letra a buscar");
		letra = sc.nextLine().charAt(0);
	}
	
	public static void buscaLetra(char letra, String frase){
		for(int i=0;i<frase.length();i++){
			if(letra==frase.charAt(i)){
				numRepeticiones=numRepeticiones+1;
				System.out.println("Letra "+letra+" encontrada en la posicion "+i);
			}
		}
		System.out.println("Total repeticiones "+numRepeticiones);
		
	}
	
}