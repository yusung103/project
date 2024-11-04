package com.example.kotlincrud.controller

import com.example.kotlincrud.dto.BlogDto
import com.example.kotlincrud.service.BlogService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/blog")
class BlogController(
    val blogService: BlogService
) {
    @GetMapping
    fun search(@RequestBody blogDto: BlogDto):ResponseEntity<String?> {
        val result = blogService.kakaoSearch(blogDto)
        return ResponseEntity.ok(result)
    }
}