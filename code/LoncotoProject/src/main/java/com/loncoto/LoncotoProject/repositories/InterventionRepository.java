package com.loncoto.LoncotoProject.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.loncoto.LoncotoProject.metier.Intervention;

public interface InterventionRepository extends PagingAndSortingRepository<Intervention, Integer> {

}
