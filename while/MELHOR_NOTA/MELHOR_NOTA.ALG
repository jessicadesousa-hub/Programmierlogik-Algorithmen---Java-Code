ALGORITMO: "Melhor_Nota"
DESCRIÇÃO: Compara notas de alunos para indicar o aluno com a mais alta. while
-------------------------------------------------------

var 
NA, cont: inteiro
A, MelhorA: caracter
N, maior: real

inicio
escreval("Escola Santa Paciencia")
escreval("---------------------")
escreva("Quantos alunos a turma tem?")
leia(NA)
cont <- 1
     enquanto (cont <= NA) faca
     escreval("Aluno", cont)
     Leia(A)
     escreval("Nota de ", A)
     leia(N)
          se (N > maior) entao
          maior <- N
          MelhorA <- A
          fimse
     cont <- (cont + 1)

     
     fimenquanto
escreval("O melhor aproveitamento foi de ", MelhorA )
escreva("com a nota ", Maior)


fimalgoritmo