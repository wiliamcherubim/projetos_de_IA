# 🧭 Contexto & Guia de Transição de Carreira: Da Indústria Automotiva para QA de Software

Este documento consolida o diagnóstico de transição de carreira, o aproveitamento do seu background em qualidade industrial e a estratégia de estudos de 1 hora por dia.

---

## 👤 Perfil do Estudante

- **Objetivo:** Transição de carreira para a área de Tecnologia como **Quality Assurance (QA) Júnior / Pleno**.
- **Disponibilidade de Tempo:** **1 hora líquida por dia** de estudo focado.
- **Background Anterior:** Qualidade industrial e desenvolvimento de produtos no setor automotivo, com domínio de ferramentas robustas de engenharia de qualidade:
  - **FMEA** (*Failure Mode and Effects Analysis* / Análise de Modos de Falha e seus Efeitos)
  - **8D** (*Eight Disciplines Problem Solving* / Método 8D para Resolução de Problemas e Causa Raiz)
  - **PPAP** (*Production Part Approval Process* / Processo de Aprovação de Peças de Produção)
  - Gestão de processos, auditoria de conformidade e melhoria contínua.

---

## 💡 Por que Qualidade de Software (QA)?

Entre as opções avaliadas (QA, Gestão de Produtos/PM e Análise de Dados), a área de **Quality Assurance** é o caminho de transição mais rápido, seguro e natural:

1. **A mentalidade é a mesma:** Investigar desvios, questionar cenários de falha antes que cheguem ao cliente final e prezar pela estabilidade do produto já fazem parte do seu DNA profissional.
2. **Curva de aprendizado acelerada:** Enquanto desenvolvimento do zero ou ciência de dados exigem anos de matemática e programação pesada, em QA você já entra dominando o pensamento crítico e a prevenção de riscos, focando a sua 1h diária apenas no vocabulário e nas ferramentas do mundo digital (Scrum, Postman, SQL, Playwright).
3. **Diferencial competitivo em entrevistas:** Candidatos júnior convencionais costumam apenas saber clicar em botões ou seguir scripts rasos. Você traz bagagem sênior de investigação de causa raiz, maturidade de processos e visão sistêmica de produto.

---

## 🌉 Ponte de Competências: Indústria Automotiva ➔ Software

| Qualidade Industrial / Automotiva | Equivalente em Qualidade de Software (QA) | Como aplicar no plano de estudos |
| :--- | :--- | :--- |
| **FMEA** (Prevenção e Modos de Falha) | **Análise de Risco & Design de Testes** (BVA, Partição de Equivalência, Testes Negativos) | Na Semana 2, ao desenhar casos de teste, pense como no FMEA: *"onde esse sistema tem maior probabilidade de quebrar e qual o impacto no usuário?"* |
| **8D & Ishikawa** (Causa Raiz) | **Reporte de Bugs & Investigação Técnica** (Logs, Status Codes, Causa Raiz do Defeito) | Na Semana 3, estruture seus bug reports buscando a causa raiz (não diga apenas *"o botão falhou"*; mostre se foi erro 400 no payload ou falha no banco). |
| **PPAP** (Homologação e Critérios de Aprovação) | **Critérios de Aceite (BDD) & Definition of Done (DoD)** | Na Semana 2, entenda as Histórias de Usuário como as especificações do cliente que devem ser validadas antes do *"Go/No-Go"* para produção. |
| **Auditoria e Conformidade de Linha** | **Testes de Regressão e Smoke Tests** | Na Semana 1 e 4, veja a esteira de testes automatizados como uma checagem contínua de fim de linha que impede defeitos de passarem despercebidos. |
| **Melhoria Contínua (Kaizen)** | **Shift-Left Testing & Retrospectivas Ágeis** | Testar o quanto antes no ciclo de vida (prevenção) é infinitamente mais barato do que corrigir defeitos após o lançamento. |

---

## ⏱️ Estratégia de Estudo: 1 Hora por Dia (Timeboxing Eficiente)

Para maximizar a consistência ao longo dos 30 dias sem sobrecarga, cada sessão diária de 60 minutos é dividida em blocos:

```text
┌─────────────────┬──────────────────────────┬─────────────────┐
│  20 min: Teoria │     30 min: Prática      │ 10 min: Registro│
│   e Conceitos   │  (Mão na massa / Testes) │ e Anotações     │
└─────────────────┴──────────────────────────┴─────────────────┘
```

1. **Minutos 00 a 20 (Fundamentos):** Leitura concentrada do tópico do dia no syllabus, documentação ou artigo recomendado.
2. **Minutos 20 a 50 (Execução Prática):** Escrita de casos de teste, execução de queries SQL, chamadas no Postman ou codificação no Playwright.
3. **Minutos 50 a 60 (Documentação & Fixação):** Preenchimento rápido do diário em `anotacoes/semana-XX.md` e marcação no `cronograma.md`.

---

## 🎯 Os 5 Tópicos Pilares no seu Cronograma

1. **Fundamentos de Teste de Software** ➔ *Semana 1 (Dias 01 a 07)*
2. **Metodologias Ágeis (Scrum & Kanban)** ➔ *Semana 2 (Dias 08 a 10)*
3. **Escrita de Casos de Teste & Reporte de Bugs** ➔ *Semana 2 e 3 (Dias 11 a 16)*
4. **Bancos de Dados & SQL Básico** ➔ *Semana 3 (Dias 17 a 18)*
5. **Testes de API com Postman & Automação Web** ➔ *Semana 3 e 4 (Dias 19 a 30)*

---

*Arquivo de origem das diretrizes iniciais: [`prompts_IA.md`](../prompts_IA.md)*
