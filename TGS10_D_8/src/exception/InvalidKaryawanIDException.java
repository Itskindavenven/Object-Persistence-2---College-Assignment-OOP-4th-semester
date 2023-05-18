package exception;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

public class InvalidKaryawanIDException extends Exception{
    public String message(){
        return "[!] ID harus diawali dengan DSN / STU serta menggunakan 5-8 digit";
    }
}
