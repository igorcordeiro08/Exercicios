public class Main {
    public static void main(String[]args){
        Data data1=new Data(26,8,1996);
        Data data2=new Data(10,4,1999);
        imprime1(data1);
        imprime1(data2);

        Data data3=new Data(26,"Agosto",1996);
        Data data4=new Data(10,"Abril",1999);
        imprime2(data3);
        imprime2(data4);

        Data data5=new Data(238,1996);
        Data data6=new Data(100,1999);
        imprime3(data5);
        imprime3(data6);

    }
    static void imprime1(Data data){
        System.out.println(data.getDia()+"/"+data.get_Mes()+"/"+data.getAno());
    }
    static void imprime2(Data data){
        System.out.println(data.getMes()+" "+data.getDia()+","+data.getAno());
    }
    static void imprime3(Data data){
        System.out.println(data.getDia()+" "+data.getAno());
    }
}