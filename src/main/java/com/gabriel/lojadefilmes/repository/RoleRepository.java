package com.gabriel.lojadefilmes.repository;

import com.gabriel.lojadefilmes.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {


}
