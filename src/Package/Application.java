package Package;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ImplInterface1 note = new ImplInterface1();
		note.setV1(14);
		note.setV2(12);
		
		System.out.println("La note minimale est de : " + note.minimum());
		System.out.println("La note maximale est de : " + note.maximum());
		
		ImplInterface2 taille = new ImplInterface2();
		taille.setV1(165);
		taille.setV2(189);
		taille.setV3(171);
		
		System.out.println("La taille maximale est de : " + taille.maximum() + " cm");
		System.out.println("La taille minimale est de : " + taille.minimum() + " cm");
	}

}
