package com.example.cfbteams

/**
 * Simple data model for a college football team.
 *
 * [color] is the school's primary color, used to render a generated badge
 * thumbnail (colored circle + abbreviation) when no real logo image is
 * supplied — real team logos are trademarked, so none are bundled here.
 *
 * [logoRes] is an OPTIONAL drawable resource name (no extension, e.g.
 * "logo_alabama") for a real logo image dropped into res/drawable. If set
 * and the resource exists, the adapter shows that image instead of the
 * generated badge.
 *
 * [espnId] and [espnSlug] are ESPN's own numeric team ID and URL slug,
 * used to build the schedule link:
 * https://www.espn.com/college-football/team/schedule/_/id/{espnId}/{espnSlug}
 */
data class Team(
    val name: String,
    val abbr: String,
    val color: String,
    val espnId: String,
    val espnSlug: String,
    val logoRes: String? = null
) {
    val scheduleUrl: String
        get() = "https://www.espn.com/college-football/team/schedule/_/id/$espnId/$espnSlug"
}

object TeamRepository {

    val teams: List<Team> = listOf(
        Team("Alabama Crimson Tide", "ALA", "#9E1B32", "333", "alabama-crimson-tide"),
        Team("Texas Longhorns", "TEX", "#BF5700", "251", "texas-longhorns"),
        Team("Texas A&M Aggies", "TAMU", "#500000", "245", "texas-am-aggies"),
        Team("Ole Miss Rebels", "MISS", "#14213D", "145", "ole-miss-rebels")
    )
}
