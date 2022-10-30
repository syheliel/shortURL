package com.syheliel.shortURL;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "URL")
 public class myURL implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String name;

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
  myURL myURL = (myURL) o;
  return id != null && Objects.equals(id, myURL.id);
 }

 @Override
 public int hashCode() {
  return getClass().hashCode();
 }
}
