package empresa;

public class Principal {

	//Ambitos de variables

	private static int variable1;
	//por defecto es public
	//pero puede ser privada o protegida. Lo ideal es privada
	//ES VISIBLE EN TODA LA CLASE

	public static void main(String[] args) {
		int variable2 =0;
		//No lleva visibilidad privada, publica o protegida
		//ES VISIBLE DENTRO DEL METODO
		//NO SE VE FUERA DEL MÉTODO

		if (variable2 > 0){
			int variable3 = 1;
			//SOLO ES VISIBLE DENTRO DEL BLOQUE DECLARADO
			//ES DECIR, DENTRO DE ESTE IF
		}

	}

	private void metodo (){
		variable1 = 3;
	}
}

