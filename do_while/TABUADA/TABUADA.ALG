ALGORITMO: "Tabuada" 
DESCRIÇÃO: Exibe tabuada de número escolhido pelo usuário. do/while
-------------------------------------------------------

var  cont, N, R: inteiro

inicio
cont <- 1
escreva("Quer ver a tabuada de qual numero?")
leia (N)

repita
      R <- (cont * N)
      escreval (cont, "x", N, "=", R)
      cont <- cont + 1
 até cont > 10

fimalgoritmo