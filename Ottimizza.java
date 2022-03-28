
public class Ottimizza {
	public static void main(String[] args) {
		
	}
	
	public static String formatarData(String data) {
		//Transforma os formatos em yyyy-MM
		//   1-dd/MM/yyyy	2-yyyy-MM-dd	3-dd-MM-yyyy	4-ddMMyyyy   
		String[] rawData;
		
		if (data.indexOf("/") != -1) { //1
			rawData = data.split("/");
			
			return rawData[2] + "-" + rawData[1];
		}
		else if (data.indexOf("-") != -1) {
			rawData = data.split("-");
			
			if (rawData[0].length() == 4) { //2
				return rawData[0] + "-" + rawData[1];
			}
			else { //3
				return rawData[2] + "-" + rawData[1];
			}
		}
		else { //4
			return data.substring(4, 8) + "-" + data.substring(2, 4);
		}
	}
	
	
	public static String concatenarStringArray(String[] stringArray) {
		String stringConcatenada = stringArray[0]; //A stringConcatenada será a variável retornada pelo método.
												   
		for (int x = 1; x < stringArray.length ; x++) {
			stringConcatenada += " " + stringArray[x];
		}

		return stringConcatenada;
	}
	
	
	public static int maiorInteiro(int[] intArray) {
		int maiorValor = intArray[0];
		
		for (int x = 1; x < intArray.length; x++) {
			if (intArray[x] > maiorValor) {
				maiorValor = intArray[x];
			}
		}
		
		return maiorValor;
	}
	
}
