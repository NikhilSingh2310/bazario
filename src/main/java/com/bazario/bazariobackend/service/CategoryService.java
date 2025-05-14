package com.bazario.bazariobackend.service;

import com.bazario.bazariobackend.entity.Category;
import com.bazario.bazariobackend.payload.CategoryDTO;
import com.bazario.bazariobackend.payload.CategoryResponse;

import java.util.List;
public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}