import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.example.Account;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UnitTests {
    @Test
    @Story("Positive: Корректное имя и фамилия")
    @Description("Проверяем, что имя и фамилия полностью соответствуют требованиям")
    public void checkNameToEmboss_ValidName_ReturnsTrue() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss("Тимоти Шаламе"));
    }

    @Test
    @Story("Negative: Имя и фамилия слишком короткие")
    @Description("Ожидаем фолс, так как имя и фамилия слишком короткие")
    public void checkNameToEmboss_NameTooShort_ReturnsFalse() {
        Account account = new Account("Т Ш");
        assertFalse(account.checkNameToEmboss("Т Ш"));
    }

    @Test
    @Story("Negative: Имя и фамилия слишком длинные")
    @Description("Ожидаем фолс, так как имя и фамилия слишком длинные")
    public void checkNameToEmboss_NameTooLong_ReturnsFalse() {
        Account account = new Account("ТимотиТимоти ШаламеШаламе");
        assertFalse(account.checkNameToEmboss("ТимотиТимоти ШаламеШаламе"));
    }

    @Test
    @Story("Negative: Не содержит пробела")
    @Description("Ожидаем фолс,так как в строке нет пробела")
    public void checkNameToEmboss_NoSpaces_ReturnsFalse() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss("ТимотиШаламе"));
    }

    @Test
    @Story("Negative: Содержит много пробелов")
    @Description("Ожидаем фолс, так как строка содержит больше одного пробела")
    public void checkNameToEmboss_MultipleSpaces_ReturnsFalse() {
        Account account = new Account("Тимоти  Шаламе");
        assertFalse(account.checkNameToEmboss("Тимоти  Шаламе"));
    }

    @Test
    @Story("Negative: Пробелы в начале строки")
    @Description("Ожидаем фолс, так как есть пробелы в начале строки")
    public void checkNameToEmboss_SpaceAtStart_ReturnsFalse() {
        Account account = new Account(" ТимотиШаламе");
        assertFalse(account.checkNameToEmboss(" ТимотиШаламе"));
    }

    @Test
    @Story("Negative: Пробелы в конце строки")
    @Description("Ожидаем фолс, так как есть пробелы в конце строки")
    public void checkNameToEmboss_SpaceAtEnd_ReturnsFalse() {
        Account account = new Account("ТимотиШаламе ");
        assertFalse(account.checkNameToEmboss("ТимотиШаламе "));
    }

    @Test
    @Story("Negative: Пришла пустая строкк")
    @Description("Ожидаем фолс, так как строка пустая")
    public void checkNameToEmboss_NullName_ReturnsFalse() {
        Account account = new Account(null);
        assertFalse(account.checkNameToEmboss(null));
    }
}
