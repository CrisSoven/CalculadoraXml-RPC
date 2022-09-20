//Cristopher Soto Ventura
package server;

public class Methods {

    public double suma(String num1String, String num2String){
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        return num1+num2;
    }

    public double resta(String num1String, String num2String){
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        return num1-num2;
    }

    public double multiplication(String num1String, String num2String){
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        return num1*num2;
    }

    public double division(String num1String, String num2String){
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        if (num2 <= 0){
            return 0;
        }
        return num1/num2;
    }

    public double exponente(String num1String, String num2String){
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        return Math.pow(num1, num2);
    }

    public double raiz(String num1String, String num2String){
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        return Math.pow(num1, 1/num2);
    }
}
