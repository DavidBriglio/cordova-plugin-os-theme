@available(iOS 13, *)
@objc(OsTheme) class OsTheme : CDVPlugin {
  @objc(getTheme:)
  func getTheme(command: CDVInvokedUrlCommand) {
    let isDark = UIScreen.main.traitCollection.userInterfaceStyle == .dark
    
    let pluginResult = CDVPluginResult(status: CDVCommandStatus_OK, messageAs: ["isDark": isDark] as [AnyHashable: Bool])
    
    self.commandDelegate!.send(pluginResult, callbackId: command.callbackId)
  }

  override func traitCollectionDidChange(_ previousCollection: UITraitCollection?) {
    super.traitCollectionDidChange(previousCollection)

    let isDark = UIScreen.main.traitCollection.userInterfaceStyle == .dark
  }
}
