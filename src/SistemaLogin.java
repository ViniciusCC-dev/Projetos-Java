import java.util.Scanner;
public class SistemaLogin {
    public static void main(String[] args) {
        String LoginMaria = "MariaBonita@gmail.com";
        String LoginGiovanna = "GiovannaLindinha@gmail.com";
        String SenhaMaria = "Maria3456";
        String SenhaGiovanna = "Giovanna3456";
        Scanner sc = new Scanner(System.in);
        System.out.print("Login: ");
        String login = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        if (login.equals(LoginMaria)  && senha.equals(SenhaMaria) ) {
            System.out.println("Acesso Disponivel");
        } else if (login.equals(LoginGiovanna) && senha.equals(SenhaGiovanna)) {
            System.out.println("Acesso Disponivel");
        } else {
            System.out.println("Login ou Senha incorretos");
        }
    }
}
