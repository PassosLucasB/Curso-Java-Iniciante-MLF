CURSO DE JAVA INICIANTE - Aulas do Canal Matheus Leandro Ferreira
Link dos vídeos (https://www.youtube.com/watch?v=RR5EGltxbl8&list=PLCUSYmPGwekcSVuf64MKje9nVf2wpToNF&index=2&t)



PLATAFORMA JAVA


- Java SE (Java Platform, Standard Edition). É a base da plataforma; inclui o ambiente de execução e as bibliotecas comuns.

- Java EE (Java Platform, Enterprise Edition). A edição voltada para o desenvolvimento de aplicações corporativas.

- Java ME (Java Platform, Micro Edition). A edição para o desenvolvimento de aplicações para dispositivos móveis e embarcados.

Este curso utiliza a versão SE


FERRAMENTAS PARA DESENVOLVIMENTO

- IntelliJ
- Eclipse
-NetBeans
- Visual Studio Code


ESTRUTURA DE UM PROGRAMA EM JAVA

public class HelloWorld {
	public static void mains(String[] args) {
		System.out.println(“Olá, mundo!”);
}
}


QUADRO DE PALAVRAS RESERVADAS

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


IDENTIFICADORES

Identificadores são rótulos / ou labels que os programadores utilizam para atribuir dados ou endereços.

Regras para a criação de identificadores:

- O 1º caractere deve ser uma letra;
- Não pode conter símbolos %, #;
- Não pode conter espaços;
- São Case Sensitive;
- Não podem ser palavras reservadas.


CHAVES, PONTO E VIRGULA, ESPAÇOS …


- Chaves: um bloco é um conjunto de instruções delimitadas por {};
- Ponto e vírgula: uma declaração consiste de uma ou mais linhas de código, que terminada por um ‘;’ ;
- Vírgula: delimitador de dados;
- Espaços em branco: separa palavras chaves e identificadores.


TIPOS DE DADOS PRIMITIVOS

A linguagem Java possui oito tipos básicos de dados, denominados tipos primitivos, que podem ser agrupados em quatro categorias:

- Tipos Inteiros
- Tipos Ponto Flutuante
- Tipo Caractere
- Tipo Lógico


CARACTERES DE TERMINAÇÃO

REPRESENTAÇÃO	SIGNIFICADO
\n	Pula linha (newline ou linefeed)
\r	Retorno de carro (carriage retunr)
\b	Retrocesso (backspace)
\t	Tabulação (horizontal tabulation)
\f	Nova página (formfeed)
\’	Apóstrofe
\”	Aspas
\\	Barra invertida
\u223d	Caractere UNICODE 233D
\g37	Octal
\fca	Hexadecimal


OPERADORES

Quando utilizar operadores de atribuição, o operando da direita deve ser compatível com o operando da esquerda.

int x = 1;
boobean b;
b = x; esta não é uma atribuição compatível  - um valor é int e o outro é boolean

int x = 2;
double d;
d = x ; // esta é uma atribuição compatível.

String s = “A”;
char c;
c = s;
// esta não é uma atribuição compatível -  c é um tipo primitivo e s é uma referência a um objeto String


OPERADORES ARITMÉTICOS

OPERADOR	SIGNIFICADO	EXEMPLO
+	Adição	a + b
-	Subtração	a - b
*	Multiplicação	a * b
/	Divisão	a / b
%	Resto da divisão inteira	a % b
-	Sinal negativo (- unitário)	-a
+	Sinal positivo (+ unitário)	 +a
++	Incremento unitário	++a ou a++
--	Decremento unitário	--a ou a--


PRECEDÊNCIA DE OPERADORES

- Java realiza as operações em uma ordem específica.
- Esta ordem é baseada na precedência dos operadores.
- Precedência é um conjunto de regras que o Java impõe no uso de todos os operadores.
Exemplo: num = 5 + 15 * 2



COMPARAÇÃO E OPERADORES LÓGICOS

OPERADOR	SIGNIFICADO	EXEMPLO
= =	Igual	a == b
! =	Diferente	a ! = b
>	Maior que 	a > b
> =	Maior ou igual a 	a > = b
<	Menor que	a < b
< =	Menor ou igual a 	a < = b

OPERADOR	Expressão 1	Expressão 2
< Menor que	3 < 8	TRUE	8 > 3	TRUE
> Maior que	2 > 4	FALSE	4 > 2	TRUE
= = Igual a	 7 = = 8	FALSE	7 = = 7	TRUE
< = Menor que ou igual a	5 < = 5	TRUE	 8< = 6	FALSE
> = Maior que ou igual a	7 > = 3	TRUE	1 > = 2	FALSE
! = diferente	 5 ! = 5	FALSE	4 ! = 3	TRUE

Assumindo que a variável z recebeu numa atribuição o valor 12, apresente o resultado das expressões
z > 3 && z > 6	TRUE
z > 3 && z < 20	TRUE
z> 3 && z < 0	FALSE
A variável z recebeu o valor 2
z > 3 && z > 6	FALSE
z > 0 && z > 1	TRUE
z <7 && z == 2	TRUE
A variável z recebeu o valor 5
z > 6 || z == 5	TRUE
z < 3 || z > 4	TRUE
z > = 0 || z < 2	TRUE


Cada Dado do tipo Primitivo possui um Dado do tipo Objeto, com nomes iniciado com letras maiúsculas:

Int = Integer
double = Double
float = Float
char = Character
boolean = Boolean
= String

