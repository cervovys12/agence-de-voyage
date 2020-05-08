package voyage;

public class Vol {
	private long id;
	private String depart;
	private String destination;
	private String date;
	private int nbrperso;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getDestination() {
		return destination;
	}
	public Vol() {
		super();
	}
	public Vol(long id, String depart, String destination, String date, int nbrperso) {
		super();
		this.id = id;
		this.depart = depart;
		this.destination = destination;
		this.date = date;
		this.nbrperso = nbrperso;
	}
	public Vol(String depart, String destination, String date, int nbrperso) {
		super();
		this.depart = depart;
		this.destination = destination;
		this.date = date;
		this.nbrperso = nbrperso;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNbrperso() {
		return nbrperso;
	}
	public void setNbrperso(int nbrperso) {
		this.nbrperso = nbrperso;
	}
	public String volshow() {
		return id + " ~ " + depart + " ~ " + destination + " ~ " + date + " ~ " + nbrperso;
	
	}
}
