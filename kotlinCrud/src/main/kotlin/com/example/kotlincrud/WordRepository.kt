package com.example.kotlincrud

import com.example.kotlincrud.entity.WordCount
import org.springframework.data.repository.CrudRepository

interface WordRepository : CrudRepository<WordCount, String> {
}