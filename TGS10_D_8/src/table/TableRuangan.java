package table;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Ruangan;

public class TableRuangan extends AbstractTableModel{
    private List<Ruangan> list;

    public TableRuangan(List<Ruangan> list) {
        this.list = list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 4;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getKapasitas();
            case 3:
                return list.get(rowIndex).getLuas();
            default:
                return null;
        }
    }
    
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama";
            case 2:
                return "Kapasitas";
            case 3:
                return "Luas";
            default:
                return null;
        }
    }
}
