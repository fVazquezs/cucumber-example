public class Calculadora {
    public int calculo(int num1, int num2, char operador) {
        if(operador == '+') {
            return somar(num1, num2);
        } else if (operador == '-') {
            return subtrair(num1, num2);
        } else if (operador == '*') {
            return multiplicar(num1,num2);
        }
        return 0;
    }
    private int somar(int num1, int num2){
        return num1 + num2;
    }
    private int subtrair(int num1, int num2){
        return num1 - num2;
    }
    private int multiplicar(int num1, int num2){
        return num1 * num2;
    }
}
