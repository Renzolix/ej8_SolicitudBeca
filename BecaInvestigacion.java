public class BecaInvestigacion extends SolicitudBeca {

    public BecaInvestigacion(double montoBase) {
        super(montoBase);
    }

    @Override
    public double calcularMontoAsignado() {
        return montoBase * 1.30; // 30% adicional por mérito
    }
}