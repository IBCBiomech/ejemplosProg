import javax.swing.JOptionPane;

class MultiplicaNumeros {
	public static void main (String [] args) {
		String strNum1;
		String strNum2;
		int intNum1;
		int intNum2;     
		int suma;
		strNum1 = JOptionPane.showInputDialog("Ingrese el entero 1: ");
		strNum2 = JOptionPane.showInputDialog("Ingrese el entero 2: ");
		intNum1 = Integer.parseInt(strNum1);
		intNum2 = Integer.parseInt(strNum2);
		suma = intNum1 + intNum2;
		JOptionPane.showMessageDialog(null, "La multiplicación es "+ suma, "Resultado,", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}
}
