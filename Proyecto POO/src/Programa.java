import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    private List<Client> Client;
    private List<Casa> Casa;
    private List<PlacaSolar> PlacaSolar;
    private Scanner scan;
    private String comando;
    private String[] parametros;

    public Programa() { 
        Client = new ArrayList<>();
        Casa = new ArrayList<>();
        PlacaSolar = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    /**
     * Comienzo de el programa
     * 
     */
    public void ejecutar() {
        boolean salir = false;
        while(salir == false){
            System.out.print(">");
            comando = scan.nextLine();

            if(comando.equalsIgnoreCase("quit")){
                salir = true;
            }

            parametros = comando.split(" ");

            switch(parametros[0]){
                case "ayuda":
                help();
                

                case "addCasa":

                case "addPlaca":
                
                case "addAparell":

                case "onCasa":

                case "onAparell":

                case "offAparell":

                case "list":

                case "info":
            
                default:
                    System.out.println("ERROR: Comanda incorrecta.");

            }
        }
    }
    public void help(){
    System.out.println("addCasa [nif] [nom] [superfície]");
    System.out.println("\tRegistrarà la casa a lempresa amb les dades indicades. ");
    System.out.println("addPlaca [nif] [superfície] [preu] [potència]");
    System.out.println("\tAfegirà la placa solar a la casa indicada. ");
    System.out.println("addAparell [nif] [descripcio] [potència]");
    System.out.println("\tAfegirà laparell a la casa indicada. ");
    System.out.println("onCasa [nif]");
    System.out.println("\tEncendrà linterruptor general de la casa. ");
    System.out.println("onAparell [nif] [descripció aparell]");
    System.out.println("\tSencendrà laparell indicat. ");
    System.out.println("offAparell [nif] [descripció aparell]");
    System.out.println("\tSapagarà laparell indicat. ");
    System.out.println("list");
    System.out.println("\tMostra la informació de les cases registrades. ");
    System.out.println("quit");
    System.out.println("\tFinalitza lexecució. ");}
    
}

