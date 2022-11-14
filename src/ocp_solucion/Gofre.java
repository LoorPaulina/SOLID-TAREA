package ocp_solucion;

public class Gofre implements Shown{
	 String isShown(SpinnerHelados gofre) {
		if(gofre.isShown()) {
			return "Gofre, "+spinnerGofres.getSelectedItem().toString()
					+" de "+spinnerHelados.getSelectedItem().toString()
    				+", "+cant;
	}
}}
	 


