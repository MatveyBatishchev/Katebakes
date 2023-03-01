package com.example.katebakes.controllers;

import com.example.katebakes.dto.ProductDto;
import com.example.katebakes.dto.UserDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Shopping cart")
@RequestMapping("/cart")
public interface ProductController {

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    ProductDto read(@PathVariable("id") int id);

    @PostMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    ProductDto create(@RequestBody ProductDto productDto);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void update(@RequestBody ProductDto productDto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable("id") int id);

    @GetMapping(value = "/list", produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    List<ProductDto> readAll(@RequestParam(value = "page", defaultValue = "0", required = false) Integer pageNum,
                             @RequestParam(value = "per_page", defaultValue = "27", required = false) Integer perPage);

}
