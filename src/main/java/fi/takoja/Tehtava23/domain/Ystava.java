package fi.takoja.Tehtava23.domain;

public class Ystava {
	
	private String Name;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Ystava [Name=" + Name + "]";
	}


}
