import java.util.Scanner;


public class numarreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ME BASE EN EL PRIMER EJERCICIO EN EL QUE PRACTICAMOS LOS ARREGLOS
		Scanner miscanner = new Scanner (System.in);
	
		int arreglo [] = new int [5];
		System.out.println("Ingrese numero de telefono: ");

		arreglo [0]=miscanner.nextInt();

		System.out.println("Ingrese numero de telefono: ");

		arreglo [1]=miscanner.nextInt();

		System.out.println("Ingrese numero de telefono: ");

		arreglo [2]=miscanner.nextInt();
		
		System.out.println("Ingrese numero de telefono: ");

		arreglo [3]=miscanner.nextInt();
		
		System.out.println("Ingrese numero de telefono ");

		arreglo [4]=miscanner.nextInt();
		
		System.out.println("\n AGENDA: ");
		System.out.println(arreglo[0]);
		System.out.println(arreglo[1]);
		System.out.println(arreglo[2]);
		System.out.println(arreglo[3]);
		System.out.println(arreglo[4]);
	}

}
