# MaterialComponentBugs

## ScrimBugActivity

Here we use

```
app_bar.setExpanded(expanded, animate = false)
toolbar_layout.setScrimsShown(expanded, animate = false)
```

but the scrim is still animated

![Scrim](https://raw.githubusercontent.com/NitroG42/MaterialComponentBugs/master/gif/scrimanimatefalse.gif)

## StatusBarScrimBugActivity

Here, we can see the statusbar color behind moved when flinging the screen.

![StatusBarForeground](https://raw.githubusercontent.com/NitroG42/MaterialComponentBugs/master/gif/statusbarforeground.gif)

## SwipeRefreshBugXiaomiActivity

**Below, I need a Xiaomi to reproduce the video with the issue**

The issue is that the appbar is not scrolling with the content with the following combination :

- A SwipeRefreshLayout
- A CoordinatorLayout with normal behavior
- A translucent status bar
- A Xiaomi Mi8 Phone (might be present on other phones, maybe with notch ?)

With this, the appbar is not scrolling either at the beginining (and never come back), either after a quick scroll.