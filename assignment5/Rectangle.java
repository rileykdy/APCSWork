public class Rectangle{

public Rectangle(double widthCon, double lengthCon){
  width = widthCon;
  length = lengthCon;
}

private double width;
private double length;

public void dimensions(){

System.out.println("Width: " + width);
System.out.println("Length: " + length);

}

public void area(){

double area = width * length;

System.out.println("Area: " + area);

}

public void perimeter(){

double perimeter = (width + length)*2;

System.out.println("Perimeter: " + perimeter);

}

public void diagonal(){

double d = (width * width) + (length * length);

double diagonal = Math.sqrt(d);

System.out.println("Diagonal: " + diagonal);

}

}
