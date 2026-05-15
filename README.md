# lab15-starter

F.CSM311 — Lab15-ийн starter код. Maven + JUnit5 жижиг проект.

## Build & test
## Оюутны мэдээлэл
* **Нэр:** Н.Ням-Од B222270805
* **Хичээл:** Программ хангамжийн бүтээлт
* **Төслийн нэр:** `lab15-starter` (StringUtils Implementation)

```bash
mvn -B clean verify
```

## Бүтэц

```
src/
├── main/java/lab/
│   ├── Calculator.java      — нэмэх, хасах, үржих, хуваах
│   └── StringUtils.java     — capitalize, isBlank (reverse-г Даалгавар 2-т нэмнэ)
└── test/java/lab/
    └── CalculatorTest.java
```
##  Төслийн тойм
Энэхүү лабораторийн ажлаар **Java** төсөл дээр **GitHub Actions** ашиглан Matrix Build тохируулж, **JaCoCo** ашиглан кодын бүрхэцийг тооцож, **Branch Protection Rule** болон **Peer Review** процессыг практик дээр хэрэгжүүлэв.

## Тестийн үр дүн (JaCoCo Report)
Төслийн нэгж тестүүдийг ажиллуулсны дараах бүрхэцийн үзүүлэлт:

## Lab15 даалгаврын товч жагсаалт

1. CI workflow бичих (`.github/workflows/ci.yml`)
2. `StringUtils.reverse()` нэмэх + тест + PR
3. Matrix build (Java 17 + 21)
4. Branch protection rule (main)
5. JaCoCo coverage gate (≥ 70%)
6. Peer review (хосоор)

Дэлгэрэнгүйг `Lab15-Git-Workflow-and-CICD.md` файлд харна уу.
## Ашигласан технологиуд
* **Хэл:** Java 17/21
* **Угсралтын хэрэгсэл:** Maven
* **Тест:** JUnit 5
* **CI/CD:** GitHub Actions
* **Coverage Tool:** JaCoCo

##  Хэрэгжүүлсэн функцууд
1. `StringUtils.reverse(String s)`: Тэмдэгт мөрийг урвуу болгох функц (Null-safe).
2. `StringUtils.capitalize(String s)`: Эхний үсгийг том болгох функц.
3. `StringUtils.isBlank(String s)`: Хоосон эсвэл null утгыг шалгах функц.


