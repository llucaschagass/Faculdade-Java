# Aplicações Java com Padrões de Projeto

Este repositório contém uma série de projetos que implementam diferentes padrões de projeto em Java. Estes projetos foram desenvolvidos como exercícios práticos para a disciplina de Modelos, Métodos e Técnicas de Engenharia de Software, do Centro Universitário UNA, sob a orientação do professor Daniel Paiva.

## Descrição dos Projetos

### a) Singleton Pattern: Sistema de Biblioteca

Este projeto implementa o padrão de projeto Singleton para gerenciar uma coleção de livros em uma biblioteca.

#### Classes:
- `Main`: Ponto de entrada da aplicação.
- `Book`: Classe que representa um livro.
- `Library`: Classe Singleton que gerencia a coleção de livros.

#### Funcionalidades:
- Adicionar livros à biblioteca.
- Listar todos os livros disponíveis na biblioteca.

### b) Observer Pattern: Sistema de Monitoramento do Clima

Este projeto implementa o padrão de projeto Observer para monitorar e exibir as condições climáticas e a previsão do tempo.

#### Classes:
- `Main`: Ponto de entrada da aplicação.
- `WeatherStation`: Classe que representa a estação meteorológica (sujeito).
- `WeatherObserver`: Interface para os observadores.
- `CurrentConditionsDisplay`: Observador que exibe as condições atuais.
- `ForecastDisplay`: Observador que exibe a previsão do tempo.

#### Funcionalidades:
- Atualizar e notificar observadores sobre mudanças nas condições climáticas.
- Exibir as condições atuais e a previsão do tempo.

### c) Decorator Pattern: Sistema de Pedidos de Café

Este projeto implementa o padrão de projeto Decorator para adicionar dinamicamente funcionalidades a um objeto de café.

#### Classes:
- `Main`: Ponto de entrada da aplicação.
- `Coffee`: Interface para a bebida base.
- `SimpleCoffee`: Implementação concreta de `Coffee`.
- `CoffeeDecorator`: Classe abstrata que serve como base para os decoradores.
- `MilkDecorator`: Decorador que adiciona leite ao café.
- `SugarDecorator`: Decorador que adiciona açúcar ao café.
- `WhippedCreamDecorator`: Decorador que adiciona chantilly ao café.

#### Funcionalidades:
- Adicionar ingredientes ao café dinamicamente.
- Calcular o custo total e a descrição completa do café com todos os ingredientes adicionados.

---

*Centro Universitário UNA*

*Modelos, Métodos e Técnicas de Engenharia de Software*

*Professor: Daniel Henrique Matos de Paiva*

---
