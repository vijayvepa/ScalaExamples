package gradlehelloworld.utilities.objects

import gradlehelloworld.objects.casting.EmailAccount
import org.apache.commons.io.IOUtils
import org.junit.jupiter.api.Assertions.{assertEquals, assertNotNull}
import org.junit.jupiter.api.Test
import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.{BaseConstructor, Constructor}

import java.nio.charset.StandardCharsets

class CastingTests {

  @Test
  def castingEmailAccountFromYamlTest(): Unit = {
    val text: String = IOUtils.toString(this.getClass.getClassLoader.getResource("test.yaml"), StandardCharsets.UTF_8)

    val constructor: BaseConstructor = new Constructor(classOf[EmailAccount])
    val yaml = new Yaml(constructor)
    val emailAccount : EmailAccount = yaml.load(text).asInstanceOf[EmailAccount]

    assertNotNull(emailAccount)

  }
}
