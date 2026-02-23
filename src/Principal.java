
import java.util.Scanner;

// APIKEY: efe9d0c2c20360fc785a9def

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        MenuConversor menu = new MenuConversor();
        ConsultarConversion consulta = new ConsultarConversion();


        while (true){

            System.out.println("""
                    Elija una opción válida
                    
                    1. Dolar            ->  Peso mexicano
                    2. Peso mexicano    ->  Dolar
                    3. Dolar            ->  Real brasileño
                    4. Real brasileño   ->  Dolar
                    5. Dolar            ->  Euro
                    6. Euro             ->  Dolar
                    7. Salir
                    
                    """);

            menu.menu(Integer.valueOf(teclado.nextLine()));

            String tipoCambio = menu.getOpcion();

            if (tipoCambio.equalsIgnoreCase("salir")){
                break;
            }

            try {
                System.out.println("Ingresa el monto que deseas convertir");
                double monto = Double.valueOf(teclado.nextLine());
                ConversionOmd miConvOmd = consulta.convertirMoneda(menu.getOpcion(), monto);
                Conversion miConv = new Conversion(miConvOmd);
                miConv.setAmount(monto);
                System.out.println(miConv);
                GeneradorDeArchivo archivo = new GeneradorDeArchivo();
                archivo.guardarJson(miConv);

            } catch (Exception e) {
                System.out.println("Dato no válido." + "\n" + e.getMessage());
            }
        }
    }
}
