package pl.javastart.euler2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Euler2Test {

    @Test
    public void shouldReturn10whenLimitIs10(){
        //given
        int expectedResult = 10;
        //when
        int actualResult = Euler2.calculateSum(10);
        //then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn44whenLimitIs34(){
        //given
        int expectedResult = 44;
        //when
        int actualResult = Euler2.calculateSum(34);
        //then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    public void shouldReturn188whenLimitIs200(){
        //given
        int expectedResult = 188;
        //when
        int actualResult = Euler2.calculateSum(200);
        //then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult);
    }
}
