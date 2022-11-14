package ocp_solucion;

public class Dulce implements Checkeable {
	String check(CheckBox checkDulce) {
		if(checkDulce.ischeck()) {
			return spinnerDulce.getSelectedItem().toString()+", Caliente, "+cant;
		}
	}
}



