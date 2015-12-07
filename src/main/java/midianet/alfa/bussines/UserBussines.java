package midianet.alfa.bussines;

import midianet.alfa.repository.UserRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserBussines {

    @Inject
    private UserRepository repository;

}