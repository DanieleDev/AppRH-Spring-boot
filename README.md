# App RH

Criação de um sistema de RH com Java e a ferramenta Spring Boot - Etapa 1

Foi desenvolvido um sistema de RH para divulgação de vagas e incrições usando o padrão arquitetural MVC. Primeiro, crimos um CRUD para as vagas e para os candidatos e fizemos a conexão com o banco de dados, utilizando o MySql. Aqui, aprendi a utilizar a anotação @RequestMapping e os métodos HTTP POST e GET, além de outras anotações importantes, como:

- @Compontent que indica uma classe como um compontente gerenciado pelo Spring;
- @Configuration que indica que uma classe declara métodos @Bean, para configuração do contexto da aplicação;
- @Controller que indica que uma classe é responsável pelas requisições e respostas HTTP no Spring;
- @Entity que marca uma classe como uma entidade, representando uma tabela no banco de dados.
  

Por fim, fizemos a integração entre o backend e o frontend, onde aprendi sobre o Thymeleaf:
- um mecanismo de templates para Java que atua como um intermediário entre as duas partes, facilitando a comunicação entre os dados do backend e a visualização no frontend, e permitindo o desenvolvimento de páginas HTML dinâmicas diretamente no lado do servidor.

Repositório do professor: [Spring-Boot-tutorial-AppRh](https://github.com/FilosoDev/Spring-Boot-tutorial-AppRh)
