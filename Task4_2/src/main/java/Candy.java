public class Candy extends Sweets {

    String type;
    public Candy(String name, int weight, double price, String uniqueParameter) {
        super(name, weight, price);
        this.type = uniqueParameter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
