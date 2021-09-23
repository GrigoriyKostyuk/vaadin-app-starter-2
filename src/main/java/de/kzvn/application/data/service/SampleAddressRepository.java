package de.kzvn.application.data.service;

import de.kzvn.application.data.entity.SampleAddress;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, Integer> {

}