ALGORITMO: "identificador_numeros_primos"
DESCRIÇÃO: Identifica números primos inseridos pelo usuário. do/while
-------------------------------------------------------

var c, N, contDiv: inteiro

inicio
C <- 1
contDiv <- 0
escreval("Digite um numero: ")
leia (N)
repita
  escreval(C)
             se (N % C = 0) entao
             contDiv <- contDiv + 1
             fimse
  c <- c +1
  ate (C > N)
  escreval("Ao todo existem ", contdiv, " valores divisiveis.")

  se (contdiv > 2) entao
  escreval("Este nao é um numero primo")
  senao
  escreval("Este é um numero primo")
  fimse

fimalgoritmo
