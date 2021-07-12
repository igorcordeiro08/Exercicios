public class ConversaoDeUnidadesDeArea {

    public static double metrosParaPes(double metros){
        double pes=metros*10.76;
        return pes;

    }
    public static double pesParaCentimetros(double pes){
        double centimetros=pes*929;
        return centimetros;
    }
    public static double milhasParaAcres(double milhas){
        double acres=milhas*640;
        return milhas;
    }
    public static double acresParaPes(double acres){
        double pes=acres*43560;
        return pes;
    }
    public static double pesParaAcres(double pes){
        double acres=pes/43560;
        return acres;
    }
    public static double centimetrosParaPes(double centimetros){
        double pes=centimetros/929;
        return pes;
    }
    public static double acresParaMilhas(double acres){
        double milhas=acres/640;
        return milhas;
    }

}


