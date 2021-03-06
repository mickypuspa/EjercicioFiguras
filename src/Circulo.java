public class Circulo extends Figura {
    private double radio;

    public Circulo (double r){
        this.radio = r;
    }
    public double area(){
        return Math.PI * radio * radio;
    }

    public int compareTo(Figura o) {
        return super.compareTo(o);
    }
}
