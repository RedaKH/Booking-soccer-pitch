public class Terrain {

    private String name;

    private double capacite;

    private HistoriqueReservation historique;




    public Terrain(String name,double capacite){

        this.name = name;
        this.capacite = capacite;
        this.historique = new HistoriqueReservation();


    }

    public double getCapacite() {
        return capacite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacite(double capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Terrain{" +
                "name='" + name + '\'' +
                ", capacite=" + capacite +
                '}';
    }

    public HistoriqueReservation getHistorique() {
        return historique;
    }
}
