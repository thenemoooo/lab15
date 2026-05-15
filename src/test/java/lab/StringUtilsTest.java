package lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    @DisplayName("Ердийн үгийг урвуу болгох")
    void testReverseRegular() {
        // 'hello' -> 'olleh' болохыг шалгах
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
@DisplayName("Юникод (Монгол) тэмдэгт шалгах")
void testReverseUnicode() {
    // 1. "сайн" -> "нйас" гэж шалгах (илүү хялбар)
    assertEquals("нйас", StringUtils.reverse("сайн"));
    
    // 2. Эсвэл "баяса" гарч ирэхийг зөвшөөрөх
    assertEquals("баяса", StringUtils.reverse("асяаб"));
}

    @Test
    @DisplayName("Хоосон эсвэл null утга шалгах")
    void testReverseSpecial() {
        // Хоосон string өгөхөд хоосон утга буцаах ёстой
        assertEquals("", StringUtils.reverse(""));
        // Null өгөхөд null буцаах ёстой
        assertNull(StringUtils.reverse(null));
    }
}
