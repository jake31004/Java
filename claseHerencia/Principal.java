class Principal{
	public static void main(String[] args) {
		Perro p1 = new Perro(1,"Kaiser","Doberman");
		Animal a1 = new Animal(5,"pelos");

		p1.comunicarse();//los métodos son diferentes porque están sobreescritos
		a1.comunicarse();

		a1.comer();
		p1.comer();
		p1.comer(9, 4);
	}
}