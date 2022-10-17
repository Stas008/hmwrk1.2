import java.util.Random;
public class lib {
    
    public static void print_arr (int[] input_arr){
        for (int i=0; i<input_arr.length; i++){
            System.out.print(input_arr[i]+" ");
        }
        System.out.println();
    }
    public static void fill_rand_array (int[] input_arr){
        Random rand = new Random();
        for (int i=0; i<input_arr.length; i++){
            input_arr[i]=rand.nextInt(100);

        }
    }
    
    public static void heapify(int input_arr[], int n, int i)
    {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2

           // Если левый дочерний элемент больше корня
        if (l < n && input_arr[l] > input_arr[largest])
            largest = l;

          // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && input_arr[r] > input_arr[largest])
            largest = r;
       // Если самый большой элемент не корень
        if (largest != i)
        {
            int swap = input_arr[i];
            input_arr[i] = input_arr[largest];
            input_arr[largest] = swap;

          // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(input_arr, n, largest);}
    }
    public static void sort(int input_arr[])
    {
        int n = input_arr.length;

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(input_arr, n, i);

        // Один за другим извлекаем элементы из кучи   
        for (int i=n-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = input_arr[0];
            input_arr[0] = input_arr[i];
            input_arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(input_arr, i, 0);
        }
    }
    public static void main(String[] args) {

    
    
    }
    
}
