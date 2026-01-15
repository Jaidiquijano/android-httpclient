package es.fpsumma.dam2.api.ui.screen.tareas

import ListadoTareasContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import es.fpsumma.dam2.api.ui.navegation.Routes
import es.fpsumma.dam2.api.viewmodel.TareasRemoteViewModel
import es.fpsumma.dam2.api.viewmodel.TareasViewModel

@Composable
fun ListadoTareasRemoteRoute(
    navController: NavController,
    vm: TareasRemoteViewModel,
    modifier: Modifier = Modifier,
){
    LaunchedEffect(Unit) {
        vm.loadTareas()

    }
    val state by vm.state.collectAsState()

    ListadoTareasContent(
        state = state,
        onBack = { navController.popBackStack() },
        onAdd = { navController.navigate(Routes.TAREA_ADD) },
        onOpenDetalle = { id -> navController.navigate(Routes.tareaView(id)) },
        onDelete = {id -> vm.eliminarTarea(id)},
        modifier = modifier,
    )

}

