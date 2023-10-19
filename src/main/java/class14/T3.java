package class14;

public class T3 {
    public static void main(String[] args) {
        System.out.println(getVovels("YerbolBadBoy"));
    }
    private static String getVovels(String str){
        return str=str.replaceAll("[^aeiouAEIOU]","");

    }
}
