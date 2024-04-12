package jpnn.JavaChallenges.practice;

public class AreaCalculator {
    
    public static final double  INVALID_VALUE = -1;
    

    //The method needs to return a double value that represents the area of a circle.
    //area of a circle is (PI * (radius * radiu))
    public static double area(double radius){
        if(radius < 0) return INVALID_VALUE;

        return Math.PI * (radius * radius);

    }


    //Area rectangle = length × width
    public static double area(double x, double y){
        if(x < 0 || y < 0) return INVALID_VALUE;

        return x * y;
    }

    
}
