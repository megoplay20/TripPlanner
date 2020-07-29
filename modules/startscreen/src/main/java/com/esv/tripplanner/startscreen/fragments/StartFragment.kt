package com.esv.tripplanner.startscreen.fragments

import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.TextAppearanceSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.OvershootInterpolator
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.esv.tripplanner.core_api.di.AppWithFacade
import com.esv.tripplanner.startscreen.R
import com.esv.tripplanner.startscreen.databinding.StartFragmentBinding
import com.esv.tripplanner.startscreen.di.StartComponent
import com.esv.tripplanner.startscreen.viewModels.StartFragmentViewModel
import kotlinx.android.synthetic.main.start_fragment.*
import javax.inject.Inject


class StartFragment : com.esv.tripplanner.core_api.ui.InjectableFragment() {

    val TITLE_INDEX: String ="TITLE_INDEX"

    @Inject
    lateinit var repository: com.esv.tripplanner.core_api.repositories.ITripRepository

    @Inject
    lateinit var navigationProvider: com.esv.tripplanner.core_api.navigation.INavigationProvider

    private lateinit  var viewModel: StartFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<StartFragmentBinding>(
            inflater,
            R.layout.start_fragment,
            container,
            false
        );

        viewModel = ViewModelProvider(
            requireActivity(),
            com.esv.tripplanner.core_api.viewModelFactories.CustomViewModelProviderFactory() {
                StartFragmentViewModel(
                    this.requireActivity().application,
                    repository,
                    navigationProvider
                )
            }
        ).get(StartFragmentViewModel::class.java)



        binding.viewModel = viewModel
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        animateWelcomeText()
        runAppTitleAnimation()
    }

    private fun animateWelcomeText() {
        welcome_text?.let {

            val destScale = if(it.scaleX > 1f){1f}else{1.5f}

            it.animate().scaleX(destScale).scaleY(destScale)
                .setInterpolator(OvershootInterpolator())
                .setDuration(1000)
                .withEndAction(){animateWelcomeText()}
                .start()
        }
    }

    private fun runAppTitleAnimation(){
            val textIndexHolder = PropertyValuesHolder.ofInt(TITLE_INDEX, *(0..app_title.text.length).toList().toIntArray())
            val srcTitleText = app_title.text
            ValueAnimator().apply {
                setValues(textIndexHolder)
                duration = 1500
                repeatCount =  ValueAnimator.INFINITE
                repeatMode = ValueAnimator.REVERSE
                addUpdateListener {
                    val index = it.getAnimatedValue(TITLE_INDEX) as Int
                    val spannableText = SpannableString(srcTitleText)
                    spannableText.setSpan(
                        TextAppearanceSpan(context, com.esv.tripplanner.shared_ui.R.style.TitleSpannableTextStyle),
                        index,
                        if(index != srcTitleText.length) {index+1}else{index},
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
                    spannableText.setSpan(
                        ForegroundColorSpan(resources.getColor(R.color.design_default_color_error)),
                        index,
                        if(index != srcTitleText.length) {index+1}else{index},
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    )
                    app_title?.let {
                        app_title.setText(spannableText, TextView.BufferType.SPANNABLE)
                    }
                }
            }.start()
    }

    override fun performInjection() {
        StartComponent.createComponent((requireActivity().application as AppWithFacade)
            .getProvidersFacade())
            .inject(this);
    }

}