package com.esv.tripplanner.lint_checks

import com.android.tools.lint.checks.infrastructure.LintDetectorTest
import com.android.tools.lint.checks.infrastructure.TestLintTask
import org.junit.After
import org.junit.Before
import org.junit.Test

class ToggleLayoutXmlStructureCheckTest {

    @Test
    fun `Test ToggleLayout control children element parameters - SUCCESS Src file`() {

        val contentFile = """<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:bind="http://schemas.android.com/tools"
    xmlns:tools="http://schemas.android.com/tools">

    <data>

        <variable
            name="viewModel"
            type="com.esv.tripplanner.newroute.viewModels.NewRouteViewModel" />
    </data>

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <EditText
            android:id="@+id/name"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="8dp"
            android:layout_marginTop="8dp"
            android:layout_marginEnd="8dp"
            android:ems="10"
            android:hint="@string/route_name_hint"
            android:inputType="text"
            android:text="@={viewModel.tripName}"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <EditText
            android:id="@+id/date"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="8dp"
            android:layout_marginTop="8dp"
            android:layout_marginEnd="8dp"
            android:ems="10"
            android:hint="@string/route_date_hint"
            android:inputType="date"
            android:text="@={viewModel.dateAsText}"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/name" />


        <com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout
            android:id="@+id/route_gen_layout"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="8dp"
            android:layout_marginTop="8dp"
            android:layout_marginEnd="8dp"
            app:hideContentByDefault="true"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/date">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="@string/RouteBuildingSection"
                app:layout_viewRole="SECTION_LABEL"
                />

            <androidx.appcompat.widget.AppCompatImageView
                android:id="@+id/show_items"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_childDesiredHeight="30dp"
                app:layout_childDesiredWidth="50dp"
                app:layout_viewRole="SHOW_BUTTON"
                app:srcCompat="@drawable/ic_baseline_arrow_drop_up_24" />

            <androidx.appcompat.widget.AppCompatImageView
                android:id="@+id/hide_items"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_childDesiredHeight="30dp"
                app:layout_childDesiredWidth="50dp"
                app:layout_viewRole="HIDE_BUTTON"
                app:srcCompat="@drawable/ic_baseline_arrow_drop_down_24" />

            <include
                android:id="@+id/toggle_content"
                layout="@layout/route_generator_layout"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"

                app:layout_viewRole="CONTENT"
                bind:viewModel="@{viewModel.routeViewModel}" />

        </com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout>

        <TextView
            android:id="@+id/textView2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginStart="8dp"
            android:layout_marginTop="8dp"
            android:text="@string/PlaceList"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/route_gen_layout" />


        <Button
            android:id="@+id/button"
            style="@style/Widget.MaterialComponents.Button.OutlinedButton.Icon"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="8dp"
            android:layout_marginEnd="8dp"
            android:onClick="@{()->viewModel.addVisitPlace()}"
            android:text="@string/addPlace"
            android:textAllCaps="false"
            app:icon="@drawable/ic_add_black_24dp"
            app:layout_constraintBottom_toBottomOf="@+id/textView2"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toEndOf="@+id/textView2"
            app:layout_constraintTop_toTopOf="@+id/textView2" />

        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/placesList"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="8dp"
            android:layout_marginTop="8dp"
            android:layout_marginEnd="8dp"
            android:paddingBottom="160dp"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/barrier"
            tools:listitem="@layout/point_of_interest_visit_plan_layout" />

        <androidx.constraintlayout.widget.Barrier
            android:id="@+id/barrier"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:barrierDirection="bottom"
            app:constraint_referenced_ids="textView2,button,route_gen_layout"
            tools:layout_editor_absoluteY="731dp" />

        <include
            android:id="@+id/loader"
            layout="@layout/loader_layout"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintBottom_toBottomOf="parent"
            bind:viewModel="@{viewModel.routeViewModel.loaderViewModel}"
            tools:visibility="gone"
            />

    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>"""


        TestLintTask.lint()
            .allowMissingSdk()
            .files(LintDetectorTest.xml("res/layout/new_route_fragment.xml", contentFile))
            .issues(ToggleLayoutXmlStructureCheck.ISSUE)
            .run()
    }


    @Test
    fun `Test ToggleLayout control children element parameters - SUCCESS`() {

        val contentFile = """<?xml version="1.0" encoding="utf-8"?>
            
            <layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:bind="http://schemas.android.com/tools"
    xmlns:tools="http://schemas.android.com/tools">
            <com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout  
                android:id='@+id/route_gen_layout'
                
            >
            <androidx.appcompat.widget.AppCompatImageView
                android:id="@+id/show_items"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_childDesiredHeight="30dp"
                app:layout_childDesiredWidth="50dp"
                app:layout_viewRole="SHOW_BUTTON"
                app:srcCompat="@drawable/ic_baseline_arrow_drop_up_24" />

            <androidx.appcompat.widget.AppCompatImageView
                android:id="@+id/hide_items"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_childDesiredHeight="30dp"
                app:layout_childDesiredWidth="50dp"
                app:layout_viewRole="HIDE_BUTTON"
                app:srcCompat="@drawable/ic_baseline_arrow_drop_down_24" />

            <include
                android:id="@+id/toggle_content"
                layout="@layout/route_generator_layout"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"

                app:layout_viewRole="CONTENT"
                bind:viewModel="@{viewModel.routeViewModel}"/>

            </com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout>
            </layout>"""

        TestLintTask.lint()
            .allowMissingSdk()
            .files(LintDetectorTest.xml("res/layout/new_route_fragment.xml", contentFile))
            .issues(ToggleLayoutXmlStructureCheck.ISSUE)
            .run()
    }


    @Test
    fun `Test ToggleLayout control children element parameters - ERROR`() {

        val contentFile = """<?xml version="1.0" encoding="utf-8"?>
            
            <layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:bind="http://schemas.android.com/tools"
    xmlns:tools="http://schemas.android.com/tools">
            <com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout  
                android:id='@+id/route_gen_layout'
                
            >
            <androidx.appcompat.widget.AppCompatImageView
                android:id="@+id/show_items"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                app:layout_childDesiredHeight="30dp"
                app:layout_childDesiredWidth="50dp"
                app:layout_viewRole="SHOW_BUTTON"
                app:srcCompat="@drawable/ic_baseline_arrow_drop_up_24" />
            

            <include
                android:id="@+id/toggle_content"
                layout="@layout/route_generator_layout"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"

                app:layout_viewRole="CONTENT"
                bind:viewModel="@{viewModel.routeViewModel}"/>

            </com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout>
            </layout>"""

        TestLintTask.lint()
            .allowMissingSdk()
            .files(LintDetectorTest.xml("res/layout/new_route_fragment.xml", contentFile))
            .issues(ToggleLayoutXmlStructureCheck.ISSUE)
            .run()
            .expect("res/layout/new_route_fragment.xml:7: Error: Отсутвуют элементы: HIDE_BUTTON Компонент ToggleLayout требует определенных настроект в Xml для его корректной работы, а именно наличия составных частей SHOW_BUTTON, HIDE_BUTTON, CONTENT [RequiredToggleLayoutSettingsNotSatisfied]\n" +
                    "            <com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout  \n" +
                    "            ^\n" +
                    "1 errors, 0 warnings")
    }


    @Test
    fun `Test ToggleLayout control children element parameters - ERROR EMPTY BODY`() {

        val contentFile = """<?xml version="1.0" encoding="utf-8"?>
            
            <layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:bind="http://schemas.android.com/tools"
    xmlns:tools="http://schemas.android.com/tools">
            <com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout  
                android:id='@+id/route_gen_layout'
                
            >
            

            </com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout>
            </layout>"""

        TestLintTask.lint()
            .allowMissingSdk()
            .files(LintDetectorTest.xml("res/layout/new_route_fragment.xml", contentFile))
            .issues(ToggleLayoutXmlStructureCheck.ISSUE)
            .run()
            .expect("res/layout/new_route_fragment.xml:7: Error: Отсутвуют элементы: SHOW_BUTTON, HIDE_BUTTON, CONTENT Компонент ToggleLayout требует определенных настроект в Xml для его корректной работы, а именно наличия составных частей SHOW_BUTTON, HIDE_BUTTON, CONTENT [RequiredToggleLayoutSettingsNotSatisfied]\n" +
                    "            <com.esv.tripplanner.shared_ui.customUiControls.ToggleLayout  \n" +
                    "            ^\n" +
                    "1 errors, 0 warnings")
    }

}


