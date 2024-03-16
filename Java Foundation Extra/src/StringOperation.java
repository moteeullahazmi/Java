public class StringOperation {
    public static void main(String[] args) {
        String name1 ="Moteeullah ";
        String name2 = "Azmi";

        //        Concatenation
        System.out.println(name1+name2);
        System.out.println(name1.concat(name2));

//        Length
        System.out.println(name1.length());

//        get character at a particular index
        System.out.println(name1.charAt(2));

//        equality check
        String name3 = new String("Moteeullah ");
        System.out.println(name1==name3); //object name1 and name3 diffrent thats why reason
        System.out.println(name1.equals(name3)); // string same check

//        compare to
        System.out.println(name1.compareTo(name2));

//        substring
        System.out.println(name1.substring(2));
        System.out.println(name1.substring(3,7));

//        replace
        System.out.println(name1.replace('a','i'));

//        Split
        String[] spli= name1.split("a");
        for (String temp:spli){
            System.out.println(temp);

//            case Conversion
            System.out.println(name1.toUpperCase());
            System.out.println(name1.toLowerCase());

//            trim
            String name4 ="    Moteeullah   ";
            System.out.println(name4);
            System.out.println(name4.trim());

        }



    }


}
