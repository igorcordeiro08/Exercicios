public class Main {
    public static void main(String[]args){

        Televisao tv=new Televisao(true,30,4,false);
        tv.setLigada(true);
        estado(tv);
        tv.ligaDesliga();
        tv.ligaDesliga();
        tv.mudaCanal();
        tv.proxCanal();
        tv.voltaCanal();
        tv.mute();
        estado(tv);
        tv.mute();
        estado(tv);




    }
    static void estado(Televisao tv){
        if(tv.isLigada()==true)
            System.out.println("A Tv está no canal:"+tv.getCanal());
        System.out.println("A Tv está no volume:"+tv.getVolume());
        System.out.println("\n");



    }


}
