# scala-encryption

Scala encryption using AES/CBC/PKCS5PADDING

using:

val encryption = ScalaEncryption("wordWith16Bits")

examples => "abc12345abc67890", "abcdefghijlmnop1"

# compile

 sbt compile

# test

 sbt test
 
# package

 sbt package

# package with dependecies

 sbt clean assembly