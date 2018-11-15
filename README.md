# react-native-cafebazaar-intents

## Getting started

`$ npm install react-native-cafebazaar-intents --save`

### Mostly automatic installation

`$ react-native link react-native-cafebazaar-intents`

## Usage

### Show Rate App

```javascript
import CafeBazaarIntents from 'react-native-cafebazaar-intents';

CafeBazaarIntents.showRatePackage('com.hitalent.hitalent')
  .catch(() => {
    Linking.openURL('https://cafebazaar.ir/app/com.hitalent.hitalent/?l=fa');
  });
```
