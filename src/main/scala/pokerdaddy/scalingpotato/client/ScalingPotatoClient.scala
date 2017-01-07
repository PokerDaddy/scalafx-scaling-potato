package pokerdaddy.scalingpotato.client

import scalafx.application.JFXApp
import scalafx.scene.Scene

object ScalingPotatoClient extends JFXApp {
  stage = new JFXApp.PrimaryStage {
    title.value = "Scaling Potato Client"
    width = 600
    height = 400
    scene = new Scene {
      
    }
  }
}