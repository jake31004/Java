class Animal{
	int edad;
	String nombre;

	Animal(int edad, String nombre){
		this.edad = edad;
		this.nombre = nombre;
	}//fin del constructor

	void comunicarse(){
		System.out.println("Me estoy comunicando");
	}

	void comer(){
		System.out.println("Estoy comiendo");
	}
}