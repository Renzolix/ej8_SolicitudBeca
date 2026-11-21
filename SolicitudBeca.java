public abstract class SolicitudBeca {
    protected double montoBase;

    public SolicitudBeca(double montoBase) {
        this.montoBase = montoBase;
    }

    public abstract double calcularMontoAsignado();
}