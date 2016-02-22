
public class Buscalineas {

	int numComentarios = 0;
	String tempData;	

	public int getComentarios (String[] arrData, int n){ // Este
		/*
		 * Vale que necesitas  
		*/

		for (int i=0; i<arrData.length; i++){
			tempData = arrData[i];
			tempData = tempData.trim();

			if (
			   ( tempData.startsWith("/*") == true ) ||
				( tempData.startsWith("*") == true ) ||
				( tempData.startsWith("*/") == true ) ||
				( tempData.startsWith("//") == true )  ||
				( tempData.equals("") == true)

			) {

			continue;

			} else numComentarios ++ ;

			tempData = "";
		}

		return numComentarios;

	}
	
}
