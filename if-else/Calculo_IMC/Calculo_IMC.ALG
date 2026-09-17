ALGORITMO: IMC
DESCRIÇÃO: Calcula o IMC e apresenta diagnóstico sobre o peso. if/else
-------------------------------------------------------
algoritmo "IMC_2"
var
   P, A, IMC: real

inicio
escreva("Qual seu peso?")
leia (P)
escreva("Qual sua altura?")
leia (A)
IMC <- P / (A ^ 2)
escreval("IMC: ", IMC:5:2)
se (IMC < 17) entao
   escreval("Muito abaixo do peso")
senao
     se (IMC >= 17) e (IMC < 18.5)  entao
        escreval("abaixo do peso")
     senao
          se (IMC >= 18.5) e (IMC < 25) entao
             escreval("Peso ideal")
          senao
               se (IMC >= 25) e (IMC < 30) entao
                  escreval("Sobrepeso")
               senao
                    se (IMC >= 30) e (IMC < 35) entao
                       escreval("Obesidade")
                    senao
                         se (IMC >= 35) e (IMC < 40) entao
                            escreval("Obesidade severa")
                         senao
                              escreval("Obesidade Morbida")
                         FimSe
                    FimSe
               FimSe
          FimSe
     FimSe
FimSe

fimalgoritmo