package app;
public class Vlucht {

    private boolean magOpstijgen;
    private boolean bagageDoorluchthaven;
    private int aantalPassagiers;
    private int gewicht;
    private int tegenwindHoeveelheid;
    private int totalBedrag;

    /**
     * 
     */
    public Vlucht() {
    }

    /**
     * @param magOpstijgen
     * @param bagageDoorluchthaven
     * @param aantalPassagiers
     * @param gewicht
     * @param tegenwindHoeveelheid
     * @param totalBedrag
     */
    public Vlucht(boolean magOpstijgen, boolean bagageDoorluchthaven, int aantalPassagiers, int gewicht,
            int tegenwindHoeveelheid, int totalBedrag) {
        this.magOpstijgen = magOpstijgen;
        this.bagageDoorluchthaven = bagageDoorluchthaven;
        this.aantalPassagiers = aantalPassagiers;
        this.gewicht = gewicht;
        this.tegenwindHoeveelheid = tegenwindHoeveelheid;
        this.totalBedrag = totalBedrag;
    }

    /**
     * @return the magOpstijgen
     */
    public boolean isMagOpstijgen() {
        return magOpstijgen;
    }

    /**
     * @param magOpstijgen the magOpstijgen to set
     */
    public void setMagOpstijgen(boolean magOpstijgen) {
        this.magOpstijgen = magOpstijgen;
    }

    /**
     * @return the bagageDoorluchthaven
     */
    public boolean isBagageDoorluchthaven() {
        return bagageDoorluchthaven;
    }

    /**
     * @param bagageDoorluchthaven the bagageDoorluchthaven to set
     */
    public void setBagageDoorluchthaven(boolean bagageDoorluchthaven) {
        this.bagageDoorluchthaven = bagageDoorluchthaven;
    }

    /**
     * @return the aantalPassagiers
     */
    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    /**
     * @param aantalPassagiers the aantalPassagiers to set
     */
    public void setAantalPassagiers(int aantalPassagiers) {
        this.aantalPassagiers = aantalPassagiers;
    }

    /**
     * @return the gewicht
     */
    public int getGewicht() {
        return gewicht;
    }

    /**
     * @param gewicht the gewicht to set
     */
    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    /**
     * @return the tegenwindHoeveelheid
     */
    public int getTegenwindHoeveelheid() {
        return tegenwindHoeveelheid;
    }

    /**
     * @param tegenwindHoeveelheid the tegenwindHoeveelheid to set
     */
    public void setTegenwindHoeveelheid(int tegenwindHoeveelheid) {
        this.tegenwindHoeveelheid = tegenwindHoeveelheid;
    }

    /**
     * @return the totalBedrag
     */
    public int getTotalBedrag() {
        return totalBedrag;
    }

    /**
     * @param totalBedrag the totalBedrag to set
     */
    public void setTotalBedrag(int totalBedrag) {
        this.totalBedrag = totalBedrag;
    }

    public boolean magOpstijgen(int gewicht, int tegenwindHoeveelheid, boolean magOpstijgenLuchthaven) {
        if ((gewicht < 1000 || tegenwindHoeveelheid > 50) && magOpstijgenLuchthaven) {
            return true;
        } else {
            return false;
        }

    }

    public int calcLanding(int gewicht, int aantalPassagiers, Bagage bagage, Vliegtuig vliegtuig) {
        int total = 0;

        if (gewicht < 1000 && gewicht != 0)
            total += 100;
        if (gewicht > 1000 && gewicht < 5000)
            total += 2500;
        if (aantalPassagiers > 2)
            total *= 1.5;
        if (bagage.getGehandeldDoorLuchthaven())
            total += 800;
        if (vliegtuig.getNederlandseVliegtuig())
            total *= 1.21;

        return total;
    }

}
