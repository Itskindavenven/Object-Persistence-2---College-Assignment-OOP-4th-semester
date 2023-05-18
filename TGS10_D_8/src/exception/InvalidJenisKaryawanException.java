package exception;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

public class InvalidJenisKaryawanException extends Exception{
    public String message(){
        return "[!] Jenis Hanya <Dosen> dan <Staff TU> saja";
    }
}
