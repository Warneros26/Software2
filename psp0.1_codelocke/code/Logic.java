
public class Logic {
	
	private int n = 0;
	private int nInvalidos;
	private String data;
	private String[] arrData;
	
	public void logic1a() {

		Input myInput = new Input();
		Output myOut = new Output();
		Data myData = new Data();
		Buscalineas myObject = new Buscalineas();

		data = myInput.readData("inFile.java");
		arrData = myData.saveData(data);
		n = arrData.length;

		nInvalidos = myObject.getComentarios(arrData, n);

		String writeText = ("Líneas de Código = "+(n - nInvalidos));
		myOut.writeData("outFile.java", writeText);
		// Se ve bien
		// Quieres probarlo?si
		// Verga, no te cuenta el Java
		
	}	
}
