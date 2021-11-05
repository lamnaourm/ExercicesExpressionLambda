
@FunctionalInterface
interface Operation {
	boolean tester(int a);
}

public class Main {

	public static void main(String[] args) {
		Operation positif = x -> x>=0;
		Operation negatif = x -> x<0;
		Operation pair = x -> x%2==0;
		
		int[] entiers = {3,6,-9,15,6};
		
		System.out.println("Liste des positifs : ");
		for(int a: entiers) {
			if(positif.tester(a))
				System.out.print(a + ",");
		}
		System.out.println();
		
		System.out.println("Liste des negatifs : ");
		for(int a: entiers) {
			if(negatif.tester(a))
				System.out.print(a + ",");
		}
		System.out.println();
		
		System.out.println("Liste des pairs : ");
		for(int a: entiers) {
			if(pair.tester(a))
				System.out.print(a + ",");
		}
		System.out.println();

	}

}
