package dssc.roman;

public class RomanNumeral {

    private int decimal;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        if(this.decimal == 0) {
            return "";
        }
        else if(this.decimal == 4){
            return "IV";
        }
        else if(this.decimal >= 5 && this.decimal < 9){
            return "V"+"I".repeat(decimal-5);
        }
        else return "I".repeat(decimal);
    }
}
