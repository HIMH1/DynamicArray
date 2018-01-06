import sun.misc.FloatingDecimal;

/**
 * Created by HIMH on 1/2/2018.
 */
public class TestDynamicArray {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addElement(4);
        dynamicArray.addElement(5);
        dynamicArray.addElement(6);
        dynamicArray.resize(4);
        dynamicArray.insertElement(3,7);
        dynamicArray.removeElement(1);

        for (int i=0;i<dynamicArray.getLength();i++) {
            System.out.println(dynamicArray.useElement(i));
        }
    }

}
