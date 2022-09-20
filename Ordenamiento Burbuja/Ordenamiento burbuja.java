import java.time.Duration;
import java.time.Instant;


class bubblesort {

    void bubblesort(int arr[]) {
        int count=0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                    
                }
            }
        }
        System.out.println(count);
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        
        bubblesort ob = new bubblesort();
        
        int arr[] = null;
        Instant inicio = Instant.now();
        ob.bubblesort(arr);
        Instant fin = Instant.now();
        System.out.println("Sorted array");
        ob.printArray(arr);
        Duration duracion = Duration.between(inicio, fin);
        long duracionEnMilisegundos = duracion.toNanos();
        System.out.println(duracionEnMilisegundos);
    }
}