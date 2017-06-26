package com.github.encryption

import javax.crypto.Cipher
import javax.crypto.spec.{IvParameterSpec, SecretKeySpec}

import org.apache.commons.codec.binary.Base64

/**
  * Secret word to generate encryption
  * Example: "abc12345abc67890" or "abcdefghijlmnop1"
  *
  * @param secretWord
  */
class ScalaEncryption(secretWord: String) {

  private final val keySpec = new SecretKeySpec(secretWord.getBytes("UTF-8"), "AES")
  private final val iv = new IvParameterSpec(secretWord.getBytes("UTF-8"))
  private final val cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING")

  final def encrypt(value: String): String = {

    cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv)

    Base64.encodeBase64String(cipher.doFinal(value.getBytes()))

  }

  final def decrypt(value: String): String = {

    cipher.init(Cipher.DECRYPT_MODE, keySpec, iv)

    new String(cipher.doFinal(Base64.decodeBase64(value)))

  }

}
