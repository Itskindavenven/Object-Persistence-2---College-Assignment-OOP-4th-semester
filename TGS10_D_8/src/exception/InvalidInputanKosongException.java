package exception;

/**
 * 210711233 - Bonaventura Octavito Cahyawan
 * 2107111365 - Titus Revi Unggul Pramudya
 */

public class InvalidInputanKosongException extends Exception{
    public String message(){
        return "[!] Inputan tidak boleh kosong terkecuali Checkbox";
    }
}
