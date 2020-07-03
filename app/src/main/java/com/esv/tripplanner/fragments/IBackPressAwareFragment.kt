package com.esv.tripplanner.fragments

interface IBackPressAwareFragment{
    fun onSupportNavigateUpTriggered()
    fun onBackPressedTriggered()
}