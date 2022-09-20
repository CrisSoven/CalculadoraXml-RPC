//Cristopher Soto Ventura
package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CalculadoraClient {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

        String option = "", num1 = "", num2 = "";
        Double response;
        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Exponente");
            System.out.println("6. Raíz");
            System.out.println("7. Salir");
            System.out.print("Ingresa una opción: ");
            option = teclado.next();

            if (isNumber(option)){
                switch (Integer.parseInt(option)){
                    case 1:
                        do {
                            System.out.print("\nIngresa el primer valor: ");
                            num1 = teclado.next();
                            if (!isNumber((num1))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num1));
                        do {
                            System.out.print("Ingresa el segundo valor: ");
                            num2 = teclado.next();
                            if (!isNumber((num2))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num2));

                        Object[] suma = {num1, num2};
                        response = (Double)
                                client.execute("Methods.suma", suma);
                        System.out.println("\n"+num1+"+"+num2+"="+response+"\n");

                        break;
                    case 2:
                        do {
                            System.out.print("\nIngresa el primer valor: ");
                            num1 = teclado.next();
                            if (!isNumber((num1))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num1));
                        do {
                            System.out.print("Ingresa el segundo valor: ");
                            num2 = teclado.next();
                            if (!isNumber((num2))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num2));

                        Object[] resta = {num1, num2};
                        response = (Double)
                                client.execute("Methods.resta", resta);
                        System.out.println("\n"+num1+"-"+num2+"="+response+"\n");

                        break;
                    case 3:
                        do {
                            System.out.print("\nIngresa el primer valor: ");
                            num1 = teclado.next();
                            if (!isNumber((num1))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num1));
                        do {
                            System.out.print("Ingresa el segundo valor: ");
                            num2 = teclado.next();
                            if (!isNumber((num2))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num2));

                        Object[] mult = {num1, num2};
                        response = (Double)
                                client.execute("Methods.multiplication", mult);
                        System.out.println("\n"+num1+"*"+num2+"="+response+"\n");

                        break;
                    case 4:
                        do {
                            System.out.print("\nIngresa el dividendo: ");
                            num1 = teclado.next();
                            if (!isNumber((num1))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num1));
                        do {
                            System.out.print("Ingresa el divisor: ");
                            num2 = teclado.next();
                            if (!isNumber((num2))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num2));

                        Object[] div = {num1, num2};
                        response = (Double)
                                client.execute("Methods.division", div);
                        System.out.println("\n"+num1+"/"+num2+"="+response+"\n");

                        break;
                    case 5:
                        do {
                            System.out.print("\nIngresa la base: ");
                            num1 = teclado.next();
                            if (!isNumber((num1))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num1));
                        do {
                            System.out.print("Ingresa la potencia: ");
                            num2 = teclado.next();
                            if (!isNumber((num2))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num2));

                        Object[] exp = {num1, num2};
                        response = (Double)
                                client.execute("Methods.exponente", exp);
                        System.out.println("\n"+num1+"^"+num2+"="+response+"\n");
                        break;
                    case 6:
                        do {
                            System.out.print("\nIngresa el radicando: ");
                            num1 = teclado.next();
                            if (!isNumber((num1))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num1));
                        do {
                            System.out.print("Ingresa indice: ");
                            num2 = teclado.next();
                            if (!isNumber((num2))){
                                System.out.println("ERROR: Ingresa un valor numérico");
                            }
                        } while (!isNumber(num2));

                        Object[] raiz = {num1, num2};
                        response = (Double)
                                client.execute("Methods.raiz", raiz);
                        System.out.println("\n"+num2+"√"+num1+"="+response+"\n");
                        break;
                    default:
                        System.out.println("Ingresa un opción válido");
                        break;
                }
            } else{
                System.out.println("Ingresa un opción válido");
            }


        } while (!option.equals("7"));
    }

    public static boolean isNumber(String number){
        try {
            int num = Integer.parseInt(number);
            return true;

        } catch (NumberFormatException e){
            return false;
        }
    }
}
