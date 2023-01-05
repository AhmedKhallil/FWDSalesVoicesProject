
package Projectmodels;

import java.util.ArrayList;

public class ModelInvoice {
    private int number;
    private String date;
    private String customerName;
    private ArrayList<ModelLine> lines;

    public ModelInvoice() {
    }

    public ModelInvoice(int num, String date, String customer) {
        this.number = num;
        this.date = date;
        this.customerName = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (ModelLine line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }

    public ArrayList<ModelLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomer() {
        return customerName;
    }

    public void setCustomer(String customer) {
        this.customerName = customer;
    }

    public int getNum() {
        return number;
    }

    public void setNum(int customerNumber) {
        this.number = customerNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + number + ", date=" + date + ", customer=" + customerName + '}';
    }

    public String getAsCSV() {
        return number + "," + date + "," + customerName;
    }

}
