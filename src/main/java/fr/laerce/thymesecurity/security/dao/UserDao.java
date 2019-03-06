package fr.laerce.thymesecurity.security.dao;

import fr.laerce.thymesecurity.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Projet thyme-security
 * Pour LAERCE SAS
 * <p>
 * Créé le  21/03/2017.
 *
 * @author fred
 */
public interface UserDao extends CrudRepository<User, Long> {
    User findByName(String name);
}
