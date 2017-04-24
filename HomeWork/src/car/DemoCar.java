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
        String selection;
        Maybach maybach = new Maybach(Maybach.FUEL_MAYBACH, 1);
        Lorry lorry = new Lorry(Lorry.FUEL_LORRY, 2);

        for (; ; ) {
            System.out.println("Choose a car:");
            System.out.println("1 -> Maybach");
            System.out.println("2 -> Lorry");
            System.out.println("q -> exit");
            selection = reader.readLine();

            if (selection.equals("q"))
                break;
            if (selection.equals("1")) {
                System.out.println("Maybach!\n Fuel level = " + Maybach.FUEL_MAYBACH +
                        " L.\n Fuel consumption = " + maybach.lkm + " L./s." );
                for (; ; ) {
                    System.out.println("1 -> move");
                    System.out.println("2 -> stop");
                    System.out.println("c -> change car");
                    selection = reader.readLine();
                    if (selection.equals("c"))
                        break;
                    if (maybach.move == false) {
                        if (selection.equals("1") && maybach.fueltank > 1) {
                            maybach.start();
                            for (; maybach.move == true; ) {
                                Thread.sleep(1000); // interrupt 1 sec
                                maybach.fueltank -= maybach.lkm;
                                if (maybach.getFuel() <= 1) {
                                    System.out.println("OMG fuel ends!....");
                                    System.out.println("Left fuel: " + maybach.getFuel() +
                                            " L., Fill a full tank? (y:n)");
                                    selection = reader.readLine();
                                    if (selection.equals("y")) {
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
                        } 
                        else if (maybach.isGoes() == false && maybach.getFuel() == 0) {
                            System.out.println("No fuel, fill a full tank? (y:n)");
                            selection = reader.readLine();
                            if (selection.equals("y")) {
                                maybach.refuel();
                                System.out.println("YHOOOO! Maybach fuel tank is full!");
                            } else break;
                        }
                    }
                }
                if (maybach.isGoes() == true) {
                    if (selection.equals("2"))
                        maybach.stop();
                }
            }
            if (selection.equals("2")) {
                System.out.println("Lorry!\n Fuel level = " + lorry.FUEL_LORRY +
                        " L.\n Fuel consumption = " + lorry.lkm + " L./s." );
                for (; ; ) {
                    System.out.println("1 -> move");
                    System.out.println("2 -> stop");
                    System.out.println("c -> change car");
                    selection = reader.readLine();
                    if (selection.equals("c"))
                        break;
                    if (lorry.move == false) {
                        if (selection.equals("1") && lorry.fueltank > 1) {
                            lorry.start();
                            for (; lorry.move == true; ) {
                                Thread.sleep(1000); // interrupt 1 sec
                                lorry.fueltank -= lorry.lkm;
                                if (lorry.getFuel() <= 2) {
                                    System.out.println("OMG fuel ends!....");
                                    System.out.println("Left fuel: " + lorry.getFuel() +
                                            " L., Fill a full tank? (y:n)");
                                    selection = reader.readLine();
                                    if (selection.equals("y")) {
                                        lorry.refuel();
                                        System.out.println("Fuel tank is full: " + lorry.getFuel()
                                                + " L.");
                                        lorry.isGoes();
                                    }
                                }
                                if (lorry.getFuel() == 0) {
                                    System.out.println("NOOOO fuel level: " + lorry.getFuel()
                                            + " L.");
                                    lorry.stop();
                                }
                            }
                        }
                        else if (lorry.isGoes() == false && lorry.getFuel() == 0) {
                            System.out.println("No fuel, fill a full tank? (y:n)");
                            selection = reader.readLine();
                            if (selection.equals("y")) {
                                lorry.refuel();
                                System.out.println("YHOOOO! Lorry fuel tank is full!");
                            } else break;
                        }
                    }
                }
                if (lorry.isGoes() == true) {
                    if (selection.equals("2"))
                        lorry.stop();
                }
            }
        }
    }
}