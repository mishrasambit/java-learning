class Operation{
    int square(int x){
        return x*x;
    }
}

class Circle{
    Operation operation;
    double pi = 3.14;
    double area(int radius){
        //square the radius
        operation = new Operation();
        int rsquare = operation.square(radius);
        //multiply with pi
        double area = pi*rsquare;
        return area;
    }
}

public class Prog1{
    public static void main(String[] args){
        Circle circle = new Circle();
        System.out.println(circle.area(5));
        
    }
}