package principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("Programa que calcula las medias de las notas.");
		
				Scanner lector = new Scanner(System.in);  // la "herramienta lectora"
				
				String[] nombre; // el vector de nombres
				double [][] nota; // la matriz de notas
				
				int nalum; // el número de alumnos que hay en la clase	
				// variable de trabajo para el cálculo de las medias
				double sumanotas=0; 
				double media;
				// PREGUNTAMOS EL nº DE ALUMNOS QUE HAY EN LA CLASE
				
				System.out.println("Introduzca el nº de alumnos que hay en esta clase: ");
				nalum=lector.nextInt();
				lector.nextLine();
				
				// Inicializamos los vectores de datos
				
				nombre= new String[nalum];
				nota=new double[nalum][3];
				
				// AHORA EMPEZAMOS A PEDIR ALUMNOS (nombres y notas)
				
				for (int i=0 ; i<nalum;i++)
				{
					// el nombre
					System.out.println("Introduzca el nombre del alumno nº "+(i+1));
					nombre[i]=lector.nextLine();
					
					// las notas
					for (int j=0;j<3;j++)
					{
						System.out.println("Introduzca la nota del alumno "+nombre[i]+" ");
						nota[i][j]=lector.nextDouble();
						lector.nextLine();
					}
				}


	}

}
