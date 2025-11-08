/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.cyclonedx.schema.bom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Task Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getTaskTypeEnum()
 * @model extendedMetaData="name='taskTypeEnum'"
 * @generated
 */
@ProviderType
public enum TaskTypeEnum implements Enumerator {
	/**
	 * The '<em><b>Copy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that copies software or data used to accomplish other tasks in the workflow.
	 * <!-- end-model-doc -->
	 * @see #COPY_VALUE
	 * @generated
	 * @ordered
	 */
	COPY(0, "copy", "copy"),

	/**
	 * The '<em><b>Clone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that clones a software repository into the workflow in order to retrieve its source code or data for use in a build step.
	 * <!-- end-model-doc -->
	 * @see #CLONE_VALUE
	 * @generated
	 * @ordered
	 */
	CLONE(1, "clone", "clone"),

	/**
	 * The '<em><b>Lint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that checks source code for programmatic and stylistic errors.
	 * <!-- end-model-doc -->
	 * @see #LINT_VALUE
	 * @generated
	 * @ordered
	 */
	LINT(2, "lint", "lint"),

	/**
	 * The '<em><b>Scan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that performs a scan against source code, or built or deployed components and services. Scans are typically run to gather or test for security vulnerabilities or policy compliance.
	 * <!-- end-model-doc -->
	 * @see #SCAN_VALUE
	 * @generated
	 * @ordered
	 */
	SCAN(3, "scan", "scan"),

	/**
	 * The '<em><b>Merge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that merges changes or fixes into source code prior to a build step in the workflow.
	 * <!-- end-model-doc -->
	 * @see #MERGE_VALUE
	 * @generated
	 * @ordered
	 */
	MERGE(4, "merge", "merge"),

	/**
	 * The '<em><b>Build</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that builds the source code, dependencies and/or data into an artifact that can be deployed to and executed on target systems.
	 * <!-- end-model-doc -->
	 * @see #BUILD_VALUE
	 * @generated
	 * @ordered
	 */
	BUILD(5, "build", "build"),

	/**
	 * The '<em><b>Test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that verifies the functionality of a component or service.
	 * <!-- end-model-doc -->
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(6, "test", "test"),

	/**
	 * The '<em><b>Deliver</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that delivers a built artifact to one or more target repositories or storage systems.
	 * <!-- end-model-doc -->
	 * @see #DELIVER_VALUE
	 * @generated
	 * @ordered
	 */
	DELIVER(7, "deliver", "deliver"),

	/**
	 * The '<em><b>Deploy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that deploys a built artifact for execution on one or more target systems.
	 * <!-- end-model-doc -->
	 * @see #DEPLOY_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOY(8, "deploy", "deploy"),

	/**
	 * The '<em><b>Release</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that releases a built, versioned artifact to a target repository or distribution system.
	 * <!-- end-model-doc -->
	 * @see #RELEASE_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASE(9, "release", "release"),

	/**
	 * The '<em><b>Clean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that cleans unnecessary tools, build artifacts and/or data from workflow storage.
	 * <!-- end-model-doc -->
	 * @see #CLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAN(10, "clean", "clean"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A workflow task that does not match current task type definitions.
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(11, "other", "other");

	/**
	 * The '<em><b>Copy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that copies software or data used to accomplish other tasks in the workflow.
	 * <!-- end-model-doc -->
	 * @see #COPY
	 * @model name="copy"
	 * @generated
	 * @ordered
	 */
	public static final int COPY_VALUE = 0;

	/**
	 * The '<em><b>Clone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that clones a software repository into the workflow in order to retrieve its source code or data for use in a build step.
	 * <!-- end-model-doc -->
	 * @see #CLONE
	 * @model name="clone"
	 * @generated
	 * @ordered
	 */
	public static final int CLONE_VALUE = 1;

	/**
	 * The '<em><b>Lint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that checks source code for programmatic and stylistic errors.
	 * <!-- end-model-doc -->
	 * @see #LINT
	 * @model name="lint"
	 * @generated
	 * @ordered
	 */
	public static final int LINT_VALUE = 2;

	/**
	 * The '<em><b>Scan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that performs a scan against source code, or built or deployed components and services. Scans are typically run to gather or test for security vulnerabilities or policy compliance.
	 * <!-- end-model-doc -->
	 * @see #SCAN
	 * @model name="scan"
	 * @generated
	 * @ordered
	 */
	public static final int SCAN_VALUE = 3;

	/**
	 * The '<em><b>Merge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that merges changes or fixes into source code prior to a build step in the workflow.
	 * <!-- end-model-doc -->
	 * @see #MERGE
	 * @model name="merge"
	 * @generated
	 * @ordered
	 */
	public static final int MERGE_VALUE = 4;

	/**
	 * The '<em><b>Build</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that builds the source code, dependencies and/or data into an artifact that can be deployed to and executed on target systems.
	 * <!-- end-model-doc -->
	 * @see #BUILD
	 * @model name="build"
	 * @generated
	 * @ordered
	 */
	public static final int BUILD_VALUE = 5;

	/**
	 * The '<em><b>Test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that verifies the functionality of a component or service.
	 * <!-- end-model-doc -->
	 * @see #TEST
	 * @model name="test"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 6;

	/**
	 * The '<em><b>Deliver</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that delivers a built artifact to one or more target repositories or storage systems.
	 * <!-- end-model-doc -->
	 * @see #DELIVER
	 * @model name="deliver"
	 * @generated
	 * @ordered
	 */
	public static final int DELIVER_VALUE = 7;

	/**
	 * The '<em><b>Deploy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that deploys a built artifact for execution on one or more target systems.
	 * <!-- end-model-doc -->
	 * @see #DEPLOY
	 * @model name="deploy"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOY_VALUE = 8;

	/**
	 * The '<em><b>Release</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that releases a built, versioned artifact to a target repository or distribution system.
	 * <!-- end-model-doc -->
	 * @see #RELEASE
	 * @model name="release"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_VALUE = 9;

	/**
	 * The '<em><b>Clean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A task that cleans unnecessary tools, build artifacts and/or data from workflow storage.
	 * <!-- end-model-doc -->
	 * @see #CLEAN
	 * @model name="clean"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAN_VALUE = 10;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A workflow task that does not match current task type definitions.
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 11;

	/**
	 * An array of all the '<em><b>Task Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskTypeEnum[] VALUES_ARRAY =
		new TaskTypeEnum[] {
			COPY,
			CLONE,
			LINT,
			SCAN,
			MERGE,
			BUILD,
			TEST,
			DELIVER,
			DEPLOY,
			RELEASE,
			CLEAN,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Task Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaskTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TaskTypeEnum get(int value) {
		switch (value) {
			case COPY_VALUE: return COPY;
			case CLONE_VALUE: return CLONE;
			case LINT_VALUE: return LINT;
			case SCAN_VALUE: return SCAN;
			case MERGE_VALUE: return MERGE;
			case BUILD_VALUE: return BUILD;
			case TEST_VALUE: return TEST;
			case DELIVER_VALUE: return DELIVER;
			case DEPLOY_VALUE: return DEPLOY;
			case RELEASE_VALUE: return RELEASE;
			case CLEAN_VALUE: return CLEAN;
			case OTHER_VALUE: return OTHER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TaskTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TaskTypeEnum
