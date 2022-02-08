public class Areas {
    public static void main(String args[]) {
        Rect r = new Rect(9,5);
        Tri t = new Tri(10,8);
        Circ c = new Circ(5,5);
        Ellipse e = new Ellipse(7,7);

        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Area is " + figref.area());
    }
}
