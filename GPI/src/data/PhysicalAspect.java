package data;

public class PhysicalAspect {

	
	private int age ;
	private String wound;
	
	public PhysicalAspect(int age, String wound) {
		super();
		this.age = age;
		this.wound = wound;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getWound() {
		return wound;
	}

	public void setWound(String wound) {
		this.wound = wound;
	}
	
	
}
