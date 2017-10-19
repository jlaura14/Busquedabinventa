package app;

import java.text.DecimalFormat;

	@SuppressWarnings("rawtypes")
	public class Sales implements Comparable {
		String meses;
		int dias;
		double ventas;
		DecimalFormat menos = new DecimalFormat("#.000");
		
		public Sales(String mes, int dia, double vent) {
			// TODO Auto-generated constructor stub
			super();
			this.meses=mes;
			this.dias=dia;
			this.ventas=vent;
		}
		public Sales(int i, int mes2, float vent) {
			// TODO Auto-generated constructor stub
		}
		public String getMeses() {
			return meses;
		}

		public void setMeses(String mes) {
			this.meses = mes;
		}

		public int getDia() {
			return dias;
		}

		public void setDia(int dia) {
			this.dias = dia;
		}

		public double getVentas() {
			return ventas;
		}

		public void setVentas(double ventas) {
			this.ventas = ventas;
		}
		@Override
		public int compareTo(Object arg0) { // SOBRECRGA AL COMPARETO
			
			Sales ven = (Sales)arg0;
			
			if (this.ventas <= ven.ventas)
				return 1;
			if (this.ventas == ven.ventas)
				return 0;
			if (this.ventas >= ven.ventas)
				return -1;
			
			return 0;
			
		}
	@SuppressWarnings("unused")
	private double compare(Sales arg0, Sales arg1) { // SOBRECARGA AL COMPARE
		if (arg0.ventas == arg1.ventas)
			return 0;
		if (arg0.ventas >= arg1.ventas)
			return -1;
		if (arg0.ventas <= arg1.ventas)
			return 1;
		return 0;
	}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			
			
			return ("Dia: "+dias+"  Venta:  "+ventas );
		
		}		
}

	


