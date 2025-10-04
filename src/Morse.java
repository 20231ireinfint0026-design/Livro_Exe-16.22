import java.util.ArrayList;
import java.util.List;

public class Morse {
    public String alfabeto(int num){
        ArrayList<String> alfabeto = new ArrayList<>(List.of(".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."));

        // A ordem da lista segue a ordem alfabética

        return alfabeto.get(num);
    }

    public String algarismos(int num){
        ArrayList<String> algarismos = new ArrayList<>(List.of("-----", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----."));

        // A ordem da lista segue a ordem numérica partindo do '0'

        return algarismos.get(num);
    }

    public String simbolos(int num){
        ArrayList<String> simbolos = new ArrayList<>(List.of(".-.-.-", "--..--", "..--..", "-.-.--", "---...", "-.-.-.",
                "-....-"));

        // Cada valor numérico abaixo representa uma posição no ArrayList
        // 0 -> '.'; 1 -> ','; 2 -> '?'; 3 -> '!'; 4 -> ':'; 5 -> ';'; 6 -> '-'

        return simbolos.get(num);
    }
}
