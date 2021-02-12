/*story:设计一个方法用于数组遍历，要求遍历的结果是在一行上的，例如[11, 22, 33, 44, 55, 66]*/
public class Ragnor_11_ArrayTraverse {
    public static void main(String[] args) {
        int [] arr = new int[]{5, 6, 7, 8};
        printArray(arr);

    }

    public static void printArray(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length -1){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
    }
}
