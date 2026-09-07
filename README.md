# CFB Teams — Android App

A simple Android app showing a grid of college football team logo thumbnails
that link out to each team's schedule on ESPN.

Currently includes 4 teams: **Alabama, Texas, Texas A&M, Ole Miss**. More can
be added any time — see below.

## What's included
- Kotlin + AndroidX, single-screen app (`MainActivity`)
- `RecyclerView` in a 4-column grid
- Each team rendered as a colored circular badge with its abbreviation — a
  generated placeholder, not the real trademarked logo artwork (see note
  below on how to swap in real logos)
- Tapping a team opens its ESPN schedule page in the browser, e.g.
  `https://www.espn.com/college-football/team/schedule/_/id/333/alabama-crimson-tide`

## Why no real team logos?
College team logos are copyrighted/trademarked, so they can't be bundled
into an app generated here. Each team gets a clean generated badge using
the school's real color and abbreviation instead. To use real logo images
you have the rights to:

1. Rename your image file to lowercase with underscores only, e.g.
   `logo_alabama.jpg`.
2. Drop it into `app/src/main/res/drawable/`.
3. In `Team.kt`, add `logoRes = "logo_alabama"` to that team's line.

The adapter automatically detects the drawable and shows it instead of the
generated badge — same pattern used for the NFL Teams app.

## Adding more teams
Open `app/src/main/java/com/example/cfbteams/Team.kt` and add a new line to
the `teams` list:
```kotlin
Team("School Name", "ABBR", "#HEXCOLOR", "espnId", "espn-slug")
```
You'll need that team's ESPN numeric ID and URL slug — the easiest way to
find them is to search "[school name] espn schedule" and look at the URL:
`espn.com/college-football/team/schedule/_/id/{THIS NUMBER}/{THIS-SLUG}`.

## How to build a real .apk with no local install (GitHub Actions)
This project includes `.github/workflows/build.yml`, which builds the APK
on GitHub's servers — no Android Studio needed.

1. Create a free GitHub account if you don't have one: https://github.com/signup
2. Create a new repository: https://github.com/new
3. Unzip this project on your computer, then on your new repo's page click
   **"uploading an existing file"** and drag in **everything inside** the
   `CFBTeams` folder (not the folder itself — `settings.gradle.kts` needs
   to sit at the repo's top level). Make sure the `.github` folder makes it
   in too (it's easy to miss since it's a hidden folder in some file
   pickers) — if it doesn't, use **Add file → Create new file**, type the
   path `.github/workflows/build.yml` (GitHub creates the folders for you),
   and paste in the contents of that file.
4. Commit, then go to the **Actions** tab. A "Build APK" run should start
   automatically; if not, click **Build APK → Run workflow**.
5. Once it finishes (green check), open the run, scroll to **Artifacts**,
   and download **CFBTeams-debug-apk**.
6. Transfer the `.apk` to your Galaxy phone and open it to install (you'll
   need to allow installs from that source the first time Android asks).

## Requirements (for local Android Studio builds)
- Android Studio Koala+ 
- minSdk 24 (Android 7.0)
- targetSdk / compileSdk 34

## Project structure
```
CFBTeams/
├── settings.gradle.kts
├── build.gradle.kts
├── gradle.properties
├── .github/workflows/build.yml
└── app/
    ├── build.gradle.kts
    └── src/main/
        ├── AndroidManifest.xml
        ├── java/com/example/cfbteams/
        │   ├── Team.kt          # data model + team list
        │   ├── TeamAdapter.kt   # RecyclerView adapter
        │   └── MainActivity.kt  # sets up the grid, opens ESPN links
        └── res/
            ├── layout/          # activity_main.xml, item_team.xml
            ├── values/          # strings, colors, theme
            ├── drawable/        # badge shape + launcher icon
            └── mipmap-anydpi-v26/
```
