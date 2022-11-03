public class Data {


    public static final String allowedCharacters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789_";
    public static boolean analysis(String login,
                                   String password,
                                   String confirmPassword){
        try {
            test(login,password,confirmPassword);
        } catch (WrongPasswordException  | WrongLoginException e){
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    private static void test(String login,
                                   String password,
                                   String confirmPassword) throws WrongPasswordException, WrongLoginException{

        if (!approbation(login)){
            throw new WrongLoginException("Неверный формат логина");
        }

        if (!approbation(password)){
            throw new WrongPasswordException("Неверный формат пароля");
        }

        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли должны совпадать");
        }

    }

    private static boolean approbation(String a){
        if (a.length()> 20){
            return false;
        }
        for (int i = 0; i < a.length(); i++){
            if (!allowedCharacters.contains(String.valueOf(a.charAt(i)))){
                return false;
            }
        }
        return true;
    }

}
