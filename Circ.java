public class Circ extends Shape {
    Circ(double a, double b) { 
        super(a, b); 
    }
    
    double area(){
        System.out.println("Inside Area for Circle."); 
        return PI * dim1 * dim1;
    }
}
