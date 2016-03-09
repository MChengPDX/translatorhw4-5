package cs202hw4_5;

//ctp = common travel phrases
public class ctp extends text {

	public ctp(String t) {
		super(t);
		// TODO Auto-generated constructor stub
	}

	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("Testing dynamic binding, ctp class");
		
	}
	public void display_string(){
		System.out.println(getString());
	}


}
