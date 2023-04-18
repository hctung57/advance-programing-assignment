import java.util.Random;
public class Bai5 {
    public static void Main(String[] args){
        Random random = new Random(1000);
        for(int i = 0 ; i < 50 ; i++){
            System.out.println(random.nextInt(100) + " ");
        }

    }
}
