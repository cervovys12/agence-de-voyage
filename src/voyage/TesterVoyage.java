package voyage;

import java.util.Iterator;

public class TesterVoyage {
	public static void main() {
		Operation operation= new Operation();
		operation.add(new Vol(1L,"meknes","fes","11/09/2020",2));
		operation.add(new Vol(2L,"sidi bennour","meknes","11/09/2020",2));
		operation.add(new Vol(3L,"fes","paris","11/09/2020",2));
		operation.add(new Vol(4L,"paris","berlin","11/09/2020",2));
	Iterator<Vol> i=operation.getallvols().iterator();
	operation.remove(2L);
	while(i.hasNext())
	{
		Vol p =i.next();
		System.out.println(p.volshow());
	}
	
	
	
	
	}
}
