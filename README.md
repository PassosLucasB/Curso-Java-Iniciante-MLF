# <h1 align="center"> CURSO DE JAVA INICIANTE</h1>

<h1 align="center">
  <img src="https://cdn.iconscout.com/icon/free/png-256/java-43-569305.png" width="120">
</h1>

<p align="center">Aulas do Canal Matheus Leandro Ferreira.</p>

<br>
<br>

Link dos vídeos (https://www.youtube.com/watch?v=RR5EGltxbl8&list=PLCUSYmPGwekcSVuf64MKje9nVf2wpToNF&index=2&t)

<br>
<br>


## <h2> PLATAFORMA JAVA </h2>
<br>

- Java SE (Java Platform, Standard Edition). É a base da plataforma; inclui o ambiente de execução e as bibliotecas comuns.

- Java EE (Java Platform, Enterprise Edition). A edição voltada para o desenvolvimento de aplicações corporativas.

- Java ME (Java Platform, Micro Edition). A edição para o desenvolvimento de aplicações para dispositivos móveis e embarcados.

- Este curso utiliza a versão SE
<br>
<br>

## FERRAMENTAS PARA DESENVOLVIMENTO

<br>

- IntelliJ
- Eclipse
- NetBeans
- Visual Studio Code

<br>

## ESTRUTURA DE UM PROGRAMA EM JAVA
```java
 public class HelloWorld {
	public static void mains(String[] args) {
		System.out.println(“Olá, mundo!”);
}
}
```
<br>

## QUADRO DE PALAVRAS RESERVADAS

<br>

abstract	default	if	private	this
boolean	do	implements	protected	throw
break	double	import	public	throws
byte	else	instanceof	return	transient
case	extends	int	short	try
catch	final	interface	static	void
char	finally	long	strictfp	volatile
class	float	native	super	while
const	for	new	switch	
continue	goto	package	synchronized	

<br>

## IDENTIFICADORES

<br>

- Identificadores são rótulos / ou labels que os programadores utilizam para atribuir dados ou endereços.

<br>

<h3>Regras para a criação de identificadores:</h3>

- O 1º caractere deve ser uma letra;
- Não pode conter símbolos %, #;
- Não pode conter espaços;
- São Case Sensitive;
- Não podem ser palavras reservadas.

<br>

## CHAVES, PONTO E VIRGULA, ESPAÇOS …

<br>

- Chaves: um bloco é um conjunto de instruções delimitadas por {};
- Ponto e vírgula: uma declaração consiste de uma ou mais linhas de código, que terminada por um ‘;’ ;
- Vírgula: delimitador de dados;
- Espaços em branco: separa palavras chaves e identificadores.

<br>

## TIPOS DE DADOS PRIMITIVOS

<br>

A linguagem Java possui oito tipos básicos de dados, denominados tipos primitivos, que podem ser agrupados em quatro categorias:

<br>

- Tipos Inteiros
- Tipos Ponto Flutuante
- Tipo Caractere
- Tipo Lógico

<br>

## CARACTERES DE TERMINAÇÃO

<br>

REPRESENTAÇÃO	SIGNIFICADO

<br>

- \n	Pula linha (newline ou linefeed)
- \r	Retorno de carro (carriage retunr)
- \b	Retrocesso (backspace)
- \t	Tabulação (horizontal tabulation)
- \f	Nova página (formfeed)
- \’	Apóstrofe
- \”	Aspas
- \\	Barra invertida
- \u223d	Caractere UNICODE 233D
- \g37	Octal
- \fca	Hexadecimal

<br>

## OPERADORES

<br>

Quando utilizar operadores de atribuição, o operando da direita deve ser compatível com o operando da esquerda.

<br>

#### int x = 1;
- boobean b;
- b = x; esta não é uma atribuição compatível  - um valor é int e o outro é boolean

#### int x = 2;
- double d;
- d = x ; // esta é uma atribuição compatível.

#### String s = “A”;
- char c;
- c = s;
- // esta não é uma atribuição compatível -  c é um tipo primitivo e s é uma referência a um objeto String

<br>

## OPERADORES ARITMÉTICOS

<br>

### OPERADOR	SIGNIFICADO	EXEMPLO
1. (+) Adição	a + b
2. (-)	Subtração	a - b
3. (*)	Multiplicação	a * b
4. (/)	Divisão	a / b
5. (%)	Resto da divisão inteira	a % b
6. (-)	Sinal negativo (- unitário)	-a
7. (+)	Sinal positivo (+ unitário)	 +a
8. (++)	Incremento unitário	++a ou a++
9. (--)	Decremento unitário	--a ou a--

<br>

## PRECEDÊNCIA DE OPERADORES

<br>

- Java realiza as operações em uma ordem específica.
- Esta ordem é baseada na precedência dos operadores.
- Precedência é um conjunto de regras que o Java impõe no uso de todos os operadores.
- Exemplo: num = 5 + 15 * 2

<br>

## COMPARAÇÃO E OPERADORES LÓGICOS

<br>

###OPERADOR	SIGNIFICADO	EXEMPLO

<br>

1. (= =) Igual	a == b
2. (! =) Diferente	a ! = b
3. (> =) Maior que a > b
4. (> =) Maior ou igual a 	a > = b
5. (<) Menor que a < b
6. (< =) Menor ou igual a 	a < = b

<br>
<br>

#### Assumindo que a variável z recebeu numa atribuição o valor 12, apresente o resultado das expressões
1. z > 3 && z > 6	TRUE
2. z > 3 && z < 20	TRUE
3. z> 3 && z < 0	FALSE
#### A variável z recebeu o valor 2
1. z > 3 && z > 6	FALSE
2. z > 0 && z > 1	TRUE
3. z <7 && z == 2	TRUE
#### A variável z recebeu o valor 5
1. z > 6 || z == 5	TRUE
2. z < 3 || z > 4	TRUE
3. z > = 0 || z < 2	TRUE

<br>


## Cada Dado do tipo Primitivo possui um Dado do tipo Objeto, com nomes iniciado com letras maiúsculas:

- Int = Integer
- double = Double
- float = Float
- char = Character
- boolean = Boolean
- String já é um Dado do tipo Objeto

<p align="center">
  <a href="https://opensource.org/licenses/MIT">
    <img src="https://img.shields.io/badge/License-MIT-blue.svg" alt="License MIT">
  </a>
</p>
