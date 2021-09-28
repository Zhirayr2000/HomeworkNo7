package triangles;

public class HelperFunctions {
    boolean isValid(Triangle t)
    {
        return !(t.side1+t.side2<t.side3 || t.side1+t.side3<t.side2 || t.side3+t.side2<t.side1);
    }
    long calculatePerimeter(Triangle t)
    {
        long perimeter=t.side1+t.side2+t.side3;
        System.out.println("The perimeter of triangle is : "+perimeter);
        return perimeter;
    }
    double calculateArea(Triangle t)
    {
        double p=(double)((t.side1+t.side2+t.side3)/2);
        double area=Math.sqrt(p*(p- t.side1)*(p-t.side2)*(p- t.side3));
        System.out.println("The area of triangle is : "+area);
        return area;
    }
}
