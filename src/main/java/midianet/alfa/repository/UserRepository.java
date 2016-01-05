package midianet.alfa.repository;

import midianet.alfa.model.User;
import midianet.exception.InfraException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public User add (final User user) throws InfraException{
        return user;
    }

    public User update(final User user) throws InfraException{
        return user;
    }

    public void delete(final User user )throws InfraException{

    }

    public User findById(final long id) throws InfraException {
        return new User();
    }

    public List<User> listAll() throws InfraException{
        return new ArrayList<User>();
    }

}