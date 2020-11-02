# Multithreading

Gör ett program som består av tre klasser:

En huvudklass med en main-metod
En trådad klass T1 som ärver av klassen Thread
En trådad klass T2 som implementerar interfacet Runnable
När huvudklassen körs ska den:

Skapa och starta en tråd från klass T1
Vänta i 5 sekunder
Skapa och starta en tråd från klass T2
Vänta i 5 sekunder
Stoppa tråden från klass T1
Vänta i 5 sekunder
Stoppa tråden från klass T2
