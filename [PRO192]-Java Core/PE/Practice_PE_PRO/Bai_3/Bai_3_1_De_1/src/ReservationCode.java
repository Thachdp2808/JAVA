public class ReservationCode {
    private String code;
    private String customerName;
    public ReservationCode(String code, String customerName) {
        this.code = code;
        this.customerName = customerName;
    }
    
     
    String getCode() {
        String result = "";
        for (int i = 0; i < customerName.length(); i++){
            if (Character.isLetter(customerName.charAt(i))){
                if (customerName.charAt(i) == 'z'){
                    result += Character.toString('a');
                    continue;
                }
                if (customerName.charAt(i) == 'Z'){
                    result += Character.toString('A');
                    continue;
                }
                char c = (char)(customerName.charAt(i) + 1);
                result += Character.toString(c);
            }else{
                result += Character.toString(customerName.charAt(i));
            }
        }
        return result;
    }
    
    
    /*add and complete your other methods here (if needed)*/
    @Override
    public String toString() {
        return this.customerName + "\t" + this.code;
    }
    
}
