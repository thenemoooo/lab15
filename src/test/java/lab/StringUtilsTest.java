package lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    @DisplayName("Хоосон болон null утга дээр reverse ажиллахыг шалгах")
    void testReverseBlank() {
        // null оролтонд null буцаах ёстой
        assertNull(StringUtils.reverse(null));
        // Хоосон оролтонд хоосон буцаах ёстой
        assertEquals("", StringUtils.reverse(""));
        // Зөвхөн зай авсан оролтонд зайгаа хэвээр буцаах ёстой
        assertEquals("   ", StringUtils.reverse("   "));
    }

    @Test
    @DisplayName("Ердийн ASCII (англи) тэмдэгтүүдийг урвуулах")
    void testReverseAscii() {
        // "java" -> "avaj"
        assertEquals("avaj", StringUtils.reverse("java"));
        // "12345" -> "54321"
        assertEquals("54321", StringUtils.reverse("12345"));
    }

    @Test
@DisplayName("Юникод (Монгол) тэмдэгтүүдийг зөв урвуулах")
void testReverseUnicode() {
    // "сайн" -> "нйас"
    assertEquals("нйас", StringUtils.reverse("сайн"));
    
    // "Монгол өгүүлбэр" -> "рэблүүгө логноМ" (Зөв хувилбар)
    assertEquals("рэблүүгө логноМ", StringUtils.reverse("Монгол өгүүлбэр"));
}
}