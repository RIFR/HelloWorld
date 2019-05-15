import java.util.*;

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
        //exercise41();

        // ÖVNINGSUPPGIFT 4 (2)
        //exercise42();

        // ÖVNINGSUPPGIFT 4 (3)
        //exercise43();

        //exercise46();

        // ÖVNINGSUPPGIFT 7
        //exercise7();
        //exercise7v1();
        //exercise7v2();

        // ÖVNINGSUPPGIFT 8
        exercise8();

        // ÖVNINGSUPPGIFT 9
        //exercise9();

        // ÖVNINGSUPPGIFT 10
        //exercise10();

        // ÖVNINGSUPPGIFT 11
        //exercise11();

        //private1();
        //private2();

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

    private static void exercise1() {
        //-------------------------------------------
        // ÖVNINGSUPPGIFT 1
        System.out.println("Hej, whats your name");
        String input = scanner.nextLine();

        System.out.println("Hej " +input);

        System.out.println(" ");

    }

    private static void exercise21(){
        // ÖVNINGSUPPGIFT 2 (1)

        System.out.println("Calculate Distance for ");
        System.out.print(" Speed(m/s)?");

        float speed = Float.valueOf(scanner.nextLine());

        System.out.print(" Time(sec)?");
        float time = Float.valueOf(scanner.nextLine());

        presentDistance(speed,time);

    }

    private static void exercise22(){
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

    private static void exercise23(){
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

    private static void presentDistance (double meterPerSeconds, double seconds)
    {System.out.println("Distance "+meterPerSeconds * seconds+" meter");}

    private static void exercise3(){
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

    private static void exercise41(){

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

    private static void exercise42() {

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

    private static void exercise43() {

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

    private static void exercise45() {

        //double random = Math.random();

        Random rand = new Random();

        int num1 = rand.nextInt(100) +1;
        int num2 = rand.nextInt(100) +1;
        int answer;



    }

    private static void exercise46() {

        Random rand = new Random();

        char[] operators = "+-*/".toCharArray();
        char operator;
        int num1,num2;
        double answer,result = 0;
        boolean cont = true;

        do {

            operator = operators[rand.nextInt(4)];
            num1 = rand.nextInt(100) +1;
            num2 = rand.nextInt(25) +1;

            switch (operator){
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = Double.valueOf(num1) / Double.valueOf(num2);
                    break;
            }

            System.out.print("What is " + num1 + " " + operator + " " + num2 +": ");
            answer = Double.valueOf(scanner.nextLine());

            if (Math.abs(answer - result) < 0.0001)
                System.out.println("Whats right!!!");
            else {
                if (operator == '/')
                    System.out.printf("Correct answer is %.2f",result);
                else
                    System.out.printf("Correct answer is %s",Math.round(result));
            }

            System.out.println("");
            System.out.print("Fortsätt? (y)");
            cont = scanner.nextLine().equalsIgnoreCase("y");
        } while (cont);
    }

    private static void exercise412(int a, int b){

        System.out.println("Vad blir "+ a +" + "+ b +"?");
        int res = Integer.valueOf(scanner.nextLine());
        if (res == a+b)
            System.out.println("Helt rätt!!!");
        else
            System.out.println("Rätt svar " +(a+b));

    }
    private static void exercise43(int a, int b){

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

    private static void exercise7() {
        String vocals = "aeiouyåäö";

        System.out.print("Skriv en rad: ");
        String input = scanner.nextLine();

        int noOfVocalsFound = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vocals.length(); j++) {
                if (input.substring(i,i+1).equalsIgnoreCase(vocals.substring(j,j+1)))
                    noOfVocalsFound++;
            }
        }

        System.out.println ("Your string contained " +noOfVocalsFound +
                " vocals, and was "+input.length() + " characerts long");

    }

    private static void exercise7v1() {

        char[] vocals = "aeiouyåäö".toCharArray();

        System.out.print("Skriv en rad: ");
        char[] input = scanner.nextLine().toLowerCase().toCharArray();

        int noOfVocalsFound = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < vocals.length; j++) {
                if (input[i]==vocals[j])
                    noOfVocalsFound++;
            }
        }

        System.out.println ("Your string contained " +noOfVocalsFound +
                " vocals, and was "+input.length + " characerts long");

    }

    private static void exercise7v2() {

        String vocals = "aeiouyåäö";

        System.out.print("Skriv en rad: ");
        char[] input = scanner.nextLine().toLowerCase().toCharArray();

        int noOfVocalsFound = 0;
        for (int i = 0; i < input.length; i++) {
                 if (vocals.contains(String.valueOf(input[i])))
                    noOfVocalsFound++;
        }

        System.out.println ("Your string contained " +noOfVocalsFound +
                " vocals, and was "+input.length + " characerts long");

    }


    private static void exercise8() {

        final int maxVal = 5;
        int [] values = new int[maxVal];
        int largest    = 0;
        int largestpos = 0;

        int[] intervalVal = new int[2];

        System.out.println("Enter "+maxVal+" integers ");
        for (int i = 0; i < values.length; i++) {
            System.out.print((i+1) + ": ");
            values[i] = scanner.nextInt();
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] +" ");
            largest = Integer.max(largest,values[i]);
            largestpos = i;
        }

        System.out.println();
        System.out.println("The largest number is " + largest +" and was found in array position " +(largestpos+1));

        System.out.println();
        System.out.println("Enter interval to be nulled");
        for (int i = 0; i < intervalVal.length; i++) {
            System.out.print((i+1) + ": ");
            intervalVal[i] = scanner.nextInt();
        }

        for (int i = 0; i < values.length; i++) {
            if ((values [i] <= Integer.max(intervalVal[1],intervalVal[0])) &&
                    (values [i] >= Integer.min(intervalVal[1],intervalVal[0]))) {

                values [i] = 0;
            }
        }

        System.out.println();
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] +" ");
        }

        System.out.println();
        int numberOfZeroValues = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i]==0)
                numberOfZeroValues++;
            else
                System.out.print(values[i] +" ");
        }
        for (int i = 0; i <numberOfZeroValues; i++) {
            System.out.print("0 ");
        }

    }

    private static void exercise9() {

        System.out.print("How many strings you do you want to enter? ");

        String [] strings = new String[Integer.valueOf(scanner.nextLine())];

        System.out.println();

        for (int i = 0; i < strings.length; i++) {

            System.out.print((i+1) + ": ");
            strings[i] = scanner.nextLine();

        }

        System.out.print("Search for : ");
        String searchString = scanner.nextLine();

        int noOfHits = 0;
        StringBuffer resultStr = new StringBuffer();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].contains(searchString)){
                noOfHits++;
                resultStr.append(strings[i] + "\n");
            }
        }

        if (noOfHits==0)
            System.out.println("Did not found any lines containing "+searchString);
        else
            System.out.println(resultStr);
    }

    /*static int noOfHits     = 0;
    static String resultStr = "";

    private static void forEachItem (String str){
        resultStr += str + "\n";
        noOfHits++;
    }*/

    private static void exercise10() {

        List<String> strings = new ArrayList<>();
        System.out.println();

        String input;
        boolean cont = true;

        while (cont) {
            System.out.print("Enter string (end with q): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("q"))
                cont = false;
            else
                strings.add(input);
        }

        System.out.print("Search for : ");
        String searchString = scanner.nextLine();


        strings.stream()
                .filter(item -> item.contains(searchString))
                .forEach(System.out::println);

        /*strings.stream()
                .filter(item -> item.contains(searchString))
                .forEach(item -> forEachItem(item));

        if (noOfHits==0)
            System.out.println("Did not found any lines containing "+searchString);
        else
            System.out.println(resultStr);*/
    }

    private static class Person{

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age  = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getage() {
            return age;
        }

        public void setage(int age) {
            this.age = age;
        }

    }

    private static void exercise11() {

        List<Person> persons = new ArrayList<>();

        String name = "";
        int age = 0;
        boolean cont = true;

        System.out.println("Enter persons, name and age (QUIT=q) ");
        while (cont) {
            System.out.print("Name? ");
            name = scanner.nextLine();
            if (name.equalsIgnoreCase("q"))
                cont = false;
            else {
                System.out.print("Age? ");
                age = Integer.valueOf(scanner.nextLine());

                persons.add(new Person(name,age));
            }
        }
        System.out.print("Search for age : ");
        final int searchForAge = Integer.valueOf(scanner.nextLine());

        persons.stream()
        .filter(item -> item.age == searchForAge)
                .forEach(item -> System.out.println(item.name));
    }

    private static void private1() {

        System.out.println();

        System.out.println("Testing StringBuffer");

        StringBuffer stringBuffer = new StringBuffer("Ahmed");

        stringBuffer.append(" was here");

        System.out.println(stringBuffer);

        stringBuffer.insert(10,"never ");
        stringBuffer.replace(0,5,"Richard");

        System.out.println(stringBuffer);

    }

    private static void private2() {

        System.out.println();

        System.out.println("Testing StringBuilder");

        StringBuilder stringBuilder = new StringBuilder("Ahmed");

        stringBuilder.append(" was here");

        System.out.println(stringBuilder);

        stringBuilder.insert(10,"never ");
        stringBuilder.replace(0,5,"Richard");

        System.out.println(stringBuilder);

    }

}
