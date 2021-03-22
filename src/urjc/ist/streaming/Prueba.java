package urjc.ist.streaming;

import java.util.List;
import java.util.Calendar;

public class Prueba {
	private List<String> lista;
	private Calendar dia;
	
	public Prueba(Calendar dia) {
		if(dia!=null)
		System.out.println(dia.getTime());
		else
			System.out.println("eiii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ahoraCal = Calendar.getInstance();
		Prueba aux = new Prueba(ahoraCal);
	}

}
