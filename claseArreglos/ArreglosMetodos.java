class ArreglosMetodos{
	public static void main(String[] args) {
		int[] arreglo = new int[10];
		ArreglosMetodos.inicializarArreglo(arreglo);
		ArreglosMetodos.imprimirArreglo(arreglo);
	}//fin del main

	static void inicializarArreglo(int array[]){
		int i = 0;
		for(i = 0; i < 10; i++)
			array[i] = i;
	}//fin inicializarArreglo

	static void imprimirArreglo(int array[]){
		for(int valor : array)
			System.out.println(valor);
	}//fin imprimirArreglo
}