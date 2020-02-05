module.exports = {
  getTheme: () => new Promise((resolve, reject) => cordova.exec(resolve, reject, 'OsTheme', 'getTheme', []))
}