import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try{
            ArrayList<Persona> personas = new ArrayList<Persona>();
            String[] strings;
            String line;
            FileReader fr = new FileReader("fichero.txt");
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                strings = line.split(":");
                if (strings.length == 3) {
                    Optional<String> poblacion = strings[1] == ""?Optional.empty(): Optional.of(strings[1]);
                    String orElse = poblacion.orElse("NULL");
                    Persona persona = new Persona(strings[0], orElse, Integer.parseInt(strings[2]));
                    personas.add(persona);
                }
            }
            List<Persona> l=personas.stream().filter(persona -> persona.getEdad() < 25)
                    .collect(Collectors.toList());

            l.forEach(p -> System.out.println("Nombre: " + p.getNombre() + ". Poblacion: " + p.getPoblacion() + ". Edad: " + p.getEdad()));

        }catch (IOException e) {
                System.out.println("An error ocurred.");
                e.printStackTrace();
        }

    }
}