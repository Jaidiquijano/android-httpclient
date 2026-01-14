package es.fpsumma.dam2.api.ui.screen.tareas

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import es.fpsumma.dam2.api.ui.navegation.Routes
import es.fpsumma.dam2.api.viewmodel.TareasViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NuevaTareaRoomRoute(
    navController: NavController,
    vm: TareasViewModel
)
{
    NuevaTareaContent(
        onBack = { navController.popBackStack() },
        onSave = { titulo, descripcion ->

            vm.viewModelScope.launch {
                vm.addTarea(titulo, descripcion)
                navController.navigate(Routes.TAREA_LISTADO) {

                    popUpTo(Routes.TAREA_LISTADO) { inclusive = false }
                }
            }
        }
    )
}
