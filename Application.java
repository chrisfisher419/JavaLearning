import java.util.ArrayList;
import java.util.List;

public class Application
{

	public static void main(String[] args) 
	{
       answer(new int[] {}, new int[] {});
    }
	public static int answer(int[] x, int[] y)
	{
        // TODO Auto-generated method stub

        x = new int[] {1, 2, 3, 4, 5, 6};
        y = new int[] {1, 2, 3, 4, 5 };

        boolean contains = false;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    contains = true;
                    break;
                }
            }

            if(!contains){
                list.add(x[i]);
            }
            else{
                contains = false;
            }
        }
        System.out.println(list);
        System.out.println(list.get(0));
        return list.get(0);
	}
	

	
	public static void Arr(int[] arrx, int[] arry)
	{
	  
	}

}
