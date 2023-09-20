
public class Fila {
	private double entrada;//Só para mostrar o resultado, que compartilha o mesmo resultado
	private static Fila filaInst;
	private Fila() {
		
	}

	public void imprimeDocumento() {
		
	}
	public void removeDocumento() {
		
	}
	public void remove_Todosdocumento() {
		
	}
	public static Fila getInstance() {
		if (filaInst == null) {
			filaInst = new Fila();
		}
		return filaInst;
	} 
	public void setEntrada(double entrada){
		this.entrada=entrada;
	
	}
	public double getEntrada(){
		return entrada;
	}
	
}
