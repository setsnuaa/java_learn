package demo04Array;

public class Demo04Array {
    public static void main(String[] args) {
        //动态初始化
        int[] arrayA=new int[10];

        //静态初始化
        int[] arrayB=new int[]{1,2,3};

        for(int i=0;i<arrayB.length;i++){
            arrayB[i]=i-1;
        }
        arrayA=arrayB;
        for(int i=0;i<arrayA.length;i++){
            System.out.println(arrayA[i]);
        }
    }
}
