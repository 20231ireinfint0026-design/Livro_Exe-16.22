public class Converter extends Morse{
    private String sentenca;

    public String getSentenca() {
        return sentenca;
    }

    public void setSentenca(String sentenca) {
        this.sentenca = sentenca;
    }

    public StringBuilder paraMorse(){
        StringBuilder expressao = new StringBuilder();
        char[] chars = new char[sentenca.length()];
        getSentenca().getChars(0, getSentenca().length(), chars, 0);

        for (char aux : chars){
            switch (aux){
                case 'a', 'A': expressao.append(alfabeto(0));
                    break;

                case 'b', 'B': expressao.append(alfabeto(1));
                    break;

                case 'c', 'C': expressao.append(alfabeto(2));
                    break;

                case 'd', 'D': expressao.append(alfabeto(3));
                    break;

                case 'e', 'E': expressao.append(alfabeto(4));
                    break;

                case 'f', 'F': expressao.append(alfabeto(5));
                    break;

                case 'g', 'G': expressao.append(alfabeto(6));
                    break;

                case 'h', 'H': expressao.append(alfabeto(7));
                    break;

                case 'i', 'I': expressao.append(alfabeto(8));
                    break;

                case 'j', 'J': expressao.append(alfabeto(9));
                    break;

                case 'k', 'K': expressao.append(alfabeto(10));
                    break;

                case 'l', 'L': expressao.append(alfabeto(11));
                    break;

                case 'm', 'M': expressao.append(alfabeto(12));
                    break;

                case 'n', 'N': expressao.append(alfabeto(13));
                    break;

                case 'o', 'O': expressao.append(alfabeto(14));
                    break;

                case 'p', 'P': expressao.append(alfabeto(15));
                    break;

                case 'q', 'Q': expressao.append(alfabeto(16));
                    break;

                case 'r', 'R': expressao.append(alfabeto(17));
                    break;

                case 's', 'S': expressao.append(alfabeto(18));
                    break;

                case 't', 'T': expressao.append(alfabeto(19));
                    break;

                case 'u', 'U': expressao.append(alfabeto(20));
                    break;

                case 'v', 'V': expressao.append(alfabeto(21));
                    break;

                case 'w', 'W': expressao.append(alfabeto(22));
                    break;

                case 'x', 'X': expressao.append(alfabeto(23));
                    break;

                case 'y', 'Y': expressao.append(alfabeto(24));
                    break;

                case 'z', 'Z': expressao.append(alfabeto(25));
                    break;

                case '0': expressao.append(algarismos(0));
                    break;

                case '1': expressao.append(algarismos(1));
                    break;

                case '2': expressao.append(algarismos(2));
                    break;

                case '3': expressao.append(algarismos(3));
                    break;

                case '4': expressao.append(algarismos(4));
                    break;

                case '5': expressao.append(algarismos(5));
                    break;

                case '6': expressao.append(algarismos(6));
                    break;

                case '7': expressao.append(algarismos(7));
                    break;

                case '8': expressao.append(algarismos(8));
                    break;

                case '9': expressao.append(algarismos(9));
                    break;

                case '.': expressao.append(simbolos(0));
                    break;

                case ',': expressao.append(simbolos(1));
                    break;

                case '?': expressao.append(simbolos(2));
                    break;

                case '!': expressao.append(simbolos(3));
                    break;

                case ':': expressao.append(simbolos(4));
                    break;

                case ';': expressao.append(simbolos(5));
                    break;

                case '-': expressao.append(simbolos(6));
                    break;

                case ' ':
                    expressao.append("  ");
                    break;

                default: break;
            }

            expressao.append(' ');
        }

        return expressao;
    }

    public StringBuilder paraPortugues(){
        String[] palavras = getSentenca().split(" {3}");
        StringBuilder expressao = new StringBuilder();

        for (String auxPalavras : palavras){
            String[] chars = auxPalavras.split(" ");
            StringBuilder palavra = new StringBuilder();

            for (String auxChars : chars){
                if (alfabeto(0).equals(auxChars)){
                    palavra.append("a");
                } else if (alfabeto(1).equals(auxChars)) {
                    palavra.append("b");
                } else if (alfabeto(2).equals(auxChars)) {
                    palavra.append("c");
                } else if (alfabeto(3).equals(auxChars)) {
                    palavra.append("d");
                } else if (alfabeto(4).equals(auxChars)) {
                    palavra.append("e");
                } else if (alfabeto(5).equals(auxChars)) {
                    palavra.append("f");
                } else if (alfabeto(6).equals(auxChars)) {
                    palavra.append("g");
                } else if (alfabeto(7).equals(auxChars)) {
                    palavra.append("h");
                } else if (alfabeto(8).equals(auxChars)) {
                    palavra.append("i");
                } else if (alfabeto(9).equals(auxChars)) {
                    palavra.append("j");
                } else if (alfabeto(10).equals(auxChars)) {
                    palavra.append("k");
                } else if (alfabeto(11).equals(auxChars)) {
                    palavra.append("l");
                } else if (alfabeto(12).equals(auxChars)) {
                    palavra.append("m");
                } else if (alfabeto(13).equals(auxChars)) {
                    palavra.append("n");
                } else if (alfabeto(14).equals(auxChars)) {
                    palavra.append("o");
                } else if (alfabeto(15).equals(auxChars)) {
                    palavra.append("p");
                } else if (alfabeto(16).equals(auxChars)) {
                    palavra.append("q");
                } else if (alfabeto(17).equals(auxChars)) {
                    palavra.append("r");
                } else if (alfabeto(18).equals(auxChars)) {
                    palavra.append("s");
                } else if (alfabeto(19).equals(auxChars)) {
                    palavra.append("t");
                } else if (alfabeto(20).equals(auxChars)) {
                    palavra.append("u");
                } else if (alfabeto(21).equals(auxChars)) {
                    palavra.append("v");
                } else if (alfabeto(22).equals(auxChars)) {
                    palavra.append("w");
                } else if (alfabeto(23).equals(auxChars)) {
                    palavra.append("x");
                } else if (alfabeto(24).equals(auxChars)) {
                    palavra.append("y");
                } else if (alfabeto(25).equals(auxChars)) {
                    palavra.append("z");
                } else if (algarismos(0).equals(auxChars)) {
                    palavra.append("0");
                } else if (algarismos(1).equals(auxChars)) {
                    palavra.append("1");
                } else if (algarismos(2).equals(auxChars)) {
                    palavra.append("2");
                } else if (algarismos(3).equals(auxChars)) {
                    palavra.append("3");
                } else if (algarismos(4).equals(auxChars)) {
                    palavra.append("4");
                } else if (algarismos(5).equals(auxChars)) {
                    palavra.append("5");
                } else if (algarismos(6).equals(auxChars)) {
                    palavra.append("6");
                } else if (algarismos(7).equals(auxChars)) {
                    palavra.append("7");
                } else if (algarismos(8).equals(auxChars)) {
                    palavra.append("8");
                } else if (algarismos(9).equals(auxChars)) {
                    palavra.append("9");
                } else if (simbolos(0).equals(auxChars)) {
                    palavra.append(".");
                } else if (simbolos(1).equals(auxChars)) {
                    palavra.append(",");
                } else if (simbolos(2).equals(auxChars)) {
                    palavra.append("?");
                } else if (simbolos(3).equals(auxChars)) {
                    palavra.append("!");
                } else if (simbolos(4).equals(auxChars)) {
                    palavra.append(":");
                } else if (simbolos(5).equals(auxChars)) {
                    palavra.append(";");
                } else if (simbolos(6).equals(auxChars)) {
                    palavra.append("-");
                }
            }

            expressao.append(palavra).append(" ");
        }

        return expressao;
    }
}