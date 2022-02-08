public class Rect extends Shape {
    
    Rect(double a, double b) { 
        super(a, b); 
    }
    
    double area(){
        System.out.println("Inside Area for Rectangle."); 
        return dim1 * dim2; 
    }
}
