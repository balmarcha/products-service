package es.bxg.productservice.product.model.dto;

import es.bxg.commonlib.model.dtos.BaseDto;
import es.bxg.productservice.category.model.dto.CategoryDto;
import es.bxg.productservice.color.model.dto.ColorDto;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class ProductDto extends BaseDto {

  private String name;

  private String shortDescription;

  private String longDescription;

  private BigDecimal basePrice;

  private BigDecimal promotionalPrice;

  private String currency;

  private String sku;

  private String barcode;

  private String brand;

  private String model;

  private Integer minAge;

  private Integer maxAge;

  private String gender;

  private String material;

  private String toyType;

  private BigDecimal weight;

  private String dimensions;

  private String countryOfOrigin;

  private LocalDate releaseDate;

  private CategoryDto category;

  private List<ColorDto> colors;
}