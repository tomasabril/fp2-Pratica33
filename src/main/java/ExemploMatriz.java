import utfpr.ct.dainf.if62c.exemplos.Matriz;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class ExemploMatriz {

    public static void main(String[] args) {
        Matriz orig = new Matriz(3, 2);
        double[][] m = orig.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        m[2][1] = 2.1;
        Matriz outra = new Matriz(3, 2);
        double[][] m2 = outra.getMatriz();
        m2[0][0] = 0.0;
        m2[0][1] = 0.1;
        m2[1][0] = 1.0;
        m2[1][1] = 1.1;
        m2[2][0] = 2.0;
        m2[2][1] = 2.1;
        
        Matriz transp = orig.getTransposta();
        Matriz somada = orig.soma(outra);
        System.out.println("Matriz original: \n" + orig);
        System.out.println("Matriz transposta: \n" + transp);
    }
}
