public class main {
    public static void main(String[] args) {
        double[] a = {1, 9, 4.5, 6.6, 5.7, -4.5};
        for (double i: a) {
            System.out.print(i+"\t");
        }
        System.out.println("\nAfter sort:");
        selectionSort(a);
        for (double i: a) {
            System.out.print(i+"\t");
        }
    }

    public static void selectionSort(double[] a) {
        double currentMin;
        int currentMinIndex;
        for (int i=0;i<a.length-1;i++){
            currentMinIndex = i;
            currentMin = a[currentMinIndex];
            for (int j=i+1;j<a.length;j++){
                if (a[currentMinIndex] > a[j]){
                    currentMinIndex = j;
                    currentMin = a[j];
                }
            }
            if (currentMinIndex != i){
                a[currentMinIndex] = a[i];
                a[i] = currentMin;
            }
        }
    }
}
