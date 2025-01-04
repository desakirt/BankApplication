
package com.github.derickfelix.bankapplication.repositories;

import com.github.derickfelix.bankapplication.models.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends BaseRepository<User, Long> {
    
    List<User> search(String term);
    
    Optional<User> findByUsernameAndPassword(String username, String password);
    
    Optional<User> findByUsername(String username);

}
