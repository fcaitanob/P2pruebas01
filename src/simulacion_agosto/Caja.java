package simulacion_agosto;

public class Caja {

		private String titular;
		private double saldo;
		
		
		public Caja (String t, double d) {
			titular = t;
			saldo  = d;
		}
		
		public Caja () {
			titular = "";
			saldo = 0;
		}
		
		public String getTitular() {
			return titular;
		}
		
		public void setTitular(String t) {
			titular = t;
		}

		public double getSaldo() {
			return saldo;
		}
		
		public void setSaldo(double s) {
			saldo = s;
		}
		
		public void ingresar(double ingreso) {
			saldo = saldo + ingreso;
		}
		
		public void retirar(double retiro) {
			saldo -= retiro;
			if (saldo < 0) {
				saldo = 0;
			}
	}
		
		
		
		
	
	
	
	public static void main(String[] args) {

		Caja c = new Caja("Fernando", 4000.0);
		c.ingresar(2000.0);
		c.retirar(1200.0);
		System.out.println("La cuenta de " + c.getTitular() + " tiene $ " + c.getSaldo());
		
		
		
	}
}
