![maven](https://github.com/vpithan/jokenpo/actions/workflows/maven.yml/badge.svg)

Cria uma solução para o jogo Jokenpo utilizando Spring.

A solução adotada foi a utilização de um Enum para conter as opções e a comparação com outra opção do Enum **JokenpoOptions**.

Para efetuar o build/testes:
 - ./mvnw package

Para executar:
 -  java -jar target/jokenpo-0.0.1.jar  {opcao1} {opcao2}
    - Ex: **java -jar target/jokenpo-0.0.1.jar pedra pedra**

Opções:
 - PEDRA
 - PAPEL
 - TESOURA
