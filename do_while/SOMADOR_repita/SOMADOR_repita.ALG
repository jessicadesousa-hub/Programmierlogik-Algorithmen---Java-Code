ALGORITMO: "super_contador"
DESCRIÇÃO: Soma valores digitados pelo usuário. do/while
-------------------------------------------------------

var V, S: inteiro
resp: caracter

inicio
S <- 0
  repita
  escreva("Digite um valor: ")
  leia (V)
  s <- S + V
  escreval("Deseja continuar? [S/N]")
  leia (resp)
  até (resp = "N")

 escreval("A soma de todos os valores digitados e ", S)
fimalgoritmo