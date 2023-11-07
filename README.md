<h1 align="center"> Projeto IBM Expectativas Mercado Anuais </h1>

Este projeto tem como objetivo buscar, salvar, atualizar e deletar dados que foram consumidos da Api Externa do Governo
- Expectativas de Mercado Anuais - 

- Feito por Akemi Samantha Nakayama 

<h3 align="left"> ✔️ Tecnologias Utilizadas  </h3>
Java JDK 11
InteliJ IDEA
Paradigma de orientação a objetos
Spring Framework
Spring Boot
JPA Hibernate
Maven

# Principais Dependencias Utilizadas 
Spring Boot DevTools DEVELOPER TOOLS
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

Lombok DEVELOPER TOOLS
Java annotation library which helps to reduce boilerplate code.

Spring Web WEB
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

Spring Data JPA SQL
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

MySQL Driver SQL
MySQL JDBC and R2DBC driver.

OpenFeign SPRING CLOUD ROUTING
Declarative REST Client. OpenFeign creates a dynamic implementation of an interface decorated with JAX-RS or Spring MVC annotations.

Model Mapper 


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
  <img width="324" alt="image" src="https://media.github.ibm.com/user/404080/files/7be9b7f4-3c12-4054-aae7-cc004d3220a2">
 
# Configure estes campos 
  spring.datasource.username=userName
  spring.datasource.password=passwordUserName
- E mude este campo para "create"
  spring.jpa.hibernate.ddl-auto=create
- Este campo ira possibilitar a criacao a partir do Java da tabela que fora criada para esta API.

# Finalizando todas estas configuracoes esta pronto para subir a aplicacao.
- Va na classe ExpectativasMercadoAnuaisApplication.
<img width="942" alt="image" src="https://media.github.ibm.com/user/404080/files/25832ce2-33dc-4d36-8156-0727291b37ad">
- Na setinha verde ao lado do metodo clique em...
  <img width="250" alt="image" src="https://media.github.ibm.com/user/404080/files/43732a3c-cf74-4315-82a4-e38e31c9779d">
- Assim ira subir a aplicacao e estara criando uma tabela relacional em seu banco de dados.
