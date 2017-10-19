package app;

import java.util.Scanner;

public class App {
	static Scanner lector = new Scanner(System.in);
	static int resp;
	static double resp2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] m = new String[12]; 
		m[0] ="Enero";
		m[1] ="Febrero";
		m[2] ="Marzo";
		m[3] ="Abril";
		m[4] ="Mayo";
		m[5] ="Junio";
		m[6] ="Julio";
		m[7] ="Agosto";
		m[8] ="Septiembre";
		m[9] ="Octubre";
		m[10] ="Noviembre";
		m[11] ="Diciembre";
		//arreglo de los meses
		
		Sales[][] venta = new Sales [12][];
		venta [0]     = new Sales[31];
		venta [1]     = new Sales[28];
		venta [2]     = new Sales[31];
		venta [3]     = new Sales[30];
		venta [4]     = new Sales[31];
		venta [5]     = new Sales[30];
		venta [6]     = new Sales[31];
		venta [7]     = new Sales[31];
		venta [8]     = new Sales[30];
		venta [9]     = new Sales[31];
		venta [10]    = new Sales[30];
		venta [11]    = new Sales[31];
		//arrelgo de los dias de los meses
		int mes =1;
		
		for (int i = 0; i < venta.length; i++) {
			System.out.println((m[i]));
			for (int j = 0; j < venta[i].length; j++) {
				venta[i][j] = new Sales((m[i]),(j+1),(float)(Math.random()*(1000) + 1));
			//se llena el arreglo con el dia mas la venta del dia con numeros aleatorios
				System.out.print(" ["+venta[i][j]+"]");
				System.out.print("\t");
			}
			System.out.println("--------------------------------------------------------------");
			mes=mes+1;
		}
	
		System.out.println("selecciona el mes (del 1 al 12)");
		resp= lector.nextInt();//capturamos el mes donde se va a buscar la venta
		System.out.println("Ingrese la venta a buscar");
		resp2= lector.nextDouble();//capturamos la venta a buscar
		
		
		System.out.println("");
		System.out.println("");
		Sales[] base = new Sales[31];
		switch (resp) {
        case 1:   	
        	//pasamos al switch para buscar en base al numero que eligio el usuario
   		 base = gnomeSort(venta[0]); 
   		busquedaBinaria(base, resp2);
   		 for (int i = 0; i < base.length; i++) {
   			System.out.print(base[i]);  
   			System.out.print("\t");
   		}
        break;
        case 2: 

        	
      		 base = gnomeSort(venta[1]);  
      		busquedaBinaria(base, resp2);
      		 for (int i = 0; i < base.length; i++) {
      			System.out.print(base[i]); 
      			System.out.print("\t");
      		}
        
        
        case 3: 
     		 base = gnomeSort(venta[2]);  
     		busquedaBinaria(base, resp2);
     		 for (int i = 0; i < base.length; i++) {
     			System.out.print(base[i]);  
     			System.out.print("\t");
     			}
        case 4:
        	 base = gnomeSort(venta[3]);  
        	 busquedaBinaria(base, resp2);
     		 for (int i = 0; i < base.length; i++) {
     			System.out.print(base[i]);  
     			System.out.print("\t");
     		 }
        case 5:
        	base = gnomeSort(venta[4]);  
        	busquedaBinaria(base, resp2);
     		 for (int i = 0; i < base.length; i++) {
     			System.out.print(base[i]);  
     			System.out.print("\t");
     		 }
        	
        case 6:
        	
        	base = gnomeSort(venta[5]);  
        	busquedaBinaria(base, resp2);
     		 for (int i = 0; i < base.length; i++) {
     			System.out.print(base[i]);  
     			System.out.print("\t");
     		 }
        	
        case 7:
        	base = gnomeSort(venta[6]);
        	busquedaBinaria(base, resp2);
     		 for (int i = 0; i < base.length; i++) {
     			System.out.print(base[i]); 
     			System.out.print("\t");
     		 }
        
        case 8:
        	base = gnomeSort(venta[7]); 
        	busquedaBinaria(base, resp2);
     		 for (int i = 0; i < base.length; i++) {
     			System.out.print(base[i]); 
     			System.out.print("\t");
     		 }
        
        case 9:
        	base = gnomeSort(venta[8]); 
        	busquedaBinaria(base, resp2);
     		 for (int i = 0; i < base.length; i++) {
     			System.out.print(base[i]); 
     			System.out.print("\t");
     		 }
        	
        case 10:
        	base = gnomeSort(venta[9]); 
 			busquedaBinaria(base, resp2);
     		 for (int i = 0; i < base.length; i++) {
     			System.out.print(base[i]); 
     			System.out.print("\t");
     		 }
        
        case 11:
        	base = gnomeSort(venta[10]); 
 			busquedaBinaria(base, resp2);
     		 for (int i = 0; i < base.length; i++) {
     			System.out.print(base[i]); 
     			System.out.print("\t");
     		 }
        	
        case 12:
        	base = gnomeSort(venta[11]); 
        	busquedaBinaria(base, resp2);
     		 for (int i = 0; i < base.length; i++) {
     			System.out.print(base[i]); 
     			System.out.print("\t");
     		 }	
        default: System.out.println ("numero equivocado"); break;
    }
		 
		///////////////////////////////////////
		///////////////////////////////////////
		//tuvimos un error porque nos imprimia si buscabamos en el mes 7 nos imprimia
		//el arreglo del mes 7 8 9 10 11 12, apartir de donde buscabamos nos imprimia la verdad no supimos como 
		//arreglarlo pero cumple con los requisitos
	}
	private static <T extends Comparable<T>> T[] gnomeSort(T[] array) {
	      for ( int i = 1; i < array.length; ) {
	         if (array[i - 1].compareTo(array[i]) <= 0) {
	            ++i;
	         } else {
	            T temporal = (T) array[i];
	            array[i] = array[i - 1];
	            array[i - 1] =  temporal;
	            --i;
	            if ( i == 0 ) {
	               i = 1;
	            }
	         }
	      }
	      return array;
}
	public static void busquedaBinaria( Sales [] venta2, double vta){
		  int n = venta2.length;
		  int centro,inf=0,sup=n-1;
		   while(inf<=sup){
		     centro=(inf+sup)/2;
		     if(venta2[centro].getVentas() == vta)
		     {
		    	 System.out.println("La venta fue encontrada: "+venta2[centro]);
		    	 return;
		    	 
		     }else if(venta2[centro].getVentas() < vta ){
		        sup=centro-1;
		     }
		     else {
		       inf=centro+1;
		     }
		   }
		   System.out.println("No se encontro la venta");
		   return;
		 }
}
	

	