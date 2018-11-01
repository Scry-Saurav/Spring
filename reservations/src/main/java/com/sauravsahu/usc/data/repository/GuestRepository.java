package com.sauravsahu.usc.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.sauravsahu.usc.data.entity.Guest;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}