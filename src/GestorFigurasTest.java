public class GestorFigurasTest {
    public static void main(String[] args) {
        Figura[] figura = new Figura[4];
        figura[0] = new Circulo(4.5);
        figura[1] = new Rectangulo(5,3);
        figura[2] = new Triangulo (4,7);
        figura[3] = new Cuadrado(5.5);

        GestorFiguras g = new GestorFiguras();

        g.sort(figura);
        for (Figura value : figura) {
            System.out.println("Figura:" + value.getClass().getName() + ", Área:" + value.area());
        }

        double Atotal = g.Suma(figura);
        System.out.println("Suma de todas las areas: " + Atotal);
    }
}
