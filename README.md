# cordova-plugin-os-theme [![npm version](https://badge.fury.io/js/cordova-plugin-os-theme.svg)](https://badge.fury.io/js/cordova-plugin-os-theme)

This plugin is designed to return information about the current os theme (android and iOS).

## Installation

Through your terminal:

```terminal
# Newest npm version
cordova plugin add cordova-plugin-os-theme

# Newest github version
cordova plugin add https://github.com/DavidBriglio/cordova-plugin-os-theme.git
```

## Useage

This plugin has one method: `getTheme()` that will return a promise that will in turn receive an object with the current os theme properties. Currently there is only one property being tracked: `isDark`. This will be set to `true` only if dark mode is confirmed active. If we do not know the state of the theme or it is in light mode, `isDark` will be `false`.

### Example

```javascript
cordova.plugins.osTheme.getTheme()
  .then(theme => { // { isDark: [boolean] }
    console.log('The current theme is: ' + theme.isDark ? 'Dark' : 'Light')
  })
  .catch(message => { // string error message
    console.log('Error getting theme: ' + message)
  })
```

## License

MIT. Please see license file for full details.

## Questions

Please feel free to open an issue!
