import java.util.Arrays;

public class GestorFiguras {
    public double Suma(Figura[] f){
        int j = 0;
        double atotal = 0;
        while(j<f.length){
            atotal = atotal + f[j].area();
            j++;
        }
        return atotal;
    }
}
