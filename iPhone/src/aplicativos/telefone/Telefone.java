package aplicativos.telefone;

public interface Telefone {
	public void procurarContato();
	public void DigitarNumero();
	default void ligar() {
		System.out.println("Ligando para o contato!");
	}
}
