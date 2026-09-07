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
        Team("Alabama Crimson Tide", "ALA", "#9E1B32", "333", "alabama-crimson-tide", logoRes = "logo_alabama"),
        Team("Texas Longhorns", "TEX", "#BF5700", "251", "texas-longhorns", logoRes = "logo_texas"),
        Team("Texas A&M Aggies", "TAMU", "#500000", "245", "texas-am-aggies", logoRes = "logo_texas_am"),
        Team("Ole Miss Rebels", "MISS", "#14213D", "145", "ole-miss-rebels", logoRes = "logo_ole_miss"),
        Team("Auburn Tigers", "AUB", "#03244D", "2", "auburn-tigers", logoRes = "logo_aub"),
        Team("Georgia Bulldogs", "UGA", "#BA0C2F", "61", "georgia-bulldogs", logoRes = "logo_uga"),
        Team("Florida Gators", "FLA", "#0021A5", "57", "florida-gators", logoRes = "logo_fla"),
        Team("LSU Tigers", "LSU", "#461D7C", "99", "lsu-tigers", logoRes = "logo_lsu"),
        Team("Mississippi State Bulldogs", "MSST", "#660000", "344", "mississippi-state-bulldogs", logoRes = "logo_msu"),
        Team("Oklahoma Sooners", "OU", "#841617", "201", "oklahoma-sooners", logoRes = "logo_ou"),
        Team("South Carolina Gamecocks", "SC", "#73000A", "2579", "south-carolina-gamecocks", logoRes = "logo_sc"),
        Team("Tennessee Volunteers", "TENN", "#FF8200", "2633", "tennessee-volunteers", logoRes = "logo_ten"),
        Team("Vanderbilt Commodores", "VAN", "#866D4B", "238", "vanderbilt-commodores", logoRes = "logo_van"),
        Team("Arkansas Razorbacks", "ARK", "#9D2235", "8", "arkansas-razorbacks", logoRes = "logo_ark"),
        Team("Missouri Tigers", "MIZ", "#F1B82D", "142", "missouri-tigers", logoRes = "logo_miz"),
        Team("Ohio State Buckeyes", "OSU", "#BB0000", "194", "ohio-state-buckeyes", logoRes = "logo_osu"),
        Team("Michigan Wolverines", "MICH", "#00274C", "130", "michigan-wolverines", logoRes = "logo_mich"),
        Team("Illinois Fighting Illini", "ILL", "#E84A27", "356", "illinois-fighting-illini", logoRes = "logo_default"),
        Team("Indiana Hoosiers", "IU", "#990000", "84", "indiana-hoosiers", logoRes = "logo_default"),
        Team("Oregon Ducks", "ORE", "#154733", "2483", "oregon-ducks", logoRes = "logo_default"),
        Team("Penn State Nittany Lions", "PSU", "#041E42", "213", "penn-state-nittany-lions", logoRes = "logo_default"),
        Team("UCLA Bruins", "UCLA", "#2D68C4", "26", "ucla-bruins", logoRes = "logo_default"),
        Team("USC Trojans", "USC", "#8C1515", "30", "usc-trojans", logoRes = "logo_default"),
        Team("Washington Huskies", "WASH", "#4B2E83", "264", "washington-huskies", logoRes = "logo_default"),
        Team("Wisconsin Badgers", "WISC", "#C5050C", "275", "wisconsin-badgers", logoRes = "logo_default"),
        Team("Texas Tech Red Raiders", "TTU", "#CC0000", "2641", "texas-tech-red-raiders", logoRes = "logo_default"),
        Team("BYU Cougars", "BYU", "#002E5D", "252", "byu-cougars", logoRes = "logo_default"),
        Team("Arizona Wildcats", "ARIZ", "#AB0520", "12", "arizona-wildcats", logoRes = "logo_default"),
        Team("Arizona State Sun Devils", "ASU", "#8C1D40", "9", "arizona-state-sun-devils", logoRes = "logo_default"),
        Team("Colorado Buffaloes", "COL", "#CFB87C", "38", "colorado-buffaloes", logoRes = "logo_default"),
        Team("Iowa Hawkeyes", "IOWA", "#FFCD00", "2294", "iowa-hawkeyes", logoRes = "logo_default"),
        Team("Iowa State Cyclones", "ISU", "#C8102E", "66", "iowa-state-cyclones", logoRes = "logo_default"),
        Team("TCU Horned Frogs", "TCU", "#4D1979", "2628", "tcu-horned-frogs", logoRes = "logo_default"),
        Team("Utah Utes", "UTAH", "#BE0000", "254", "utah-utes", logoRes = "logo_default"),
        Team("West Virginia Mountaineers", "WVU", "#EAAA00", "277", "west-virginia-mountaineers", logoRes = "logo_default"),
        Team("Miami Hurricanes", "MIA", "#F47321", "2390", "miami-fl-hurricanes", logoRes = "logo_default"),
        Team("Virginia Cavaliers", "UVA", "#232D4B", "258", "virginia-cavaliers", logoRes = "logo_default"),
        Team("Clemson Tigers", "CLEM", "#F56600", "228", "clemson-tigers", logoRes = "logo_default"),
        Team("Florida State Seminoles", "FSU", "#782F40", "52", "florida-state-seminoles", logoRes = "logo_default"),
        Team("Notre Dame Fighting Irish", "ND", "#0C2340", "87", "notre-dame-fighting-irish", logoRes = "logo_default"),
        Team("SMU Mustangs", "SMU", "#C8102E", "2567", "southern-methodist-mustangs", logoRes = "logo_default"),
        Team("Louisville Cardinals", "LOU", "#AD0000", "97", "louisville-cardinals", logoRes = "logo_default"),
        Team("North Carolina Tar Heels", "UNC", "#7BAFD4", "153", "north-carolina-tar-heels", logoRes = "logo_default"),
        Team("California Golden Bears", "CAL", "#003262", "25", "california-golden-bears", logoRes = "logo_default")
    )
}