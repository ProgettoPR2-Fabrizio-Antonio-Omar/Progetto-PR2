# Progetto2015

## Componenti del gruppo
* Fabrizio Nurchi
* Antonio Nuvoli
* Omar Pani
prova
prova

### Funzione Semplice
**NOME:** GRADI 
**CATEGORIA:** Matematica 
**FUNZIONAMENTO:** Converte i radianti in gradi. 
**SINTASSI:**
```
GRADI(Numero)
```
**Numero** è l'angolo espresso in radianti da convertire in gradi.
**ESEMPIO:**
```= GRADI(PI.GRECO())``` restituisce 180 gradi.

### Funzione Complessa
**NOME:** MATR.TRASPOSTA
**CATEGORIA:** Matrice
**FUNZIONAMENTO:** Traspone le righe e le colonne di una matrice.
**SINTASSI:** 
```
MATR.TRASPOSTA(Matrice)
```
Il parametro **Matrice** rappresenta la matrice del foglio elettronico da trasporre.
A inizio pagina sono disponibili ulteriori informazioni.
**ESEMPIO:**
Nel foglio elettronico, selezionate l'area in cui dovrà comparire la matrice trasposta. Se la matrice originale contiene "n" righe e "m" colonne, l'area selezionata deve contenere almeno "m" righe e "n" colonne. Digitate direttamente la formula, selezionate la matrice originale e premete Maiusc+Ctrl+Invio. In alternativa, se state usando la **Creazione guidata funzione**, selezionate la casella di controllo **Matrice**. La matrice trasposta compare nell'area di destinazione selezionata e viene protetta automaticamente dalle modifiche.

### Funzione Custom
**NOME:** EVERYWHEREWIKI
**CATEGORIA:** Testo
**FUNZIONAMENTO:** Restiuisce il contenuto di una pagina Wikipedia con eventuale traduzione dello stesso.
**SINTASSI:** 
```
EVERYWHEREWIKI("Link della pagina Wikipedia")
``` 
```
EVERYWHEREWIKI("Titolo della pagina Wikipedia", "Prefisso della lingua")
``` 
**ESEMPIO:**
```
=EVERYWHEREWIKI("https://it.wikipedia.org/wiki/Italia")
``` restiuisce il contenuto della pagina Wikipedia "Italia".
```
=EVERYWHEREWIKI("Alan Turing","it")
``` restituisce il contenuto, in lingua italiana, della pagina Wikipedia "Alan Turing".
**FUNZIONAMENTO DETTAGLIATO:**

**SCELTE IMPLEMENTATIVE E LIBRERIE UTILIZZATE:**
