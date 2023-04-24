class Televisao extends Devices{
    private double resolution;
    private boolean tdt;

    Televisao(){
        super();
        this.resolution = 20;
        this.tdt = false;
    }

    Televisao(double basePrice, double weight){
        super(basePrice, weight);
        this.resolution = 20;
        this.tdt = false;
    }

    Televisao(double basePrice, String color, String brand, char energyConsumption, double weight, double resolution, boolean tdt){
        super(basePrice, color, brand, energyConsumption, weight);
        this.resolution = resolution;
        this.tdt = tdt;
    }
    public Televisao(int i, boolean b) {
    }

    public void setResolution(double resolution){
        this.resolution = resolution;
    }
    
    public void setTdt(boolean tdt){
        this.tdt = tdt;
    }    
    public double getResolution(){
        return this.resolution;
    }
    
    public boolean getTdt(){
        return this.tdt;
    }
    
    @Override
    public double precoFinal(){
        double finalPrice = super.precoFinal();
        if(this.resolution > 40) finalPrice *= 1.3;
        if(this.tdt) finalPrice += 50;
        return finalPrice;
    }
}