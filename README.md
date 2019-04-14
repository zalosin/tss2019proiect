Să se scrie un program Java, precum şi cerințele (specificația) acestuia.

>Fie N si un vector de N elemente. Se dau numerele a,b,c. Sa se afiseze cate numere din vector sunt o combinatie artimetica a numerelor a,b,c

    solve(n,arr,a,b,c)

1. Pe baza cerințelor programului, să se genereze date de test folosind metode funcționale:`
(a) partiționare în clase de echivalenţă
    > pentru n 3 clase de echivalenta
        N_1 = 1..100
        N_2 = { n | n < 1 }
        N_3 = { n | n > 100 }
        
    > pentru iesiri 2 clase
        O_1 = 0
        O_2 = { x | 0 < x < n}

    deci clasele de echivalenta pentru tot programul sunt 
    >C_11 = { n,arr,a,b,c | n \in N_1, |arr| = n, (a,b,c) \in O_1 }
    >C_12 = { n,arr,a,b,c | n \in N_1, |arr| = n, (a,b,c) \in O_2 }
    >C_21 = { n,arr,a,b,c | n \in N_2, |arr| = n, (a,b,c) \in O_1 }
    >C_32 = { n,arr,a,b,c | n \in N_3, |arr| = n, (a,b,c) \in O_1 }
    
    (b ) analiza valorilor de frontieră,
    > pentru N avem valori de frontiera : 0,1,100,101 deci
        N_1 : 1,100
        N_2 : 0
        N_3 : 101
    >pentru iesire avem 2 valori de frontiera 0,n
        O_1 : 0
        O_2 : n
    
    (c ) partiționare în categorii.
    > n : <0, 0, 1, 2..99, 100, 101, >101
     arr : lungime minima, maxima sau intermediara
     a,b,c : <0, 0, >0

    > n 
        1) {n | n < 0}
        2) 0
        3) 1
        4) 2..99
        5) 100
        6) 101
        7) (>) 101

    > v
        1) {arr | |arr| = 1}
        2) {arr | 1 < |arr| < 100}
        3) {arr | |arr| = 100}

    > a
        1) a < 0
        2) a = 0
        3) a > 0
        
    > b
        1) b < 0
        2) b = 0
        3) b > 0
        
    > c
        1) c < 0
        2) c = 0
        3) c > 0

    Vom implementa:
    >    n1
        n2
        n3v1a1b1c1
        n3v1a2b1c1
        n3v1a3b1c1
        n3v1a1b2c1
        n3v1a1b3c1
        n3v1a1b1c2
        n3v1a1b1c3
        n4v2a1b1c1
        n4v2a2b1c1
        n4v2a3b1c1
        n4v2a1b2c1
        n4v2a1b3c1
        n4v2a1b1c2
        n4v2a1b1c3
        n5v3a1b1c1
        n5v3a2b1c1
        n5v3a3b1c1
        n5v3a1b2c1
        n5v3a1b3c1
        n5v3a1b1c2
        n5v3a1b1c3
        n6
        n7

    Să se implementeze cele 3 seturi de test obținute folosind JUnit.

2. Să se transforme programul într-un graf orientat şi, pe baza acestuia, să se genereze date de
test care realizează acoperire la nivel de
![Graph](/Images/Graph.png "Graful programului")
(a ) instrucțiune,   
![instructiune](/Images/nivel_instructiune.png "Nivel Instructiune")
(b ) decizie
![decizie](/Images/decizii.png "Nivel decizie")
(c ) condiție.
![conditie](/Images/condition_1.png "Nivel conditie")
![conditie2](/Images/condition_2.png "Nivel conditie")

    Să se implementeze cele 3 seturi de test folosind JUnit.

3. Să se calculeze complexitatea programului folosind formula lui McCabe, precum şi
numărul de circuite independente.

    >arce => e = 12
    noduri => n = 10
    nr de circuite linear independente => V(G) = e-n+1 = 12-10+1 = 1

4. Să se propună un set de teste care să realizeze o acoperire la nivel de cale şi să se
implementeze setul de test rezultat în JUnit.

5. Să se folosească un generator de mutanți (e.g. MuJava/Muclipse sau alt utilitar pentru a crea
mutanți pentru programul dat.

    >Am folosit Pitest.

6. Să se ruleze seturile de test de la punctele 1), 2) si 4) contra mutanților generați şi să se
explice rezultatele.

7. Să se creeze teste suplimentare pentru a omorî 2 dintre mutanții neechivalenți rămași în
viață.
