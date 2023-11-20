import java.util.ArrayList;
import java.util.List;

public class HistoriqueReservation {

    private List<Reservation> reservations;

    public HistoriqueReservation() {
        this.reservations = new ArrayList<>();
    }

    public void ajouterReservation(Reservation nouvelleReservation) {
        reservations.add(nouvelleReservation);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}

