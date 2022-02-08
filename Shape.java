public abstract class Shape {
    double dim1;
    double dim2;
    double PI=3.14;

    Shape(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

}
