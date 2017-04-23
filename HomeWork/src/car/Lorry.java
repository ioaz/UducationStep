package car;

/**
 * Created by ioa on 23.04.17.
 */
class Lorry extends Maybach{
    final static int FUEL_LORRY = 10;

    Lorry (int fueltank, int lkm) {
        super(fueltank, lkm);
    }

    @Override
    boolean start() {
        move = true;
        System.out.println("start -> " + "\"" + "Lorry started" + "\"");
        return move;
    }
    @Override
    boolean stop() {
        move = false;
        System.out.println("stop -> " + "\"" + "Lorry stopped" + "\"");
        return move;
    }
    @Override
    boolean isGoes() {
        if (move == true) {
            System.out.println("Lorry is going.");
            return true;
        } else {
            System.out.println("Lorry is stopped.");
            return false;
        }
    }
    @Override
    void refuel(){
        this.fueltank = FUEL_LORRY;
    }
}