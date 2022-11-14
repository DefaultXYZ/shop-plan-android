package xyz.shop.plan.presentation.plan

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.shop.plan.R
import xyz.shop.plan.extensions.PreviewContainer
import xyz.shop.plan.utils.compose.PreviewObjects

@Composable
fun PlanScreen(
    modifier: Modifier = Modifier,
    viewModel: PlanViewModel
) {
    val items: List<PlanListItem> = viewModel.items
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        if (items.isEmpty()) {
            EmptyPlanListContent()
        } else {
            PlanListContent(items = items)
        }
    }
}

@Composable
fun EmptyPlanListContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(R.string.plan_list_empty_content_text))
    }
}

@Composable
fun PlanListContent(
    modifier: Modifier = Modifier,
    items: List<PlanListItem>
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(6.dp),
        contentPadding = PaddingValues(6.dp)
    ) {
        items(
            count = items.size,
            key = { items[it].id }
        ) {
            PlanListCard(item = items[it])
        }
    }
}

@Composable
fun PlanListCard(
    modifier: Modifier = Modifier,
    item: PlanListItem
) {
    Card(
        modifier = modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(6.dp)) {
            Text(item.formattedDateTime())
            Text(item.provideTitle())
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewEmptyPlanListContent() {
    PreviewContainer {
        EmptyPlanListContent()
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewPlanListContent() {
    PreviewContainer {
        PlanListContent(items = PreviewObjects.planListItems)
    }
}

@Preview
@Composable
fun PreviewPlanListCard() {
    PreviewContainer {
        PlanListCard(item = PreviewObjects.planListItem)
    }
}
