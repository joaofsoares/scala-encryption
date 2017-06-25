package com.github.encryption

import org.junit.{Assert, Test}

class ScalaEncryptionTest {

  @Test
  def testEncryption: Unit = {

    val scalaEncryption = new ScalaEncryption("abc12345abc67890")

    val number = "123456"

    val encrypted = scalaEncryption.encrypt(number)

    Assert.assertEquals(number, scalaEncryption.decrypt(encrypted))

  }

}
