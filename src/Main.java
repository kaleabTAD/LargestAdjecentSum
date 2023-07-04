public class Main {
    public static void main(String[] args) {
        int []a={1,3,5,8,1};
        System.out.println(LargestAdjecentSum(a));
    }

    public static int  LargestAdjecentSum(int []a) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <a.length-1 ; i++) {
            if (max<a[i]+a[i+1]){
                max=a[i]+a[i+1];
            }
        }


return max;
    }
}