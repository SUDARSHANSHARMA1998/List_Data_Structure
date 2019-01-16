package list;
import java.util.Arrays;
public class DemoList
{
        int[] list = new int[10];

        public static void main(String[] args)
        {
            DemoList list1 = new DemoList();

            list1.insertItem(42);
            list1.insertItem(43);
            list1.insertItem(44);
            list1.insertItem(45);
            list1.insertItem(46);

            System.out.println("before " + Arrays.toString(list1.list));

            list1.removeItem(2);

            System.out.println("after " + Arrays.toString(list1.list));

        }

        void insertItem(int value)
        {
            for (int i = 0; i < list.length; i++)
            {
                if (list[i] == 0)
                {
                    list[i] = value;
                    break;
                }
            }
        }

        void removeItem(int index)
        {
            int i = 0;

            for (i = index ; i < list.length - 1 ; i++)
            {
//			System.out.print(list[i] + " <-- " + list[i+1] + "\n");
                list[i] = list[i + 1];
            }

            list[list.length - 1] = 0;
//		set the last element as 0
        }

        int isEmpty()
        {
            if (list[0] == 0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }


        int isFull()
        {
            if (list[list.length - 1] != 0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

}
