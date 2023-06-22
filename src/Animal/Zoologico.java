package Animal;

public class Zoologico {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo",3,4,"marrom","terra",10,"grama");
        Peixe tubarao = new Peixe("Tubarao",4,0,"branco","mar",22,4,1);
        Mamifero ursoDoCanada = new Mamifero("Catatau",5,4,"albino","terra",8,"mel");
        Mamifero leao = new Mamifero("Simba",4,4,"amarelo","terra",12,"carne");
        Mamifero micoLeaoDourado = new Mamifero("Mico Leao Dourado",0.3,4,"amarelo","terra",0.1,"frutas");

        System.out.println(camelo+"\n "+tubarao+"\n "+ursoDoCanada+"\n "+leao+" \n"+micoLeaoDourado);

    }
}
