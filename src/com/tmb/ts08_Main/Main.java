package com.tmb.ts08_Main;

import javax.swing.JOptionPane;

import com.tmbs.ta08_01.Exercise01;
import com.tmbs.ta08_02.Exercise02;
import com.tmbs.ta08_03.Exercise03;
import com.tmbs.ta08_04.Exercise04;


public class Main {

	public static void main(String[] args) {
		

		String[] options = { "EJ 1", "EJ 2", "EJ 3", "EJ 4", "Salir" };

		int i = JOptionPane.showOptionDialog(null, "Seleccione un ejercicio", "Unidad C TA 8",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[3]);

		if (i == JOptionPane.CLOSED_OPTION)
			i = 4; // Controlando el cierre JOPane

		switch (i) {
		case 0:
			JOptionPane.showMessageDialog(null, "El ejercicio 1 se mostrará por la consola");
			Exercise01.run();
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "El ejercicio 2 se mostrará por la consola");
			Exercise02.run();
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "El ejercicio 3 se mostrará por la consola");
			Exercise03.run();
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "El ejercicio 4 se mostrará por la consola");
			Exercise04.run();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "EXIT APP");
			break;
		}

	}

}
