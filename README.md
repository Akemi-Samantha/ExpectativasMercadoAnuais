# 📊 Expectativas de Mercado – Análise de Dados Econômicos com Spring Boot

Este projeto simula uma API para o gerenciamento e análise de expectativas econômicas anuais, com base em dados do Banco Central (BACEN). O objetivo é exercitar a construção de um backend RESTful, com leitura de dados externos, modelagem de entidades financeiras, persistência em banco de dados e exposição de dados via API.

---

## 🎯 Objetivo do projeto

- Realizar ingestão e persistência de dados econômicos históricos (PIB, IPCA, Selic etc.)
- Simular o comportamento de uma API de dados financeiros nacionais
- Aplicar práticas modernas de desenvolvimento backend com **Spring Boot**
- Praticar a leitura e tratamento de arquivos CSV no backend
- Expor dados por meio de **endpoints RESTful estruturados e organizados**

---

## 🧠 Contexto dos dados

Os dados foram extraídos da base pública do Banco Central e simulam:

- Expectativas anuais de **PIB**
- Variações do **IPCA**
- Projeções de **Selic** e indicadores macroeconômicos
- Análises por **ano base** e categorias econômicas

---

## 🛠️ Tecnologias utilizadas

- **Java 11**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Web**
- **H2 Database** (para testes locais)
- **Apache Commons CSV** (leitura de arquivos)
- **Lombok**
- **Maven**

---

## 🧱 Arquitetura

O projeto segue uma arquitetura simples baseada em camadas:

controller → service → repository → model


### 📂 Estrutura de pacotes:

src/
└── main/
└── java/
└── com/akemi/expectativas/
├── controller/
├── service/
├── model/
└── repository/


- `controller/` → expõe os endpoints REST
- `service/` → lida com regras de negócio, leitura do CSV e lógica de filtro
- `model/` → contém as entidades representando os dados econômicos
- `repository/` → interfaces do Spring Data JPA

---

## 🗂️ Funcionalidades implementadas

- Leitura automatizada de arquivos `.csv` com dados anuais
- Armazenamento estruturado no banco H2 local
- Endpoints para listagem, busca por ano, filtro por indicador econômico
- Organização de resposta por DTOs
- Testes e validações básicas no backend

---

## ▶️ Como executar o projeto

1. Clone o repositório  
   `git clone https://github.com/Akemi-Samantha/ExpectativasMercadoAnuais`

2. Importe na sua IDE (IntelliJ recomendado)

3. Execute o projeto com:  
   `./mvnw spring-boot:run`  
   ou via IDE

4. Acesse os endpoints via Postman, Insomnia ou navegador

---

## 🔍 Exemplos de endpoints

- `GET /expectativas` → lista todas as expectativas carregadas
- `GET /expectativas?ano=2020` → filtra por ano
- `GET /expectativas?indicador=IPCA` → filtra por indicador específico
- `POST /expectativas/upload` → upload de novo CSV (em desenvolvimento)

---

## 💡 Destaques técnicos

- Uso de **Apache Commons CSV** para parsing de arquivos estruturados
- Organização em **camadas bem definidas**
- Modelo de dados desacoplado da estrutura original do arquivo
- Ponto de partida para análise de dados financeiros via backend

---


# :hammer: Funcionalidades do projeto

- `Funcionalidade 1`: 
-     Nome EndPoint: onbordingSaveMarketDataBase
-     Descrição da funcionalidade 1: Este endpoint tem como objetivo buscar uma lista de dados da api externa do governo e salvando no banco relacional a quantidade de dados que foram filtrados.
- `Funcionalidade 2`: 
-     Nome EndPoint: getAllAnnualMarketData
-     Descrição da funcionalidade 1: Este endpoint tem como objetivo buscar uma lista de dados que foram salvos no banco de dados relacional.
- `Funcionalidade 3`: 
-      Nome EndPoint: saveMarketData
-      Descrição da funcionalidade 2: Este endpoint tem como objetivo savar dados da Expectativas de Mercado Anuais.
- `Funcionalidade 4`: 
-      Nome EndPoint: findByIdMarkerData
-      Descrição da funcionalidade 4: Este endpoint consulta dados de mercado anuais a partir do id que sera indicado pelo usuario.
- `Funcionalidade 5`: 
-      Nome EndPoint: updateMarketData
-      Descrição da funcionalidade 5: Este endpoint tem como objetivo atualizar os dados de mercado anuais a partir do id que sera indicado pelo usuario.
- `Funcionalidade 6`: 
-      Nome EndPoint: deleteMarketDara
-      Descrição da funcionalidade 6: Este endpoint tem como objetivo deletar dados de mercado anuais a partir do id que sera indicado pelo usuario.
- `Funcionalidade 7`: 
-      Nome EndPoint: getAllPage
-      Descrição da funcionalidade 7: Este endpoint tem como objetivo consultar uma lista de dados de Expectativas de Mercado Anuais gerando uma paginacao que sera indicada pelo usuario, a partir da pagina que ele gostaria de retornar e a quantidade de elementos que gostaria de receber/consultar. 
- `Funcionalidade 8`: 
-      Nome EndPoint: getAllByDataReferencia
-      Descrição da funcionalidade 8: Este endpoint tem como objetivo consultar uma lista de dados de Expectativas de Mercado Anuais a partir da sua Data Referencia que sera indicada pelo usuario.


# 📁 Acesso ao projeto
**Para acessar o projeto**

-Cire um diretorio em um local de preferencia da sua maquina.
-Logo apos a criacao abra um terminal dentro do seu direitorio.
-Utlizando os comandis git clone o repositorio do projeto em seu diretorio.
--> git clone caminho http do projeto
- PS.: Nao se esqueca que este comando pertence ao Git, deve-se estar instalado em sua maquina, caso nao so baixar neste site https://git-scm.com/downloads :)
  
# 🛠️ Abrir e rodar o projeto
 
Apos a clonagem sera importante criar uma conexao em um banco relacional de sua preferencia! 
O MySql deve estar instalado e configurado em sua maquina local.
Baixe uma IDE compativel para linguagem Java JDK 11 -> Para esta aplicacao foi utilizada a IDE IntelliJ - Spring Boot - Construtor Maven -
Em seguida entre na classe application.properties
 
# Configure estes campos 
  spring.datasource.username=userName
  spring.datasource.password=passwordUserName
- E mude este campo para "create"
  spring.jpa.hibernate.ddl-auto=create
- Este campo ira possibilitar a criacao a partir do Java da tabela que fora criada para esta API.

# Finalizando todas estas configuracoes esta pronto para subir a aplicacao.
- Va na classe ExpectativasMercadoAnuaisApplication.
- Na setinha verde ao lado do metodo clique em...
- Assim ira subir a aplicacao e estara criando uma tabela relacional em seu banco de dados.

## ✨ Sobre

Este projeto foi desenvolvido de forma autoral como estudo prático, inspirado em dados reais do BACEN.  
Serviu como base para aplicar arquitetura em camadas, estruturação de domínio e integração de dados externos em uma API REST com Spring Boot.

---

## 👩‍💻 Por Akemi Samantha Nakayama

🔗 [LinkedIn](https://www.linkedin.com/in/akemi-samantha-nakayama-121622206/)  
🐙 [GitHub](https://github.com/Akemi-Samantha)

