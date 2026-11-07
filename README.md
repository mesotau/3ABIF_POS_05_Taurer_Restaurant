```
┌──────────────────────────────────────┐
│             Restaurant               │
├──────────────────────────────────────┤
│─ name: String = "UNKN"               │
│─ sitzplaetze: int = 0                │
│─ vegetarisch: boolean = false        │
├──────────────────────────────────────┤
│+ Restaurant(neuName, neuSitzplaetze, │
│  neuVegetarisch)                     │
│+ get/set Methoden                    │
│+ printRestaurant()                   │
└──────────────────────────────────────┘
```
Constructor:  
Erstellen Sie ein neues GitHub-Repository nachname_restaurant.  
Erzeugen Sie die leere Klasse und pushen Sie das Projekt.  
Erzeugen Sie die Get-Methoden und pushen Sie das Projekt.  
Erzeugen Sie die Set-Methoden und pushen Sie das Projekt.  
Erzeugen Sie den Konstruktor und pushen Sie das Projekt.  
Prufen Sie das Repository auf github.com.  

Print:  
Roma Restaurant: 80 Sitzplaetze - true  
Akropolis Restaurant: 60 Sitzplaetze - true  
Steakhouse Restaurant: 100 Sitzplaetze - false  

```
┌───────────────────────────────────────────────────────────────────────────────────────────────────────┐
│                                               Restaurant                                              │
├───────────────────────────────────────────────────────────────────────────────────────────────────────┤
│ - name: String = "UNKN"                                                                               │
│ - vegetarisch: boolean = false                                                                        │
│ - lieferdienst: boolean = false                                                                       │
│ - sitzplaetze: int = 1                                                                                │
│ - tische: int = 15                                                                                    │
├───────────────────────────────────────────────────────────────────────────────────────────────────────┤
│ + Restaurant(neuName, neuVegetarisch, neuLieferdienst, neuSitzplaetze, neuTische)                     │
│ + Restaurant(neuName, neuVegetarisch, neuSitzplaetze)                                                 │
│ + Restaurant(neuName, neuVegetarisch)                                                                 │
│ + Restaurant(neuName, neuLieferdienst, neuSitzplaetze)                                                │
│ + Restaurant(neuName, neuSitzplaetze, neuLieferdienst)                                                │
│ + Restaurant(neuName)                                                                                 │
│ + Restaurant()                                                                                        │
│ + get/set Methoden                                                                                    │
│ + printRestaurant()                                                                                   │
└───────────────────────────────────────────────────────────────────────────────────────────────────────┘
```

MuiltipleConstructor:  
Fügen Sie die fehlenden Eigenschaften hinzu (inkl. get/set und Aufruf im Konstruktor).  
Fügen Sie die oben angeführten Konstruktoren hinzu. Welche Konstruktoren können nicht implementiert werden, 
da sie die gleiche Signatur aufweisen wie ein anderer Konstruktor?  

```
┌────────────────────────────────────────────────┐
│                   Restaurant                   │
├────────────────────────────────────────────────┤
│─ name: String = "UNKN"                         │
│─ sitzplaetze: int = 0                          │
│─ vegetarisch: boolean = false                  │
├────────────────────────────────────────────────┤
│+ Restaurant()                                  │
│+ Restaurant(name, sitzplaetze)                 │
│+ Restaurant(name, sitzplaetze, vegetarisch)    │
│+ getName()                                     │
│+ getSitzplaetze()                              │
│+ getVegetarisch()                              │
│+ setName(name)                                 │
│+ setSitzplaetze(sitzplaetze)                   │
│+ setVegetarisch(vegetarisch)                   │
└────────────────────────────────────────────────┘
```

this:  
Ändern Sie die Parameter der set-Methoden und der Konstruktoren.  
Der Parametername soll von neuEigenschaft (Beispiel: neuName) auf eigenschaft (Beispiel: name) geändert werden.  
In den set-Methoden verwenden Sie den this Operator!  

ifPrint:  
Restaurant: VeggieHouse - 80 Sitzplätze - vegetarisch  
Restaurant: SteakHouse - 120 Sitzplätze - nicht vegetarisch      

JavaDoc_SubString:  
Die Eigenschaft name beinhaltet zwei Informationen, getrennt durch ein Leerzeichen.  

Beispiele: - Wien Steirereck - Graz Landhauskeller - Linz Promenadenhof  
Die Methode getStadt() liefert den Teil der Eigenschaft name vor dem ersten Leerzeichen.  
Die Methode getRestaurantname() liefert den Teil der Eigenschaft name nach dem ersten Leerzeichen.  
Sollte kein Leerzeichen vorkommen, wird eine entsprechende Fehlermeldung ausgegeben.  
Testen Sie beide Methoden einschließlich des Fehlerfalls mit einem JUnit-Test.  

```
┌────────────────────────────────────────────────┐
│                   Restaurant                   │
├────────────────────────────────────────────────┤
│─ name: String = "UNKN"                         │
│─ sitzplaetze: int = 1                          │
│─ vegetarisch: boolean = false                  │
├────────────────────────────────────────────────┤
│+ Restaurant(neuName, neuSitzplaetze,           │
│neuVegetarisch)                                 │
│+ get/set Methoden                              │
│+ getStadt(): String                            │
│+ getRestaurantname(): String                   │
└────────────────────────────────────────────────┘
```

if-Methode:  
Die Eigenschaft sitzplaetze muss zwischen 1 und 1000 liegen.  
Im Fehlerfall geben Sie eine entsprechende Fehlermeldung aus.  
Setzen Sie die Eigenschaft auf den Defaultwert!

JUnit:  
Die Eigenschaft sitzplaetze muss zwischen 1 und 1000 liegen.  
Prüfen Sie im JUnit Test ALLE Fälle!  

```
┌──────────────────────────────────────────┐
│               Restaurant                 │
├──────────────────────────────────────────┤
│ - name: String = "UNKN"                  │
│ - sitzplaetze: int = 1                   │
│ - vegetarisch: boolean = false           │
├──────────────────────────────────────────┤
│ + Restaurant(neuName, neuSitzplaetze,    │
│   neuVegetarisch)                        │
│ + get/set Methoden                       │
└──────────────────────────────────────────┘
```

Formel24:  
Erstellen Sie die Klasse Formel24.  
Die Methode berechne ermittelt das Ergebnis folgender Formel:  
  
z = 5*x*y + 2;  
  
Das Ergebnis z soll zurückgegeben werden.  
Die Methode berechne mit drei Parametern ermittelt die Summe:  
  
e = berechne(b, a) + berechne(c, 4) + berechne(a, c);  
  
Das Ergebnis e soll zurückgegeben werden.  
Ermitteln Sie am Zettel! Welches Ergebnis liefern die Aufrufe?  
  
berechne(1, 3, 5)  
berechne(2, -1, 3)  

Verwenden Sie den Debugger zum schrittweisen Durcharbeiten des Programms!  