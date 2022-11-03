public class Main {
    public static void main(String[] args) {

        boolean entrance = Data.analysis("login","nologin","login+");
        if (entrance){
            System.out.println("Данные верные");
        } else {
            System.out.println("Данные не верные");
        }
    }


}