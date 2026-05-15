# Лаборатори 15: CI/CD ба Тестийн Автоматжуулалт

![Build Status](https://github.com/thenemoooo/lab15/actions/workflows/ci-EXAMPLE.yml/badge.svg)
![Java Version](https://img.shields.io/badge/Java-17%20%7C%2021-orange)
![Coverage](https://img.shields.io/badge/Coverage-77%25-green)

## 👤 Оюутны мэдээлэл
* **Нэр:** Ням-Од
* **Хичээл:** Програм хангамжийн инженерчлэл / Мэдээллийн технологи
* **Төслийн нэр:** `lab15-starter` (StringUtils Implementation)

---

## 🚀 Төслийн тойм
Энэхүү лабораторийн ажлаар **Java** төсөл дээр **GitHub Actions** ашиглан Matrix Build тохируулж, **JaCoCo** ашиглан кодын бүрхэцийг тооцож, **Branch Protection Rule** болон **Peer Review** процессыг практик дээр хэрэгжүүлэв.

## 📊 Тестийн үр дүн (JaCoCo Report)
Төслийн нэгж тестүүдийг ажиллуулсны дараах бүрхэцийн үзүүлэлт:

| Метрик | Үзүүлэлт | Төлөв |
| :--- | :--- | :--- |
| **Instructions Coverage** | 77% | ✅ Pass (>70%) |
| **Branches Coverage** | 80% | ✅ Pass |
| **Build Environments** | Java 17, Java 21 | ✅ Success |

---

## 🛠 Ашигласан технологиуд
* **Хэл:** Java 17/21
* **Угсралтын хэрэгсэл:** Maven
* **Тест:** JUnit 5
* **CI/CD:** GitHub Actions
* **Coverage Tool:** JaCoCo

## 🧪 Хэрэгжүүлсэн функцууд
1. `StringUtils.reverse(String s)`: Тэмдэгт мөрийг урвуу болгох функц (Null-safe).
2. `StringUtils.capitalize(String s)`: Эхний үсгийг том болгох функц.
3. `StringUtils.isBlank(String s)`: Хоосон эсвэл null утгыг шалгах функц.

---
© 2026 Ням-Од. Бүх эрх хуулиар хамгаалагдсан.