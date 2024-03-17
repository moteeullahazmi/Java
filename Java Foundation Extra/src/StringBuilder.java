public class StringBuilder {
    public static void main(String[] args) {
        String str= "Moteeullah ";
        str.concat("Azmi");
        System.out.println(str); //Moteeullah because immutable

        StringBuffer sb = new StringBuffer("Moteeullah ");
        sb.append("Azmi");
        System.out.println(sb);
    }

}