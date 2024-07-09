package aplicativos.internet;

public interface Internet {
	public void navegar();
	
	default void ConectarInternet() {
		System.out.println("Conectado a Internet!!");
	}
}
