import java.io.*;

public class main1 {

    public static void main(String[] args) throws IOException  {
        //testMinFunction();
        //testSwapFunction();
        //testExceptions1 ();
        //testExceptions2 ();


        System.out.println("RUNS testHomeWork3");
        if (args.length > 0)
           testHomeWork3 (args[0]);
        else
            testHomeWork3 ("C:\\\\Users\\\\Freyschuss\\\\Workspace\\\\TempFiles");
        System.out.println("RUNS testSubClass");
        testSubClass();

        System.out.println("RUNS testSubClass");
        testDog();
    }

    public static void testDog() throws IOException  {

        class Animal {
            public void move() {
                System.out.println("Animals can move");
            }
        }

        class Dog extends Animal {
            public void move() {
                System.out.println("Dogs can walk and run");
            }

            public void bark() {
                System.out.println("Dogs can bark");
            }
        }


        Animal a = new Animal();   // Animal reference and object
        Animal b = new Dog();   // Animal reference but Dog object
        Dog c = new Dog();   // Animal reference but Dog object

        a.move();   // runs the method in Animal class
        b.move();   // runs the method in Dog class
        c.bark();
    }


    public static void testSubClass () throws IOException  {

        class Super_class {
            int num = 20;

            // display method of superclass
            public void display() {
                System.out.println("This is the display method of superclass");
            }
        }

        class Sub_class extends Super_class {
            int num = 10;

            // display method of sub class
            public void display() {
                System.out.println("This is the display method of subclass");
            }

            public void my_method() {
                // Instantiating subclass
                Sub_class sub = new Sub_class();

                // Invoking the display() method of sub class
                sub.display();

                // Invoking the display() method of superclass
                super.display();

                // printing the value of variable num of subclass
                System.out.println("value of the variable named num in sub class:" + sub.num);

                // printing the value of variable num of superclass
                System.out.println("value of the variable named num in super class:" + super.num);
            }
        }

        Sub_class obj = new Sub_class();
        obj.my_method();
    }

    public static void testHomeWork3 (String DirName) throws IOException {
        //System.out.println(DirName);
        homeWork3 (DirName);
    }

    public static void homeWork3 (String DirName) throws IOException  {
        File file = null;
        String[] paths;

        FileReader inFile  = null;
        FileWriter outFile = null;
        String outputFileName     = "output.txt";
        String fullOutputFileName = DirName + "\\" + outputFileName;

        try {
            // create new file object
            file = new File(DirName);

            outFile = new FileWriter(fullOutputFileName);

            // array of files and directory
            paths = file.list();

            // for each name in the path array
            for(String path : paths) {
                // prints filename and directory name
                //System.out.println(path);
                if (!(path.equals(outputFileName)) &&
                        (path.substring(path.lastIndexOf('.')).equals(".txt"))) {
                    outFile.write(path.substring(0, path.lastIndexOf('.')) + ":\n");
                    //if read protected

                    try {
                        inFile = new FileReader(DirName + "\\" + path);

                        int c;
                        while ((c = inFile.read()) != -1) {
                            outFile.write(c);
                        }
                        if (inFile != null) {
                            inFile.close();
                        }
                    } catch (Exception e) {
                        outFile.write("*** Encrypted ***");
                        e.printStackTrace();
                    } finally {
                        if (inFile != null) {
                            inFile.close();
                        }
                    }
                }
                //else
                //    System.out.println("Ignore " + path);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }finally {
            if (outFile != null) {
                outFile.close();
            }
            if (inFile != null) {
                inFile.close();
            }
        }
    }

    public static void testExceptions2 () {

        int a[] = new int[2];
        try {
            System.out.println("Access element three :" + a[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        }finally {
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }

    public static int minFunction(int n1, int n2) {
         return (n1 > n2 ? n2 : n1);
    }

    public static void testMinFunction () {
         System.out.println(minFunction (2,3));
    }

    public static void swapFunction(Integer a, Integer b) {
        System.out.println("Before swapping(Inside), a = " + a + " b = " + b);

        // Swap n1 with n2
        Integer c = a;
        a = b;
        b = c;

        System.out.println("After swapping(Inside), a = " + a + " b = " + b);
    }
    public static void testSwapFunction () {
        int a = 2;
        int b = 3;
        System.out.println("Before call " + a + " " + b);
        swapFunction (2,3);
        System.out.println("After call  " + a + " " + b);
    }


       /*
        double a = 0.1d;
        double b = 0.2d;

        float c = 0.1f;
        float d = 0.2f;

        System.out.println(a + b);
        System.out.println(c + d);
         */
    //var a = 12;
    //a = 21;
    //System.out.println(a);

    // var myList = new ArrayList<Map<String, List<Integer>>>();
    //ArrayList<Map<String, List<Integer>>> myList;
    //myList = new ArrayList<Map<String, List<Integer>>>();

    //for (var current : myList) {
    // current is infered to type: Map<String, List<Integer>>
    //    System.out.println(current);
    //}

        /*
        int x = 10;

        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }


        for(int x = 10; x < 20; x = x + 1) {
            System.out.print("value of x : " + x );
            System.out.print("\n");
        }

        int x = 10;

        do {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }while( x < 20 );

        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }

        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            if( x == 30 ) {
                continue;
            }
            System.out.print( x );
            System.out.print("\n");
        }

        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            System.out.print( x );
            System.out.print(x != numbers.length - 1  ? ",":" ");
        }
        System.out.print("\n");
        String [] names = {"James", "Larry", "Tom", "Lacy"};

        for( String name : names ) {
            System.out.print( name );
            System.out.print(name!="Lacy" ? ",":" ");
        }

        // char grade = args[0].charAt(0);
        char grade = 'D';

        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");break;
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);

        int i = 5000;
        float gpa1 = 13.65f;
        double gpa2 = 21.65d;
        double mask = 0xaf;

        System.out.println(i);
        System.out.println(gpa1);
        System.out.println(mask);

        double radians = Math.toRadians(gpa2);

        System.out.println(Math.tan(radians));

        Integer x = 5; // boxes int to an Integer object
        System.out.println(Math.tan(x.doubleValue()));
        System.out.println(Math.sin(x.doubleValue()));
        System.out.println(Math.cos(x.doubleValue()));
        x =  x + 10;   // unboxes the Integer to a int
        System.out.println(x);

    int [] numbers1 = {2, 13, 26, 85, 90, 91};
    int [] numbers2 = {3, 11, 21, 55, 88, 65, 123};

    int [] result;}
     */
}
