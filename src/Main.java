import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //-------------------------------------------
        // ÖVNINGSUPPGIFT 1
        //Main.exercise1();

        //-------------------------------------------
        // ÖVNINGSUPPGIFT 2 (1)
        //exercise21();

        //-------------------------------------------
        // ÖVNINGSUPPGIFT 2 (2)
        //exercise22();

        //-------------------------------------------
        // ÖVNINGSUPPGIFT 2 3
        //exercise23();

        //-------------------------------------------
        // ÖVNINGSUPPGIFT 3
        //exercise3();

        // ÖVNINGSUPPGIFT 4 (1)
        exercise41();

        // ÖVNINGSUPPGIFT 4 (2)
        exercise42();

        // ÖVNINGSUPPGIFT 4 (3)
        exercise43();


        /*
        int stefan = 0;
        System.out.println("Age");
        //stefan = Integer.parseInt (scanner.nextLine());
        stefan = scanner.nextInt();

        System.out.println("Hello World -" + input + stefan);

        scanner.close();

        double a = 0.1;
        double b = 0.2;

        float c = 0.1f;
        float d = 0.2f;

        System.out.println(a + b);
        System.out.println(c + d); */

    }

    public static void exercise1() {
        //-------------------------------------------
        // ÖVNINGSUPPGIFT 1
        System.out.println("Hej, whats your name");
        String input = scanner.nextLine();

        System.out.println("Hej " +input);

        System.out.println(" ");

    }

    static void exercise21(){
        // ÖVNINGSUPPGIFT 2 (1)

        System.out.println("Calculate Distance for ");
        System.out.print(" Speed(m/s)?");

        float speed = Float.valueOf(scanner.nextLine());

        System.out.print(" Time(sec)?");
        float time = Float.valueOf(scanner.nextLine());

        presentDistance(speed,time);

    }

    static void exercise22(){
        // ÖVNINGSUPPGIFT 2 (2)

        System.out.println(" ");
        System.out.println("Calculate Distance for ");
        System.out.print(" Speed(m/s)?");

        float speed = Float.valueOf(scanner.nextLine());

        System.out.print(" Time(m)?");
        float time = Float.valueOf(scanner.nextLine());

        System.out.print(" Time(sec)?");
        time = time*60.0f + Float.valueOf(scanner.nextLine());

        presentDistance(speed,time);

    }

    static void exercise23(){
        // ÖVNINGSUPPGIFT 2 3

        System.out.println(" ");
        System.out.println("Calculate Distance for ");
        System.out.print(" Speed(km/h)?");

        float speed = Float.valueOf(scanner.nextLine());
        speed = speed / 3.6f;

        System.out.print(" Time(m)?");
        float time = Float.valueOf(scanner.nextLine());

        System.out.print(" Time(sec)?");
        time = time*60.0f + Float.valueOf(scanner.nextLine());

        presentDistance(speed,time);

    }

    static void presentDistance (double meterPerSeconds, double seconds)
    {System.out.println("Distance "+meterPerSeconds * seconds+" meter");}

    static void exercise3(){
        // ÖVNINGSUPPGIFT 3

        System.out.println("CALCULATE LARGEST AREA");
        System.out.print("Kvadratens sida? ");
        double ks = Float.valueOf(scanner.nextLine());
        double aks = calculateRectangularArea(ks,ks);

        System.out.print("Cirkels radie? ");
        double cr = Float.valueOf(scanner.nextLine());
        double acr = calculateCircularArea(cr);

        System.out.print("Triangelns bas? ");
        double tb = Float.valueOf(scanner.nextLine());

        System.out.print("Triangelns höjd? ");
        double th = Float.valueOf(scanner.nextLine());

        double atr = calculateTriangleArea(tb,th);

        String Largest = "Kvadraten";
        double largestvalue = aks;
        if (acr > largestvalue) {
            Largest = "Cirkel";
            largestvalue = acr;
        } else if (acr == largestvalue)
            Largest += " & Cirkel";

        if (atr > largestvalue) {
            Largest = "Triangeln";
            largestvalue = atr;
        } else if (atr == largestvalue)
            Largest += " & Triangeln";

        System.out.println("The "+ Largest +" is largest with the area " +largestvalue);
    }

    static double calculateRectangularArea (double side1,double side2) {
        return side1 * side2;
    }

    static double calculateCircularArea (double radian) {
        return Math.PI *radian*radian;
    }

    static double calculateTriangleArea (double base, double heigth) {
        return heigth * base / 2.0;
    }

    static void exercise41(){

        int a,b;
        System.out.print("Ange två tal: ");
        String input = scanner.nextLine();
        if (input.trim().contains(" ")) {
            a = Integer.valueOf(input.substring(0,input.indexOf(" ")));
            b = Integer.valueOf(input.substring(input.indexOf(" ")+1).trim());
        } else {
            a = Integer.valueOf(input);
            b = Integer.valueOf(scanner.nextLine());
        }

        exercise412(a,b);

    }

    static void exercise42() {

        boolean ok;
        do {
            int a,b;
            System.out.print("Ange två tal: ");
            String input = scanner.nextLine();
            if (input.trim().contains(" ")) {
                a = Integer.valueOf(input.substring(0,input.indexOf(" ")));
                b = Integer.valueOf(input.substring(input.indexOf(" ")+1).trim());
            } else {
                a = Integer.valueOf(input);
                b = Integer.valueOf(scanner.nextLine());
            }

            exercise412(a,b);

            System.out.print("");
            System.out.print("Fortsätt? (y)");
            ok = scanner.nextLine().equalsIgnoreCase("y");
        } while (ok);

    }

    static void exercise43() {

        boolean ok;
        do {
            int a,b;
            System.out.print("Ange två tal: ");
            String input = scanner.nextLine();
            if (input.trim().contains(" ")) {
                a = Integer.valueOf(input.substring(0,input.indexOf(" ")));
                b = Integer.valueOf(input.substring(input.indexOf(" ")+1).trim());
            } else {
                a = Integer.valueOf(input);
                b = Integer.valueOf(scanner.nextLine());
            }

            exercise43 (a,b);

            System.out.print("");
            System.out.print("Fortsätt? (y)");
            ok = scanner.nextLine().equalsIgnoreCase("y");
        } while (ok);

    }

    static void exercise412(int a, int b){

        System.out.println("Vad blir "+ a +" + "+ b +"?");
        int res = Integer.valueOf(scanner.nextLine());
        if (res == a+b)
            System.out.println("Helt rätt!!!");
        else
            System.out.println("Rätt svar " +(a+b));

    }
    static void exercise43(int a, int b){

        System.out.println("Vad blir "+ a +" + "+ b +"?");
        int res = Integer.valueOf(scanner.nextLine());
        if (res == a+b)
            System.out.println("Helt rätt!!!");
        else
            System.out.println("Rätt svar " + (a+b));

        System.out.println("Vad blir "+ a +" - "+ b +"?");
        res = Integer.valueOf(scanner.nextLine());
        if (res == a-b)
            System.out.println("Helt rätt!!!");
        else
            System.out.println("Rätt svar " + (a-b));

        System.out.println("Vad blir "+ a +" * "+ b +"?");
        res = Integer.valueOf(scanner.nextLine());
        if (res == a*b)
            System.out.println("Helt rätt!!!");
        else
            System.out.println("Rätt svar " + (a*b));

        System.out.println("Vad blir "+ a +" / "+ b +"?");
        double d = Float.valueOf(scanner.nextLine());
        double e = Double.valueOf(a) / Double.valueOf(b);
        if (d == e)
            System.out.println("Helt rätt!!!");
        else
            System.out.printf("%.2f Rätt svar ",e);
    }
}
