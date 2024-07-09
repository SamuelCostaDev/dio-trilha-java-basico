package aplicativos;

import aplicativos.internet.Internet;
import aplicativos.reprodutorMusical.ReprodutorMusical;
import aplicativos.telefone.Telefone;

public class Aplicativos implements Internet, ReprodutorMusical, Telefone{

	public void navegar() {
		ConectarInternet();
		System.out.println("Acessando o navegador");
	}

	public void ProcurarMusica() {
		System.out.println("Procurando Musica");
		TocarMusica();
	}

	public void procurarContato() {
		System.out.println("Procurando Contato!!!");
		ligar();
	}

	@Override
	public void DigitarNumero() {
		System.out.println("992123421");
		ligar();
	}

}
