package hrank.algorithm.implementation;

public class TEST {
	
	private String name;
	private int roll;

	public static void main(String[] args) {
		System.out.println(5/(-1));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TEST other = (TEST) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}
	
}
