import java.util.*;


public class Karaoke {
    Map<String,String> musica=new HashMap<>();
    public Karaoke(){
        musica.put("Facas","Diego & Victor Hugo");
        musica.put("Despedida de Casal","Gustavo Mioto");
        musica.put("Batom de Cereja","Israel & Rodolffo");
        musica.put("Ficha Limpa","Gusttavo Lima");
        musica.put("Troca de Calçada","Marilia Mendonca");
        musicas();
    }
    public void musicas (){
        /*Set<String>keys=musica.keySet();
        TreeSet<String> orderedKeys=new TreeSet<String>(keys);
        for (String key: orderedKeys){
            System.out.println(musica.values());*/
        for(String key: musica.keySet()){
            System.out.println(musica.values(key));

        }     
        }
       
        


    }


