# 📅 Cronograma Semanal (30 Dias de QA — 1 Hora por Dia)

Este documento contém o plano de estudos detalhado dia a dia, adaptado para sua rotina de **1 hora diária de estudo** e desenhado para conectar seu background de **qualidade industrial (FMEA, 8D, PPAP)** ao ecossistema de testes de software.

> ⏱️ **Divisão Recomendada da sua 1 Hora Diária:**
> - **20 minutos:** Leitura conceitual / Teoria focada
> - **30 minutos:** Prática mão na massa / Exercícios
> - **10 minutos:** Registro das lições no diário (`anotacoes/`) e marcação `[x]`

---

## 🗓️ Semana 1: Fundamentos de Teste & Ciclo de Vida de Software
> **Foco:** Construir a base conceitual e compreender a diferença entre validação, verificação e ciclo de defeitos.  
> 💡 *Conexão com seu background:* Assim como no controle industrial, prevenir falhas no início do fluxo custa uma fração de corrigir em produção.

| Status | Dia | Tópico Principal | Atividade Prática / Meta (1h de estudo) |
| :---: | :---: | :--- | :--- |
| [ ] | **Dia 01** | Introdução ao QA | **Validação vs. Verificação:** Entender a diferença essencial entre *"construir o produto certo"* (validação com cliente/negócio) e *"construir o produto corretamente"* (verificação técnica de conformidade). |
| [ ] | **Dia 02** | Tipos de Teste I | **Testes Funcionais, Exploratórios e de Usabilidade:** Compreender suas aplicações, objetivos e momentos adequados de uso no ciclo de desenvolvimento. |
| [ ] | **Dia 03** | Tipos de Teste II | **Testes de Regressão, Sanidade e Smoke Tests:** Compreender como estruturar e priorizar a suíte de testes em deploys contínuos (análogo à inspeção de fim de linha). |
| [ ] | **Dia 04** | Ciclo de Vida do Bug | **Estados de uma falha:** Entender o fluxo de status de um bug (*Novo*, *Aberto*, *Em Correção*, *Re-teste*, *Fechado*, *Reaberto*) e conectar com a contenção do método 8D. |
| [ ] | **Dia 05** | Princípios de Teste | **7 Princípios de Teste de Software:** Estudar e exemplificar princípios do ISTQB (ex: "Teste antecipado", "Pesticide Paradox", "Ausência de erros é ilusão"). |
| [ ] | **Dia 06** | Síntese & Exercícios | **Mapa Mental:** Criar um mapa mental visual consolidando todos os conceitos e tipos de testes estudados na semana. |
| [ ] | **Dia 07** | Retrospectiva | **Autoavaliação:** Avaliação de fixação dos conceitos da Semana 1 e preenchimento da retrospectiva semanal. |

---

## 🗓️ Semana 2: Metodologias Ágeis & Escrita de Casos de Teste
> **Foco:** Entender o fluxo de trabalho das squads de tecnologia e aprender a documentar cenários de teste com clareza.  
> 💡 *Conexão com seu background:* O BDD/Critérios de Aceite funcionam como as especificações do PPAP, enquanto a Partição de Equivalência e BVA são a aplicação direta do pensamento FMEA.

| Status | Dia | Tópico Principal | Atividade Prática / Meta (1h de estudo) |
| :---: | :---: | :--- | :--- |
| [ ] | **Dia 08** | Scrum na Prática | **Papéis e Cerimônias:** Papéis (*PO*, *Scrum Master*, *Dev*, *QA*) e cerimônias (*Daily*, *Sprint Planning*, *Review*, *Retrospective*). |
| [ ] | **Dia 09** | Kanban & Fluxo de Trabalho | **Gestão visual:** Entender limites de WIP (*Work in Progress*), gargalos na esteira e regras de transição de cards entre Dev e QA. |
| [ ] | **Dia 10** | Histórias de Usuário | **Interpretação de Requisitos:** Análise de critérios de aceite utilizando o formato BDD (*Given-When-Then* / Dado-Quando-Então). |
| [ ] | **Dia 11** | Escrita de Casos de Teste I | **Técnicas de Design de Teste (FMEA aplicado):** Aplicação de Partição de Equivalência (*Equivalence Partitioning*) e Análise do Valor Limite (*Boundary Value Analysis - BVA*). |
| [ ] | **Dia 12** | Escrita de Casos de Teste II | **Estruturação de Casos de Teste:** Formatar casos com Pré-condições, Passos de execução numerados, Dados de entrada e Resultado Esperado. |
| [ ] | **Dia 13** | Prática de Documentação | **Mão na massa:** Escrever 5 casos de teste completos e profissionais para um fluxo de login e recuperação de senha. |
| [ ] | **Dia 14** | Retrospectiva | **Revisão:** Validação dos modelos de casos de teste criados, refinamento da escrita e autoavaliação. |

---

## 🗓️ Semana 3: Reporte de Bugs, SQL Essencial & Testes de API
> **Foco:** Documentar erros com precisão cirúrgica, realizar consultas SQL essenciais e iniciar a validação de serviços backend com Postman.  
> 💡 *Conexão com seu background:* A anatomia do Bug Report e investigação com SQL e APIs refletem as disciplinas de causa raiz e ações corretivas do 8D.

| Status | Dia | Tópico Principal | Atividade Prática / Meta (1h de estudo) |
| :---: | :---: | :--- | :--- |
| [ ] | **Dia 15** | Reporte de Bugs Profissional | **Anatomia do Bug Report (8D em ação):** Título descritivo, Severidade vs. Prioridade, Ambiente, Passos de Reprodução, Resultados Obtido/Esperado e Evidências. |
| [ ] | **Dia 16** | Simulação de Bug Report | **Prática de escrita:** Documentar 2 a 3 relatórios de bugs fictícios incluindo prints, logs e comportamento esperado. |
| [ ] | **Dia 17** | SQL Essencial para QA | **Consultas Básicas:** Praticar comandos `SELECT`, `WHERE`, `ORDER BY` e operadores lógicos para conferir dados da aplicação no banco. |
| [ ] | **Dia 18** | Junções e Agregações em SQL | **Consultas Avançadas:** Prática de `INNER JOIN`, `LEFT JOIN`, `COUNT`, `GROUP BY` para validações diretas de integridade de dados. |
| [ ] | **Dia 19** | Conceitos de API REST | **Arquitetura Web:** Entender cliente-servidor, Verbos HTTP (`GET`, `POST`, `PUT`, `DELETE`), Status Codes (2xx, 3xx, 4xx, 5xx) e cabeçalhos. |
| [ ] | **Dia 20** | Testes de API com Postman | **Uso da Ferramenta:** Criar Collections, Environments, variáveis e validar Payloads/Headers em requisições HTTP reais ou simuladas. |
| [ ] | **Dia 21** | Retrospectiva & Scripting | **Asserções em JS:** Criar asserções básicas com JavaScript no Postman (ex: `pm.response.to.have.status(200)`) e fechar a semana. |

---

## 🗓️ Semana 4: Automação Web com Playwright & Projeto Integrador
> **Foco:** Automatizar testes end-to-end (E2E) com Playwright e consolidar todo o aprendizado em um portfólio prático.  
> 💡 *Conexão com seu background:* Automação de testes é a linha automatizada de controle de qualidade que garante repetibilidade e zero falhas de escape.

| Status | Dia | Tópico Principal | Atividade Prática / Meta (1h de estudo) |
| :---: | :---: | :--- | :--- |
| [ ] | **Dia 22** | Introdução ao Playwright | **Setup do Ambiente:** Instalação e configuração de Node.js, VS Code, Playwright Test runner e compreensão da estrutura de diretórios. |
| [ ] | **Dia 23** | Locatores & Ações Básicas | **Interação com a DOM:** Mapear elementos com boas práticas (`getByRole`, `getByText`, CSS/XPath) e simular cliques, digitação e seleções. |
| [ ] | **Dia 24** | Asserções & Page Object Model | **Boas Práticas de Automação:** Validação de resultados esperados (`expect`) e organização do projeto utilizando o padrão *Page Object Model (POM)*. |
| [ ] | **Dia 25** | Automação de Fluxos E2E | **Script Completo:** Desenvolver um script automatizado de ponta a ponta para fluxo de autenticação e preenchimento de formulário cadastral. |
| [ ] | **Dia 26** | Projeto Integrador QA I | **Planejamento do Portfólio:** Escolher uma aplicação de teste, planejar os testes funcionais manuais, estruturar a coleção do Postman e esboçar os testes E2E. |
| [ ] | **Dia 27** | Projeto Integrador QA II | **Execução:** Codificar a automação no Playwright, executar as validações de API/banco e reportar eventuais falhas encontradas. |
| [ ] | **Dia 28** | Portfólio & Repositório Git | **Vitrine Profissional:** Organizar o repositório no GitHub com README impecável contendo o código do Playwright, collection do Postman e modelos de bugs. |
| [ ] | **Dia 29** | Preparação para Entrevistas | **Revisão Técnica & Pitch de Carreira:** Treinar como defender seu histórico industrial (FMEA, 8D, PPAP) articulado com as ferramentas digitais (Playwright, Postman, SQL). |
| [ ] | **Dia 30** | Conclusão & Próximos Passos | **Encerramento:** Balanço geral dos 30 dias, autoavaliação das competências e definição dos próximos estudos (CI/CD no GitHub Actions, relatórios Allure). |
