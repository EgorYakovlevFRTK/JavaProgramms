package checkFaulls;

public class myClass {
	
	public static void nothingMaker(Shape obj) {
		obj.draw();
	}
	
	public static void main(String[] args) {
		
		Shape s = new Tringle(); //s ���� Shape
		nothingMaker(s); // ��������� ����� draw ��������� ������, ��� draw ���������������� � �������� ������
		System.out.println(s instanceof Shape);
	}

}
