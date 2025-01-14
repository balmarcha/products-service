package es.bxg.productservice.color.adapter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "colors")
public class ColorEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "colors_id_gen")
  @SequenceGenerator(name = "colors_id_gen", sequenceName = "colors_id_seq", allocationSize = 1)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name", nullable = false, length = 50)
  private String name;

}