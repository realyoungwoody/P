import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = 0;

        while (size <= 0) {
            System.out.print("Введите размер массива: ");
            if (in.hasNextInt()) {
                size = in.nextInt();
            } else {
                while (!in.hasNextInt()) {
                    System.out.println("Error!");
                    System.out.print("Введите целое число: ");
                    in.next();
                }
                size = in.nextInt();
            }
            if(size <= 0){
                System.out.println("нужно больше 0");
            }
        }

        System.out.println();
        float[] array = new float[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент: ");
            float arrayi;
            if (in.hasNextFloat()) {
                arrayi = in.nextFloat();
            } else {
                while (!in.hasNextFloat()) {
                    System.out.println("Error!");
                    System.out.print("Введите число: ");
                    in.next();
                }
                arrayi = in.nextFloat();
            }
            array[i] = arrayi;
        }

        System.out.println();
        System.out.print("Исходный массив: ");
        for(float elem : array){
            System.out.print(elem + " ");
        }
        System.out.println();

        int sizeN = 1;

        for (int i = 0; i < size-1; i++) {
            if(array[i] < array[i+1]){
                sizeN++;
            }
        }

        float[] arrayN = new float[sizeN];
        int g = 0;

        if(array[0] < array[1]){
            arrayN[0] = array[0];
            g++;
        }
        else{
            for (int i = 0; g != 1; i++) {
                if(array[i]<array[i+1]){
                    arrayN[g] = array[i];
                    g++;
                }
            }
        }

        for (int i = 0; i < size-1; i++) {
            if(array[i]<array[i+1]){
                arrayN[g] = array[i+1];
                g++;
            }
        }

        System.out.print("Массив, который мы получили: ");
        for(float elem : arrayN){
            System.out.print(elem + " ");
        }

        in.close();

    }

}

