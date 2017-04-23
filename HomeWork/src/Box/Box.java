package Box;

/**
 * Created by ioa on 15.04.17.
 */
class Box {
    double width;
    double heigth;
    double depth;

    Box (double width, double heigth, double depth) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
    }
    double voluem(){
        return width * heigth * depth;
    }

//    void setDim (double width, double heigth, double depth){
//        this.width = width;
//        this.heigth = heigth;
//        this.depth = depth;
//    }
}

class BoxDemo{
    public static void main(String[] args) {
        // создать объект класса Box
        Box mybox = new Box(10.2,15,8);
        Box mybox1 = new Box(6,48.5,5);
        double vol;
        // инициализация
//        mybox.setDim(10, 15, 8);
//        mybox1.setDim(5,4,65);

        vol = mybox.voluem();
        System.out.println("vol = " + vol);

        vol = mybox1.voluem();
        System.out.println("vol = " + vol);

    }

}

