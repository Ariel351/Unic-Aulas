public class Devices{
    protected double precoBase;
    protected String cor;
    protected String marca;
    protected char energyConsumption;
    protected double peso;

    Devices(){
        this.precoBase = 100;
        this.cor = "branco";
        this.energyConsumption = 'F';
        this.peso = 5;
    }

    Devices(double precoBase, double peso){
        this.precoBase = precoBase;
        this.cor = "branco";
        this.energyConsumption = 'F';
        this.peso = peso;
    }

    Devices(double precoBase, String cor, String marca, char energyConsumption, double peso){
        this.precoBase = precoBase;
        verificarCor(cor);
        this.marca = marca;
        checkEnergyConsumption(energyConsumption);
        this.peso = peso;
    }
    public void setEnergyConsumption(char energyConsumption){
        checkEnergyConsumption(energyConsumption);
    }

    public void setCor(String cor){
        verificarCor(cor);
    }

    public void setPrecoBase(double precoBase){
        this.precoBase = precoBase;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public void checkEnergyConsumption(char letter){
        if(letter >= 'A' && letter <= 'F') this.energyConsumption = letter;
        else this.energyConsumption = 'F';
    }

    public void verificarCor(String cor){
        switch(cor.toLowerCase()){
            case "preto":
            case "vermelho":
            case "azul":
            case "cinza": this.cor = cor.toLowerCase(); break;
            default: this.cor = "branco";
        }
    }

    public double getPrecoBase(){
        return this.precoBase;
    }

    public String getColor(){
        return this.cor;
    }

    public String getMarca(){
        return this.marca;
    }

    public char getEnergyConsumption(){
        return this.energyConsumption;
    }

    public double getPeso(){
        return this.peso;
    }

    public double precoFinal(){
        switch(this.energyConsumption){
            case 'A': return this.precoBase + 100;
            case 'B': return this.precoBase + 80;
            case 'C': return this.precoBase + 60;
            case 'D': return this.precoBase + 50;
            case 'E': return this.precoBase + 30;
            default: return this.precoBase + 10;
        }
    }
}