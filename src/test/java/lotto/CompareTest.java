package lotto;

import controller.Compare;
import controller.InputNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class CompareTest {
    @DisplayName("당첨번호와 보너스 번호 내 중복이 있는지 확인")
    @Test
    void 번호_중복_테스트() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
                    Compare.getIntegratedWinningNumber(List.of(1,2,3,4,5,6), List.of(1));
                })
                .withMessage("[ERROR] 당첨번호와 보너스번호 내 중복이 있습니다.");
        assertThatIllegalArgumentException().isThrownBy(() -> {
                    Compare.getIntegratedWinningNumber(List.of(1,2,3,4,4,6), List.of(7));
                })
                .withMessage("[ERROR] 당첨번호와 보너스번호 내 중복이 있습니다.");
    }
}
