class Arreglos{
	public static void main(String[] args){
		//tipoDeDato[] referencia = new tipoDeDato[tamaño]


		int[] arreglo1 = new int[5]; //[0,0,0,0,0]
		//Por defecto se crea un arreglo lleno con puros ceros
		//Si el arreglo fuera de cadenas, por defecto tendría cadenas vacías
		//Si el arreglo fuera de boooleanos, se llenaría con valores false

		//Para acceder a los elementos de un arreglo
		//Utilizamos los índices, los índices empiezan con el 0

		//[elemento1, elemento2, elemento3, elemento4]
		//    0           1           2         3     Indices

		//Para acceder a algún elemento de un arreglo
		//Se escribe el nombre del arreglo y entre corchetes su ínice
		//nombreArreglo[indice]

		arreglo1[0]=0; //Primer elemento   [0,0,0,0,0]
		arreglo1[1]=1; //Segundo elemento  [0,1,0,0,0]
		arreglo1[2]=2; //Tercer elemento   [0,1,2,0,0]
		arreglo1[3]=3; //Cuarto elemento   [0,1,2,3,0]
		arreglo1[4]=4; //Quinto elemento   [0,1,2,3,4]

		//Imprimiendo valores
		System.out.println(arreglo1[0]);
		System.out.println(arreglo1[1]);
		System.out.println(arreglo1[2]);
		System.out.println(arreglo1[3]);
		System.out.println(arreglo1[4]);
		//Compilar y ejecutar

		//Como se pueden dar cuenta en las líneas de arriba
		//La líneas de código son pŕacticamente iguales lo único
		//que cambia es el valor del índice, entonces podemos
		//utilizar un ciclo for para acceder a todos los elementos del arreglo

		System.out.println("Imprimiendo arreglo con un for");
		for(int i = 0; i < 5; i++)
			System.out.println(arreglo1[i]);


	}
}