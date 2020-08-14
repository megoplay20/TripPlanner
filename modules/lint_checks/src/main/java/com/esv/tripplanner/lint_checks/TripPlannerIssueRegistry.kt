package com.esv.tripplanner.lint_checks

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.Issue

class TripPlannerIssueRegistry : IssueRegistry() {
    override val issues: List<Issue>
        get() = listOf(ToggleLayoutXmlStructureCheck.ISSUE)
}