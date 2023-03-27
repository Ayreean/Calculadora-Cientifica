public class Calculos {

    public  int soma (int a, int b) {
        // Usando uma variável para o resultado
        int resultado;
        resultado = a + b;
        return resultado;
    }
    // Uma sobrecarga para o método soma Float e Float
    public float soma (float a, float b) {
        return a + b;
    }
    // Uma sobrecarga para o método soma String e String
    public  int soma (String a, String b) {
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        return n1 + n2;
    }
   
    // Uma sobrecarga para o método soma tres inteiros
    public int soma (int a, int b, int c) {
        return a + b + c;
    }
    
    // Uma sobrecarga para o método soma String e int
    public int soma (String a, int b) {
        return Integer.parseInt(a) + b;
    }

    // Uma sobrecarga para o método soma Int e String
    public int soma (int a, String b) {
    return a + Integer.parseInt(b);
    }
    
    // Outras operações
    public int subtracao (int a, int b) {
        // Sem usar uma variável para o resultado
        return a - b;
    }
    
    public int multiplicacao (int a, int b) {
        return a * b;
    }
    
    public int divisao (int a, int b) {
        // Aqui ocorre a divisão inteira
        return a / b;
    }
    
    // Método para calcular raiz com parâmetro int
    public double raiz(int num) {
        return Math.sqrt(num);
    }

    // Método para calcular raiz com parâmetro double
    public double raiz(double num) {
        return Math.sqrt(num);
    }

    // Método para calcular raiz com parâmetro String
    public double raiz(String numStr) {
        double num = Double.parseDouble(numStr);
        return Math.sqrt(num);
    }

    // Método para calcular potência com parâmetros int
    public double potencia(int base, int expoente) {
        return Math.pow(base, expoente);
    }

    // Método para calcular potência com parâmetros String
    public double potencia(String baseStr, String expoenteStr) {
        double base = Double.parseDouble(baseStr);
        double expoente = Double.parseDouble(expoenteStr);
        return Math.pow(base, expoente);
    }

    // Método para calcular potência com parâmetros int e double
    public double potencia(int base, double expoente) {
        return Math.pow(base, expoente);
    }
}
