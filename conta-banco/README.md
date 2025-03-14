# Projeto: ContaBanco

Este projeto faz parte do aprendizado do módulo de Sintaxe e visa criar uma simulação de contas bancárias com as seguintes especificações:

## 1. Criação do Projeto
O projeto `ContaBanco` receberá dados via terminal para configurar as características de uma conta bancária.

## 2. Criação da Classe
Dentro do projeto, foi criada a classe `ContaTerminal.java`, onde toda a codificação do programa será realizada.

## 3. Atributos da Conta Bancária
A tabela abaixo apresenta os atributos que compõem as contas bancárias no projeto:

| **Atributo**       | **Tipo**   | **Exemplo**        |
|---------------------|------------|--------------------|
| Número              | Inteiro    | 1021              |
| Agência             | Texto      | 067-8             |
| Nome do Cliente     | Texto      | Mario Andrade     |
| Saldo               | Decimal    | 237.48            |

## 4. Inserção de Dados
Os dados devem ser inseridos via terminal, sendo que o usuário receberá mensagens indicando as informações que precisam ser fornecidas, por exemplo:
- **Programa**: "Por favor, digite o número da Agência!"
- **Usuário**: 1021 (e aperta ENTER para o próximo campo)

## 5. Exibição da Mensagem Final
Depois de todas as informações terem sido inseridas, o sistema exibirá a seguinte mensagem para o usuário:

 Olá [Nome Cliente], obrigado por criar uma conta em nosso banco. Sua agência é [Agência], conta [Número] e seu saldo [Saldo] já está disponível para saque.

Os campos em `[ ]` serão preenchidos com as informações fornecidas pelo usuário.

