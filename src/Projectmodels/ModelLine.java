
package Projectmodels;

public class ModelLine {
    int number ;
    private String item;
    private double price;
    private int count;
    private ModelInvoice invoice;

    public ModelLine() {
    }

    public ModelLine(int number, String item, double price, int count, ModelInvoice invoice) {
        this.number = number;
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }

    public ModelLine(String itemName, double itemPrice, int count, ModelInvoice inv) {

    }


    public double getLineTotal() {
        return price * count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getNum() + ", item=" + item + ", price=" + price + ", count=" + count + '}';
    }

    public ModelInvoice getInvoice() {
        return invoice;
    }

    public String getAsCSV() {
        return invoice.getNum() + "," + item + "," + price + "," + count;
    }

}
