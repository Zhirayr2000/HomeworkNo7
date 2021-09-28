package triangles;

public class Triangle {
    int side1;
    int side2;
    int side3;
    Triangle(int side1,int side2,int side3){
        if(side1<=0 || side2<=0 || side3<=0)
        {
            System.out.println("Sides must be Positive Integers.");
            return;
        }
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public  String toString(){
        return "side1 : "+side1+"\nside2 : "+side2+"\nside3 : "+side3+".\n";
    }
}
