package lab2.com;

import java.util.Scanner;

    public class Apka {
        public static void main(String[] args) {
            Apka apka = new Apka();
            apka.startLoop();
        }
private static final String menu =
        """
            MENU GLOWNE
            Wybierz kolekcje
            1.Lista
            2.mapa
            3.Set
            0.Zakończ
                """;

    
    public void startLoop()
    {
        Akcjelisty akcjelisty = new Akcjelisty();
        Akcjezbioru akcjezbioru = new Akcjezbioru();
        Akcjemapy akcjemapy = new Akcjemapy();

        Scanner s = new Scanner(System.in);
        while(21<37)
        {
            System.out.println(menu);
            int wybor=Integer.parseInt(s.nextLine());

            switch(wybor)
            {
                case 1:
                {
                    akcjelisty.actions();
                    break;
                }
                case 2:
                {

                    akcjemapy.actions();
                    break;
                }
                case 3:
                {

                    akcjezbioru.actions();
                    break;
                }
                case 0:
                {
                    System.exit(0);
                }

            }

        }

    }
}
