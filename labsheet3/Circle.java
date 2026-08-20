public class Circle{
    double r;
    double d;
    double area;
    double circumference;
    double pi=22/7;

    public void caldiamiter(double r){
        this.r=r;
        d=2*pi*r;
        System.out.println("Daimeter is"+d);

    }
    public void calarea(double r){
        this.r=r;
        area=pi*r*r;
        System.out.println("Area is"+area);
    }
    public void calcircumference(double r){
        this.r=r;
        circumference=2*pi*r;
        System.out.println("Circumference is"+circumference);
    }
}