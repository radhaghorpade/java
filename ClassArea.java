package area;

public class ClassArea extends shape{
	
	void rectangleArea(int l,int b){
		System.out.println("Area of Reactangle : " +(l*b));
    }
	
	void squareArea(int s){
		System.out.println("Area of Square : " +(s*s));
    }
	void circleArea(int r){
		System.out.println("Area of Circle : " +(3.14*r*r));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ClassArea ca = new ClassArea();
     ca.rectangleArea(5, 3);
     ca.circleArea(6);
     ca.squareArea(6);
	}

}
