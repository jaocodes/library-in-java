# Roadmap de Implementação - Sistema de Biblioteca
Abaixo um planejamento de melhorias para continuar avançando nos conceitos de programação Java.
## Fase 1: Menu Interativo
- [ ] **Criar sistema de menu principal**
    - [ ] Implementar classe Menu com opções numeradas
    - [ ] Adicionar opção "Listar livros disponíveis"
    - [ ] Adicionar opção "Realizar empréstimo"
    - [ ] Adicionar opção "Cadastrar novo livro"
    - [ ] Adicionar opção "Sair do sistema"

- [ ] **Implementar cadastro de livros em tempo real**
    - [ ] Criar método `cadastrarNovoLivro()` na classe Library
    - [ ] Desenvolver fluxo de interação para coletar dados do livro
    - [ ] Implementar validações para título e autor
    - [ ] Integrar novo livro automaticamente no sistema de empréstimos

## Fase 2: Sistema de Clientes
- [ ] **Criar classe Cliente**
    - [ ] Definir atributos: id, nome, email
    - [ ] Implementar construtores com validações
    - [ ] Criar métodos getters e setters
    - [ ] Adicionar método toString() para exibição

- [ ] **Implementar gerenciamento de clientes na Library**
    - [ ] Adicionar lista de clientes na classe Library
    - [ ] Criar método `cadastrarCliente(String nome, String email)`
    - [ ] Implementar método `listarClientes()`
    - [ ] Desenvolver método `buscarClientePorId(String id)`

- [ ] **Integrar clientes com sistema de empréstimos**
    - [ ] Modificar classe Loan para referenciar Cliente em vez de String clientName
    - [ ] Atualizar método de empréstimo para trabalhar com objetos Cliente
    - [ ] Criar método `consultarHistoricoCliente(String clienteId)`

## Fase 3: Sistema de Buscas e Filtros
- [ ] **Implementar buscas por livros**
    - [ ] Criar método `buscarLivrosPorTitulo(String titulo)`
    - [ ] Desenvolver método `buscarLivrosPorAutor(String nomeAutor)`
    - [ ] Utilizar Streams API para filtros case-insensitive

- [ ] **Adicionar sistema de gêneros literários**
    - [ ] Incluir atributo `genero` na classe Book
    - [ ] Criar enum ou lista de gêneros pré-definidos
    - [ ] Implementar método `filtrarLivrosPorGenero(String genero)`

- [ ] **Desenvolver filtros temporais**
    - [ ] Implementar método `listarLivrosRecentes(LocalDate dataLimite)`
    - [ ] Criar filtro para livros cadastrados na última semana/mês
    - [ ] Adicionar ordenação por data de cadamento

## Fase 4: Melhorias no Menu e Experiência do Usuário
- [ ] **Expandir opções do menu principal**
    - [ ] Adicionar "Gerenciar Clientes" como submenu
    - [ ] Incluir "Buscar Livros" como opção principal
    - [ ] Criar "Relatórios" para dados estatísticos

- [ ] **Implementar validações robustas**
    - [ ] Validar formato de email nos clientes
    - [ ] Verificar duplicidade de livros no cadastro
    - [ ] Implementar tratamento de erros em todas as interações

## Fase 5: Funcionalidades Avançadas
- [ ] **Sistema de devolução de livros**
    - [ ] Criar método `devolverLivro(String livroId)`
    - [ ] Atualizar status de disponibilidade automaticamente
    - [ ] Registrar data de devolução no empréstimo

- [ ] **Relatórios e estatísticas**
    - [ ] Implementar `gerarRelatorioEmprestimosAtivos()`
    - [ ] Criar `calcularLivroMaisEmprestado()`
    - [ ] Desenvolver `listarClientesMaisAtivos()`