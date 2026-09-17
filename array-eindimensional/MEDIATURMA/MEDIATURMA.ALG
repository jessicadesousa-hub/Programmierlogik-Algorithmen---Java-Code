ALGORITMO: "MediaTurma" 
DESCRIÇÃO: Calcula a nota média da turma e identifica quantos alunos tem média acida da turma. Array
-------------------------------------------------------

var
   nome: vetor[1..4] de Caracter
   n1: vetor [1..4] de real
   n2: vetor[1..4] de real
   m: vetor[1..4] de real
   SomaM, MTurma: real
   i, Tot: inteiro
inicio
      Para i <- 1 ate 4 faca
           escreval("ALUNO ",i)
           escreval("Nome: ")
           Leia (nome[i])
           escreval("Primeira nota: ")
           Leia (n1[i])
           escreval("Segunda nota: ")
           Leia (n2[i])
           m[i] <- (n1[i]+n2[i])/2
           SomaM <- SomaM + m[i]
      FimPara
MTurma <- SomaM/4

LimpaTela

escreval("LISTAGEM DE ALUNOS")
escreval("------------------")
Para i <- 1 ate 4 faca
     escreval(nome[i]:15, m[i]:4:1)
     se m[i] > MTurma entao
        Tot <- Tot+1
     Fimse
FimPara
Escreval("Ao todo temos ", Tot, " alunos acima da media da turma que é ", MTurma:4:1)

fimalgoritmo