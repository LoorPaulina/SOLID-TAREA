package ocp_solucion;

public class Salado implements Checkeable{
	 String check(CheckBox checkSalado) {
		if(checkSalado.ischeck()) {
			return spinnerSalado.getSelectedItem().toString()+", Caliente, "+cant;
		}
	}
}


