import java.util.ArrayList;
import java.util.List;

public class MainEjercicio8 {
    public static void main(String[] args) {
        List<SolicitudBeca> solicitudes = new ArrayList<>();

        solicitudes.add(new BecaInvestigacion(100000.0));
        solicitudes.add(new BecaComedor(35000.0));
        solicitudes.add(new BecaInvestigacion(150000.0));
        solicitudes.add(new BecaComedor(35000.0));

        double presupuestoTotal = 0.0;
        System.out.println("=== DESGLOSE DE SOLICITUDES DE BECA ===");
        for (SolicitudBeca beca : solicitudes) {
            double monto = beca.calcularMontoAsignado();
            presupuestoTotal += monto;
            System.out.println("Solicitud de tipo " + beca.getClass().getSimpleName() + " -> Asignado: $" + monto);
        }

        System.out.println("----------------------------------------");
        System.out.println("Presupuesto Total Requerido: $" + presupuestoTotal);
    }
}