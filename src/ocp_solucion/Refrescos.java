package ocp_solucion;

public class Refrescos implements Retornable{
	String returnString(Spinner spinner) {
		return spinner.getSelectedItem().toString()+" "+spinnerTamaño.getSelectedItem().toString()
				+", : "+cant;
	}
}