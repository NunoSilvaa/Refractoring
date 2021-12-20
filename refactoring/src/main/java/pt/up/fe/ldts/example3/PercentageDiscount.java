package pt.up.fe.ldts.example3;

public class PercentageDiscount implements Discount{
    private double percentage;

    public PercentageDiscount(double percentage){
        this.percentage = percentage;
    }
    @Override
    public double applyDiscount(double price){
        return price - price * percentage;
    }
}
