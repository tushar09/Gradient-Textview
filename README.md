# Gradient TextView
<img src="https://raw.githubusercontent.com/tushar09/Gradient-Textview/master/demo.jpg" width="200">
Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
    repositories {
    ...
        maven { url 'https://jitpack.io' }
    }
}
```
Add the dependency

```gradle
dependencies {
    implementation 'com.github.tushar09:Gradient-Textview:1.0'
}
```

Now simply use it

```
TextView tv = findViewById(R.id.tv);
Tvg.change(tv, Color.parseColor("#800CDD"),  Color.parseColor("#3BA3F2"));
Tvg.change((TextView) findViewById(R.id.tv2), new int[]{
        Color.parseColor("#F97C3C"),
        Color.parseColor("#FDB54E"),
        Color.parseColor("#64B678"),
        Color.parseColor("#478AEA"),
        Color.parseColor("#8446CC"),
});
Tvg.change((TextView) findViewById(R.id.tv3), new int[]{
        Color.parseColor("#F97C3C"),
        Color.parseColor("#FDB54E"),
        Color.parseColor("#64B678"),
        Color.parseColor("#478AEA"),
        Color.parseColor("#8446CC"),
});
```
