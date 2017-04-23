package car;

/**
 * Created by ioa on 21.04.17.
 */
public class Car {
    boolean move;
    int fueltank;
    int lkm;
    private long startTime;
    private long endTime;

    Car(int fueltank, int lkm){
        this.fueltank = fueltank;
        this.lkm = lkm;
    }
    boolean start() {
        move = true;
        System.out.println("start -> " + "\"" + "Maybach started" + "\"");
        return move;
    }

    boolean stop() {
        move = false;
        System.out.println("stop -> " + "\"" + "Maybach stopped" + "\"");
        return move;
    }

    boolean isGoes() {
        if (move == true) {
            System.out.println("Maybach is going.");
            return true;
        } else {
            System.out.println("Maybach is stopped.");
            return false;
        }
    }
    int getFuel() {
        return this.fueltank;
    }
    void refuel(int fueltank){
        this.fueltank = fueltank;
    }

//    long startTime() {
//        startTime = System.currentTimeMillis();
//        return startTime;
//    }
//    long endTime() {
//        endTime = System.currentTimeMillis();
//        return endTime;
//    }
//
//    double time(){
//        double diff = ((endTime - startTime)/1000);
//        return diff;
//    }
}

