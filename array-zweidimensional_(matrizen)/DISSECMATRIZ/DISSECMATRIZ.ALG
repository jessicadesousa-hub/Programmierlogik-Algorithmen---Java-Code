algoritmo "DissecMatriz"
var
   Mat: vetor[1..4, 1..4] de inteiro
   L, C, R: inteiro

Procedimento MostraMatriz1
inicio
   escreval()
   escreval("MATRIZ COMPLETA:")
   para L <- 1 ate 4 faca
      para C <- 1 ate 4 faca
         escreva(Mat[L,C]:4)
      fimpara
      escreval()
   fimpara
fimprocedimento

Procedimento DiagonalPrincipal2
inicio
   escreval()
   escreval("DIAGONAL PRINCIPAL:")
   para L <- 1 ate 4 faca
      para C <- 1 ate 4 faca
         se L = C entao
            escreva(Mat[L,C]:4)
         senao
            escreva("    ")
         fimse
      fimpara
      escreval()
   fimpara
fimprocedimento

Procedimento TriSup3
inicio
   escreval()
   escreval("TRIANGULO SUPERIOR:")
   para L <- 1 ate 4 faca
      para C <- 1 ate 4 faca
         se L < C entao
            escreva(Mat[L,C]:4)
         senao
            escreva("    ")
         fimse
      fimpara
      escreval()
   fimpara
fimprocedimento

Procedimento TriInf4
inicio
   escreval()
   escreval("TRIANGULO INFERIOR:")
   para L <- 1 ate 4 faca
      para C <- 1 ate 4 faca
         se L > C entao
            escreva(Mat[L,C]:4)
         senao
            escreva("    ")
         fimse
      fimpara
      escreval()
   fimpara
fimprocedimento

Procedimento Menu
inicio
   escreval()
   escreval("MENU DE OPCOES:")
   escreval("=======================")
   escreval("[1] Mostrar a Matriz")
   escreval("[2] Mostrar a Diagonal Principal")
   escreval("[3] Mostrar Triangulo Superior")
   escreval("[4] Mostrar Triangulo Inferior")
   escreval("[5] Sair")
   escreva("==== OPCAO: ")
   leia(R)
fimprocedimento

inicio
   para L <- 1 ate 4 faca
      para C <- 1 ate 4 faca
         escreva("Digite o valor para a posicao [", L, ",", C, "]: ")
         leia(Mat[L,C])
      fimpara
   fimpara

   repita
      Menu
      escolha R
         caso 1
            MostraMatriz1
         caso 2
            DiagonalPrincipal2
         caso 3
            TriSup3
         caso 4
            TriInf4
         caso 5
            limpatela
            escreval("ENCERRANDO...")
         outrocaso
            escreval("Opcao invalida!")
      fimescolha
   ate R = 5

fimalgoritmo