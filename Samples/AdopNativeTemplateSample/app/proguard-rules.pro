# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in /Users/rick/Library/Android/sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
#adop
-dontwarn android.webkit.**
-keep class com.adop.sdk.adview.BaseAdView { public *; }
-keep class com.adop.sdk.interstitial.BaseInterstitial { public *; }
-keep class com.adop.sdk.nativead.BaseNativeAd { public *; }
-keep class com.adop.sdk.nativead.BaseNativeTemplateAd { public *; }
-keep class com.adop.sdk.nativead.CustomNativeImageView { public *; }
-keep class com.adop.sdk.nativead.CustomNativeIconView { public *; }
-keep class com.adop.sdk.nativead.CustomDialog { public *; }
-keep class com.adop.sdk.AdEntry { public *; }
-keep class com.adop.sdk.interstitial.InterstitialAdopActivity { *; }
-keep class com.adop.sdk.interstitial.InterstitialAdop {*;}

-dontnote android.net.http.*
-dontnote org.apache.commons.codec.**
-dontnote org.apache.http.**

#InterstitialCauly
-keep public class com.fsn.cauly.** {
public protected *;
}
-keep public class com.trid.tridad.** {
public protected *;
}

#AdViewFacebook
-keep class com.facebook.ads.** { *; }
-dontwarn com.facebook.ads.**

#NativeAvocarrot
-dontobfuscate
-dontwarn com.squareup.okhttp.**