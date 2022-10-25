import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numeroQuarto, opOcupar, opMenu;

        String quartos[] = {"Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre", "Livre"};

        do
        {
            System.out.print("[1] Hospedar \n[0] Sair \n---> ");
            opMenu = in.nextInt();
        
            if (opMenu==1)
            {
                System.out.print("\nSelecione o número do quarto: (1 à 20): ");
                numeroQuarto = in.nextInt();

                if (numeroQuarto<=0 && numeroQuarto >20)
                {
                    System.out.print("\nQuarto inválido.\n");
                }
                else
                {
                    if (quartos[numeroQuarto].equals("Livre"))
                    {
                        System.out.print("\nQuarto Livre.\n");
                        System.out.print("\nDeseja ocupá-lo? \n[1] Sim \n[2] Não \n--->  ");
                        opOcupar = in.nextInt();

                        if (opOcupar==1)
                        {
                            quartos[numeroQuarto] = "Ocupado";
                            System.out.print("\nQuarto "+ numeroQuarto+ " está ocupado agora.\n");

                            for (int i=1; i<=20; i++)
                            {
                                System.out.print("\nQuarto: "+ i+ ": "+ quartos[i]);
                            }
                            System.out.print("\n\n");
                        }
                        else if (opOcupar==2)
                        {
                            quartos[numeroQuarto] = "Livre";
                            System.out.print("\nQuarto "+ numeroQuarto+ " permanece livre.\n");

                            for (int i=1; i<=20; i++)
                            {
                                System.out.print("\nQuarto: "+ i+ ": "+ quartos[i]);
                            }
                            System.out.print("\n\n");
                        }

                    }
                    else if (quartos[numeroQuarto].equals("Ocupado"))
                    {
                        System.out.print("\nQuarto ocupado. \n\nSelecione outro: ");
                        numeroQuarto = in.nextInt();

                        if (quartos[numeroQuarto].equalsIgnoreCase("Livre"))
                        {
                            System.out.print("\nDeseja ocupá-lo? \n[1] Sim \n[2] Não \n--->  ");
                            opOcupar = in.nextInt();

                            if (opOcupar==1)
                            {
                                quartos[numeroQuarto] = "Ocupado";
                                System.out.print("\nQuarto "+ numeroQuarto+ " está ocupado agora.\n");

                                for (int i=1; i<=20; i++)
                                {
                                    System.out.print("\nQuarto: "+ i+ ": "+ quartos[i]);
                                }
                            }
                            else if (opOcupar==2)
                            {
                                quartos[numeroQuarto] = "Livre";
                                System.out.print("\nQuarto "+ numeroQuarto+ " permanece livre.\n");

                                for (int i=1; i<=20; i++)
                                {
                                    System.out.print("\nQuarto: "+ i+ ": "+ quartos[i]);
                                }
                            }
                            System.out.print("\n\n");
                        }
                    }
                }
            }
        } while(opMenu!=0);
        System.out.print("\nFinalizado.\n");



        in.close();
        
    }
}
