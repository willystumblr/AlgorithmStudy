import java.util.*;

public class GA_4 {

    public static int n;
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(int i=0; i<n; i++){
            arrayList.add(input.nextInt());
        }

        long startTime = System.currentTimeMillis();

        Collections.sort(arrayList);

        int target = 1;
        for (int i=0; i<n; i++){
            if(target < arrayList.get(i)) break;
            target += arrayList.get(i);
        }

        long estimatedTime = System.currentTimeMillis() - startTime;

        System.out.println(target+" " +estimatedTime);
    }
}