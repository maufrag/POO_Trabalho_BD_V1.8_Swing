package MetodosGerais;

import java.util.List;

public class MetodosDeApoio {

	public static Boolean isNullOrWhiteSpace(String texto) {
		if (texto == null)
			return true;
		if (texto.isEmpty())
			return true;

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) != ' ') {
				return false;
			}
		}
		return true;
	}

	public static boolean isInteger(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			Integer.parseInt(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static boolean isChar(String strChar) {
		if (strChar == null)
			return false;
		else if (strChar.length() > 1)
			return false;
		else
			return true;
	}

	public static void listarMenu(List<String> listaMenu) {
		System.out.println("Informe o valor correspondente a operação que deseja realizar");
		int index = 1;
		for (String menu : listaMenu) {
			System.out.println(index + " - " + menu);
			index++;
		}
	}
}
