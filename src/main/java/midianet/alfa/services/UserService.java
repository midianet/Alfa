package midianet.alfa.services;

import midianet.alfa.bussines.UserBussines;
import midianet.alfa.rep.UserRep;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Component
@Path("user")
public class UserService {
    private Logger log = Logger.getLogger(UserService.class);

    @Context
    private UriInfo uri;

    @Autowired
    private UserBussines bussines;

    @GET
    @Produces("application/json")
    public Response listar() {
       try {
            final List<UserRep> l = new ArrayList<>();
            final UserRep u = new UserRep();
            u.setId(1L);
            u.setNome("Marcos Fernando");
            u.setEmail("midianet@gmail.com");
            u.setSenha("xpfda2@t54$%$5!");
            l.add(u);
            return Response.ok().entity(l).build();
        }catch(Exception e){
            log.error(e);
            return Response.serverError().entity("Ocorreu um erro solicite log para mais detalhes").build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response obterPorId(@PathParam("id") final Long id) {
        try {
            final UserRep u = new UserRep();
            u.setId(id);
            u.setNome("Marcos Fernando");
            u.setEmail("midianet@gmail.com");
            u.setSenha("xpfda2@t54$%$5!");
            return Response.ok().entity(u).build();
            //return Response.status(404).entity("Registro não encontrado.").build();
        }catch(Exception e){
            log.error(e);
            return Response.serverError().entity("Ocorreu um erro solicite log para mais detalhes").build();
        }
    }

    @POST
    @Consumes("application/json")
    public Response incluir(final UserRep usuario){
        try {
            usuario.setId(1L);
            final UriBuilder b = uri.getAbsolutePathBuilder();
            final URI userUri = b.path(String.format("/%s", usuario.getId())).build();
            return Response.created(userUri).build();
            //return Response.status(422).entity("Dados inválidos (Limite de envio excedido).").build();
        }catch(Exception e){
            log.error(e);
            return Response.serverError().entity("Ocorreu um erro solicite log para mais detalhes").build();
        }
    }

    @PUT
    @Consumes("application/json")
    public Response alterar(final UserRep usuario){
        try {
            return Response.noContent().build();
            //return Response.status(404).entity("Registro não encontrado.").build();
        }catch(Exception e){
            log.error(e);
            return Response.serverError().entity("Ocorreu um erro solicite log para mais detalhes").build();
        }
    }


    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public Response deletar(final @PathParam("id") String id) {
        try {
            return Response.noContent().build();
            //return Response.status(404).entity("Registro não encontrado.").build();
        }catch(Exception e){
            log.error(e);
            return Response.serverError().entity("Ocorreu um erro solicite log para mais detalhes").build();
        }
    }


}