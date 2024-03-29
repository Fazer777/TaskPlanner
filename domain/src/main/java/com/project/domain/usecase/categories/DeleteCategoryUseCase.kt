package com.project.domain.usecase.categories

import com.project.domain.repository.ICategoryRepository

class DeleteCategoryUseCase(private val categoryRepository: ICategoryRepository) {
    suspend fun execute(itemIndex : Int){
        categoryRepository.deleteCategory(itemIndex)
    }
}