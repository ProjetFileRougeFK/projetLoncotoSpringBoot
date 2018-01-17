package com.loncoto.LoncotoProject.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.loncoto.LoncotoProject.metier.Article;

public interface ArticleRepository extends PagingAndSortingRepository<Article, Integer> {

}
