package pk1;

import java.util.Objects;

public class Oiseau implements Comparable<Oiseau>{
	
	private int age;
	private String color;
	
	public Oiseau(int age, String color) {
		super();
		this.age = age;
		this.color = color;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ", age=" + age + ", color=" + color ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oiseau other = (Oiseau) obj;
		return age == other.age && Objects.equals(color, other.color);
	}

	@Override
	public int compareTo(Oiseau o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}

	@Override
	protected Oiseau clone(){
		// TODO Auto-generated method stub
		try {
			return (Oiseau)super.clone();
			}
		catch(CloneNotSupportedException e){
			return null;
		}
	}

	
}
