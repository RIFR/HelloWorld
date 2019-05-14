public class SortMain {


    public static void SortHigh (int[] theList) {
        int temp;
        for (int i = 0; i < theList.length; i++) {
            for (int j = 0; j < theList.length; j++) {
                if (theList [i] < theList [j]) {
                    temp = theList [i];
                    theList [i] = theList [j];
                    theList [j] = temp;
                }
            }
        }
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean done = false;
        int list1 [] = {3,8,9,14,18,4};
        int list2 [] = {1,2,7,12,17,21,26,13};

        int [] fullList = new int [list1.length + list2.length];
        int fullListItem = 0;

        int pos1,pos2 = 0;

        //List myList = new List();
        System.out.println("Sort");

        System.out.print("List1     ");
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + " ");
            fullList [i]=list1[i];
        }

        System.out.print("\n");

        System.out.print("List2     ");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
            fullList [i + list1.length]=list2[i];
        }

        System.out.print("\n");
        System.out.print("Unsorted  ");
        for (int x : fullList)
            System.out.print(x + " ");

        //for (int i = 0; i < fullList.length; i++) {
        //    System.out.print(fullList[i] + " ");
        //}
       System.out.print("\n");

        //for (int i = 0; i < myList.length; i++) {
        //   System.out.println(myList[i] + " ");
        //}
        //while (done == false) {
        //   done = true;
        Sort(fullList);
        /*
           for (int i = 0; i < fullList.length; i++) {
              for (int j = 0; j < fullList.length; j++) {
                  if (fullList [i] < fullList [j]) {
                      pos2 = fullList [i];
                      fullList [i] = fullList [j];
                      fullList [j] = pos2;
                  }
              }
           }

         */
        //}

        System.out.print("Sorted    ");
        for (int x : fullList) {
            System.out.print(x + " ");
        }

        pos1 = 0;
        pos2 = 0;
        SortHigh (list1);
        SortHigh (list2);
        System.out.print("\n");
        System.out.print("Sorted<2> ");
        for (int i = 0; i < list1.length; i++) {
            for (int j = pos2; j < list2.length; j++) {
                if (list2[j] < list1[i]) {
                    System.out.print(list2[j] + " ");
                    pos2 = j + 1;
                }
            }
            System.out.print(list1[i] + " ");
            pos1 = i + 1;
        }

        for (int k = pos2; k < list2.length; k++) {
            System.out.print(list2[k] + " ");
        }

    }

    public static void Sort (int[] theList) {
        int temp;
        for (int i = 0; i < theList.length; i++) {
            for (int j = 0; j < theList.length; j++) {
                if (theList [i] < theList [j]) {
                    temp = theList [i];
                    theList [i] = theList [j];
                    theList [j] = temp;
                }
            }
        }
    }

}
