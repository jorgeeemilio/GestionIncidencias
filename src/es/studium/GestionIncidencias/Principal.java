package es.studium.GestionIncidencias;

public class Principal
{
	public static void main(String[] args)
	{
		Modelo modelo = new Modelo();
		VistaLogin vistaLogin = new VistaLogin();
		new Controlador(modelo, vistaLogin);
	}
}