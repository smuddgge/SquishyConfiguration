package com.github.smuddgge.squishyconfiguration;

import com.github.smuddgge.squishyconfiguration.utility.AllConfigurationTester;
import com.github.smuddgge.squishyconfiguration.utility.ConfigurationTester;
import org.junit.jupiter.api.Test;

import java.io.File;

public class YamlConfigurationTest {

    @Test
    public void testYaml() {
        ConfigurationTester tester = new AllConfigurationTester(
                ConfigurationFactory.YAML.createPreparedFactory(
                        new File("src/main/resources"), "test"
                )
        );

        tester.testAll();
    }
}
