package com.bazario.bazariobackend.service.impl;

import com.bazario.bazariobackend.payload.CategoryDTO;
import com.bazario.bazariobackend.payload.CategoryResponse;
import com.bazario.bazariobackend.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

    @Override
    public CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder) {
        return null;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        return null;
    }

    @Override
    public CategoryDTO deleteCategory(Long categoryId) {
        return null;
    }

    @Override
    public CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId) {
        return null;
    }
}