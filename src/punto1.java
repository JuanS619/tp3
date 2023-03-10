public class punto1 {
    public static void main(String[] args) {
        String nombres = "la vida es bella";
        char letra = 'a';
        int contador=0;
        int numeros[] = new int[]{1,37,16,40,21,35,29};
        int i=0, j=0, aux=0;
        int numero_x=20, sumar=0;
        //EJERCICIO A
        for(i=0; i<nombres.length();i++){
            if (nombres.charAt(i)==letra){
                contador+=1;
            }
        }
        System.out.println("la letra se repite: "+contador);
        //EJERCICIO B
        for(i=0; i< numeros.length-1; i++){
            for(j=0; j< numeros.length-1; j++){
                //si numero actual es mayor a numero siguiente
                if(numeros[j] > numeros[j+1]){
                    aux = numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        System.out.println("Orden ascendente:");
        for(i=0; i<numeros.length;i++){
            System.out.println(numeros[i] + ";");
        }
        System.out.println("Orden descentente: ");
        for(i=numeros.length-1; i>=0 ;i--){
            System.out.println(numeros[i] + ";");
        }
        //EJERCICIO C
        for(i=0; i<numeros.length;i++){
            if(numeros[i] > numero_x){
                System.out.printf(numeros[i] + " ");
                sumar = sumar + numeros[i];
            }
        }
        System.out.println("\nEl resultado de las sumas de los numeros mayores a 20 es: " + sumar);





    }



}
