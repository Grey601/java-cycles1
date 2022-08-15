import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/range.csv")
    public void SqrInsideRangeTest(int expected, int startRange, int stopRange) {
        SQRService service = new SQRService();
        int actual = service.countSqrInsideRange(startRange, stopRange);
        assertEquals(expected, actual);
    }
}
