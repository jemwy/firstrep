import java.util.Random;

public class RacingCarApp 
{
    public static void main (String[] args)
    {
        int[] year8 = {2012, 2007, 1992, 2007, 1988, 2015, 2019, 2023};
        String[] make8 = {"Cadillac CTS-V", "Volkswagen GTI", "Nissan 300ZX Turbo", "Chevrolet Corvette", 
                            "Acura Legend Coupe", "Tesla Model S 60", "Ford Mustang GT", "Honda Civic"};
        Car[] race8 = new Car[8];
        for (int i=0;i<8;i++){
            race8[i] = new Car(year8[i], make8[i]);
        }

        Random rand = new Random();
        for(int i=1; i<=30; i++) {
            for (int j = 0; j<8; j++) {
                int randNum = rand.nextInt(20) + 1;
                if (randNum < 19) {
                    race8[j].accelerate();
                } else {
                    race8[j].brake();
                }
            }
        }

        System.out.println("Racing Car by J. Lucero\n");
        System.out.println("Model  Make                  Speed");
        System.out.println("-----  --------------------  -----");
        for (int i=0; i<8; i++) {
            System.out.println(race8[i]);
        }
        // NEW CHANGES TO BE SEEN 
    }
}
