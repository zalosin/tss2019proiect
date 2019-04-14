
Să se scrie un program Java, precum şi cerințele (specificația) acestuia.

>Fie N si un vector de N elemente. Se dau numerele a,b,c. Sa se afiseze cate numere din vector sunt o combinatie artimetica a numerelor a,b,c

    solve(n,arr,a,b,c)

1. Pe baza cerințelor programului, să se genereze date de test folosind metode funcționale:`<br>
(a) partiționare în clase de echivalenţă<br>
    > pentru n 3 clase de echivalenta<br>
        N_1 = 1..100<br>
        N_2 = { n | n < 1 }<br>
        N_3 = { n | n > 100 }<br>
        
    > pentru iesiri 2 clase<br>
        O_1 = 0<br>
        O_2 = { x | 0 < x < n}<br>

    deci clasele de echivalenta pentru tot programul sunt <br>
    >C_11 = { n,arr,a,b,c | n \in N_1, |arr| = n, (a,b,c) \in O_1 }<br>
    >C_12 = { n,arr,a,b,c | n \in N_1, |arr| = n, (a,b,c) \in O_2 }<br>
    >C_21 = { n,arr,a,b,c | n \in N_2, |arr| = n, (a,b,c) \in O_1 }<br>
    >C_32 = { n,arr,a,b,c | n \in N_3, |arr| = n, (a,b,c) \in O_1 }<br>
    
    (b ) analiza valorilor de frontieră,<br>
    > pentru N avem valori de frontiera : 0,1,100,101 deci<br>
        N_1 : 1,100<br>
        N_2 : 0<br>
        N_3 : 101<br>
    >pentru iesire avem 2 valori de frontiera 0,n<br>
        O_1 : 0<br>
        O_2 : n<br>
    
    (c ) partiționare în categorii.<br>
    > n : <0, 0, 1, 2..99, 100, 101, >101<br>
     arr : lungime minima, maxima sau intermediara<br>
     a,b,c : <0, 0, >0<br>

    > n <br>
		>1) {n | n < 0}<br>
        >2) 0<br>
        >3) 1<br>
        >4) 2..99<br>
        >5) 100<br>
        >6) 101<br>
        >7) (>) 101<br>

    > v<br>
        1) {arr | |arr| = 1}<br>
        2) {arr | 1 < |arr| < 100}<br>
        3) {arr | |arr| = 100}<br>

    > a<br>
        1) a < 0<br>
        2) a = 0<br>
        3) a > 0<br>
        
    > b<br>
        1) b < 0<br>
        2) b = 0<br>
        3) b > 0<br>
        
    > c<br>
        1) c < 0<br>
        2) c = 0<br>
        3) c > 0<br>

    Vom implementa:
		 

>n1<br>
>         n2<br>
>         n3v1a1b1c1<br>
>         n3v1a2b1c1<br>
>         n3v1a3b1c1<br>
>         n3v1a1b2c1<br>
>         n3v1a1b3c1<br>
>         n3v1a1b1c2<br>
>         n3v1a1b1c3<br>
>         n4v2a1b1c1<br>
>         n4v2a2b1c1<br>
>         n4v2a3b1c1<br>
>         n4v2a1b2c1<br>
>         n4v2a1b3c1<br>
>         n4v2a1b1c2<br>
>         n4v2a1b1c3<br>
>         n5v3a1b1c1<br>
>         n5v3a2b1c1<br>
>         n5v3a3b1c1<br>
>         n5v3a1b2c1<br>
>         n5v3a1b3c1<br>
>         n5v3a1b1c2<br>
>         n5v3a1b1c3<br>
>         n6<br>
>         n7<br>

    Să se implementeze cele 3 seturi de test obținute folosind JUnit.

2. Să se transforme programul într-un graf orientat şi, pe baza acestuia, să se genereze date de
test care realizează acoperire la nivel de
![Graph](/Images/Graph.png "Graful programului")<br>
(a ) instrucțiune,   <br>
![instructiune](/Images/nivel_instructiune.png "Nivel Instructiune")<br>
(b ) decizie<br>
![decizie](/Images/decizii.png "Nivel decizie")<br>
(c ) condiție.<br>
![conditie](/Images/condition_1.png "Nivel conditie")<br>
![conditie2](/Images/condition_2.png "Nivel conditie")<br>

    Să se implementeze cele 3 seturi de test folosind JUnit.<br>

3. Să se calculeze complexitatea programului folosind formula lui McCabe, precum şi
numărul de circuite independente.<br>

    >arce => e = 12<br>
    noduri => n = 10<br>
    nr de circuite linear independente => V(G) = e-n+1 = 12-10+1 = 1<br>

4. Să se propună un set de teste care să realizeze o acoperire la nivel de cale şi să se
implementeze setul de test rezultat în JUnit.<br>

5. Să se folosească un generator de mutanți (e.g. MuJava/Muclipse sau alt utilitar pentru a crea
mutanți pentru programul dat.<br>

    >Am folosit Pitest.<br>

6. Să se ruleze seturile de test de la punctele 1), 2) si 4) contra mutanților generați şi să se
explice rezultatele.<br>

7. Să se creeze teste suplimentare pentru a omorî 2 dintre mutanții neechivalenți rămași în
viață.<br>
