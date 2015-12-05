package com.upokecenter.test; import com.upokecenter.util.*;

import org.junit.Assert;
import org.junit.Test;
import com.upokecenter.mail.*;

  public class DispositionBuilderTest {
    @Test
    public void TestConstructor() {
      String stringNull = null;
      ContentDisposition dispNull = null;
      try {
Assert.assertEquals(null, new DispositionBuilder(stringNull));
        Assert.fail("Should have failed");
      } catch (NullPointerException ex) {
        System.out.print("");
} catch (Exception ex) {
        Assert.fail(ex.toString());
        throw new IllegalStateException("", ex);
      }
      try {
Assert.assertEquals(null, new DispositionBuilder(dispNull));
        Assert.fail("Should have failed");
      } catch (NullPointerException ex) {
        System.out.print("");
} catch (Exception ex) {
        Assert.fail(ex.toString());
        throw new IllegalStateException("", ex);
      }
      try {
Assert.assertEquals(null, new DispositionBuilder(""));
        Assert.fail("Should have failed");
      } catch (IllegalArgumentException ex) {
        System.out.print("");
} catch (Exception ex) {
        Assert.fail(ex.toString());
        throw new IllegalStateException("", ex);
      }
    }
    @Test
    public void TestDispositionType() {
      DispositionBuilder db = new DispositionBuilder();
      db.SetDispositionType("inline");
      Assert.assertEquals("inline", db.getDispositionType());
    }
    @Test
    public void TestRemoveParameter() {
      try {
        new DispositionBuilder().RemoveParameter(null);
        Assert.fail("Should have failed");
      } catch (NullPointerException ex) {
        System.out.print("");
} catch (Exception ex) {
        Assert.fail(ex.toString());
        throw new IllegalStateException("", ex);
      }
    }
    @Test
    public void TestSetDispositionType() {
      try {
        new DispositionBuilder().SetDispositionType(null);
        Assert.fail("Should have failed");
      } catch (NullPointerException ex) {
        System.out.print("");
} catch (Exception ex) {
        Assert.fail(ex.toString());
        throw new IllegalStateException("", ex);
      }
      try {
        new DispositionBuilder().SetDispositionType("");
        Assert.fail("Should have failed");
      } catch (IllegalArgumentException ex) {
        System.out.print("");
} catch (Exception ex) {
        Assert.fail(ex.toString());
        throw new IllegalStateException("", ex);
      }
    }
    @Test
    public void TestSetParameter() {
      // not implemented yet
    }
    @Test
    public void TestToDisposition() {
      // not implemented yet
    }
    @Test
    public void TestToString() {
      // not implemented yet
    }
  }