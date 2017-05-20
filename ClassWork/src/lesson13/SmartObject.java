package lesson13;

/**
 * Created by ioa on 16.05.17.
 */
public class SmartObject {
    public boolean isSmart(Comparator cmp){
        return cmp.compare(this) > 0;
    }

    public static void main(String[] args) {
        SmartObject obj = new SmartObject();
        obj.isSmart(new Comparator() {
            @Override
            public int compare(Object object) {
                return object instanceof Integer ? 1 : 0;
            }
        });
    }
}
