package car;

/**
 * Created by ioa on 21.04.17.
 */
class Maybach {
    final static int FUEL_MAYBACH = 5;
    boolean move;
    int fueltank;
    int lkm;
//    private long startTime;
//    private long endTime;

    Maybach(int fueltank, int lkm){
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
    void refuel(){
        this.fueltank = FUEL_MAYBACH;
    }
}


