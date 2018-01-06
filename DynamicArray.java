import java.lang.reflect.Array;

/**
 * Created by HIMH on 1/2/2018.
 */
public class DynamicArray{
    private int[] arr;
    public DynamicArray() {
        arr = new int[0];
    }

    public void addElement(int element){
        int[] temp = new int[arr.length + 1];
        System.arraycopy(arr,0,temp,0,arr.length);
        temp[arr.length] = element;
        arr = temp;
    }

    public void removeElement(int index){
        int[] temp = new int[arr.length - 1];
        System.arraycopy(arr,0, temp, 0, index);
        System.arraycopy(arr,index + 1, temp, index, temp.length - index);
        arr = temp;
    }

    public void resize(int newSize){
        int[] temp = new int[newSize];
        System.arraycopy(arr,0,temp,0,arr.length);
        arr = temp;
    }

    public void changeElement(int index, int element){
        arr[index] = element;
    }

    public int getElement(int index){
        return arr[index];
    }

    public int getLength(){
        return arr.length;
    }
}
