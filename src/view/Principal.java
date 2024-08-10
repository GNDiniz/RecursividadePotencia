package view;

import controller.PotenciaController;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		PotenciaController pc = new PotenciaController();
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Informe a base: "));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Informe o expoente: "));
		
		int pot = pc.pot(base, expoente);
		System.out.println("Potência de base "+base+" e expoente "+expoente+"é igual a: "+pot);

	}

}
