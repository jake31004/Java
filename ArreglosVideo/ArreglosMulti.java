class ArreglosMUlti{
	public static void main(String[] args) {
		//Los arreglos multidimensionales se crean igual que los unidimensionales
		//Solo que el num de corchetes aumenta según el número de dimensiones

		//tipoDeDato[][]...[] referencia = new tipoDeDato[tam1][tam2]...[tamN]
		//El número de corchetes del lado izquierdo debe de ser igual
		//al número de corchetes del lado derecho

		//Para acceder a cada elemento del arreglo se utilizan los índices
		//Empezando por el cero

		double[][] arreglo = new double[2][3];

		//Se creó una tabla con dos filas y tres columnas con valores 0.0
		// { 0.0,0.0,0.0
		//   0.0,0.0,0.0
		//   0.0,0.0,0.0 }

		//Si queremos acceder a cada uno de los elementos de la tabla o matriz
		//Podemos utilizar dos ciclos for

		//				i < numFilas
		for (int i = 0; i < 2; i++) 
			for (int j = 0; j < 3 ; j++) 
				arreglo[i][j] = 3*i+j;

	    //Ahora el arreglo tiene los valores de:
		// 	{ 0.0,1.0,2.0
		// 	  3.0,4.0,5.0
		// 	  6.0,7.0,8.0 }

		//Para imprimir los valores se utilizan dos for exactamente iguales
		//a los anteriores
		
		for (int i = 0; i < 2; i++){ 
			for (int j = 0; j < 3; j++)
				System.out.print(arreglo[i][j]+" ");

			System.out.println();
		} 
	}
}