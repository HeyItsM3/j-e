package paquete;

public class Program {
    public static int main(String s) {
        int contarPalabras = 1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                contarPalabras++;
            }
        }
        return contarPalabras;
    }
}


