import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GeneradorDeArchivo {

    public void guardarJson(Conversion conversion) throws IOException {

        List<Conversion> listaConsultas = new ArrayList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        if(!Files.exists(Path.of("conversionesRealizadas.json"))){
            listaConsultas.add(conversion);

            FileWriter escritura = new FileWriter("conversionesRealizadas.json");
            escritura.write(gson.toJson(listaConsultas));
            escritura.close();
        } else {
            Reader leer = new FileReader("conversionesRealizadas.json");
            Type lista = new TypeToken<ArrayList<Conversion>>(){}.getType();
            listaConsultas = gson.fromJson(leer,lista);
            listaConsultas.add(conversion);

            FileWriter escritura = new FileWriter("conversionesRealizadas.json");
            escritura.write(gson.toJson(listaConsultas));
            escritura.close();
        }
    }
}
