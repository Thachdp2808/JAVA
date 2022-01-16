
public class VNMotor extends Motor {

    String series;
    double discount;

    public VNMotor() {
    }

    public VNMotor(String brandName, String series, double price) {
        super.brandName = brandName;
        super.price = price;
        this.series = series;
    }

    /*Complete the below function for second test case*/
    public double getSalePrice() {
        if (price < 3000) {
            discount = 0.05 * price;
        } else {
            discount = 0.1 * price;
        }
        return (price - discount);
    }

    @Override
    public String toString() {
        return super.brandName + "\t" + super.price + "\t" + series;
    }

}
