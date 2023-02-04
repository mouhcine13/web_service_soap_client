import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();


        System.out.println(stub.convert(700));

        Compte c = stub.getCompte(5);


        System.out.println(c.getCode());
        System.out.println(c.getMt());
        System.out.println(c.getDate());
    }
}
