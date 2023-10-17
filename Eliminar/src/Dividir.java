public class Dividir {
    public static String outraString="Este é o meu primeiro programa";
    public static StringBuilder resultado = new StringBuilder();
    public static void Processo(String aString){
        char[] charArray = outraString.toCharArray();
        for(char c: charArray) {
            if(c!='e'&& c!='E'){
                resultado.append(c);
            }
        }

    }


    public static void main(String[] args) {
        Processo(outraString);
        System.out.print(resultado.toString());
    }
}
