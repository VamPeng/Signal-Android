package org.thoughtcrime.securesms.registration.secondary

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.Test
import org.thoughtcrime.securesms.crypto.IdentityKeyUtil
import org.thoughtcrime.securesms.devicelist.protos.DeviceName
import java.nio.charset.Charset

class DeviceNameCipherTest {
  @Test
  fun encryptDeviceName() {
    val deviceName = "xXxCoolDeviceNamexXx"
    val identityKeyPair = IdentityKeyUtil.generateIdentityKeyPair()

    val encryptedDeviceName = DeviceNameCipher.encryptDeviceName(deviceName.toByteArray(Charset.forName("UTF-8")), identityKeyPair)

    val plaintext = DeviceNameCipher.decryptDeviceName(DeviceName.ADAPTER.decode(encryptedDeviceName), identityKeyPair)!!

    assertThat(String(plaintext, Charset.forName("UTF-8"))).isEqualTo(deviceName)
  }
}
