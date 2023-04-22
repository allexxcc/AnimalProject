
public class Dog extends Animal {
	
	private String earShape;
	private String tailShape;
	
	public Dog() {
		super("Mitt", "big",50);
	}
	
	public Dog(String type, double wight) {
		this(type,wight,"Perky", "Curled");
	}


public Dog(String type, double wight, String earShape, String tailshape) {
	super(type, wight<15 ? "small" : (wight<35 ? "medium":"large"),wight);
	this.earShape=earShape;
	this.tailShape=tailShape;
}


@Override
public String toString() {
	return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + ", toString()=" + super.toString();
		
}
	public void makeNoise() {
		if(type=="Wolf") {
			System.out.println("Ow Wooooo");
		}
		bark();
		System.out.println();
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		//System.out.println("Dogs walk run and wag their tail");
		if (speed=="slow") {
			walk();
			wagTail();
		}else {
			run();
			bark();
		}
		System.out.println();
	}
	
	private void bark() {
		System.out.print("Woof");
	}
	
	private void run() {
		System.out.print("Dog running");
	}
	private void walk() {
		System.out.print("Dog walking");
	}
	
	private void wagTail() {
		System.out.print("Tail wagging");
	}
}
