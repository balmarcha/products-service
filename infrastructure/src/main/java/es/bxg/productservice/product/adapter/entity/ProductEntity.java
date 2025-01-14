package es.bxg.productservice.product.adapter.entity;

import es.bxg.productservice.category.adapter.entity.CategoryEntity;
import es.bxg.productservice.color.adapter.entity.ColorEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "products")
public class ProductEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_id_gen")
  @SequenceGenerator(name = "products_id_gen", sequenceName = "products_id_seq", allocationSize = 1)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "short_description")
  private String shortDescription;

  @Column(name = "long_description")
  private String longDescription;

  @Column(name = "base_price", nullable = false, precision = 10, scale = 2)
  private BigDecimal basePrice;

  @Column(name = "promotional_price", precision = 10, scale = 2)
  private BigDecimal promotionalPrice;

  @Column(name = "currency", length = 3)
  private String currency;

  @Column(name = "sku", nullable = false, length = 50)
  private String sku;

  @Column(name = "barcode", length = 50)
  private String barcode;

  @Column(name = "brand", length = 100)
  private String brand;

  @Column(name = "model", length = 100)
  private String model;

  @Column(name = "min_age")
  private Integer minAge;

  @Column(name = "max_age")
  private Integer maxAge;

  @Column(name = "gender", length = 20)
  private String gender;

  @Column(name = "material", length = 100)
  private String material;

  @Column(name = "toy_type", length = 50)
  private String toyType;

  @Column(name = "weight", precision = 10, scale = 2)
  private BigDecimal weight;

  @Column(name = "dimensions", length = 100)
  private String dimensions;

  @Column(name = "country_of_origin", length = 100)
  private String countryOfOrigin;

  @Column(name = "release_date")
  private LocalDate releaseDate;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private CategoryEntity category;

  @ManyToMany
  @JoinTable(
      name = "products_colors",
      joinColumns = @JoinColumn(name = "product_id"),
      inverseJoinColumns = @JoinColumn(name = "color_id")
  )
  private List<ColorEntity> colors;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

}