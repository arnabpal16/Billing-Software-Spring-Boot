package com.arnab.billingsoftware.service;

import com.arnab.billingsoftware.io.CategoryRequest;
import com.arnab.billingsoftware.io.CategoryResponse;

import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request);

    List<CategoryResponse> read();

    void delete (String categoryId);
}
