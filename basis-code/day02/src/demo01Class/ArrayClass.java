package demo01Class;

public class ArrayClass {
    int[] array={1,2,3};
    public int getMax(){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
}
