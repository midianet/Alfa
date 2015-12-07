package midianet.alfa.services;

import midianet.alfa.bussines.UserBussines;
import midianet.alfa.rep.UserR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Controller
@Path("user")
public class UserService {

    @Inject
    private UserBussines bussines;

    @GET
    @Produces("application/json")
    public UserR obter() {
        final UserR u = new UserR();
        u.setId(1L);
        u.setNome("Marcos Fernando");
        u.setEmail("midianet@gmail.com");
        u.setSenha("xpfda2@t54$%$5!");
        return u;
    }

}