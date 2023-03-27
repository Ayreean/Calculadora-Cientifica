public class CalculadoraCientifica {
    public static void main(String[] args) {
        Calculos c = new Calculos();
        int n1 = 2, n2 = 5, n3 = 7;
        double d1 = 3;
        String s1 = "4", s2 = "4";
        float f1 = 56.7f, f2 = 0.3f;

        // Somando dois números reais
        System.out.println("A soma dos reais " + f1 + " e " + f2 + " é: " +  c.soma(f1, f2));
    
        // Somando dois inteiros
        System.out.println("A soma dos inteiros " + n1 + " e " + n2 + " é: " +  c.soma(n1, n2));
    
        // Somando inteiro e string
        System.out.println("A soma do inteiro " + n1 + " e da string " + s1 +  " é: " +  c.soma(n1, s1));
    
        // Somando string e inteiro
        System.out.println("A soma da string " + s2 + " e do inteiro " + n2 +  " é: " +  c.soma(s2, n2));
    
        // Somando string e string
        System.out.println("A soma das strings " + s1 + " e " + s2 + " é: " +  c.soma(s1, s2));
        
        // Somando três inteiros
        System.out.println("A soma dos inteiros " + n1 + " , " + n2 + " e " + n3 +" é: " + c.soma(n1, n2, n3));

        // Raízes
        System.out.println("Raiz de " + n1 + ": " + c.raiz(n1));
        System.out.println("Raiz de " + d1 + ": " + c.raiz(d1));
        System.out.println("Raiz de " + s1 + ": " + c.raiz(s1));

        // Potências
        System.out.println(n1 + " elevado a " + n2 + ": " + c.potencia(n1, n2));
        System.out.println(s1 + " elevado a " + s2 + ": " + c.potencia(s1, s2));
        System.out.println(n1 + " elevado a " + d1 + ": " + c.potencia(n1, d1));
    }

}
