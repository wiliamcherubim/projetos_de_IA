# 📚 Recursos e Materiais de Apoio

Este documento centraliza as referências gratuitas, ferramentas recomendadas e documentos de apoio para o seu plano de 30 dias em QA, organizados **semana a semana** e alinhados à sua estratégia de **transição de carreira**.

---

## 🧭 Documentos de Carreira & Contexto

- 📑 **[Guia de Transição de Carreira & Equivalências](docs/contexto-e-transicao.md):** Mapeamento detalhado de como traduzir ferramentas da qualidade industrial/automotiva (**FMEA**, **8D**, **PPAP**) para termos, cerimônias e práticas de QA de Software.
- 💬 **[Diálogo de Diagnóstico Inicial](prompts_IA.md):** Perguntas e respostas que definiram a escolha de QA e a rotina de 1h/dia.

---

## 🗂️ Seus Documentos de Contexto (Drive & Local)
Aproveite modelos e anotações armazenadas em suas pastas e conversas para apoiar os estudos diários:

- 📑 **Modelos de Casos de Teste e Reportes:** Consulte seus templates de testes manuais, planilhas e especificações salvos no Google Drive ou arquivos locais.
- 🗄️ **Anotações de SQL e Banco de Dados:** Utilize seus guias de consultas rápidas, resumos de comandos DDL/DML e modelos relacionais.
- 📬 **Coleções e Documentação de API:** Acesse arquivos `.json` de coleções prévias do Postman e exemplos de payloads.
- 💬 **Histórico de Comunicação:** Revisite e-mails e mensagens técnicas de projetos anteriores para praticar a clareza e objetividade na escrita de bugs.

---

## 📅 Recursos por Semana

### 🗓️ Semana 1: Fundamentos de Teste & Ciclo de Vida de Software
*Foco: Vocabulário padronizado, princípios e tipos de teste.*

- **Syllabus ISTQB CTFL (Certified Tester Foundation Level):**
  - [Download Oficial do Syllabus ISTQB CTFL (BSTQB / ISTQB)](https://www.bstqb.org.br/)
  - *Destaque de leitura:* Capítulos 1 (Fundamentos da Testagem) e 2 (Testes ao Longo do Ciclo de Vida de Software).
- **Validação vs. Verificação:**
  - Artigos de referência sobre a diferença entre *"construir o produto certo"* (validação com stakeholders) e *"construir o produto corretamente"* (verificação contra requisitos).
- **Ciclo de Vida do Defeito & Contenção:**
  - Guia visual de estados de bugs (*New, Assigned, Open, Fixed, Retest, Verified, Closed, Reopened*).
  - *Paralelo industrial:* Compare o ciclo do bug com as fases de contenção (D3) e correção definitiva (D5/D6) do método 8D.
- **Ferramentas para Mapas Mentais (Dia 06):**
  - [Miro](https://miro.com/) ou [Whimsical](https://whimsical.com/) para diagramas ágeis.
  - [Mermaid Live Editor](https://mermaid.live/) para geração de mapas mentais direto em Markdown.

---

### 🗓️ Semana 2: Metodologias Ágeis & Escrita de Casos de Teste
*Foco: Cultura de squads ágeis, critérios de aceite e técnicas formais de teste.*

- **Guia do Scrum (Scrum Guide Oficial):**
  - [Scrum Guide Oficial em Português](https://scrumguides.org/download.html)
  - *Destaque de leitura:* Papéis (Product Owner, Scrum Master, Developers), Eventos (Sprint, Daily, Planning, Review, Retrospective) e Artefatos (Backlog do Produto, Backlog da Sprint, Incremento).
- **Kanban & Gestão de Fluxo:**
  - Conceito de WIP (*Work in Progress*), lead time e cycle time aplicados a QA.
- **BDD e Critérios de Aceite:**
  - Sintaxe Gherkin: `Dado (Given)`, `Quando (When)`, `Então (Then)`.
  - [Documentação Oficial do Cucumber / Gherkin](https://cucumber.io/docs/gherkin/reference/)
  - *Paralelo industrial:* Veja as especificações de BDD como os cadernos de encargos e relatórios dimensionais do PPAP.
- **Técnicas de Design de Teste (FMEA Aplicado a Software):**
  - *Partição de Equivalência (Equivalence Partitioning):* Divisão de entradas válidas e inválidas.
  - *Análise de Valor Limite (Boundary Value Analysis - BVA):* Identificação de fronteiras mínimas, nominais e máximas.
- **Ferramentas de Gestão de Testes:**
  - [Qase.io](https://qase.io/) ou [TestRail](https://www.testrail.com/) (para conhecer a interface de gerenciamento de casos de teste modernos).

---

### 🗓️ Semana 3: Reporte de Bugs, SQL Essencial & Testes de API
*Foco: Comunicação técnica de falhas, consulta a banco de dados relacional e requisições HTTP.*

- **Reporte de Bugs Profissional:**
  - Boas práticas no Jira / Azure DevOps: Título conciso, passos reproduzíveis, severidade vs. prioridade, logs de console e prints anotados.
  - *Paralelo industrial:* Estruture o bug report aplicando a mentalidade de causa raiz do 8D e Diagrama de Ishikawa.
- **Banco de Dados & SQL para QA:**
  - [W3Schools SQL Tutorial](https://www.w3schools.com/sql/): Plataforma interativa para praticar comandos `SELECT`, `WHERE`, `ORDER BY`, `GROUP BY` e `JOIN`.
  - [SQLBolt](https://sqlbolt.com/): Lições interativas passo a passo com exercícios práticos diretamente no navegador.
  - [DB Fiddle](https://www.db-fiddle.com/) ou [SQL Fiddle](https://sqlfiddle.com/): Ambientes online para criar tabelas temporárias e simular cenários de teste.
- **Conceitos de API REST & HTTP:**
  - [MDN Web Docs - HTTP Overview](https://developer.mozilla.org/pt-BR/docs/Web/HTTP): Visão geral de métodos HTTP (`GET`, `POST`, `PUT`, `DELETE`, `PATCH`), cabeçalhos e códigos de status (`200 OK`, `201 Created`, `400 Bad Request`, `401 Unauthorized`, `404 Not Found`, `500 Internal Server Error`).
- **Postman & Testes de API:**
  - [Postman Learning Center](https://learning.postman.com/): Guias oficiais para criar Collections, gerenciar Environments e variáveis.
  - [ReqRes (reqres.in)](https://reqres.in/): API REST pública, gratuita e simulada ideal para treinar requisições CRUD com Postman.
  - [Postman JavaScript Snippets](https://learning.postman.com/docs/writing-scripts/test-scripts/): Guia rápido para escrever asserções em `pm.test()`.

---

### 🗓️ Semana 4: Automação Web com Playwright & Projeto Integrador
*Foco: Automação E2E moderna com TypeScript/JavaScript, Page Object Model e portfólio.*

- **Playwright Oficial:**
  - [Documentação Oficial do Playwright](https://playwright.dev/): Guia de instalação (`npm init playwright@latest`), arquitetura e execução headless/headed.
  - [Playwright Locators Guide](https://playwright.dev/docs/locators): Melhores práticas com `page.getByRole()`, `page.getByLabel()`, `page.getByText()`.
  - [Playwright Assertions (`expect`)](https://playwright.dev/docs/test-assertions): Validações web com auto-retry.
  - [Page Object Models no Playwright](https://playwright.dev/docs/pom-design): Como encapsular a lógica de páginas e manter a suíte limpa e escalável.
- **Aplicações Web para Treino de Automação:**
  - [SauceDemo (Swag Labs)](https://www.saucedemo.com/): Aplicação clássica para treinar login, catálogo e checkout.
  - [The Internet (Herokuapp)](https://the-internet.herokuapp.com/): Vários componentes web reais (dropdowns, alerts, drag and drop, dynamic loading).
  - [Automation Exercise](https://automationexercise.com/): E-commerce completo com fluxos reais de teste manual e automatizado.
- **Portfólio & Git/GitHub:**
  - [GitHub Docs - Hello World](https://docs.github.com/pt/get-started/start-your-journey/hello-world): Estruturação de repositório profissional com README explicativo, badges e prints de evidências de execução.
- **Preparação para Entrevistas:**
  - Como estruturar seu *pitch* profissional explicando a transição de qualidade automotiva para QA de software, destacando como o raciocínio preventivo de FMEA e 8D se traduz em código automatizado com Playwright e validações de API/SQL.
