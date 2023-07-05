package learn.polymorphism;

public class Automation extends MultipleLanguage implements TestTool,Language{

	public void java() {
		System.out.println("Clear Java Exam");
	}

	public void Selenium() {
		System.out.println("Apply Selenium in Testing");
	}
	

	@Override
	public void ruby() {
        System.out.println("Elearning session in ruby");		
	}

	public static void main(String[] args) {
          
		Automation prog=new Automation();
		prog.java();
		prog.python();
		prog.ruby();
		prog.Selenium();
		
		
		
	}


}

