import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args){
//        int[] numbs={16, 44, 55, 65, 45, 34, 65, 76};
//        int[] numbs=new int[2];
//        numbs[0]=33;
//        numbs[1]=44;
//
//        for(int num:numbs){
//            System.out.println(num);
//        }

        List<Childrena> chil = new ArrayList<>();
        chil.add(new Childrena());
        chil.add(new Childrena());

        show(chil);
    }

    private static void show(List<? extends Parenta> list){
        for(Parenta demo:list){
            demo.pubb();
        }
    }
}
