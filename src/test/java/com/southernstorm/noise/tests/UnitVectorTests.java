package com.southernstorm.noise.tests;

import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;

public class UnitVectorTests {

  @Test
  public void testBasicVector() throws Exception {
    try (final InputStream stream = getClass().getResourceAsStream("test-vectors.json")) {
      VectorTests vectorTests = new VectorTests();
      vectorTests.processInputStream(stream);
      Assert.assertEquals(vectorTests.getFailed(), 0);
    }
  }
}
