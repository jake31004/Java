class Perro extends Animal{
	String raza;

	Perro(int edad, String nombre, String raza){
		super(edad,nombre);
		this.raza = raza;
	}

	//Sobreescritura del método comunicarse
	//TIene que tener exactamente la misma firma (mismo valor de retorno, mismo nombre, mismos parametro)
	void comunicarse(){
		System.out.println("Guau guau");
	}

	//sobrecarga del metodo comer
	//Se llaman igual los métodos pero reciben argumentos de distinto tipo
	void comer(int horaComida, int horaActual){

		for (int i = horaActual; i <= horaComida; i++) {
			
			if(horaActual == horaComida){
				System.out.println("Ya es hora de comer");
				break;
			}else{
				System.out.println("Todavía no tengo hambre");
				horaActual++;
			}

		}
	}
}