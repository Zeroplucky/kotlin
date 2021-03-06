/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.compiler.javac;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class LoadJava8UsingJavacTestGenerated extends AbstractLoadJava8UsingJavacTest {
    @TestMetadata("compiler/testData/loadJava8/compiledJava")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CompiledJava extends AbstractLoadJava8UsingJavacTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestCompiledJava, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInCompiledJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/loadJava8/compiledJava"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, true);
        }

        @TestMetadata("InnerClassTypeAnnotation.java")
        public void testInnerClassTypeAnnotation() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/InnerClassTypeAnnotation.java");
        }

        @TestMetadata("MapRemove.java")
        public void testMapRemove() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/MapRemove.java");
        }

        @TestMetadata("TypeAnnotations.java")
        public void testTypeAnnotations() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/TypeAnnotations.java");
        }

        @TestMetadata("TypeParameterAnnotations.java")
        public void testTypeParameterAnnotations() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/TypeParameterAnnotations.java");
        }
    }

    @TestMetadata("compiler/testData/loadJava8/sourceJava")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SourceJava extends AbstractLoadJava8UsingJavacTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestSourceJava, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInSourceJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/loadJava8/sourceJava"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, true);
        }

        @TestMetadata("MapRemove.java")
        public void testMapRemove() throws Exception {
            runTest("compiler/testData/loadJava8/sourceJava/MapRemove.java");
        }

        @TestMetadata("TypeAnnotations.java")
        public void testTypeAnnotations() throws Exception {
            runTest("compiler/testData/loadJava8/sourceJava/TypeAnnotations.java");
        }

        @TestMetadata("TypeParameterAnnotations.java")
        public void testTypeParameterAnnotations() throws Exception {
            runTest("compiler/testData/loadJava8/sourceJava/TypeParameterAnnotations.java");
        }
    }
}
