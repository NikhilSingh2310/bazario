package com.bazario.bazariobackend.repository;

import com.bazario.bazariobackend.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}