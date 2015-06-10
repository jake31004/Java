class ArreglosMulti{
	public static void main(String[] args) {
		double[][] arreglo = new double[5][5];
		
		ArreglosMulti.inicializarArreglo(arreglo);
		ArreglosMulti.imprimirArreglo(arreglo);

	}//fin main

	static void inicializarArreglo(double array[][]){
		int i = 0;
		int j = 0;

		for(i = 0; i < 5; i++)
			for (j = 0; j < 5; j++ ) 
				array[i][j] = i*j;	

	}//fin inicializarArreglo

	static void imprimirArreglo(double array[][]){
		for(double subArreglo[] : array){
			for(double valor : subArreglo)
				System.out.print(valor+" ");

			System.out.println();
		}
	}//fin imprimirArreglo
}