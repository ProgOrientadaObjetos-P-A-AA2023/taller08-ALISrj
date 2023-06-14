package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.*;

public class Ejecutor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean bandera = true;
        
        while (bandera) {

            System.out.print("Ingrese 1 para crear el nombramiento de un docente.\n"
                    + "Ingrese 2 para crear la factura de un docente.\n> ");
            String opcion = entrada.nextLine();

            if ("1".equals(opcion) || "2".equals(opcion)) {

                System.out.print("Ingrese los nombres del docente.\n> ");
                String nombres = entrada.nextLine();
                System.out.print("Ingrese la cédula del docente.\n> ");
                String cedula = entrada.nextLine();

                if ("1".equals(opcion)) {

                    System.out.print("Ingrese el sueldo del docente.\n> ");
                    double valorSueldo = entrada.nextDouble();
                    System.out.print("Ingrese el valor de la hora extra.\n> ");
                    double valorHorasExtra = entrada.nextDouble();
                    System.out.print("Ingrese el número de horas extra.\n> ");
                    int numHoras = entrada.nextInt();
                    entrada.nextLine();
                    
                    DocenteNombramiento docente1 = new DocenteNombramiento();
                                        
                    docente1.establecerNombres(nombres);
                    docente1.establecerCedula(cedula);
                    docente1.establecerValorSueldo(valorSueldo);
                    docente1.establecerValorHorasExtra(valorHorasExtra);
                    docente1.establecerNumeroHorasExtra(numHoras);                    
                    docente1.establecerSueldo();

                    System.out.println(docente1);
                } else if ("2".equals(opcion)) {

                    System.out.print("Ingrese el valor de la factura.\n> ");
                    double valorFactura = entrada.nextDouble();
                    System.out.print("Ingrese el valor iva del descuento.\n> ");
                    double valorIvaDescuento = entrada.nextDouble();
                    entrada.nextLine();
                    
                    DocenteFactura factura1 = new DocenteFactura();
 
                    factura1.establecerNombres(nombres);
                    factura1.establecerCedula(cedula);
                    factura1.establecerValorFactura(valorFactura);
                    factura1.establecerValorIvaDescuento(valorIvaDescuento);
                    factura1.establecerValorCancelar();
                    System.out.println(factura1);
                }

            } else {
                System.out.println("Opción incorrecta");
            }
            
            System.out.print("\nIngrese si para salir del programa.\n> ");
            String salida = entrada.nextLine();
            if ("si".equals(salida)) {
                bandera = false;
            }

        }

    }

}
