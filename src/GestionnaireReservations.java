import.java.util.Date;

public class GestionnaireReservations {

    public void effectuerReservation(Terrain terrain, Date date, String heureDebut, String heureFin) {
        Reservation nouvelleReservation = new Reservation(date,heureDebut,heureFin,terrain);
        terrain.getHistorique().ajouterReservation(nouvelleReservation);
    }
}
