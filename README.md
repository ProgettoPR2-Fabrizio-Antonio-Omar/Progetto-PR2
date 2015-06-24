# Progetto2015

## Componenti del gruppo
* Fabrizio Nurchi
* Antonio Nuvoli
* Omar Pani


### Funzione Semplice
**NOME:** GRADI <br>
**CATEGORIA:** Matematica <br>
**FUNZIONAMENTO:** Converte i radianti in gradi. <br>
**SINTASSI:**  <br>
```
GRADI(Numero)
```
*Numero* è l'angolo espresso in radianti da convertire in gradi.<br>
**ESEMPIO:**
```
= GRADI(PI.GRECO())
``` 
restituisce 180 gradi.<br><br><br>

### Funzione Complessa
**NOME:** MATR.TRASPOSTA<br>
**CATEGORIA:** Matrice<br>
**FUNZIONAMENTO:** Traspone le righe e le colonne di una matrice.<br>
**SINTASSI:** <br>
```
MATR.TRASPOSTA(Matrice)
```
Il parametro *Matrice* rappresenta la matrice del foglio elettronico da trasporre.
A inizio pagina sono disponibili ulteriori informazioni.<br>
**ESEMPIO:**<br>
Nel foglio elettronico, selezionate l'area in cui dovrà comparire la matrice trasposta. Se la matrice originale contiene "n" righe e "m" colonne, l'area selezionata deve contenere almeno "m" righe e "n" colonne. Digitate direttamente la formula, selezionate la matrice originale e premete Maiusc+Ctrl+Invio. In alternativa, se state usando la *Creazione guidata funzione*, selezionate la casella di controllo *Matrice*. La matrice trasposta compare nell'area di destinazione selezionata e viene protetta automaticamente dalle modifiche.<br><br><br>

### Funzione Custom
**NOME:** EVERYWHEREWIKI<br>
**CATEGORIA:** Testo<br>
**FUNZIONAMENTO:** Restiuisce il contenuto di una pagina Wikipedia con eventuale traduzione dello stesso.<br>
**SINTASSI:** <br>
```
EVERYWHEREWIKI("Link della pagina Wikipedia")
``` 
```
EVERYWHEREWIKI("Titolo della pagina Wikipedia", "Prefisso della lingua")
``` 
**ESEMPIO:**<br>
```
=EVERYWHEREWIKI("https://it.wikipedia.org/wiki/Italia")
``` 
restiuisce il contenuto della pagina Wikipedia "Italia".<br><br>
```
=EVERYWHEREWIKI("Alan Turing","it")
``` 
restituisce il contenuto, in lingua italiana, della pagina Wikipedia "Alan Turing".<br><br>
**FUNZIONAMENTO DETTAGLIATO:**<br>
Nel caso in cui vengano passati come parametri il *titolo della pagina* e il *prefisso della lingua* la funzione si può ramificare in 3 pattern:<br><br>
1. La pagina cercata dall'utente inserendo il titolo esiste nella lingua specificata dall'utente, a questo punto viene stampato il contenuto della pagina. In caso la pagina non esistesse si passa al punto 2.<br>
**Esempio:** viene cercata la pagina "Italia" in lingua italiana, la pagina viene trovata e ne viene stampato il contenuto così com'è. <br><br>
2. La pagina viene cercata dentro Wikipedia in versione inglese usando lo stesso titolo, se la pagina viene trovata viene stampata tradotta nella lingua specificata originariamente dall'utente. Se la pagina non viene trovata si passa al punto 3.<br>
**Esempio:** viene cercata la pagina "Sabrina Ferilli" in lingua spagnola, la pagina non viene trovata in lingua spagnola dunque si effettua una ricerca utilizzando nuovamente il titolo "Sabrina Ferilli" all'interno di Wikipedia in versione inglese, la pagina viene trovata e viene stampato il contenuto tradotto in lingua spagnola.<br><br>
3. Il titolo della pagina viene tradotto in lingua inglese e la pagina viene cercata dentro Wikipedia in versione inglese utilizzando però il titolo tradotto. Se la pagina viene trovata viene stampata tradotta nella lingua specificata originariamente dall'utente. Se la pagina non viene trovata viene stampato un messaggio di errore.<br>
**Esempio:** questo caso è molto raro. Ipotizzando che la pagina "[Cloroformio](https://it.wikipedia.org/wiki/Cloroformio)" non esista in lingua italiana e l'utente la cercasse in italiano si cade nel secondo pattern. A questo punto la pagina "Cloroformio" viene cercata in inglese ma non viene comunque trovata, questo perché la parola "Cloroformio" non ha nessun significato in lingua inglese; si passa al terzo pattern. Viene tradotta la parola "Cloroformio" in inglese producendo "Chloroform"; viene cercata e trovata la pagina "Chloroform" in inglese, che verrà tradotta in italiano e restituita all'utente.<br><br>


**LIBRERIE UTILIZZATE:**<br>
* [**wiki-java**](https://github.com/mer-c/wiki-java) per effettuare la ricerca delle pagine Wikipedia e per estrapolare il contenuto in HTML.
* [**Jericho HTML Parser**](http://jericho.htmlparser.net/docs/index.html) per convertire l'HTML delle pagine in "plain text" e renderlo leggibile all'utente. E' stato utilizzato questo parser perché, tra quelli provati, forniva una migliore formattazione del testo convertito da HTML.
* [**microsoft-translator-java-api**](https://github.com/boatmeme/microsoft-translator-java-api) per effettuare le traduzioni. Inizialmente avevamo pensato di utlizzare le API di Google Translate ma sembrano essere diventate a pagamento ed è possibile avere un trial di 60 gg solo nel caso di aziende. Abbiamo perciò optato per Bing, che permette 2.000.000 di char al mese gratuitamente.<br><br>

**SCELTE IMPLEMENTATIVE:**<br>
Per quanto riguarda i pattern si è scelto di utilizzare la lingua inglese come alternativa alle ricerche nella lingua specificata dall'utente perché Wikipedia in inglese contiene un numero maggiore di voci.<br><br>
Per le traduzioni si hanno a disposizione 2'000'000 char mensili e speriamo che questo limite non venga oltrepassato con i test. Per questo, abbiamo specificatamente effettuato traduzioni di pagine brevi.<br><br>
Inizialmente avevamo pensato di cercare le pagine non solo in lingua inglese ma in tutte le lingue possibili (o perlomeno nelle versioni di Wikipedia che contengono il maggior numero di voci) ma siamo stati costretti ad abbandonare questa ipotesi a causa della lentezza delle query da parte delle API di Wikipedia utilizzate (circa 5 secondi per ottenere il testo di una pagina). Questo ritardo è dato probabilmente dal fatto che quando si vuole passare alle voci in un'altra lingua bisogna rinizializzare un oggetto di tipo Wiki con il costruttore e rieffettuare il login al database. D'altra parte, ottenere l'HTML delle pagine con una libreria più generica non ci avrebbe permesso di sapere se una pagina esiste o meno.

