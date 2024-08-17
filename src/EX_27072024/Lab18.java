package EX_27072024;

public class Lab18 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "PRAMOD";
        s1 = "Dutta";

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
        stringBuilder.append("Ji");
        System.out.println(stringBuilder);

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)



    }
}
