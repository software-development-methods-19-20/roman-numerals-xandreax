package dssc.roman;

public class RomanNumeral {

    private int decimal;
    private static final String [] units = new String[] {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String [] decimals = new String[] {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] hundreds = new String[] {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] thousands = new String[] {"","M", "MM", "MMM"};
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 3999;

    public RomanNumeral(int decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        if(decimal>= MIN_VALUE && decimal<=MAX_VALUE){
            return thousands[decimal/1000]+hundreds[(decimal%1000)/100]+decimals[((decimal%100)/10)]+units[decimal%10];
        }
        else if(decimal == 0){
            return "";
        }
        else{
            return "Only numbers between 0 and 3999";
        }
    }
}
