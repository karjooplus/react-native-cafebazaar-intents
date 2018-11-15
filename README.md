# react-native-cafebazaar-intents

## Getting started

```
$ npm install react-native-cafebazaar-intents --save
$ react-native link react-native-cafebazaar-intents
```

## Usage

### Show Rate App

![rate-package](https://user-images.githubusercontent.com/7693001/48556995-bf139600-e8fa-11e8-9b9d-45985632d02d.png)

```javascript
import CafeBazaarIntents from 'react-native-cafebazaar-intents';

CafeBazaarIntents.showRatePackage('com.hitalent.hitalent')
  .catch(() => {
    Linking.openURL('https://cafebazaar.ir/app/com.hitalent.hitalent/?l=fa');
  });
```
