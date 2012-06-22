package templemore.xsbt.cucumber

import java.io.File

/**
 * @author Chris Turner
 */
case class CucumberOptions(featuresDir: File,
                           basePackage: String,
                           options: List[String],
                           beforeFunc: () => Unit,
                           afterFunc: () => Unit) {

  def featuresPresent = featuresDir.exists
}
