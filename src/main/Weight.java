package main;

public class Weight {
    //TODO: check for OUNCES_IN_A_POUND throughout methods
    private static final double OUNCES_IN_A_POUND = 16;

    public Weight() {
    }

    int pounds;

    private double ounces;

    public Weight (int pounds, double ounces){
            this.pounds = pounds;
            this.ounces = ounces;

        normalize();
    }

    protected double toOunces() {
        double lbs = getPounds();
        double oz = getOunces();
        System.out.println();

        double lbsToOunces;

        lbsToOunces = lbs * 16;
        System.out.println(lbsToOunces);

        double totalOz = lbsToOunces + oz;
        System.out.println(totalOz);

        return totalOz;
    }

    private void normalize() {
        if (ounces > OUNCES_IN_A_POUND) {
            this.pounds = pounds + 1;
            this.ounces = ounces - OUNCES_IN_A_POUND;

            //use this to see result of "normalized" weight
//            System.out.println(pounds + " lbs " + ounces + "oz");
        } else {
            this.pounds = pounds;
            this.ounces = ounces;

//            System.out.println("OKAY!");
//            System.out.println(pounds + " lbs " + ounces + "oz");
        }}

    public boolean lessThan(Weight weight) {

        if(pounds < weight.pounds && ounces < weight.ounces) {
            return true;
        }

        return false;
    }

    public Weight addTo(Weight weight) {
        return new Weight(pounds + weight.pounds, ounces + weight.ounces );

    }


    /* GETTERS & SETTERS */

    public int getPounds() {
        return pounds;
    }

    public void setPounds(int pounds) {
        this.pounds = pounds;
    }

    public double getOunces() {
        return ounces;
    }

    public void setOunces(double ounces) {
        this.ounces = ounces;
    }

    /* TO STRING */
    @Override
    public String toString() {
        return "weight is " + pounds +
                " pounds, " + + ounces +
                " ounces" ;
    }
}
