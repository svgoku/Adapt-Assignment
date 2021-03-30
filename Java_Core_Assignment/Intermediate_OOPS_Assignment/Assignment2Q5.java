class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "Rectangle5";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "Line5";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "Cube5";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5 {

	public static void main(String[] args) {
		Shape5 shapeA=new Cube5();
    	Shape5 shapeB=new Line5();
    	Shape5 shapeC=new Rectangle5();
    	System.out.println(shapeA.draw());
    	System.out.println(shapeB.draw());
    	System.out.println(shapeC.draw());

	}

}
