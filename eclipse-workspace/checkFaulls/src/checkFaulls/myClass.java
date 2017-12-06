package checkFaulls;

public class myClass {
	
	public static void nothingMaker(Shape obj) {
		obj.draw();
	}
	
	public static void main(String[] args) {
		
		Shape s = new Tringle(); //s типа Shape
		nothingMaker(s); // ¬ызоветс€ метод draw дочернего класса, ибо draw переопредел€ест€ в дочернем классе
		System.out.println(s instanceof Shape);
	}

}
