package com.loncoto.LoncotoProject.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.loncoto.LoncotoProject.metier.Famille;

public interface FamilleRepository extends PagingAndSortingRepository<Famille, Integer> {

}
