import java.util.*;




public class Contador{
    private Map< String , Integer> frase;
    private Scanner teclado;

	public Contador()
	{
            frase = new HashMap < String, Integer >(); 
            teclado = new Scanner( System.in ); 
            criarMapa(); 
            mostrarMapa();
	}

	
	private void criarMapa()
	{
            System.out.println("Digite a frase:"); 
            String input= teclado.nextLine();
            String[] textoSeparado=input.split(" ");
            System.out.println(Arrays.toString(textoSeparado));

            for(int i=0;i<textoSeparado.length;i++){
                String palavra=textoSeparado[i];
                if (frase.containsKey(palavra)){
                    int contador=frase.get(palavra);
                    frase.put(palavra,contador+1);
                }
                else
                    frase.put(palavra,1);
            }
        }
       

	private void mostrarMapa()
	{
            Set< String > keys = frase.keySet(); // Obtem as classes

            TreeSet< String > orderedKeys = new TreeSet< String > ( keys );
            System.out.println ("Palavras Contidas na frase: \nPalavras");

            for ( String key : orderedKeys )
            System.out.println ( key +"\t\t"+ frase.get( key )+" vez(es)");

    }
}