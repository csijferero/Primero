package datos;

public abstract class Vehiculo {
	
	/*2. Se pretende desarrollar una aplicación que permita calcular los precios de 
	alquiler de una empresa de alquiler de vehículos.
	Cada vehículo se identifica unívocamente por medio de su matrícula.
	La empresa alquila distintos tipos de vehículos, tanto para transporte de 
	personas como de carga. En la actualidad los vehículos alquilados por la 
	empresa son: coches, microbuses, furgonetas y camiones.
	El precio del alquiler de cualquier vehículo tiene un componente base que 
	depende de los días de alquiler a razón de 50€/día.
	En el caso de alquiler de un coche, al precio base se le suma la cantidad 
	de 1,5€ por plaza y día.
	El precio de alquiler de los microbuses es igual que el de los coches, salvo 
	que se le añade una cantidad de 2€/plaza independientemente de los días de alquiler.
	El precio de los vehículos de carga es el precio base más 20€ * PMA (peso 
	máximo autorizado en toneladas).
	Además, en el caso de los camiones, al precio se suma un fijo de 40€ 
	independientemente de los días de alquiler.
	La interacción del empleado con la aplicación se realizará en el 
	programa principal. Debe permitir dar de alta vehículos (con tipo y 
	todos sus datos), calcular cuánto es el alquiler y llevar el total 
	alquilado de la empresa.*/
	
	private String alquiler;
	private int dias_alquiler;
	private int num_plazas;
	
	
	public Vehiculo(String alquiler, int dias_alquiler, int num_plazas) {
		super();
		this.alquiler = alquiler;
		this.dias_alquiler = dias_alquiler;
		this.num_plazas = num_plazas;
	}


	public String getAlquiler() {
		return alquiler;
	}


	public void setAlquiler(String alquiler) {
		this.alquiler = alquiler;
	}


	public int getDias_alquiler() {
		return dias_alquiler;
	}


	public void setDias_alquiler(int dias_alquiler) {
		this.dias_alquiler = dias_alquiler;
	}


	public int getNum_plazas() {
		return num_plazas;
	}


	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}


	@Override
	public String toString() {
		return "Vehiculo [alquiler=" + alquiler + ", dias_alquiler=" + dias_alquiler + ", num_plazas=" + num_plazas
				+ "]";
	}
	
	public abstract double calcularAlquiler();
	
	
	

}
