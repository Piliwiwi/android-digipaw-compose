package com.arech.digipaw.pet.list.presentation.list

import com.arech.digipaw.pet.list.presentation.model.PetCard
import com.arech.mvi.events.MviUiState

/**
 * Created by Pili Arancibia on 15-08-22.
 */

sealed class ListUiState : MviUiState {
    object DefaultUiState : ListUiState()
    object LoadingUiState : ListUiState()
    object ErrorUiState : ListUiState()
    data class ShowPetCardListUiState(val pets: List<PetCard>) : ListUiState()
}
