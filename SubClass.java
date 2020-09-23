
public class SubClass extends SubClassTwo implements InterfaceClass{

	
	public SubClass() {
		super(1);
		System.out.println("from constructor");
	}

	public void method() {
		System.out.println("This is from Subclass");
	}

	@Override
	public void methodInterface() {
		System.out.println("This is Overrided from Interface");
	}
}
