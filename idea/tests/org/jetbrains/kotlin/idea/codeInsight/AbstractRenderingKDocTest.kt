/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.codeInsight

import org.jetbrains.kotlin.idea.test.KotlinLightCodeInsightFixtureTestCase

//BUNCH 201
abstract class AbstractRenderingKDocTest : KotlinLightCodeInsightFixtureTestCase() {
    protected fun doTest(path: String) = Unit
}
