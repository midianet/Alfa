package midianet.alfa.services;

import midianet.alfa.bussines.UserBussines;
import midianet.alfa.rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Component
@Path("user")
public class UserService {

    @Autowired
    private UserBussines bussines;

    @GET
    @Produces("application/json")
    public List<UserRep> listar() {
        final List<UserRep> l = new ArrayList<>();
        final UserRep u = new UserRep();
        u.setId(1L);
        u.setNome("Marcos Fernando");
        u.setEmail("midianet@gmail.com");
        u.setSenha("xpfda2@t54$%$5!");
        l.add(u);
        return l;
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public UserRep obterPorId(@PathParam("id") final Long id) {
        final UserRep u = new UserRep();
        u.setId(id);
        u.setNome("Marcos Fernando");
        u.setEmail("midianet@gmail.com");
        u.setSenha("xpfda2@t54$%$5!");
        return u;
    }



}