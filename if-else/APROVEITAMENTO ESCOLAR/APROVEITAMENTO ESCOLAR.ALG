ALGORITMO: "Aproveitamento escolar"
DESCRIÇÃO: Calcula Média de notas escolares e indica o nível de aproveitamento. If/else
-------------------------------------------------------
algoritmo "Aproveitamento escolar"
var
   N1, N2, Media: Real


inicio
Escreval("Qual a primeira nota?")
leia (N1)
escreval("Qual a segunda nota?")
leia (N2)
Media <- (N1 + N2) / 2
Escreval("Media: ", Media)
se (Media <= 10) e (Media >= 9) entao
   escreval("Aproveitamento A")
senao
     se (Media >= 8) e (Media < 9) entao
        escreval("Aproveitamento B")
     senao
          se (Media >= 7) e (Media < 8) entao
             escreval("Aproveitamento C")
          senao
               se (Media >= 6) e (Media < 7) entao
                  escreval("Aproveitamento D")
               senao
                    se (Media >= 5) e (Media < 6) entao
                       escreval("Aproveitamento E")
                    senao
                         se (Media < 5) entao
                            escreval("Aproveitamento F")

                         fimse
                    fimse
               fimse
          fimse
     fimse
Fimse
fimalgoritmo