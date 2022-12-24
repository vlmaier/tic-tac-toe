# Tic Tac Toe

I have developed this Android application back in 2014. I had no Git experience yet, so unfortunately no commit history is available. However, you can look at the code I wrote as an undergraduate.

Check this out: https://github.com/vlmaier/tic-tac-toe/blob/main/app/src/main/java/com/vladas/tictactoe/Game.java#L269

What the hell is that?

```java
...

if((s2 == b && s3 == b && s1 == "") || (s4 == b && s7 == b && s1 == "") || (s5 == b && s9 == b && s1 == "") ||
   (s2 == p && s3 == p && s1 != b) || (s4 == p && s7 == p && s1 != b) || (s5 == p && s9 == p && s1 != b))
    id = R.id.feld1;
else if((s1 == b && s3 == b && s2 == "") || (s5 == b && s8 == b && s2 == "") ||
        (s1 == p && s3 == p && s2 != b) || (s5 == p && s8 == p && s2 != b))
    id = R.id.feld2;
else if((s1 == b && s2 == b && s3 == "") || (s6 == b && s9 == b && s3 == "") || (s5 == b && s7 == b && s3 == "") ||
        (s1 == p && s2 == p && s3 != b) || (s6 == p && s9 == p && s3 != b) || (s5 == p && s7 == p && s3 != b))
    id = R.id.feld3;
    
...
```

Today I am pretty sure that tic tac toe game algorithm can be written waaaay shorter and more readable (or readable at all).

It kind of works... and I would say that at least back then I understood boolean algebra and conditions.

## Layout Showcase

<p float="left">
  <img src="https://user-images.githubusercontent.com/18353152/209415095-527a6d36-613a-4125-b329-0a16efbda0b3.png" width="250"/>
  <img src="https://user-images.githubusercontent.com/18353152/209415097-a72a8778-b493-4a24-9992-603d94c4f3a4.png" width="250"/>
  <img src="https://user-images.githubusercontent.com/18353152/209415098-c70c8cec-070a-4be9-988d-1605c602ad45.png" width="250"/>
</p>
