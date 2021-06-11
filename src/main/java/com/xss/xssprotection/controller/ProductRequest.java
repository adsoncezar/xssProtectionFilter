package com.xss.xssprotection.controller;

import com.xss.xssprotection.entity.Brand;
import com.xss.xssprotection.entity.Product;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {

  String name;
  String description;
  BrandRequest brand;
  BigDecimal value;

  public Product toModel() {
    return Product.builder().description(this.description).name(this.name).value(this.value)
        .brand(this.brand.toModel()).build();
  }

  @Builder
  @Getter
  @NoArgsConstructor
  @AllArgsConstructor
  static class BrandRequest {

    String name;

    Brand toModel() {
      return Brand.builder().name(this.name).build();
    }
  }
}
