public class AirConditioning {
    private boolean exist;

    public AirConditioning (boolean exist){
        this.exist = exist;
    }

    public boolean getExist(){
        return this.exist;
    }

    public void coolTemperature(int degrees){
        System.out.println("Cooling temperature in room. Temperature became " + degrees);
    }

    public void heatTemperature(int degrees){
        System.out.println("Heating temperature in room. Temperature became " + degrees);
    }
}
