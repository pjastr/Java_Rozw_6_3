public class Kwadrat extends Figura {
    public Kwadrat(int a) {
        this.a=a;
    }

    @Override
    public double ObliczPole() {
        return a*a;
    }
}
