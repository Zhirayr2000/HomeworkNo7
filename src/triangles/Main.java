package triangles;

public class Main {
    static int rand()
    {
        return (int)(Math.random()*99+1);
    }
    public static void main(String[] args) {
        Triangle[] triangles=new Triangle[3];
        for(int i=0;i<triangles.length;i++) {
            triangles[i] = new Triangle(rand(), rand(), rand());
            System.out.println("Triangle["+i+"]\n"+triangles[i]);
        }
        HelperFunctions helper=new HelperFunctions();
        for (int i = 0; i < 3; i++) {
            if(helper.isValid(triangles[i]))
            {
                helper.calculateArea(triangles[i]);
                helper.calculatePerimeter(triangles[i]);
                System.out.println();
            }
            else
                System.out.println("Invalid sides\n");
        }
    }
}
