

public class StringProblemInjava{
    public static void main(String[] args){

        long start = System.currentTimeMillis();

        String s = "";
        for(int i = 0; i < 100000; i++){
            s = s + i;
        }


        StringBuilder sb = new StringBuilder();
        for(int i = 0 i < 100000; i++){
            sb.append(i);
        }
         

        long end = System.currentTimeMillis();
        long duration = end -start;
        System.out.println(duration);
    }
}