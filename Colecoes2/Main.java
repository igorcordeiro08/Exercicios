import java.util.*;

public class Main {
    public static void main(String[]args){
        List<String> pessoas=new ArrayList<>();
        pessoas.add("Igor");
        pessoas.add("Joao");
        pessoas.add("Maria");
        
        System.out.println(pessoas.toString());
        
        Set<String> palavras=new HashSet<>(pessoas);
        System.out.println(palavras.toString());

        PriorityQueue<String> prior=new PriorityQueue<>(palavras);
        System.out.println(prior.toString());

        ArrayDeque<String> dq=new ArrayDeque<>(prior);
        System.out.println(dq.toString());

        Set<String> tree=new TreeSet<>(dq);
        System.out.println(tree.toString());


    }
    
}
