package twij.JavaProject.question;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration

public class QuestionConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            QuestionRepository repository){
        return args->{
            Question p1 = new Question(
                    1,
                    "Który z poniższych typów NIE jest referencją:",
                    "double (bo to typ prymitywny)",
                    "int[]",
                    "Character",
                    "Double",
                    "double (bo to typ prymitywny)");
            Question p2 = new Question(
                    2,
                    "Które z poniższych stwierdzeń jest NIEprawdziwe:",
                    "Interfejs może dziedziczyć po interfejsie. Dziedziczone są wówczas zdefiniowane w nim stałe i metody",
                    "Klasa implementująca jakiś interfejs nie może dziedziczyć po innej klasie",
                    "Wewnątrz interfejsu można zadeklarować klasę lub interfejs\n",
                    "Klasa może implementować wiele interfejsów",
                    "Klasa implementująca jakiś interfejs nie może dziedziczyć po innej klasie");
            Question p3 = new Question(
                    3,
                    "Jaki jest wynik kodu: int sum = Arrays.stream(new int[]{1,2,3})\n" +
                    ".filter(i->i>=2)\n .map(i->i*3)\n .sum();\n System.out.print(sum);",
                    "15",
                    "9",
                    "5",
                    "Jest wyrzucany RuntimeException",
                    "15");
            Question p4 = new Question(
                    4,
                    "Jaki jest wynik kodu: System.out.print( 1 < 2 < 3 < 4 );",
                    "Błąd kompilacji",
                    "4",
                    "true",
                    "1",
                    "Błąd kompilacji");
            Question p5 = new Question(
                    5,
                    "Które z poniższych stwierdzeń odnoszących się do biblioteki Swing jest NIEprawdziwe:",
                    "Lekkie komponenty Swing nie są skojarzone z obiektem platformy (oknem, kontrolką) i są zaimplementowane w języku Java",
                    "Komponenty Swing mogą mieć różną postać graficzną, niezależną od platformy",
                    "Ciężkimi komponentami w Swing są kontenery górnego poziomu: JFrame, JDialog i JApplet",
                    "Operacje na komponentach Swing (np. wyświetlanie) są bardziej wydajne, ponieważ nie są zaimplementowane w języku" +
                    "Java, ale odpowiadają za nie funkcje systemowe platformy",
                    "Operacje na komponentach Swing (np. wyświetlanie) są bardziej wydajne, ponieważ nie są zaimplementowane w języku" +
                    "Java, ale odpowiadają za nie funkcje systemowe platformy");
            Question p6 = new Question(
                    6,
                    "Które ze stwierdzeń odnoszących się do monitorów jest NIEprawdziwe:",
                    "Wątek będący właścicielem monitora nie może zostać wywłaszczony w trakcie wykonywania metody synchronicznej",
                    "Jeżeli monitor obiektu ma właściciela, to pozostałe wątki nie mogą wykonywać jego metod synchronicznych",
                    "Wątek będący właścicielem monitora może wywoływać inne metody synchroniczne",
                    "Wątek wykonujący metodę synchroniczną obiektu musi być właścicielem monitora",
                    "Wątek będący właścicielem monitora nie może zostać wywłaszczony w trakcie wykonywania metody synchronicznej");
            Question p7 = new Question(
                    7,
                    "Który fragment kodu poprawnie tworzy kopię tablicy zadeklarowanej jako: int[]tab = {1,2,3,4};","int[] tab2 = new int[] (tab);",
                    "int[] tab2 = new int[tab];","int[] tab2 = (int[])tab.clone();",
                    "int[] tab2 = new int[tab.length]; System.arraycopy(tab, 0, tab2, 0, 3);",
                    "int[] tab2 = (int[])tab.clone();");
            Question p8 = new Question(
                    8,
                    "Które z poniższych zdań jest NIEprawdziwe:",
                    "W metodzie można deklarować zmienne lokalne o takiej samej nazwie, jak formalne parametry metody, ale wyłącznie " +
                    "wewnątrz bloku instrukcji",
                    "Lokalna zmienna może przesłonić atrybuty klasy",
                    "Atrybut zadeklarowany w klasie potomnej może przesłonić atrybut klasy, np. A{int x=7;} i class B extends A{double" +
                    "x=111;}",
                    "Formalnie parametry metody mogą przesłonić atrybuty klasy",
                    "W metodzie można deklarować zmienne lokalne o takiej samej nazwie, jak formalne parametry metody, ale wyłącznie " +
                    "wewnątrz bloku instrukcji");
            Question p9 = new Question(
                    9,
                    "Aby możliwe było uruchomienie programu spakowanego do postaci jar za pomocą polecenia java -jar xyz.jar",
                    "Paczka xyz.jar musi zawierać co najmniej jedną klasę z publiczną statyczną funkcją main() i nazwa tej klasy musi być " +
                    "wpisana w pliku manifestu",
                    "Paczka xyz.jar musi być podpisana",
                    "Paczka xyz.jar musi zawierać klasę xyz z publiczną statyczną funkcją main()",
                    "Paczka xyz.jar musi zawierać co najmniej jedną klasę z publiczną statyczną funkcją main()",
                    "Paczka xyz.jar musi zawierać co najmniej jedną klasę z publiczną statyczną funkcją main() i nazwa tej klasy musi być " +
                    "wpisana w pliku manifestu");
            Question p10 = new Question(
                    10,
                    "Złożone kontenery Swing (drzewa, listy, tabele) przechowują",
                    "Wiele odpowiednio skonfigurowanych obiektów J[...]",
                    "Referencje do tekstów String",
                    "Wiele odpowiednio skonfigurowanych obiektów JButton",
                    "Referencje typu Object",
                    "Referencje typu Object");
            Question p11 = new Question(
                    11,
                    "Unicode to stosowany w języku Java:",
                    "standard kodowania znaków, w którym jeden znak zapisywany jest za pomocą 1 lub 2 bajtów",
                    "uniwersalny format kodowania wszystkich typów danych",
                    "standard kodowania znaków, w którym jeden znak zapisywany jest za pomocą 2 bajtów",
                    "format kodowania liczb typu double",
                    "standard kodowania znaków, w którym jeden znak zapisywany jest za pomocą 2 bajtów");
            Question p12 = new Question(
                    12,
                    "Które z poniższych stwierdzeń odnoszących się do operacji graficznych w bibliotece AWT jest NIEprawdziwe:",
                    "Klasa Graphics reprezentuje kontekst graficzny i zapewnia realizację podstawowych operacji grafiki rastrowej (np." +
                    "ustawienie koloru pojedynczych pikseli)",
                    "Klasa Graphics reprezentuje kontekst graficzny i zapewnia realizację podstawowych operacji grafiki",
                    "Kod odpowiedzialny za wyświetlanie zawartości komponentu należy umieścić w metodzie paint() lub update()",
                    "Metoda repaint() pozwala na przerysowanie zawartości komponentu",
                    "Klasa Graphics reprezentuje kontekst graficzny i zapewnia realizację podstawowych operacji grafiki rastrowej (np." +
                    "ustawienie koloru pojedynczych pikseli)");
            Question p13 = new Question(
                    13,"Który z poniższych typów jest klasą potomną Object:",
                    "double[]",
                    "int",
                    "void",
                    "Żaden",
                    "double[]");
            Question p14 = new Question(
                    14,
                    "Która kombinacja modyfikatorów jest dopuszczalna?",
                    "private abstract",
                    "static synchronized",
                    "abstract final",
                    "abstract synchronized",
                    "abstract synchronized");
            Question p15 = new Question(
                    15,
                    "Które z poniższych stwierdzeń odnoszących się do rozwiązań stosowanych w bibliotece AWT jest NIEprawdziwe:",
                    "Układ BorderLayout umożliwia rozmieszczenie komponentów w 5 regionach: północnym, południowym, wschodnim," +
                    "zachodnim i środkowym",
                    "Układ i rozmiary komponentów zapisywane są w pliku XML",
                    "Jeśli komponent ma układ FlowLayout jego komponenty są rozmieszczone kolejno w wierszach",
                    "Za rozmieszczenie komponentów odpowiada przypisany do kontenera obiekt klasy LayoutManager",
                    "Układ i rozmiary komponentów zapisywane są w pliku XML");
            Question p16 = new Question(
                    16,
                    "W poniżej zdefiniowanej funkcji foo() deklaracja A a; odwołująca się do zdefiniowanej klasy A: void foo() { A a; }",
                    "Przydziela pamięć dla obiektu klasy A na stosie",
                    "Jest poprawna, tylko wtedy, jeżeli A ma bezparametrowy konstruktor",
                    "Przydziela pamięć dla referencji typu A na stosie (zmienne są na stosie, obiekty na stercie)",
                    "Przydziela pamięć dla referencji typu A na stosie, ale obiekt jest tworzony w stercie",
                    "Przydziela pamięć dla referencji typu A na stosie (zmienne są na stosie, obiekty na stercie)");
            Question p17 = new Question(
                    17,
                    "Które zdanie dotyczące inicjalizacji atrybutów statycznych jest NIEprawdziwe:",
                    "Inicjalizacja atrybutów statycznych może zostać umieszczona w bloku static",
                    "Atrybuty statyczne są inicjowane przy pierwszym wywołaniu statycznej metody klasy",
                    "Atrybuty statyczne są inicjowane przy pierwszym dostępie do statycznego atrybutu klasy",
                    "Atrybuty statyczne zawsze są inicjowane w momencie tworzenia obiektu klasy",
                    "Atrybuty statyczne zawsze są inicjowane w momencie tworzenia obiektu klasy");
            Question p18 = new Question(
                    18,"Jaka jest wartość wyrażenia 2.32+\"2.68\"?",
                    "String '2.322.68'",
                    "String \"5\"",
                    "double 5.0",
                    "int 5",
                    "String \"2.322.68\"");
            Question p19 = new Question(
                    19,
                    "Które stwierdzenie jest NIEprawdziwe?",
                    "Nie zaleca się użycia metody stop() do zakończenia wątku",
                    "Kiedy podczas działania wątku zostanie wygenerowany wyjątek i na stosie funkcji nie zostanie odnaleziony hendler" +
                    "wątek zakończy działanie",
                    "Zaleca się zakończenie wątku poprzez powrót z metody run()",
                    "Zaleca się zatrzymywanie wątku przez wywoływanie metody suspend()",
                    "Zaleca się zatrzymywanie wątku przez wywoływanie metody suspend()");
            Question p20 = new Question(
                    20,
                    "Która z poniższych deklaracji tablicy jest niepoprawna?",
                    "int tab[] = {1,2,3};",
                    "Integer[] tab = new int[]{1,2,3};",
                    "Integer[] tab = {1,2,3,}",
                    "int[] tab = new int[10];",
                    "Integer[] tab = new int[]{1,2,3};");
            Question p21 = new Question(
                    21,
                    "Który z poniższych fragmentów kodu sprawdza, czy obiekt wskazywany przez referencję xyz należy do klasy XYZ",
                    "if(xyz instanceof XYZ)",
                    "if{ (XYZ)zyx != null)",
                    "if(XYZ classof xyz)",
                    "if(xyz: XYZ)",
                    "if(xyz instanceof XYZ)");
            Question p22 = new Question(
                    22,
                    "Modelem dla komponentu Swing jest:",
                    "jego kod",
                    "zbiór danych podlegających wirtualizacji, najczęściej implementowany w postaci odpowiedniej klasy",
                    "sposób reakcji na zdarzenia",
                    "jego wygląd (ang. look and feel)",
                    "zbiór danych podlegających wirtualizacji, najczęściej implementowany w postaci odpowiedniej klasy");
            Question p23 = new Question(
                    23,
                    "W kontekście używanym podczas przełączania wątków zapisane są (podaj najbliższą odpowiedź):",
                    "Wszystkie zmienne, dla których przydzielono pamięć podczas działania wątku",
                    "Otwarte pliki i bloki pamięci, ale nie rejestry",
                    "Rejestr, stos, bloki pamięci, pliki i kod",
                    "Rejestr i stos",
                    "Rejestr i stos");
            Question p24 = new Question(
                    24,
                    "Aby sprawdzić, czy dwa obiekty typu String mają taką samą zawartość należy:",
                    "Użyć operatora ==",
                    "Użyć metody equals()",
                    "Użyć operatora =",
                    "Użyć metody String.strcmp()",
                    "Użyć metody equals()");
            Question p25 = new Question(
                    25,
                    "Które z poniższych stwierdzeń odnoszących się do rozwiązań stosowanych w bibliotece AWT jest NIEprawdziwe:",
                    "Jeżeli komponent jest źródłem zdarzeń, ale nie ma zarejestrowanych odbiorców, to po pojawieniu się zdarzenia" +
                    "generowany jest wyjątek",
                    "Komunikacja w bibliotece AWT odbywa się poprzez zdarzenia",
                    "W delegacyjnym modelu obsługi zdarzeń, ich odbiorcą jest dowolny obiekt realizujący odpowiedni interfejs Listener",
                    "Często stosowanym rozwiązaniem jest zarejestrowanie jako odbiorcy zdarzeń obiektu klasy wewnętrznej realizującego" +
                    "odpowiedni interfejs Listener",
                    "Jeżeli komponent jest źródłem zdarzeń, ale nie ma zarejestrowanych odbiorców, to po pojawieniu się zdarzenia" +
                    "generowany jest wyjątek");
            Question p26 = new Question(
                    26,
                    "Parametrem funkcji main(), od której rozpoczyna się uruchamianie programu jest:",
                    "Dowolny ciąg deklaracji zmiennych oddzielonych przecinkami",
                    "Tablica String[]",
                    "String",
                    "Tablica Object[]",
                    "Tablica String[]");
            Question p27 = new Question(
                    27,
                    "Co zostanie wyświetlone z poniższego wyrażenia:\n String word = \"abcd\";\nfor(int i=0;i<4;i+=2) System.out.print(word[i]); ",
                    "ab",
                    "ac",
                    "ace",
                    "bd",
                    "ac");
            Question p28 = new Question(
                    28,
                    "Które stwierdzenie odnoszące się do biblioteki Swing jest prawdziwe:",
                    "Reakcja na zdarzenia w bibliotece Swing odbywa się poprzez przesyłanie ich do zarejestrowanych odbiorców (ang." +
                    "listener), obiektów klas implementujących odpowiednie metody do obsługi zdarzeń",
                    "Adapter w bibliotece Swing jest specjalna klasą, która umożliwia zmianę wyglądu elementów graficznych",
                    "W bibliotece Swing rozmieszczając komponenty w kontenerze należy podać ich współrzędne wyrażone w pikselach",
                    "W bibliotece Swing każdy komponent ma swój odpowiednik w postaci obiektu platformy graficznej zarządzanej przez" +
                    "system operacyjny",
                    "Reakcja na zdarzenia w bibliotece Swing odbywa się poprzez przesyłanie ich do zarejestrowanych odbiorców (ang." +
                    "listener), obiektów klas implementujących odpowiednie metody do obsługi zdarzeń");
            Question p29 = new Question(
                    29,
                    "Które z poniższych stwierdzeń odnoszących się do obsługi zdarzeń w bibliotece AWT jest NIEprawdziwe:",
                    "Zdarzenia przechwytuje się za pomocą instrukcji catch",
                    "Adapter to klasa zapewniająca puste implementacje metod interfejsu typu Listener",
                    "Przykładami zdarzeń biblioteki AWT i interfejsów odbiorcy są: MouseEvent i MouseListener lub KeyEvent i KeyListener",
                    "Komponent będący źródłem zdarzeń może mieć wielu zarejestrowanych odbiorców (Listener)",
                    "Zdarzenia przechwytuje się za pomocą instrukcji catch");
            Question p30 = new Question(
                    30,
                    "Inicjalizacja pól niestatycznych:",
                    "Jest dokonywana podczas tworzenia obiektu klasy",
                    "Jeżeli pole klasy nie jest zainicjowane jawnie, wówczas będzie miało wartość nieokreśloną",
                    "Musi odbywać się wewnątrz konstruktora",
                    "Odbywa się tylko raz, bezpośrednio po załadowaniu klasy przez class loader z zewnętrznego źródła (pliku, archiwum)",
                    "Jest dokonywana podczas tworzenia obiektu klasy");
            repository.saveAll(
                    List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30)
            );
        };
    }

}
