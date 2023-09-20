
public class Singleton_exec {

	public static void main(String[] args) {
		Fila impressao1 = Fila.getInstance();
		Fila impressao2 = Fila.getInstance();

		impressao1.setEntrada(23);
		System.out.println(impressao2.getEntrada());
	}

}
