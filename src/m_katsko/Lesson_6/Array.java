package m_katsko.Lesson_6;

public class Array {
    public static void main(String[] args) {

        String[] slova = new String[]{"light", "Right", "Mama"};
      /*  for (String k : slova) {
            System.out.print(k.length());
        }*/
        for (String k : slova) {
            int cout=0;
            for (int i = 0; i < k.length(); i++) {
                if (k.charAt(i) == 'a' || k.charAt(i) == 'e' || k.charAt(i) == 'i'  || k.charAt(i) == 'o' || k.charAt(i) == 'u')
                {
                    cout++;
                }
            }
            System.out.println( k +" "+cout);
        }

    }
}

