package com.example.cmp325.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.cmp325.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByFullName(String fullName);
}

