public class Conversion {
    private String base_code;
    private String target_code;
    private double amount;
    private double conversion_result;



    public Conversion(ConversionOmd miConversionOmd){
        this.base_code = miConversionOmd.base_code();
        this.target_code = miConversionOmd.target_code();
        this.conversion_result = miConversionOmd.conversion_result();
    }

    @Override
    public String toString(){
        return "Código base: " + this.base_code + "\n" + "Código objetivo: " + this.target_code + "Monto ingresado: " + this.amount + "\n" + "Resultado: " + this.conversion_result;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
