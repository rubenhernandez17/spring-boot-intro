import org.springframework.stereotype.Repository;

import com.example.springdata.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    String toString();

}

