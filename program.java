// пирамидальная сортировка
public class program {

    public static void main(String[] args) {
        int[] arr = new int[10];
        lib.fill_rand_array(arr);
        lib.print_arr(arr);
        lib.sort(arr);
        lib.print_arr(arr);
    }
}