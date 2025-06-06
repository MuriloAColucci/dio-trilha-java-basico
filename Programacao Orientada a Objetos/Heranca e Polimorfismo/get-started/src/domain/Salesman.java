package domain;

public non-sealed class Salesman extends Employee {
    private double percentPerSold;
    private double soldAmount;

    public Salesman(String code, String name, String address, String age, double salary, double percentPerSold, double soldAmount) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    public Salesman() {
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount(){
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount){
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode(){
        return "SL" + this.code;
    }

    @Override
    public double getFullSalary(){
        return this.salary + (soldAmount * percentPerSold/100);
    }
}
