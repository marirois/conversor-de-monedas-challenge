public class MenuConversor {

    private String opcion;

    public void menu(int  eleccion){

        switch (eleccion){
            case 1: this.opcion = "USD/MXN/";
                break;
            case 2: this.opcion = "MXN/USD/";
                break;
            case 3: this.opcion = "USD/BRL/";
                break;
            case 4: this.opcion = "BRL/USD/";
                break;
            case 5: this.opcion = "USD/EUR/";
                break;
            case 6: this.opcion = "EUR/USD/";
                break;
            case 7: this.opcion = "salir";
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
    public String getOpcion(){
        return this.opcion;}
}
