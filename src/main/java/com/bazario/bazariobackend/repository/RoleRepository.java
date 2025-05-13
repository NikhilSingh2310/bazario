package com.bazario.bazariobackend.repository;


import com.bazario.bazariobackend.entity.AppRole;
import com.bazario.bazariobackend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName(AppRole appRole);
}
