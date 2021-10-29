package a_rogatko.leeson8;

public class Task1 {
    public static void main(String[] args) {

        String abc ="АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String gl1 = "аеёиоуыэюя";
        String gl=gl1.toUpperCase(); //
for(int k=0;k<2;k++) {
    for (int i = 0; i < 32; i++) {
        char q = abc.charAt(i);
        for (int j = 0; j < 10; j++) {
            if (q == gl.charAt(j)) {
                if(k==0||(k==1&&j%2==0)) System.out.print(q);



            }

        }
    }
System.out.println();

}
}}








