public class BecaComedor extends SolicitudBeca {

    public BecaComedor(double montoBase) {
        super(montoBase);
    }

    @Override
    public double calcularMontoAsignado() {
        return montoBase; // Monto estandarizado sin adicionales
    }
}