
import java.util.Arrays;

public class vetores3 {
    public static void main(String[] args) {
        int n [] = {2, 9, 7, 4, 3};
        int posicao = Arrays.binarySearch(n, 7);
        for (int c: n ){
            System.out.println(c);
        }
        System.out.println("A posição do 7 é: " + posicao);


    }
}
