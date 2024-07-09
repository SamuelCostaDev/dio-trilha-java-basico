package celular;

import aplicativos.Aplicativos;
import aplicativos.internet.Internet;
import aplicativos.reprodutorMusical.ReprodutorMusical;
import aplicativos.telefone.Telefone;

public class Iphone {
	public static void main(String[] args) {
		Telefone telefone = new Aplicativos();
		
		telefone.procurarContato();
		telefone.DigitarNumero();
		
		Internet internet = new Aplicativos();
		internet.navegar();
		
		ReprodutorMusical musicas = new Aplicativos();
		musicas.ProcurarMusica();
		musicas.TocarMusica();
		
		
	}
}
