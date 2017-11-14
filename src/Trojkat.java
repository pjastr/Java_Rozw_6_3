public class Trojkat extends Figura {
    public Trojkat(int a, int b, int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double ObliczPole() {
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
