package com.happyheng.cloud.repository;

import com.happyheng.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * Created by happyheng on 16/11/26.
 */
public interface UserRepository extends JpaRepository<User, Long>{


    List<User> findById(Long id);

}
