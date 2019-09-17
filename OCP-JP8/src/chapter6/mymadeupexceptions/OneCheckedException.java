package chapter6.mymadeupexceptions;

public class OneCheckedException extends Exception {
	String msg = "";
	
	public OneCheckedException() {}
	
	public OneCheckedException(String string) {
		this.msg = string;
	}
	
	@Override
	public String getMessage(){
		return msg;
	}

}
