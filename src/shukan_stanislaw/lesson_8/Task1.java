package shukan_stanislaw.lesson_8;

public class Task1 {
    public static void main(String[] args) {
        String array[] = new String[]{"а","е","ё","и","о","у","ы","э","ю","я"};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        for(int i = 0;i<array.length;i+=2){
            System.out.print(array[i]+" ");
        }
        }
    }
