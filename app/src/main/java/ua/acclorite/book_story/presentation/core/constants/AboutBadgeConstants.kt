package ua.acclorite.book_story.presentation.core.constants

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import ua.acclorite.book_story.R
import ua.acclorite.book_story.domain.about.Badge

fun Constants.provideAboutBadges() = listOf(
    Badge(
        id = "patreon",
        drawable = R.drawable.crokes_logo,
        imageVector = null,
        contentDescription = R.string.patreon_content_desc,
        url = "https://www.crokes.com"
    ),
    Badge(
        id = "x",
        drawable = R.drawable.x_logo,
        imageVector = null,
        contentDescription = R.string.x_content_desc,
        url = "https://www.x.com/thecrokes"
    ),
    Badge(
        id = "reddit",
        drawable = R.drawable.facebook_logo,
        imageVector = null,
        contentDescription = R.string.reddit_content_desc,
        url = "https://www.facebook.com/Crokes-679596038728705/"
    ),
    Badge(
        id = "tryzub",
        drawable = null,
        imageVector = null,
        contentDescription = R.string.tryzub_content_desc,
        url = null
    ),
    Badge(
        id = "github_profile",
        drawable = null,
        imageVector = null,
        contentDescription = R.string.github_profile_content_desc,
        url = "https://www.github.com/Acclorite"
    ),
)