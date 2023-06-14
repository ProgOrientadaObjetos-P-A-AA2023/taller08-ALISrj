package paquete1;

public class DocenteFactura extends Docente {

    private double valorFactura;
    private double valorIvaDescuento;
    private double valorCancelar;

    public void establecerValorFactura(double n) {
        valorFactura = n;
    }

    public void establecerValorIvaDescuento(double n) {
        valorIvaDescuento = n;
    }

    public void establecerValorCancelar() {
        valorCancelar = valorFactura - (valorFactura * valorIvaDescuento) / 100;
    }

    public double obtenerValorFactura() {
        return valorFactura;
    }

    public double obtenerValorIvaDescuento() {
        return valorIvaDescuento;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    @Override
    public String toString() {

        return String.format("Nombres del docente: %s\n"
                + "Cédula del docenete: %s\n"
                + "Valor de la Factura: %.2f\n"
                + "Valor iva de descuento: %.2f\n"
                + "Valor a cancelar: %.2f",
                obtenerNombres(),
                obtenerCedula(),
                obtenerValorFactura(),
                obtenerValorIvaDescuento(),
                obtenerValorCancelar());

    }

}
