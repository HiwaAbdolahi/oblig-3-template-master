# Obligatorisk oppgave 3 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 

Oppgaven er levert av følgende student:

* Navn: Hiwa Abdolahi, s364547, s364547@oslomet.no Github-Username: HiwaAbdolahi


# Oppgavebeskrivelse
//Oppgave1\\
Jeg startet oppgave 1 med å finne ut om treet var tomt ved rotnoden. 
En ny node med en null-peker til overordnet kan legges til her hvis treet er tomt.
Hvis ikke, krysses treet av en nodepeker p så lenge det ikke er null.
For å sikre at p alltid har en referanse til sin overordnede, 
gjøres dette sammen med en q-peker.
For å sammenligne Generics-verdier, 
bruk comp.compare-metoden.
Når pekeren til slutt når en null-verdi, sjekkes det om verdien skal bli lagt til som høyre eller venstre barn, 
og antall blir til slutt øket med 1 når dette er fullført.
//----------------------------------------------------------//

//Oppgave2\\
For å oppdage duplikater av en variabel i oppgave 2, kjørte jeg gjennom loopen ved hjelp av en while-løkke.
Nodepekeren p forskyves til høyre og tallet heves når verdien vi søker etter er lokalisert fordi dette 
er retningen en verdi som kan være lik må være.
løkken fortsetter til nodepekeren p når 0, noe som betyr at duplikater burde vært ved grenens ende.
//----------------------------------------------------------//

//Oppgave3\\
For å finne den første postordren brukte jeg koden fra 5.1.7 h) i kompendiet.
Her blir en while-løkke brukt til å traversere mot venstre gjennom treet, og første postorden blir funnet 
ved første bladnode som ikke har noen venstre eller høyre barn.
Jeg har tatt utgangspunkt i følgende eksempler for å bestemme neste postordre, 
som det står i kompendiets kapittel 5.1.7:
- Hvis p ikke har noen foreldre, er p postrekkefølgens siste node og rotnoden.
- Hvis p er det høyre barnet til forelderen, er forelder f neste postordre.
- -Hvis p er foreldrenes venstrebarn, er følgende sant:
- Foreldre er følgende postorden hvis p er enebarn  (p.forelder.høyre er null).
- Det høyre barnet til forelderen (p.parent.right) er neste oppføringsrekkefølge 
hvis p ikke er et enebarn (p.parent.right!= null).
  //----------------------------------------------------------//



//--------------Oppgave4-----------------\\
I oppgave 4 brukte jeg den ikke-rekursive metode, og startet ved rotnoden og brukte
en while-løkke for å fremføre en pekernode p langs det binære treet i rekkefølgen 
for oppføring til jeg nådde roten, den siste noden. 
For de rekursive metodene kalte jeg venstre og høyre barn rekursivt før 
jeg krysset det binære treet i postordre-rekkefølge og ga ut verdiene ved 
å bruke utførOppgave.
Når pekeren p når 0, etableres det grunnleggende tilfellet.


//--------------Oppgave5-----------------\\

Jeg laget en ArrayList og en kø i øvelse 5 for serialize()-metoden.
Hver gang en node ble lagt til ArrayList og dermed slettet fra køen, 
ble gjeldende peker flyttet ved hjelp av køen til den påfølgende noden 
i treet i nivårekkefølgen. Når det ikke er flere noder igjen, vil køen 
bli tom og while-løkken vil fortsette å kjøre.
LeggInn()-metoden og en for-løkke brukes i deserialize()-metoden for 
å sette inn verdiene fra en ArrayList i et tomt binært tre.


//--------------Oppgave6-----------------\\
Det ble utviklet tre metoder for oppgave 6. 
For å finne ønsket T-verdi for den første metoden ble det benyttet boolean fjern(T-verdi)
, programkode 5.2.8 d) fra kompendiet.
Deretter bestemmes det om noden har null, ett eller to barn. I de to første tilfellene 
flyttes de overordnede og underordnede pekerne i samsvar med om et barn er til høyre 
eller venstre. For å holde sorteringen i treet konsekvent, hvis noden inneholder to barn,
må vi finne den neste. fjern(value)-metoden kombineres med en teller ved 
bruk av fjernAll()-metoden slik at telleren til slutt returneres sammen 
med antall duplikater som er eliminert.
En privat metode kalt nullstill er lagt til og brukes til å generere den rekursive 
funksjonen nullstill(), som godtar en node som en parameter. 
Noder elimineres på denne måten i følgende rekkefølge: barn, deretter forelder.