package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.*;

public class Ejecutor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Ingrese 1 para crear el nombramiento de un docente.\n"
                + "Ingrese 2 para crear la factura de un docente.\n> ");
        String opcion = entrada.nextLine();
        
        if (!"1".equals(opcion) && !"2".equals(opcion)) {
            System.out.println("Opción incorrecta");
            return;
        }

        System.out.println("Ingrese los nombres del docente.");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese la cédula del docente.");
        String cedula = entrada.nextLine();

        if ("1".equals(opcion)) {

            System.out.print("Ingrese el sueldo del docente.\n> ");
            double valorSueldo = entrada.nextDouble();
            System.out.print("Ingrese el valor de la hora extra.\n> ");
            double valorHorasExtra = entrada.nextDouble();
            System.out.print("Ingrese el número de horas extra.\n> ");
            int numHoras = entrada.nextInt();

            DocenteNombramiento docente1 = new DocenteNombramiento(
                    valorSueldo, valorHorasExtra, numHoras);
            docente1.establecerSueldo();
            docente1.establecerNombres(nombres);
            docente1.establecerCedula(cedula);
            
            System.out.println(docente1);
        } else if ("2".equals(opcion)) {

            System.out.print("Ingrese el valor de la factura.\n> ");
            double valorFactura = entrada.nextDouble();
            System.out.print("Ingrese el valor iva del descuento.\n> ");
            double valorIvaDescuento = entrada.nextDouble();

            DocenteFactura factura1 = new DocenteFactura(
                    valorFactura, valorIvaDescuento);
            factura1.establecerValorCancelar();
            factura1.establecerNombres(nombres);
            factura1.establecerCedula(cedula);
            System.out.println(factura1);
        }

    }

}
