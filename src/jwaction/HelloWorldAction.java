package jwaction;
import com.opensymphony.xwork2.ActionSupport;
import java.util.*;

public class HelloWorldAction extends ActionSupport{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		HashMap<String, String> m1 = new HashMap<>();
	    m1.put("Zara", "8");
	    m1.put("Mahnaz", "31");
	    m1.put("Ayan", "12");
	    m1.put("Daisy", "14");
	    m1.get("Zara");
	}
	
	public String execute() {
		return SUCCESS;
	}
	
	public String hello() {
		return "hello";
	}
}
