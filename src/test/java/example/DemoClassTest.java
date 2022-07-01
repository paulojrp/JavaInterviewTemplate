package example;

import org.example.DemoClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DemoClassTest {

    @Test
    public void validateTest() {

        final DemoClass demoClass = new DemoClass();

        assertThat(demoClass.validate())
                .as("Validate instance")
                .isTrue();
    }

    @Test
    public void exceptionTest() {

        final DemoClass demoClass = new DemoClass();

        assertThatThrownBy(demoClass::exception)
                .isInstanceOf(Exception.class);
    }

    @Test
    public void preconditionTest() {

        final DemoClass demoClass = new DemoClass();

        assertThatThrownBy(demoClass::precondition)
                .isInstanceOf(IllegalArgumentException.class);
    }
}
