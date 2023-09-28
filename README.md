# Análise_CaixaBranca
Uma análise de Código em Java de acordo com a complexidade ciclomática e outros fatores, definindo seus erros de acordo com testes de caixa branca.

# Testes de Caixa Branca

## Teste de Condição
O programa apresenta somente um teste de condição, este que se apresenta dentro da função verificarUsuario(), da qual verifica a existência de uma conta com o login e senha inseridos no código.
Tendo somente um teste de condição para todo o código, ele é falho já que a variavel conn é necessario ter um valor valido durante o código, ou senão é possivel dar erro no codigo caso ele tenha um valor invalido.
Seria possível adicionar mais testes de condição assima do conn se Login e Senha tivessem Condições de existência no banco de dados, como presença de letras minúsculas, maiúsculas, números e símbolos para senhas, assim como @ e um domínio de email para login.

## Teste de Ciclo
O Programa não apresenta Loops como 'for' e 'while' e não apresenta funções recursivas, portanto ele não apresenta Ciclos, então não podemos definir entre ciclos simples, concatenados, aninhados e não estruturados. Sendo desta forma podemos assumir que a Complexidade Ciclomatica é 1, ja que independentemente da quantia de nós, caso não tenha ciclo somente existirá 1 caminho do começo até o fim do codigo.

## Nomenclatura
O Programa não apresenta problema na nomenclatura de suas Variáveis, sendo nomes dos quais diretamente se referem ao valor inserido nelas.

## Legibilidade e Organização
O Programa, enquanto legível, apresenta problemas na sua organização, tendo uma falta de padronização na escrita, tal que linhas subsequentes diferem uma da outra, mesmo quando executam a mesma função com suas variáveis mudadas.

## Tratamento de Nullpointers
Enquanto a maioria das variáveis podem ficar com diferentes valores e fazerem suas funções terminarem com um return válido até o fim do código, a variável conn, o return da função conectarBD(), caso não consiga conectar com o SQL irá causar condição de erro no código, já que ele é necessário ter um valor válido para conectar no SQL e não existe um sistema de ciclo para tentar novamente ou alertar o erro na conexão e finalizar o código apropriadamente.

## Arquitetura do código
O código é uma simples classe Java para lidar com autenticação de usuários em um banco de dados, dentro deste contexto ele apresenta uma arquitetura apropriada, mesmo com os problemas que ele apresenta.

## Fechamento de Conexões
O código não fecha as conexões com o SQL, somente resetando a conexão para null quando a função conectarBD é usado novamente.

