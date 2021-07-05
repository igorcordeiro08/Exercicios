public class Main {
    public static void main(String[]args){
        Celular celular=new Celular(100,100);
        System.out.println("Bateria:"+celular.getBateria());
        celular.mensTexto();
        System.out.println("Bateria:"+celular.getBateria());
        celular.ligacao(30);
        System.out.println("Bateria:"+celular.getBateria());
        celular.ligacao(300);
        System.out.println("Bateria:"+celular.getBateria());
    }

}
