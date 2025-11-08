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
 * A representation of the literals of the enumeration '<em><b>Impact Analysis Justification Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *                 The rationale of why the impact analysis state was asserted.
 *             
 * <!-- end-model-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getImpactAnalysisJustificationType()
 * @model extendedMetaData="name='impactAnalysisJustificationType'"
 * @generated
 */
@ProviderType
public enum ImpactAnalysisJustificationType implements Enumerator {
	/**
	 * The '<em><b>Code Not Present</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The code has been removed or tree-shaked.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CODE_NOT_PRESENT_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_NOT_PRESENT(0, "codeNotPresent", "code_not_present"),

	/**
	 * The '<em><b>Code Not Reachable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerable code is not invoked at runtime.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CODE_NOT_REACHABLE_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_NOT_REACHABLE(1, "codeNotReachable", "code_not_reachable"),

	/**
	 * The '<em><b>Requires Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Exploitability requires a configurable option to be set/unset.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #REQUIRES_CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRES_CONFIGURATION(2, "requiresConfiguration", "requires_configuration"),

	/**
	 * The '<em><b>Requires Dependency</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Exploitability requires a dependency that is not present.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #REQUIRES_DEPENDENCY_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRES_DEPENDENCY(3, "requiresDependency", "requires_dependency"),

	/**
	 * The '<em><b>Requires Environment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Exploitability requires a certain environment which is not present.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #REQUIRES_ENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRES_ENVIRONMENT(4, "requiresEnvironment", "requires_environment"),

	/**
	 * The '<em><b>Protected By Compiler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Exploitability requires a compiler flag to be set/unset.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #PROTECTED_BY_COMPILER_VALUE
	 * @generated
	 * @ordered
	 */
	PROTECTED_BY_COMPILER(5, "protectedByCompiler", "protected_by_compiler"),

	/**
	 * The '<em><b>Protected At Runtime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Exploits are prevented at runtime.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #PROTECTED_AT_RUNTIME_VALUE
	 * @generated
	 * @ordered
	 */
	PROTECTED_AT_RUNTIME(6, "protectedAtRuntime", "protected_at_runtime"),

	/**
	 * The '<em><b>Protected At Perimeter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Attacks are blocked at physical, logical, or network perimeter.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #PROTECTED_AT_PERIMETER_VALUE
	 * @generated
	 * @ordered
	 */
	PROTECTED_AT_PERIMETER(7, "protectedAtPerimeter", "protected_at_perimeter"),

	/**
	 * The '<em><b>Protected By Mitigating Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Preventative measures have been implemented that reduce the likelihood and/or impact of the vulnerability.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #PROTECTED_BY_MITIGATING_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	PROTECTED_BY_MITIGATING_CONTROL(8, "protectedByMitigatingControl", "protected_by_mitigating_control");

	/**
	 * The '<em><b>Code Not Present</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The code has been removed or tree-shaked.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CODE_NOT_PRESENT
	 * @model name="codeNotPresent" literal="code_not_present"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_NOT_PRESENT_VALUE = 0;

	/**
	 * The '<em><b>Code Not Reachable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The vulnerable code is not invoked at runtime.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #CODE_NOT_REACHABLE
	 * @model name="codeNotReachable" literal="code_not_reachable"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_NOT_REACHABLE_VALUE = 1;

	/**
	 * The '<em><b>Requires Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Exploitability requires a configurable option to be set/unset.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #REQUIRES_CONFIGURATION
	 * @model name="requiresConfiguration" literal="requires_configuration"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRES_CONFIGURATION_VALUE = 2;

	/**
	 * The '<em><b>Requires Dependency</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Exploitability requires a dependency that is not present.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #REQUIRES_DEPENDENCY
	 * @model name="requiresDependency" literal="requires_dependency"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRES_DEPENDENCY_VALUE = 3;

	/**
	 * The '<em><b>Requires Environment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Exploitability requires a certain environment which is not present.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #REQUIRES_ENVIRONMENT
	 * @model name="requiresEnvironment" literal="requires_environment"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRES_ENVIRONMENT_VALUE = 4;

	/**
	 * The '<em><b>Protected By Compiler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Exploitability requires a compiler flag to be set/unset.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #PROTECTED_BY_COMPILER
	 * @model name="protectedByCompiler" literal="protected_by_compiler"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_BY_COMPILER_VALUE = 5;

	/**
	 * The '<em><b>Protected At Runtime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Exploits are prevented at runtime.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #PROTECTED_AT_RUNTIME
	 * @model name="protectedAtRuntime" literal="protected_at_runtime"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_AT_RUNTIME_VALUE = 6;

	/**
	 * The '<em><b>Protected At Perimeter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Attacks are blocked at physical, logical, or network perimeter.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #PROTECTED_AT_PERIMETER
	 * @model name="protectedAtPerimeter" literal="protected_at_perimeter"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_AT_PERIMETER_VALUE = 7;

	/**
	 * The '<em><b>Protected By Mitigating Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Preventative measures have been implemented that reduce the likelihood and/or impact of the vulnerability.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #PROTECTED_BY_MITIGATING_CONTROL
	 * @model name="protectedByMitigatingControl" literal="protected_by_mitigating_control"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECTED_BY_MITIGATING_CONTROL_VALUE = 8;

	/**
	 * An array of all the '<em><b>Impact Analysis Justification Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImpactAnalysisJustificationType[] VALUES_ARRAY =
		new ImpactAnalysisJustificationType[] {
			CODE_NOT_PRESENT,
			CODE_NOT_REACHABLE,
			REQUIRES_CONFIGURATION,
			REQUIRES_DEPENDENCY,
			REQUIRES_ENVIRONMENT,
			PROTECTED_BY_COMPILER,
			PROTECTED_AT_RUNTIME,
			PROTECTED_AT_PERIMETER,
			PROTECTED_BY_MITIGATING_CONTROL,
		};

	/**
	 * A public read-only list of all the '<em><b>Impact Analysis Justification Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImpactAnalysisJustificationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Impact Analysis Justification Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisJustificationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpactAnalysisJustificationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impact Analysis Justification Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisJustificationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImpactAnalysisJustificationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Impact Analysis Justification Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ImpactAnalysisJustificationType get(int value) {
		switch (value) {
			case CODE_NOT_PRESENT_VALUE: return CODE_NOT_PRESENT;
			case CODE_NOT_REACHABLE_VALUE: return CODE_NOT_REACHABLE;
			case REQUIRES_CONFIGURATION_VALUE: return REQUIRES_CONFIGURATION;
			case REQUIRES_DEPENDENCY_VALUE: return REQUIRES_DEPENDENCY;
			case REQUIRES_ENVIRONMENT_VALUE: return REQUIRES_ENVIRONMENT;
			case PROTECTED_BY_COMPILER_VALUE: return PROTECTED_BY_COMPILER;
			case PROTECTED_AT_RUNTIME_VALUE: return PROTECTED_AT_RUNTIME;
			case PROTECTED_AT_PERIMETER_VALUE: return PROTECTED_AT_PERIMETER;
			case PROTECTED_BY_MITIGATING_CONTROL_VALUE: return PROTECTED_BY_MITIGATING_CONTROL;
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
	private ImpactAnalysisJustificationType(int value, String name, String literal) {
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
	
} //ImpactAnalysisJustificationType
