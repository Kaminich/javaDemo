package com.kaminich.productmanagement.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.endpoint.base-url}/model")
@RequiredArgsConstructor
@Tag(name = "Product Model Controller")
public class ProductModelController {
}
