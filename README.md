## WorkShop API

Projeto desenvolvido em Java com Spring Boot, com foco no aprendizado de **JPA**, **H2 Database** e **uso de profiles para ambiente de testes**.

### 🎯 Objetivo
Este projeto tem como objetivo praticar:
- Mapeamento de entidades com JPA
- Persistência de dados utilizando Spring Data JPA
- Configuração de banco de dados em memória (H2)
- Uso do profile `test` para ambiente de desenvolvimento e testes

### 🛠 Tecnologias utilizadas
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

### 🧩 Modelo de domínio
Atualmente o projeto possui a entidade `User`, representando um usuário do sistema, com os seguintes atributos:
- id
- name
- email
- phone
- password

### ⚙️ Ambiente de testes (Profile `test`)
O projeto utiliza o **profile `test`** para executar a aplicação com:
- Banco de dados H2 em memória
- Console H2 habilitado
- Logs SQL ativados para facilitar o aprendizado

Configuração localizada em:
