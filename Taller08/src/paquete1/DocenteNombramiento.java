package paquete1;

public class DocenteNombramiento extends Docente {

    private double valorSueldo;
    private double valorHorasExtra;
    private int numeroHorasExtra;
    private double sueldo;

    public DocenteNombramiento(double vS, double vH, int nH) {
        valorSueldo = vS;
        valorHorasExtra = vH;
        numeroHorasExtra = nH;
    }

    public void establecerValorSueldo(double n) {
        valorSueldo = n;
    }

    public void establecerValorHorasExtra(double n) {
        valorHorasExtra = n;
    }

    public void establecerNumeroHorasExtra(int n) {
        numeroHorasExtra = n;
    }

    public void establecerSueldo() {
        sueldo = valorSueldo + (valorHorasExtra * numeroHorasExtra);
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHorasExtra() {
        return valorHorasExtra;
    }

    public int obtenerNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {

        return String.format("Nombres del docente: %s\n"
                + "Cédula del docenete: %s\n"
                + "Valor del sueldo: %.2f\n"
                + "Valor de horas extras: %.2f\n"
                + "Número de horas extra: %d\n"
                + "Sueldo Final: %.2f",
                obtenerNombres(),
                obtenerCedula(),
                obtenerValorSueldo(),
                obtenerValorHorasExtra(),
                obtenerNumeroHorasExtra(),
                obtenerSueldo());

    }

}
