# exercicios-ifrs
Crie uma classe Data que receba 3 números (mês, dia e ano) no construtor e garanta que os dados foram inseridos corretamente.  E as datas são validas. Em caso de números inseridos errados exibir mensagem e setar a data como 00-00-0000. Criar um método que exiba o valor da data verData(), no formato dia/mes/ano com os 0 na frente exemplo ( 01/02/2022) , utilizar condicionais.

Crie uma classe conta corrente que possua métodos sacar e depositar. Garanta que o saldo da conta seja apenas alterada por esses métodos.

Crie um construtor que garanta um valor valido e outro que já possua um valor inicial usado para transferências de contas.

Crie uma classe

Classe CarroCorrida

*Atributos:

- numeroCarro : int
- piloto : String
- equipe : String
- velocidadeMaxima : float
- velocidadeAtual : float
- ligado : boolean

*Métodos:

+ CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima) - "Construtor"
+ set... (alterar atributos da Classe - "Modificadores")
+ get... (retorna valores dos atributos da Classe - "Acessores")
+ acelerar(float) - aumenta unidades em Km/h
+ frear(float) - reduz a velocidade em percentual (%) de frenagem
+ parar()
+ ligar()
+ desligar()

*Observações:
*Não ultrapassar a velocidade máxima
*Frear e Acelerar só funcionam se o carro estiver ligado
*Desligar só funciona se o carro estiver parado


Escreva um construtor para a classe Lampada de forma que instâncias desta só possam ser criadas se um estado inicial for passado para o construtor. Esse estado pode ser o valor booleano que indica se a lâmpada está acesa (true) ou apagada (false). Crie o método interruptor para trocar o estado e dizer se a lâmpada está acesa ou apagada. Crie um método que exiba se a mesma está acesa ou apagada.

Considere a classe Lampada que também representa o número de watts da lâmpada (veja o exercício 4). Escreva dois construtores para a classe: um que recebe como argumentos o número de watts da lâmpada, e outro, sem argumentos, que considera que a lâmpada tem 60 watts por default.

Considere a classe Lampada dos exercícios anteriores crie um método get e set que garanta que a potencia esteja em uma escala de 1 a 1000

Escreva outro construtor para a classe Data (exe1) que receba uma instância da própria classe Data e use os dados desta para inicializar os campos

Crie uma classe Produto que tenha um construtor que inicialize o produto com um nome e um valor.
Defina os seguintes valores "default" para a mesma:
- Desconto máximo: 20%
- Quantidade de parcelas máxima: 24
Crie métodos que modifiquem os valores padrões, permitindo apenas valores mais restritos (menos parcelas ou menos desconto)
O nome não pode possuir menos que 2 caracteres
O preço não pode ser menor que 1 centavo

Transforme a classe produto para que possua setters fluentes. Crie uma classe TestaProduto mostrando o funcionamento do setter fluente com desconto de 10% e 12 parcelas.

Transforme a classe Produto para o padrão JQuery de getter e setter. 