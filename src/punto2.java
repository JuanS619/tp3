public class punto2 {
    public static void main(String[] args) {
        String nombres = " Jose; Juan; Ricardo; Aldana; Camila; Celeste; Yasmín; Lourdes; Paloma; Fermín";
        String frase_split[] = nombres.split(";");
        for(String elementos:frase_split){
            System.out.println(elementos);
        }
    }
}
