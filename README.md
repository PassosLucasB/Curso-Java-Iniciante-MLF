# <h1 align="center"> CURSO DE JAVA INICIANTE</h1>

<h1 align="center">
  <img src="https://cdn.iconscout.com/icon/free/png-256/java-43-569305.png" width="120">
</h1>

<p align="center">Aulas do Canal Matheus Leandro Ferreira.</p>

<br>
<br>

## MÓDULO 1

<br>
<br>

Link dos vídeos (https://www.youtube.com/watch?v=RR5EGltxbl8&list=PLCUSYmPGwekcSVuf64MKje9nVf2wpToNF&index=2&t)

<br>
<br>

## TRILHA 1  - Introdução ao Java e Tipos de Dados


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
<br>
boolean	do	implements	protected	throw
<br>
break	double	import	public	throws
<br>
byte	else	instanceof	return	transient
<br>
case	extends	int	short	try
<br>
catch	final	interface	static	void
<br>
char	finally	long	strictfp	volatile
<br>
class	float	native	super	while
<br>
const	for	new	switch
<br>
continue	goto	package	synchronized	
<br>
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

<br>

- Os Dados Primitivos guardam o valor bruto e são focados em performance, os Dados tipo Objeto (tipos de referência) armazenam endereços de memória, possuindo propriedades e podendo executar métodos.

### SCANNER

```java
import java.util.Scanner;

Scanner sc =  new Scanner(System.in); //sc foi o nome dado ao novo scanner

System.out.println("Digite a nota 1: ");
float nota1 = sc.nextFloat(); //float é o tipo do dado determinado para ser recebido
System.out.println("A nota 1 é: " + nota1);

```
<br>
<br>
<br>

## TRILHA 2  - Estruturas Condicionais

<br>

EXPRESSÃO CONDICIONAL

<br>

- Definição: São intruções que permitem executar diferentes blocos de código conforme uma condição lógica.

<br>
  
  - Exemplo no mundo real: "Se estiver chovendo, leve guarda-chuva. Senão, vá sem ele."

<br>

### IF 

if (condicao) {
	//bloco executado se a condicao for verdadeira

}

Exemplos:

```java


//Somente IF

int idade = 20;
if (idade >= 18) {
	System.out.println("Maior de idade.");
}



// IF e ELSE

int idade = 20;
if (idade >= 18) {
	System.out.println("Maior de idade.");
}else{
	System.out.println("Menor de idade.");
}



// IF, ELSE e ELSE IF

int idade = 85;
if (idade >= 90) {
	System.out.println("Conceito A");
}else if{
	System.out.println("Conceito B");
}else{
	System.out.println("Conceito C ou inferior");
}


```
<br>
<br>
<br>



### SWITCH 
<br>
switch (condicao) {
<br>
	case 1: //bloco executado se a condicao for verdadeira; break;
	<br>
	case 2: //bloco executado se a condicao for verdadeira; break;
	<br>
	case 3: //bloco executado se a condicao for verdadeira; break;
	<br>
	default: //bloco executado se nenhuma condicao for verdadeira
	<br>
}
<br>
Exemplos:
<br>

```java


//Somente IF

int dia = 3;
switch (dia) {
	case 1: System.out.println("Domingo"); break;
	case 2: System.out.println("Segunda"); break;
	default: System.out.println("Outro dua");
}

```
<br>
<br>


DIFERENÇAS ENTRE IF E SWITCH
<br>
<br>
IF = Avalia expressões lógicas, suporta intervalos e é mais flexível.
<br>
SWITCH = Avalia apenas valores fixos, suporta somente igualdades e é mais legível em alguns casos.
<br>
<br>
Erros Comuns
<br>
- Usar = ao invés de ==
- Esquecer chaves {} em blocos maiores
- Colocar ; logo após o if(condição)
- Esquecer o break no switch
<br>
No caso de comparações, ao comparar valores utiliza-se o == ou < ou >, <= ou >=. Mas ao comparar textos utiliza-se equals nomeVariavel.equals("").


<br>
<br>
<br>

## TRILHA 3  - Estruturas de Repetição
<br>
<br>
- Definição: Permitem executar um bloco de código várias vezes, com base em uma condição lógica.

<br>
  
  - Use quando quiser repetir ações como contar, percorrer listas ou esperar uma condição mudar.

<br>
<br>

### TIPOS DE LAÇOS EM JAVA
<br>

Quando usar cada tipo:
<br>
<br>

FOR = quando souber quantas vezes repetir;
<br>
WHILE = quando repetir até a condição mudar;
<br>
D0-WHILE = garante pelo menos uma execução.
<br>
<br>
### FOR
<br>
O laço FOR é uma estrutura de repetição compacta que agrupa três elementos na mesma linha: a inicialização de uma variável, a condição de parada e o incremento (ou decremento).

Foco: Contagem estruturada e interação sobre coleções com tamanhos conhecidos.

- É utilizado para gerenciar repetições com número predefinido de vezes;
- Cria e destrói a variável de controle no próprio cabeçalho;
- Evita loops infinitos acidentais porque obriga o desenvolvedor a colocar o incremento no cabeçalho.

<br>
<br>
ESTRUTURA DO FOR
<br>

```java

for (int i = 0; i<5; i++) {
	System.out.println("O valor de i: "+i);
}

```
int i = 0 -> iniciar o contador em zero
<br>
i < 5 -> condicional (verifica se continua o contador menor que 5)
<br>
i++ -> incrementa após cada repetição


<br>
<br>

### WHILE

<br>


O laço WHILE é uma estrutura de repetição baseada apenas em uma condição lógica. Ele testa a condição antes de executar o bloco de código. Se for verdadeira, ele executa, se for falsa, ele para.

Foco: Repetir um bloco enquanto uma situação externa ou interna for válida, sem número fixo de vezes.

- Gerencia as repetições com quantidade de vezes desconhecida;
- Exige que a variável seja criada antes dele e atualiza centro do bloco;
- Pode causar loops infinitos se o programador esquecer de atualizar a condição dentro das chaves.

<br>
<br>

ESTRUTURA DO WHILE

<br>

```java

int i = 0;
while (i<5){
	System.out.println(i);
	i++;
}

```
int i = 0 -> iniciar o contador em zero
<br>
i < 5 -> condicional (verifica se continua o contador menor que 5)
<br>
i++ -> incrementa após cada repetição

<br>
<br>

### DO-WHILE

<br>


O laço DO-WHILE é uma estrutura de repetição baseada apenas em uma condição lógica. Ele executa o bloco de código e apenas depois avaliar se a condição é verdadeira. Se for verdadeira, ele repete, se for falsa, ele encerra.

Foco: Garantir uma execução obrigatória antes de qualquer verificação lógica.

- Gerenciar as repetições com quantidades de vezes desconhecida;
- Exige que a variável seja criada antes dele e atualizada dentro do bloco;
- Pode causar loops infinitos se o programador esquecer de atualizar a condição dentro das chaves.

Uso ideal: Para menus de sistemas, validação de entradas ou leitura de dados onde você precisa interagir com o usuário antes de decidir se continua.
<br>

ESTRUTURA DO DO-WHILE

<br>

```java

int i = 0;
do{
	System.out.println(i);
	i++;
}while (i<5);

```
int i = 0 -> iniciar o contador em zero
<br>
i < 5 -> condicional (verifica se continua o contador menor que 5)
<br>
i++ -> incrementa após cada repetição


<br>
<br>
<br>

## TRILHA 4  - Vetores e Matrizes

<br>
<br>
<br>
### O QUE É UM VETOR?
<br>
Definição: Um vetor (ou array) é uma estrutura de dados que armazena múltiplos valores do mesmo tipo, em posições consecutivas na memória.
<br>
Pense com uma fila de caixas numeradas, onde cada caixa guarda um valor.

<br>
<br>
SINTAXE BÁSICA
<br>

```java
int[] numeros =  new int[5]; //vetor de 5 posições

```
<br>
Cria (ou estancia) um vetor de inteiros com 5 posições, todas iniciadas com zero.
<br>
numeros[0] = 10;
<br>
numeros[1] = 20;
<br>
numeros[2] = 30;
<br>
numeros[3] = 40;
<br>
numeros[4] = 50.
<br>
<br>
Os índices começam em 0 e vão até o tamanho -1. 
<br>
Nesse caso, o tamanho é 5, porém inicia-se a contagem no 0, logo de 0 a 4.
<br>
<br>
LEMBRETE: No Java os vetores possuem tamanhos fixos e precisam ser inicializados.
<br>
<br>
PERCORRENDO COM FOR:
<br>

```java
for(int i=0, i<numeros.length; i++){
	System.out.println(numeros[i]);
}
```
<br>
Usando o For para alterar um valor específico:
<br>

```java
for(int i=0, i<numeros.length; i++){
	System.out.println(numeros[i]);
	if(i==2){
	numero[i] = 50;
}
}
```
<br>
<br>
LEMBRETE: Use .length para saber o tamanho do vetor.
<br>
<br>
<br>
INICIALIAÇÃO DIRETA


<br>

```java

int[] idades = {18,21,25,30};

//Criação e preenchimento ao mesmo tempo.
String[]nomes = {"Ana", "Joao", "Pedro"};
	for(int i = 0; i<nomes.length; i++){
		System.out.println("Olá, " + nomes[i]);
		}
```
<br>

FOR-EACH EM ARRAYS

<br>

```java

	for(String nome: nomes){
		System.out.println(nome);
		}
```
<br>
<br>
<br>
ATENÇÃO AOS ERROS:
<br>
- Acessar nyumeros[5] (fora do limite);
<br>
- Tentar usar um vetor antes de inicializar;
<br>
- Confundir índice com valor.
<br>
<br>
<br>

### O QUE É UMA MATRIZ?

<br>
Definição: Uma matriz (ou um array bidimensional) é como uma tabela: organiza valores em linhas e colunas.
<br>
Imagine uma planilha do Excel com números e organizados por posição.
<br>
<br>

DECLARAÇÃO DE MATRIZ
<br>

```java
int[] [] matriz =  new int[5] [4];

```
<br>
Cria uma matriz com 3 linhas e 4 colunas.
<br>
Cada elemento é acessado por dois índices: linha e coluna.

<br>
<br>

ATRIBUINDO VALORES
<br>

```java
int[] [] matriz =  new int[5] [4];
matriz[0][0] = 10;
matriz[1][2] = 25;
matriz[2][3] = 40;

```
<br>
<br>

PERCORRENDO COM DOIS FOR
<br>

```java
int[] [] matriz =  new int[5] [4];
matriz[0][0] = 10;
matriz[1][2] = 25;
matriz[2][3] = 40;

for(int i=0; i<3; i++){
	for (int j=0; j<4; j++){
		System.out.println(matriz[i][j] + "");
		}
		System.out.println();
}
```
<br>
Primeiro for -> linhas
<br>
Segundo for -> colunas
<br>
<br>

<br>
INICIALIAÇÃO DIRETA


<br>

```java

int[][]numeros = {
//Criação e preenchimento ao mesmo tempo.
	{1,2,3},
	{4,5,6},
	{7,8,9}
};

```
<br>

<br>
<br>

## MÓDULO 2

<br>
<br>

Link dos vídeos (https://www.youtube.com/watch?v=CbJh4gvmCco e https://www.youtube.com/watch?v=BzyCOEwkPX0&list=PLCUSYmPGwekfNNbgSBsepDqAk1fktpgpf&index=19)

<br>
<br>

## TRILHA 1  - Programação Orientada a Objetos

<br>
<br>

## <h2> ENCAPSULAMENTO E HERANÇA </h2>

<br>
<br>
ENCAPSULAMENTO EM JAVA
<br>
<br>
Consiste em esconder os detalhes internos de implementação de uma classe. Expõe apenas o que é necessário através de métodos públicos.
<br>
Os atributos da classe só poderão ser acessados e modificados por meio de métodos (geralmente conhecidos como getters e setters).
<br>
Os atributos podem ser divididos em três tipos:

<br>

- public = livre acesso
- protected = scesso somente por classes do mesmo pacote
- private = acesso somente dentro da mesma classe
  
<br>
<br>
Exemplo
<br>
<br>

```java

public class Pessoa{
	private String nome;
	private int idade;

//O construtor leva o mesmo nome da classe e passando por parâmetro o nome e a idade
public Pessoa(String nome, int idade){
	this.nome = nome; //Inicializando o atributo nome do objeto Pessoa
	this.idade = idade; //Inicializando o atributo idade do objeto Pessoa
}
//Métodos getters e setters para encapsulamento para acessar os atributos
public String getNome(){
	return nome;
}
public void setNome(String nome){
	this.nome = nome;
}
public String getIdade(){
	return idade;
}
public void setIdade(int idade){
	if(idade > 0{
		this.idade = idade;
	}else{
		throw new IllegalArgumentException("Idade deve ser maior que zero.");}
}
}

```
<br>
<br>
<br>
HERANÇA EM JAVA
<br>
<br>
Herança é um mecanismo que permite criar uma nova classe com a definição de uma classe já existente.
<br>
Quando uma classe herda de outra, todos os métodos e atributos aparecem automaticamente na classe nova.
<br>
A herança permite à classe qua está sendo herdada redefinir qualquer comportamento que não goste (sobreposição).
<br>
Herança normalmente produz subclasses mais especializadas, mais específicas, que as superclasses.
<br>
Uma subclasse guarda a relação "é filho de" ou "é um .." com a superclasse.
<br>
Quando herdamos, devemos nos perguntar se a classe que está sendo herdada é do mesmo tipo da classe herdando.
<br>
A forma básica de herança em Java é a extensão simples sntre uma superclasse e sua classe derivada. Utilizando-se da definição da classe derivada a palavra-chave extends.
<br>
<br>
Exemplo
<br>
<br>


```java

//Subclasse (funcionario que herda de Pessoa)
public class Funcionario extends Pessoa{
private double salario;
}
public Funcionario(String nome, int idade, double salario){
// Chama o construtor da superclasse
super(nome, idade);
this.salario = salario;
}
//Getter e Setter para salario
public double get Salario(){
return salario;
}
public void setSalario(double salario){
if(salario>0){
this.salario = salario;
}else}
throe new IllegalArgumentException("Salário deve ser maior que zero.");}
}
}


```
<br>
<br>
<br>

## <h2> ABSTRAÇÃO E POLIMORFISMO </h2>

<br>
<br>
ABSTRAÇÃO EM JAVA
<br>
<br>
Abstração em Java permite que os desenvolvedores se concentrem em interações de alto nível, ocultando os detalhes complexos. Usada para impor ao desenvolvedor que implemente os métodos da classe herdada.
<br>
<br>
Exemplo
<br>
<br>


```java

//Classe abstrata
public abstract class Pessoa{
	private String nome;
	private int idade;

//Construtor
public Pessoa(Strign nome, int idade){
	this.nome = nome;
	this.idade = idade;
}

//GETTERS E SETTERS
//Método abstrato que deve ser implementado pelas subclasses
public abstract void mostrarProfissao();
}

// Funcionario estente Pessoa e implementa o método abstrato
public class Funcionario extends Pessoa{

	//Implementação do método abstrato
	@Override
	public void mostrarProfissao(){
		System.out.println(“Profissão: Funcionário de uma empresa.”);
}
}

```
<br>
<br>
<br>
POLIMORFISMO EM JAVA
<br>
<br>
Polimorfismo ocorre quando podemos tratar objetos de diferentes subclasses através de uma mesma referência da superclasse. Isso permite que um mesmo método tenha comportamentos diferentes dependendo do objeto que o chama. Utiliza a sobreposição @Override.
<br>
<br>
Exemplo
<br>
<br>


```java

public class TestePolimorfismo{
public static void main(String[] args){
//Criando objetos das subclasses, mas referenciando-os pela superclasse Pessoa
Pessoa pessoa1 = new Funcionario(“Mateus”, 30, 5000.00);
Pessoa pessoa2 = new Estudante(“Lucas”, 20, “Ciência da Computação”);

// Exibindo informações e profissões (polimorfismo)

pessoa1.exibirInformacoes();
pessoa1.mostrarProfissao();

System.out.println(“\n);

pessoa2.exibirInformacoes();
pessoa2.mostrarProfissao();
}
}

```
<br>
<br>
<br>





<p align="center">
  <a href="https://opensource.org/licenses/MIT">
    <img src="https://img.shields.io/badge/License-MIT-blue.svg" alt="License MIT">
  </a>
</p>
