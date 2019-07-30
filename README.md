# MaterialComponentBugs

The two activity first activity has obvious bugs.


## SwipeRefreshBugXiaomiActivity

The issue is that the appbar is not scrolling with the content with the following combination :
- A SwipeRefreshLayout
- A CoordinatorLayout with normal behavior
- A translucent status bar
- A Xiaomi Mi8 Phone (might be present on other phones, maybe with notch ?)

With this, the appbar is not scrolling either at the beginining (and never come back), either after a quick scroll.

See the [video](videos/swipeissue.mp4)