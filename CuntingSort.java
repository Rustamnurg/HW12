/**
 * Created by Rustam on 21.04.16.
 */
public class Main {

    public static void main(String[] args){
        int[] arr = new int[10];
        containWithRandomNumbers(arr);
        countingSort(arr);
        printMassive(arr);
    }

    public static void countingSort(int[] mass) {
        assert (mass != null);
        assert (mass.length > 0);

        int max = getMaxValue(mass);
        int min = getMinValue(mass);

        //массив, в котором хранится кол-во каждых элементов (i элемент встречается counts[i] раз)
        int counts[] = new int[max - min + 1];

        //заполняется нулями
        for (int i = min; i <= max; ++i) counts[i - min] = 0;

        //подсчет
        for (int i = 0; i < mass.length; ++i) {
            ++counts[mass[i] - min];
        }

        //вставка в отсортированном порядке
        int pos = 0;
        for (int i = min; i <= max; ++i) {
            for (int j = counts[i - min]; j > 0; j--) {
                mass[pos++] = i;
            }
        }
    }

/////////вспомогательные функции

    private static int getMaxValue(int[] mass){
        int max = mass[0];

        for(int i = 0; i < mass.length; i++){
            if(max < mass[i])
                max = mass[i];
        }

        return max;
    }

    private static int getMinValue(int[] mass){
        int min = mass[0];

        for(int i = 0; i < mass.length; i++){
            if(min > mass[i])
                min = mass[i];
        }

        return min;
    }

    public static void containWithRandomNumbers(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 10);
        }
    }

    public static void printMassive(int arr[]) {
        for (int anArr : arr) {
            System.out.print(anArr + "\n");
        }
    }
}
