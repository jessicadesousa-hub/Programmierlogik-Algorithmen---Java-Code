ALGORITMO: 
DESCRIÇÃO:
-------------------------------------------------------
algoritmo "ResultadoProva"
var

   G: vetor[1..5] de caracter
   RA: vetor[1..5] de caracter
   A: vetor[1..3] de caracter
   CA: inteiro
   S, MT: real
   Nota: vetor[1..3] de real

Procedimento CadastroGabarito()
var
   QG : inteiro
inicio

      escreval("PASSO 1 - Cadastro de Gabarito")
      escreval("------------------------------")

      para QG <- 1 ate 5 faca
           escreval("Questao ", QG, ":")
           Leia(G[QG])
      FimPara
Fimprocedimento

Funcao CadastraProva(): Real
var
   c: inteiro
   NA: real
inicio
      NA <- 0
      escreval("Respostas dadas:")
      Para c <- 1 ate 5 faca
           escreval("Questao ", c, ":")
           leia(RA[c])
           Se (Maiusc(RA[c]) = Maiusc(G[c])) entao
              NA<- NA+2
           fimse
      fimpara
      Retorne NA
Fimfuncao

inicio
         CadastroGabarito()
para CA <- 1 ate 3 faca
LimpaTela
escreval("---------------")
escreval("Aluno ", CA, ":")
escreval("---------------")
escreva("Nome:")
leia(A[CA])
nota[CA] <- CadastraProva()
         S <- S + Nota[CA]
    FimPara



Limpatela
escreval("NOTAS FINAIS")
escreval("-----------------------")
 Para CA <- 1 ate 3 faca
 escreval(A[CA]:10, Nota[CA]:4:1)
 fimpara
 MT <- S/3

 escreval("-----------------------")
 Escreval("Media da turma:", MT:4:1)

fimalgoritmo