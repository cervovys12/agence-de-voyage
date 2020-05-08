package voyage;

import java.util.ArrayList;

public class Operation {
	private ArrayList<Vol> Vols=new ArrayList<Vol>();

	public ArrayList<Vol> getVols() {
		return Vols;
	}

	public void setVols(ArrayList<Vol> vols) {
		Vols = vols;
	}
	public void add(Vol a)
	{
		Vols.add(a);
	}
	public void remove (long id)
	{
		for (Vol a:Vols)
		{
			if (a.getId()==id) {
				Vols.remove(a);
				break;
			}
		}
	}
	public ArrayList getallvols()
	{
		return Vols;
	}
	
}
