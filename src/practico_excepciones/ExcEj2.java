package practico_excepciones;

public class ExcEj2 {

	public static void main(String[] args) {

		Exception exc;
		try {
			exc= new Exception("aaabbb");
			throw exc;
		} catch (Exception e){
			System.out.println("Texto del parámetro: " + e.getMessage());
		} finally {
			System.out.println("Estoy en el finally") ;
		}
		
	}

}
