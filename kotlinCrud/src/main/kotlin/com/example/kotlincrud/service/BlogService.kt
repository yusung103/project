package com.example.kotlincrud.service

import com.example.kotlincrud.dto.BlogDto
import org.springframework.stereotype.Service

@Service
class BlogService {
    fun kakaoSearch(blogDto: BlogDto): String? {
        println(blogDto.toString())
        return "kakaoSearch"
    }
}