# Atividade: Introdução a Programação Orientada a Objetos

Este repositório contém o material de estudo e as atividades práticas referentes ao módulo de introdução à Programação Orientada a Objetos em Java.

## 📚 Principais Conceitos Vistos

Programação Orientada a Objetos (POO) é um paradigma de programação que organiza o código em torno de "objetos", que são instâncias de "classes". Em Java, a POO permite maior modularidade, reutilização de código e facilita a manutenção dos programas.

### Classe
É um molde ou um template que define os atributos (variáveis) e comportamentos (métodos) de um objeto.

**Exemplo:**
```java
class Carro {
    String modelo;
    int ano;

    void ligar() {
        System.out.println("O carro está ligado.");
    }
}
```

### Objeto:
É uma instância de uma classe. Ao criar um objeto, você está criando um "exemplar" daquela classe, com seus próprios valores.

**Exemplo:**
```java
// Criando um objeto 'meuCarro' da classe 'Carro'
Carro meuCarro = new Carro();

// Definindo os valores dos atributos para este objeto
meuCarro.modelo = "Fusca";
meuCarro.ano = 1974;

// Chamando um método do objeto
meuCarro.ligar(); // Saída: O carro está ligado.
```
### Método
São as ações ou comportamentos que os objetos podem realizar. São definidos dentro de uma classe.

**Exemplo:**
```java
class Carro {
    String modelo;
    int ano;

    void ligar() {
        System.out.println("O carro está ligado.");
    }

    void buzinar() {
        System.out.println("Beep! Beep!");
    }
}
```
### Método com Parâmetros
Um método pode receber dados (parâmetros) para realizar alguma tarefa. A forma mais comum de usar parâmetros é através de métodos construtores, que inicializam um objeto no momento de sua criação.

**Exemplo:**
```java
public class Produto {
    String nome;
    double preco;
    int quantidade;
    
    // Construtor que recebe nome, preço e quantidade
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
```

### Sobrecarga de Métodos (Overloading)
A sobrecarga acontece quando você cria vários métodos (ou construtores) com o mesmo nome, mas com parâmetros diferentes (seja no tipo, na quantidade ou na ordem). O Java escolhe qual versão usar com base nos argumentos que você passa.

**Exemplo**
```java
public class Produto {
    String nome;
    double preco;
    int quantidade;
    
    // Construtor 1
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    // Construtor 2 (sobrecarregado)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0; // Valor padrão
    }
}
```

## 🏛️ Os 4 Pilares da POO

**Encapsulamento:**  Proteger os dados, controlando o acesso a eles através de métodos (getters e setters).
**Herança:** Permitir que uma classe (filha) herde atributos e métodos de outra classe (mãe).
**Polimorfismo:** Permitir que objetos de diferentes classes respondam à mesma mensagem (chamada de método) de maneiras específicas.
**Abstração:** Focar nos aspectos essenciais de um objeto, escondendo detalhes de implementação complexos.

---

## 🚀 Atividades Propostas
O objetivo é criar as classes a seguir, aplicando os conceitos de atributos privados, getters e setters, e depois instanciar objetos para demonstrar seu funcionamento.

1.  **Classe `Pessoa`:** Atributos `nome` e `idade`.
2.  **Classe `Carro`:** Atributos `marca`, `modelo` e `ano`.
3.  **Classe `Livro`:** Atributos `titulo`, `autor` e `anoDePublicacao`.
4.  **Classe `Aluno`:** Atributos `nome`, `matricula` e `notaFinal`.
5.  **Classe `Produto`:** Atributos `nome` e `preco`.
6.  **Classe `Roda`:** 4 atributos à sua escolha (ex: `aro`, `marca`, `material`, `largura`).
7.  **Classe `Animal`:** Atributos `nome`, `raca` e `idade`.
8.  **Classe `Endereco`:** Atributos `rua`, `numero` e `cidade`.
9.  **Classe `ContaBancaria`:** Atributos `numeroDaConta` e `saldo`.
10. **Classe `Funcionario`:** Atributos `nome`, `salario` e `cargo`.
11. **Classe `Produto` (variação):** Atributos `nome`, `descricao` e `quantidadeEstoque`.
12. **Classe `Emprestimo`:** Atributos `valor`, `dataDeEmprestimo` e `numeroDeParcelas`.

---

<p align="center">
  &copy; 2025 - Atividade de Técnicas de Programação
</p>
