package lab;

/**
 * String-тэй ажиллах туслах утга.
 *
 * Lab15 — Даалгавар 2-т `reverse` функц нэмэгдсэн хувилбар.
 */
public final class StringUtils {

    private StringUtils() {
        // Туслах класс тул объект үүсгэх боломжгүй болгосон.
    }

    /**
     * Тэмдэгт мөр хоосон эсвэл null эсэхийг шалгах.
     */
    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    /**
     * Үгийн эхний үсгийг том болгох.
     */
    public static String capitalize(String s) {
        if (isBlank(s)) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    /**
     * Тэмдэгт мөрийг урвуу болгох (Даалгавар 2).
     * StringBuilder ашиглан Юникод тэмдэгтийг зөв хөрвүүлнэ.
     * * @param s Оролтын тэмдэгт мөр
     * @return Урвуулсан тэмдэгт мөр. Хэрэв оролт null эсвэл хоосон бол хэвээр буцаана.
     */
    public static String reverse(String s) {
        if (isBlank(s)) {
            return s;
        }
        return new StringBuilder(s).reverse().toString();
    }
}