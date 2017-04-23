package car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ioa on 21.04.17.
 */
    class DemoCar {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choes;
        Maybach maybach = new Maybach(Maybach.FUEL_MAYBACH, 1);
        Lorry lorry = new Lorry(Lorry.FUEL_LORRY, 2);

        for (; ; ) {
            System.out.println("Choose a car:");
            System.out.println("1 -> Maybach");
            System.out.println("2 -> Lorry");
            System.out.println("q -> exit");
            choes = reader.readLine();

            if (choes.equals("q"))
                break;
            if (choes.equals("1")) {
                System.out.println("Maybach!\n Fuel level = " + Maybach.FUEL_MAYBACH +
                        " L.\n Fuel consumption = " + maybach.lkm + " L./s." );
                for (; ; ) {
                    System.out.println("1 -> move");
                    System.out.println("2 -> stop");
                    System.out.println("c -> change car");
                    choes = reader.readLine();
                    if (choes.equals("c"))
                        break;
                    if (maybach.move == false) {
                        if (choes.equals("1") && maybach.fueltank > 1) {
                            maybach.start();
                            for (; maybach.move == true; ) {
                                Thread.sleep(1000);
                                maybach.fueltank -= maybach.lkm;

                                if (maybach.getFuel() == 1) {
                                    System.out.println("OMG fuel ends!....");
                                    System.out.println("Left fuel: " + maybach.getFuel() +
                                            " L., Fill a full tank? (y:n)");
                                    choes = reader.readLine();

                                    if (choes.equals("y")) {
                                        maybach.refuel();
                                        System.out.println("Fuel tank is full: " + maybach.getFuel()
                                                + " L.");
                                        maybach.isGoes();
                                    }
                                }
                                if (maybach.getFuel() == 0) {
                                    System.out.println("NOOOO fuel level: " + maybach.getFuel()
                                            + " L.");
                                    maybach.stop();
                                }
                            }
                        } else if (maybach.isGoes() == false && maybach.getFuel() == 0) {

                            System.out.println("No fuel, fill a full tank? (y:n)");
                            choes = reader.readLine();
                            if (choes.equals("y")) {
                                maybach.refuel();
                                System.out.println("YHOOOO! Maybach fuel tank is full!");
                            } else break;
                        }
                    }
                }

                if (maybach.isGoes() == true) {
                    if (choes.equals("2")) {
                        maybach.stop();
                    }
                }
            }

            if (choes.equals("2")) {
                System.out.println("Lorry!\n Fuel level = " + Lorry.FUEL_LORRY +
                        " L.\n Fuel consumption = " + lorry.lkm + " L./s." );
                for (; ; ) {
                    System.out.println("1 -> move");
                    System.out.println("2 -> stop");
                    System.out.println("c -> change car");
                    choes = reader.readLine();
                    if (choes.equals("c"))
                        break;
                    if (lorry.move == false) {
                        if (choes.equals("1") && lorry.fueltank > 1) {
                            lorry.start();
                            for (; lorry.move == true; ) {
                                Thread.sleep(1000);
                                lorry.fueltank -= lorry.lkm;
                                if (lorry.getFuel() <= 1) {
                                    System.out.println("OMG fuel ends!....");
                                    System.out.println("Left fuel: " + lorry.getFuel() +
                                            " L., Fill a full tank? (y:n)");
                                    choes = reader.readLine();

                                    if (choes.equals("y")) {
                                        lorry.refuel();
                                        System.out.println("Fuel tank is full: " + lorry.getFuel()
                                                + " L.");
                                        lorry.isGoes();
                                    }
                                }
                                if (lorry.getFuel() <= 0) {
                                    System.out.println("NOOOO fuel level: " + lorry.getFuel()
                                            + " L.");
                                    lorry.stop();
                                }
                            }
                        } else if (lorry.isGoes() == false && lorry.getFuel() == 0) {

                            System.out.println("No fuel, fill a full tank? (y:n)");
                            choes = reader.readLine();
                            if (choes.equals("y")) {
                                lorry.refuel();
                                System.out.println("YHOOOO! lorry fuel tank is full!");
                            }
                        }
                    }
                }

                if (lorry.isGoes() == true) {
                    if (choes.equals("2")) {
                        lorry.stop();
                    }
                }
            }
        }
    }
}