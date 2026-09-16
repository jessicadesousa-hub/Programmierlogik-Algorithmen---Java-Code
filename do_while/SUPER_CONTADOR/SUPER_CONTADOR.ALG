ALGORITMO:"super_contador" 
DESCRIÇÃO: Contador progressivo ou regressivo após selecao em menu. do/while
-------------------------------------------------------

var R: caracter
CONT: INTEIRO

inicio
repita
escreval("================")
escreval("|     MENU     |")
escreval("================")
escreval("[1] De 1 a 10")
escreval("[2] De 10 a 1")
escreval("[3] Sair")
escreval("================")
leia (R)
cont <- 0
     se (R = "1")  entao
        repita
          cont <- cont + 1
          escreval(cont)
        ate (cont = 10)

     senao
          cont <- 11

        se (R = "2")  entao
           repita
             cont <- cont - 1
             escreval(cont)
             ate (cont = 1)

          senao
               se (R = "3") entao
               escreval("Saindo...")

                fimse
          fimse
     fimse
ate R = "3"
fimalgoritmo