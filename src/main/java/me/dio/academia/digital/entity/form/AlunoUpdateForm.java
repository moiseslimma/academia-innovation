package me.dio.academia.digital.entity.form;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoUpdateForm {

  private String nome;
  private String bairro;
  private LocalDate dataDeNascimento;
}
