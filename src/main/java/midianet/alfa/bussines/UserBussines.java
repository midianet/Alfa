package midianet.alfa.bussines;

import midianet.alfa.model.User;
import midianet.alfa.repository.UserRepository;
import midianet.exception.BussinesException;
import midianet.exception.InfraException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserBussines {

    @Autowired
    private UserRepository repository;


    public User save(final User user) throws BussinesException, InfraException {
        if(user.getId() == null){
            repository.add(user);
        }else{
            repository.update(user);
        }
        return user;
    }

    public void delete(final User user )throws  BussinesException,InfraException{
        repository.delete(user);
    }

    public User findById(final long id) throws  BussinesException,InfraException {
        return repository.findById(id);
    }

    public List<User> listAll() throws InfraException{
        return repository.listAll();
    }

}