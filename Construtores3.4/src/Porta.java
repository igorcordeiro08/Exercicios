public class Porta {
    private boolean aberta;

    public Porta(boolean aberta){
        this.aberta=aberta;
    }


    void abreOuFecha(){
        if (isAberta()==false){
            setAberta(true);
            System.out.println("A porta abriu.");}
        else{
            setAberta(false);
            System.out.println("A porta fechou.");}
    }
    void estaAberta(){
        if (isAberta()==true)
            System.out.println("A porta esta aberta");
        else
            System.out.println("A porta esta fechada");
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
}
