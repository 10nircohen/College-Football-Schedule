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
        Team("Auburn Tigers", "AUB", "#03244D", "2", "auburn-tigers"),
        Team("Georgia Bulldogs", "UGA", "#BA0C2F", "61", "georgia-bulldogs"),
        Team("Florida Gators", "FLA", "#0021A5", "57", "florida-gators"),
        Team("LSU Tigers", "LSU", "#461D7C", "99", "lsu-tigers"),
        Team("Ole Miss Rebels", "MISS", "#14213D", "145", "ole-miss-rebels"),
        Team("Mississippi State Bulldogs", "MSST", "#660000", "344", "mississippi-state-bulldogs"),
        Team("Oklahoma Sooners", "OU", "#841617", "201", "oklahoma-sooners"),
        Team("South Carolina Gamecocks", "SC", "#73000A", "2579", "south-carolina-gamecocks"),
        Team("Tennessee Volunteers", "TENN", "#FF8200", "2633", "tennessee-volunteers"),
        Team("Vanderbilt Commodores", "VAN", "#866D4B", "238", "vanderbilt-commodores"),
        Team("Arkansas Razorbacks", "ARK", "#9D2235", "8", "arkansas-razorbacks"),
        Team("Missouri Tigers", "MIZ", "#F1B82D", "142", "missouri-tigers"),
        Team("Ohio State Buckeyes", "OSU", "#BB0000", "194", "ohio-state-buckeyes"),
        Team("Michigan Wolverines", "MICH", "#00274C", "130", "michigan-wolverines"),
        Team("Illinois Fighting Illini", "ILL", "#E84A27", "356", "illinois-fighting-illini"),
        Team("Indiana Hoosiers", "IU", "#990000", "84", "indiana-hoosiers"),
        Team("Oregon Ducks", "ORE", "#154733", "2483", "oregon-ducks"),
        Team("Penn State Nittany Lions", "PSU", "#041E42", "213", "penn-state-nittany-lions"),
        Team("UCLA Bruins", "UCLA", "#2D68C4", "26", "ucla-bruins"),
        Team("USC Trojans", "USC", "#8C1515", "30", "usc-trojans"),
        Team("Washington Huskies", "WASH", "#4B2E83", "264", "washington-huskies"),
        Team("Wisconsin Badgers", "WISC", "#C5050C", "275", "wisconsin-badgers"),
        Team("Texas Tech Red Raiders", "TTU", "#CC0000", "2641", "texas-tech-red-raiders"),
        Team("BYU Cougars", "BYU", "#002E5D", "252", "byu-cougars"),
        Team("Arizona Wildcats", "ARIZ", "#AB0520", "12", "arizona-wildcats"),
        Team("Arizona State Sun Devils", "ASU", "#8C1D40", "9", "arizona-state-sun-devils"),
        Team("Colorado Buffaloes", "COL", "#CFB87C", "38", "colorado-buffaloes"),
        Team("Iowa Hawkeyes", "IOWA", "#FFCD00", "2294", "iowa-hawkeyes"),
        Team("Iowa State Cyclones", "ISU", "#C8102E", "66", "iowa-state-cyclones"),
        Team("TCU Horned Frogs", "TCU", "#4D1979", "2628", "tcu-horned-frogs"),
        Team("Utah Utes", "UTAH", "#BE0000", "254", "utah-utes"),
        Team("West Virginia Mountaineers", "WVU", "#EAAA00", "277", "west-virginia-mountaineers"),
        Team("Miami Hurricanes", "MIA", "#F47321", "2390", "miami-fl-hurricanes"),
        Team("Virginia Cavaliers", "UVA", "#232D4B", "258", "virginia-cavaliers"),
        Team("Clemson Tigers", "CLEM", "#F56600", "228", "clemson-tigers"),
        Team("Florida State Seminoles", "FSU", "#782F40", "52", "florida-state-seminoles"),
        Team("Notre Dame Fighting Irish", "ND", "#0C2340", "87", "notre-dame-fighting-irish"),
        Team("SMU Mustangs", "SMU", "#C8102E", "2567", "southern-methodist-mustangs"),
        Team("Louisville Cardinals", "LOU", "#AD0000", "97", "louisville-cardinals"),
        Team("North Carolina Tar Heels", "UNC", "#7BAFD4", "153", "north-carolina-tar-heels"),
        Team("California Golden Bears", "CAL", "#003262", "25", "california-golden-bears")
    )
}