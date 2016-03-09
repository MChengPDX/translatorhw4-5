package cs202hw4_5;

public abstract class text {
	private String t;

	public text(String t) {
		this.t = t;
	}

	public void setString(String t) {
		this.t = t;
	}

	public String getString() {
		return t;
	}
	abstract void display_string();
	abstract void test();
	

}

