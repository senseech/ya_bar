import java.util.ArrayList;
import java.util.Scanner;

public class main_bar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fi_str = in.nextLine();
        String str_col[] = fi_str.split(" ");

        ArrayList <String> mtx_cocktail = new ArrayList<>();
        for (int i = 0; i < Integer.valueOf(str_col[0]); i++){
            mtx_cocktail.add(in.nextLine());
        }
        String num_cock = in.nextLine();

        ArrayList <drink> arr_drinks = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(num_cock); i++){
            String[] cur_dr = in.nextLine().split(" ");
            drink ra_dr = new drink(cur_dr[0], Integer.parseInt(cur_dr[1]), cur_dr[2]);
            arr_drinks.add(ra_dr);
        }

        int num_dr = 0;
        for (int i = mtx_cocktail.size()-2; i > 0; i--){
            if (num_dr == arr_drinks.size()){
                break;
            }
            mtx_cocktail.set(i, mtx_cocktail.get(i).replace(" ", arr_drinks.get(num_dr).getChar_dr()));
            arr_drinks.get(num_dr).setCount_dr(arr_drinks.get(num_dr).getCount_dr()-1);
            if (arr_drinks.get(num_dr).getCount_dr() == 0){
                num_dr++;
            }
        }
        mtx_cocktail.forEach(System.out::println);
    }
}
