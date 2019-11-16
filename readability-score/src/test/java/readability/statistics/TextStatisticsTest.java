package readability.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextStatisticsTest {

    private static final double DELTA = 0.01;

    @Test
    void shouldReturnCorrectIndexScore_1() {
        //given
        TextStatistics textStatistics = new TextStatistics(580, 108, 6);

        //when
        //then
        assertEquals(12.86, textStatistics.getReadabilityIndex(), DELTA);
    }

    @Test
    void shouldReturnCorrectIndexScore_2() {
        //given
        TextStatistics textStatistics = new TextStatistics(476, 100, 10);

        //when
        //then
        assertEquals(5.9896, textStatistics.getReadabilityIndex(), DELTA);
    }
    @Test
    void shouldReturnCorrectIndexScore_3() {
        //given
        TextStatistics textStatistics = new TextStatistics(982, 180, 13);

        //when
        //then
        assertEquals(11.19, textStatistics.getReadabilityIndex(), DELTA);
    }
}