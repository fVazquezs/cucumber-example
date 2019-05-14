Feature: Calculadora
  Scenario: Escrever dois numeros com um operador
    Given Criar uma calculadora
    When escrever 2 + 2
    Then devo receber um resultado 4

  Scenario: Escrever dois numeros com um operador
    Given Criar uma calculadora
    When escrever 5 - 2
    Then devo receber um resultado 3

  Scenario: Escrever dois numeros com um operador
    Given Criar uma calculadora
    When escrever 5 * 4
    Then devo receber um resultado 20