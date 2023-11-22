package kg.abdurahim.diaryapp.model

import androidx.compose.ui.graphics.Color
import kg.abdurahim.diaryapp.ui.theme.AngryColor
import kg.abdurahim.diaryapp.ui.theme.AwfulColor
import kg.abdurahim.diaryapp.ui.theme.BoredColor
import kg.abdurahim.diaryapp.ui.theme.CalmColor
import kg.abdurahim.diaryapp.ui.theme.DepressedColor
import kg.abdurahim.diaryapp.ui.theme.DisappointedColor
import kg.abdurahim.diaryapp.ui.theme.HappyColor
import kg.abdurahim.diaryapp.ui.theme.HumorousColor
import kg.abdurahim.diaryapp.ui.theme.LonelyColor
import kg.abdurahim.diaryapp.ui.theme.MysteriousColor
import kg.abdurahim.diaryapp.ui.theme.NeutralColor
import kg.abdurahim.diaryapp.ui.theme.RomanticColor
import kg.abdurahim.diaryapp.ui.theme.ShamefulColor
import kg.abdurahim.diaryapp.ui.theme.SurprisedColor
import kg.abdurahim.diaryapp.ui.theme.SuspiciousColor
import kg.abdurahim.diaryapp.ui.theme.TenseColor
import kg.abu.diaryapp.R

enum class Mood(
    val icon: Int,
    val contentColor: Color,
    val containerColor: Color,
) {

    Neutral(
        icon = R.drawable.neutral,
        contentColor = Color.Black,
        containerColor = NeutralColor
    ),
    Happy(
        icon = R.drawable.happy,
        contentColor = Color.Black,
        containerColor = HappyColor
    ),
    Angry(
        icon = R.drawable.angry,
        contentColor = Color.White,
        containerColor = AngryColor
    ),
    Bored(
        icon = R.drawable.bored,
        contentColor = Color.Black,
        containerColor = BoredColor
    ),
    Calm(
        icon = R.drawable.calm,
        contentColor = Color.Black,
        containerColor = CalmColor
    ),
    Depressed(
        icon = R.drawable.depressed,
        contentColor = Color.Black,
        containerColor = DepressedColor
    ),
    Disappointed(
        icon = R.drawable.disappointed,
        contentColor = Color.White,
        containerColor = DisappointedColor
    ),
    Humorous(
        icon = R.drawable.humorous,
        contentColor = Color.Black,
        containerColor = HumorousColor
    ),
    Lonely(
        icon = R.drawable.lonely,
        contentColor = Color.White,
        containerColor = LonelyColor
    ),
    Mysterious(
        icon = R.drawable.mysterious,
        contentColor = Color.Black,
        containerColor = MysteriousColor
    ),
    Romantic(
        icon = R.drawable.romantic,
        contentColor = Color.White,
        containerColor = RomanticColor
    ),
    Shameful(
        icon = R.drawable.shameful,
        contentColor = Color.White,
        containerColor = ShamefulColor
    ),
    Awful(
        icon = R.drawable.awful,
        contentColor = Color.Black,
        containerColor = AwfulColor
    ),
    Surprised(
        icon = R.drawable.surprised,
        contentColor = Color.Black,
        containerColor = SurprisedColor
    ),
    Suspicious(
        icon = R.drawable.suspicious,
        contentColor = Color.Black,
        containerColor = SuspiciousColor
    ),
    Tense(
        icon = R.drawable.tense,
        contentColor = Color.Black,
        containerColor = TenseColor
    )

}