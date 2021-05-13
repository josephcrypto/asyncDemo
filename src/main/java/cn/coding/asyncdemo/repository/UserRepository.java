package cn.coding.asyncdemo.repository;

import cn.coding.asyncdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
