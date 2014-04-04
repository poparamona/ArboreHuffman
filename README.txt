Codificarea binara a unui text folosind Arbori Huffman in java :

Pentru rezolvarea temei am avut nevoie de clasa Nodb in care am construit nodurile arborelui Huffman astfel: 
Am folosit getter si setter atat pentru valuare si caracter cat si pentru valoarea de stanga si de dreapta.
O functie compar care compara nodul curent cu nodul "a" si returneaza o valuare mai mica decat zero daca numarul de aparitii ale nodului curent este mai mare ca nod "a" sau daca this.getcar este mai in fata alfabetic decat "a" 
O functie isLeaf care verifica daca nodul este frunza sau nu.
Am mai avut nevoie de doi constructori: unul pentru caracter si valuare iar altul pentru nodul stang si drept 

Clasa arbore contine functii necesare pentru construirea vectorului de noduri si a arborelui.
Functia insNod insereaza nodul "n" in vectorul de noduri astfel: daca vectorul este gol adauga nodul "n". Daca are elemente il parcurge si face insert sort: cand gaseste primul mai mare ca el le muta la dreapta si insereaza in locul lui
Functia CombNod combina doua noduri din vector creand un nou nod si elimina cele doua noduri din vector pe care le-am combinat.
Functia rad apeleaza functia conbina nod pana ramane decat nodul radacina in vectorul de noduri
vectnod primeste un sir de caractere si returneaza vectorul de noduri asociat sirului .  Creaza nod daca nu exista si incrementeaza numarul de aparitii(valuarea) daca exista 
		 
Clasa codificare codifica un sir de caractere citit de la stdin utulizand arborele Huffman
Clasa codificare contine constructorul codificare, constructor ce primeste sir de caractere si afisaza secventa de biti. Intre <caracter> <secventa codificara> si sirul codificat afisaja caracterul punct
Functia CreareCoduri: Daca nodul este frunza afisaza codul asci al caracterului urmat de spatiu si codul caracterului. Daca nu este frunza creaza codul adaugand "0" pe ramura stanga si "1" pentru ramura dreapta

Clasa decodificare contine functia caracter unde : Parcurg "s" cu "k" pana la caracterul spatiu si salvez in stringul "x" initial vid codul asci al caracterului. Apoi parcurg cu "i" sirul 's' si daca gasesc caracterul "0" ma duc in ramura din stanga ,iar daca noddul din stanga nu exista il creez. Acelasi lucru in dreapta daca gasesc "1" 
Functia secventa Daca in sirul "s" gasesc "1" ma duc pe ramura dreapta altfel daca gasesc "0" ma duc pe ramura stanga.Daca nu exista nod nici in stanga nici in dreapta afisez caracterul.

Clasa Main permite testarea temei(codificarea si decodificarea). Pentru citirea de la stdin am folosit clasa Scanner











