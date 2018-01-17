package com.loncoto.LoncotoProject.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.loncoto.LoncotoProject.metier.Client;

public interface ClientRepository extends PagingAndSortingRepository<Client, Integer> {

}
