public class StringManipulation {
    public static void main(String[] args) {
        String name="Moteeullah Azmi";
        String reverseName="Dr";

        for(int i =name.length()-1; i>=0; i--){
//            System.out.print(name.charAt(i));
            reverseName=reverseName+name.charAt(i);
        }
        System.out.println("out of loop" +reverseName);
    }
}
