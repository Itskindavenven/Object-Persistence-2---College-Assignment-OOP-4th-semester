package control;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

import dao.PeminjamanRuangDAO;
import java.util.List;
import model.PeminjamanRuangan;
import table.TablePeminjamanRuangan;

public class PeminjamanRuangControl {
    private PeminjamanRuangDAO prDao = new PeminjamanRuangDAO();
    
    public PeminjamanRuangan fetchDataPeminjamanRuangan(int id){
        return prDao.fetchPeminjaman(id);
    }
    
    public void insertDataPeminjamanRuangan(PeminjamanRuangan pr){
        prDao.insertPeminjamanRuangan(pr);
    }
    
    public TablePeminjamanRuangan showPeminjamanRuangan(String query){
        List<PeminjamanRuangan> dataPeminjamanRuangan = prDao.showPeminjamanRuangan(query);
        TablePeminjamanRuangan tablePeminjamanRuangan = new TablePeminjamanRuangan(dataPeminjamanRuangan);
        
        return tablePeminjamanRuangan;
    }
    
    public void updateDataPeminjamanRuangan(PeminjamanRuangan pr){
        prDao.updatePeminjamanRuangan(pr);
    }
    
    public void deleteDataPeminjamanRuangan(int id){
        prDao.deletePeminjamanRuangan(id);
    }
}
