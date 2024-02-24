package com.southernstorm.noise.tests;

import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitVectorTests {

  @Test
  public void testBasicVector() throws Exception {
    try (final InputStream stream = getClass().getResourceAsStream("test-vectors.json")) {
      VectorTests vectorTests = new VectorTests();
      vectorTests.processInputStream(stream);
      assertEquals(vectorTests.getFailed(), 0);
    }
  }
}
