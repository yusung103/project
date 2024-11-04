package com.example.kotlincrud.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class WordCount (
    @Id
    val word: String,
    val count: Int = 0
)