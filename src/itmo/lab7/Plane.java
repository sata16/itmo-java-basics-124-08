package itmo.lab7;

public class Plane {
    class Wing{
        double weightWing;
        public double getWeightWing(){
            return this.weightWing;
        }
        public Wing(double w){
            this.weightWing = w;
        }
    }

    public Double setWeightWingAndPrint(double w){
        Wing wing = new Wing(w);
        return wing.getWeightWing();
    }
}
