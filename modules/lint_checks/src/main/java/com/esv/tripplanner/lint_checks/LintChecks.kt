@file:Suppress("UnstableApiUsage")

package com.esv.tripplanner.lint_checks

import com.android.tools.lint.detector.api.*
import com.android.utils.forEach
import org.w3c.dom.Element
import org.w3c.dom.Node.ELEMENT_NODE
import java.util.*

class ToggleLayoutXmlStructureCheck : ResourceXmlDetector(){
    companion object {
        private const val EXPLANATION = "Компонент ToggleLayout требует определенных" +
                " настроект в Xml для его корректной работы," +
                " а именно наличия составных частей SHOW_BUTTON, HIDE_BUTTON, CONTENT"
        private const val DESCRIPTION = EXPLANATION

        val ISSUE = Issue.create(
            "RequiredToggleLayoutSettingsNotSatisfied",
            DESCRIPTION,
            EXPLANATION,
            Category.CORRECTNESS,
            8,
            Severity.ERROR,
            Implementation(ToggleLayoutXmlStructureCheck::class.java, Scope.RESOURCE_FILE_SCOPE)
        )

        val requiredAttributes = setOf("SHOW_BUTTON", "HIDE_BUTTON", "CONTENT")
    }

    override fun getApplicableElements(): Collection<String>? {
        return Collections.singletonList(
            "com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout");
    }

    override fun visitElement(context: XmlContext, element: Element) {

        val requiredSet: MutableSet<String> =
            mutableSetOf(*requiredAttributes.toList().toTypedArray())

        (0 until element.childNodes.length).asSequence().map {
            element.childNodes.item(it)
        }.filter {
            it.nodeType == ELEMENT_NODE }
            .mapNotNull { uiElement ->
                var desiredAttributeValue:String? = null
                uiElement.attributes?.forEach{
                        if(it.nodeName == "app:layout_viewRole"){
                            desiredAttributeValue = it.nodeValue
                        }
                }
                desiredAttributeValue
            }
            .forEach {
                if (it in requiredSet) {
                    requiredSet.remove(it)
                }
            }

        if (requiredSet.size != 0) {
                context.report(ISSUE, context.getLocation(element), "Отсутвуют элементы: ${requiredSet.joinToString(", ")} ${DESCRIPTION}")
        }
    }

}