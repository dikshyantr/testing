package testing;

public class Test {
	boolean  a = true;
	public Test(){
		if(a){
			throw new NullPointerException();
		}
	}
}
