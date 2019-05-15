Feature: Calculadora
  Scenario: Usar calculadora para fazer uma soma
    Given Criar uma calculadora
    When escrever 2 + 2
    Then devo receber um resultado 4

  Scenario: Usar calculadora para fazer uma subtracao
    Given Criar uma calculadora
    When escrever 5 - 2
    Then devo receber um resultado 3

  Scenario: Usar calculadora para fazer um multiplicacao
    Given Criar uma calculadora
    When escrever 5 * 4
    Then devo receber um resultado 20

  Scenario: Usar calculadora para fazer uma divisao
    Given Criar uma calculadora
    When escrever 20 / 2
    Then devo receber um resultado 10
