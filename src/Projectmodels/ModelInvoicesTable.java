package Projectmodels;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelInvoicesTable extends AbstractTableModel {
    private ArrayList<ModelInvoice> invoices;
    private String[] columns = {"No.", "Date", "Customer", "Total"};

    public ModelInvoicesTable(ArrayList<ModelInvoice> invoices) {
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelInvoice ModelInvoice = invoices.get(rowIndex);

        switch (columnIndex) {
            case 0: return ModelInvoice.getNum();
            case 1: return ModelInvoice.getDate();
            case 2: return ModelInvoice.getCustomer();
            case 3: return ModelInvoice.getInvoiceTotal();
            default : return "";
        }
    }
}

