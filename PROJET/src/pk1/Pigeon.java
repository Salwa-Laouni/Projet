package pk1;

public class Pigeon extends Oiseau{
	
	private String name;

	public Pigeon(int age, String color, String name) {
		super(age, color);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pigeon [name=" + name +super.toString();
	}

	@Override
	public int compareTo(Oiseau o) {
		// TODO Auto-generated method stub
		return super.compareTo(o);
	}

	@Override
	protected Oiseau clone() {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	
	
}
