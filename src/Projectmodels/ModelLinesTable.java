package Projectmodels;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;


public class ModelLinesTable extends AbstractTableModel {
   // public ModelLinesTable(ArrayList<ModelLine> lines) {

    private ArrayList<ModelLine> lines;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public ModelLinesTable(ArrayList<ModelLine> lines) {
        this.lines = lines;
    }

    public ArrayList<ModelLine> getLines() {
        return lines;
    }


    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelLine ModelLine = lines.get(rowIndex);

        switch(columnIndex) {
            case 0: return ModelLine.getInvoice().getNum();
            case 1: return ModelLine.getItem();
            case 2: return ModelLine.getPrice();
            case 3: return ModelLine.getCount();
            case 4: return ModelLine.getLineTotal();
            default : return "";
        }
    }
}


