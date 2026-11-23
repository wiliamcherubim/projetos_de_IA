# 📊 Desafio: Média Final do Aluno (Formação JavaScript Developer)

Solução do desafio de código proposto no bootcamp da **Digital Innovation One (DIO)**.

---

## 📌 Descrição do Desafio

O objetivo é criar um algoritmo em JavaScript que receba a média final de um aluno e classifique sua situação acadêmica com base em faixas de pontuação predefinidas:

| Faixa da Média                      | Situação    | Saída Esperada |
| :---------------------------------- | :---------- | :------------- |
| Média menor que `5.0`               | Reprovado   | `REP`          |
| Média entre `5.0` e menor que `7.0` | Recuperação | `REC`          |
| Média igual ou maior que `7.0`      | Aprovado    | `APR`          |

---

## 🛠️ Tecnologias e Conceitos Aplicados

- **JavaScript (ES6+)**
- **Manipulação de Tipos:** Conversão de texto para número de ponto flutuante com `parseFloat()`.
- **Entrada e Saída (I/O):** Uso das funções `gets()` e `print()` específicas do ambiente de testes da DIO.
- **Estruturas Condicionais:** Encadeamento de `if`, `else if` e `else`.
- **Operadores Lógicos e Relacionais:** `<`, `>=`, e `&&` (conjunção lógica _AND_).

---

## 💻 Código da Solução

```javascript
// Lê a entrada do sistema e converte para número decimal (float)
let media = parseFloat(gets());

// Estrutura de decisão para classificar a média
if (media < 5) {
  print("REP");
} else if (media >= 5 && media < 7) {
  print("REC");
} else {
  print("APR");
}
```

---

## 🧠 Lógica Explicada

1. **Entrada de Dados:** A função `gets()` captura a média fornecida pelo sistema de testes. O `parseFloat()` assegura que a comparação numérica seja precisa.
2. **Primeira Verificação (`if`):** Checa se a média é inferior a 5. Sendo verdadeiro, exibe `REP`.
3. **Segunda Verificação (`else if`):** Se a primeira for falsa, valida se a média está na faixa de recuperação (maior ou igual a 5 **e** menor que 7). Sendo verdadeiro, exibe `REC`.
4. **Caso Restante (`else`):** Qualquer média a partir de 7 cai automaticamente neste bloco, exibindo `APR`.
