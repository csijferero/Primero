package datos;

import java.util.Scanner;

public class Objetos {
	
	private static Scanner sc = new Scanner(System.in);
	
	private String nombre;
	private int energia;
	private int hambre;
	private int felicidad;
	private int suciedad;
	private boolean vivo;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getHambre() {
		return hambre;
	}

	public void setHambre(int hambre) {
		this.hambre = hambre;
	}

	public int getFelicidad() {
		return felicidad;
	}

	public void setFelicidad(int felicidad) {
		this.felicidad = felicidad;
	}

	public int getSuciedad() {
		return suciedad;
	}

	public void setSuciedad(int suciedad) {
		this.suciedad = suciedad;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	@Override
	public String toString() {
		return "Objetos [nombre=" + nombre + ", energia=" + energia + ", hambre=" + hambre + ", felicidad=" + felicidad
				+ ", suciedad=" + suciedad + ", vivo=" + vivo + "]";
	}

	public Objetos(String nombre) {
		super();
		this.nombre = nombre;
		energia = 100;
		hambre = 0;
		felicidad = 100;
		suciedad = 0;
		vivo = true;
	}
	
	public void comer(){
		
		int seleccion;
		
		do {
			System.out.println("Menu:");
			System.out.println("1) Desayuno");
			System.out.println("2) Almuerzo");
			System.out.println("3) Merienda");
			System.out.println("4) Cena");
			System.out.println("Elija una opción: ");
			seleccion = sc.nextInt();
		} while (seleccion<=0 || seleccion>=5);
		
		switch (seleccion) {
		case 1:
			if (energia+2>100) 
				energia=100;
			else
				energia += 2;
			
			if (suciedad+1>100) 
				suciedad=100;
			else
				suciedad += 1;
			
			if (hambre-2<0) 
				hambre=0;
			else
				hambre -= 2;
			break;
		case 2:
			if (energia+10>100) 
				energia=100;
			else
				energia += 10;
			
			if (suciedad+3>100) 
				suciedad=100;
			else
				suciedad += 3;
			
			if (hambre-5<0) 
				hambre=0;
			else
				hambre -= 5;
			break;
		case 3:
			if (energia+2>100) 
				energia=100;
			else
				energia += 2;
			
			if (suciedad+1>100) 
				suciedad=100;
			else
				suciedad += 1;
			
			if (hambre-2<0) 
				hambre=0;
			else
				hambre -= 2;
			break;
		case 4:
			if (energia+3>100) 
				energia=100;
			else
				energia += 3;
			
			if (suciedad+2>100) 
				suciedad=100;
			else
				suciedad += 2;
			
			if (hambre-3<0) 
				hambre=0;
			else
				hambre -= 3;
			break;
		}
	}
	
	public void dormir(){
		String opcion;
		int horas;
		do {
			System.out.println("Cuantas horas desea dormir: ");
			opcion = sc.next();
			try {
				horas = Integer.parseInt(opcion);
			} catch (NumberFormatException e) {
				horas = -1;
			}
		} while (horas<0);
		
		if (energia+horas>100) 
			energia=100;
		else
			energia += horas;
		
		if (suciedad+horas>100) 
			suciedad=100;
		else
			suciedad += horas;
		
		if (hambre+horas>100) 
			hambre=100;
		else
			hambre += horas;
		
		if (felicidad+horas>100) 
			felicidad=100;
		else
			felicidad += horas;
	}
	
	public void jugar(){
		
		String opcion;
		int horas;
		do {
			System.out.println("Cuantas horas desea jugar: ");
			opcion = sc.next();
			try {
				horas = Integer.parseInt(opcion);
			} catch (NumberFormatException e) {
				horas = -1;
			}
		} while (horas<0);
		
		if (energia-horas<0) 
			energia=0;
		else
			energia -= horas;
		
		if (suciedad+horas>100) 
			suciedad=100;
		else
			suciedad += horas;
		
		if (hambre+horas>100) 
			hambre=100;
		else
			hambre += horas;
		
		if (felicidad+horas>100) 
			felicidad=100;
		else
			felicidad += horas;
	}
	
	public void asear(){
		
		int seleccion;
		
		do {
			System.out.println("Menu:");
			System.out.println("1) Ducha");
			System.out.println("2) Baño");
			System.out.println("Elija una opción: ");
			seleccion = sc.nextInt();
		} while (seleccion<=0 || seleccion>=3);
		
		switch (seleccion) {
		case 1:
			if (suciedad-5<0) 
				suciedad=0;
			else
				suciedad -= 5;
			
			if (felicidad+2>100) 
				felicidad=100;
			else
				felicidad += 2;
			
			if (energia-3<0) 
				energia=0;
			else
				energia -= 3;
			
			break;
			
		case 2:
			if (suciedad-5<0) 
				suciedad=0;
			else
				suciedad -= 5;
			
			if (felicidad+4>100) 
				felicidad=100;
			else
				felicidad += 4;
			
			if (energia-5<0) 
				energia=0;
			else
				energia -= 5;
			
			break;
		}
		
		
	}
	
	public void estudiar(){
		
		String opcion;
		int horas;
		do {
			System.out.println("Cuantas horas desea estudiar: ");
			opcion = sc.next();
			try {
				horas = Integer.parseInt(opcion);
			} catch (NumberFormatException e) {
				horas = -1;
			}
		} while (horas<0);
		
		if (energia-horas<0) 
			energia=0;
		else
			energia -= horas;
		
		if (suciedad+horas>100) 
			suciedad=100;
		else
			suciedad += horas;
		
		if (hambre+horas>100) 
			hambre=100;
		else
			hambre += horas;
		
		if (felicidad+horas>100) 
			felicidad=100;
		else
			felicidad += horas;
		
		
	}
	
}
