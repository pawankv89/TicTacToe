# TicTacToe

Added Some screens here.

![](https://github.com/pawankv89/TicTacToe/blob/master/images/Screenshot_1.png)
![](https://github.com/pawankv89/TicTacToe/blob/master/images/Screenshot_2.png)
![](https://github.com/pawankv89/TicTacToe/blob/master/images/Screenshot_3.png)
![](https://github.com/pawankv89/TicTacToe/blob/master/images/Screenshot_4.png)
![](https://github.com/pawankv89/TicTacToe/blob/master/images/Screenshot_5.png)

## Version 1.0
Tic Tac Toe Free supports one player and two player gameplay, so you can play against another human or against your Android device. 
Start playing Free Tic Tac Toe game on your Android device.
We prepared simple version for everyone! Enjoy our cool glow design. No need waste paper to play puzzle games.
Each player chooses his/her sign – an “X” or an “0”, and taking turns they put their signs one by one into the squares of the 3x3 field. 

#### Controller

```xml

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.pk.tictactoe">

    <!-- Add these permissions for better ad targeting -->
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
    <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED" />
    <uses-permission android:name="android.permission.BLUETOOTH" />

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">

        <!-- TODO replace YOUR_APP_ID with actual value -->
        <meta-data
            android:name="com.startapp.sdk.APPLICATION_ID"
            android:value="APPLICATION_ID" />

        <activity
            android:name=".MainActivity"
            android:theme="@style/Theme.AppCompat.Light.NoActionBar" />
        <activity
            android:name=".singleplayer.SinglePlayerActivity"
            android:theme="@style/Theme.AppCompat.Light.NoActionBar" />
        <activity
            android:name=".multiplayer.MultiPlayerActivity"
            android:theme="@style/Theme.AppCompat.Light.NoActionBar" />
        <activity
            android:name=".result.ResultActivity"
            android:theme="@style/Theme.AppCompat.Light.NoActionBar" />
        <activity
            android:name=".splash.SplashActivity"
            android:theme="@style/Theme.AppCompat.Light.NoActionBar">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>


```

## Requirements

### Android Studio 4.0

Build #AI-193.6911.18.40.6514223, built on May 20, 2020
Runtime version: 1.8.0_242-release-1644-b3-6222593 x86_64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
macOS 10.15.1
GC: ParNew, ConcurrentMarkSweep
Memory: 1246M
Cores: 4
Registry: ide.new.welcome.screen.force=true
Non-Bundled Plugins: com.intellij.marketplace, com.thoughtworks.gauge, org.intellij.plugins.markdown


## License

This code is distributed under the terms and conditions of the [MIT license](LICENSE).

## Change-log

A brief summary of each this release can be found in the [CHANGELOG](CHANGELOG.mdown). 
