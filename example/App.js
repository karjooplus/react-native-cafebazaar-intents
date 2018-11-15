/**
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {
  StyleSheet,
  View,
  Button,
  Linking,
} from 'react-native';
import CafeBazaarIntents from 'react-native-cafebazaar-intents';

type Props = {};
export default class App extends Component<Props> {
  rateUs = () => {
    CafeBazaarIntents.showRatePackage('com.hitalent.hitalent')
      .catch(() => {
        Linking.openURL('https://cafebazaar.ir/app/com.hitalent.hitalent/?l=fa');
      });
  }

  render() {
    return (
      <View style={styles.container}>
        <Button
          onPress={this.rateUs}
          title="به ما امتیاز دهید!"
        />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
});
