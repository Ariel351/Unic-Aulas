class WashingMachine extends Devices{
    public double load;

    WashingMachine(){
        super();
        this.load = 5;
    }

    WashingMachine(double basePrice, double weight){
        super(basePrice, weight);
        this.load = 5;
    }

    WashingMachine(double load, double basePrice, String color, String brand, char energyConsumption, double weight){
        super(basePrice, color, brand, energyConsumption, weight);
        this.load = load;
    }
    public void setLoad(double load){
        this.load = load;
    }
    public double getLoad(){
        return this.load;
    }

    public double precoFinal(){
        double finalPrice = super.precoFinal();
        if(this.load > 30) finalPrice += 50;
        return finalPrice;
    }
}
