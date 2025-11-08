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
 * A representation of the literals of the enumeration '<em><b>Evidence Technique</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage#getEvidenceTechnique()
 * @model extendedMetaData="name='evidenceTechnique'"
 * @generated
 */
@ProviderType
public enum EvidenceTechnique implements Enumerator {
	/**
	 * The '<em><b>Source Code Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Examines the source code without executing it.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #SOURCE_CODE_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_CODE_ANALYSIS(0, "sourceCodeAnalysis", "source-code-analysis"),

	/**
	 * The '<em><b>Binary Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Examines a compiled binary through reverse engineering, typically via disassembly or bytecode reversal.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #BINARY_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY_ANALYSIS(1, "binaryAnalysis", "binary-analysis"),

	/**
	 * The '<em><b>Manifest Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Examines a package management system such as those used for building software or installing software.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #MANIFEST_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	MANIFEST_ANALYSIS(2, "manifestAnalysis", "manifest-analysis"),

	/**
	 * The '<em><b>Ast Fingerprint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Examines the Abstract Syntax Tree (AST) of source code or a compiled binary.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #AST_FINGERPRINT_VALUE
	 * @generated
	 * @ordered
	 */
	AST_FINGERPRINT(3, "astFingerprint", "ast-fingerprint"),

	/**
	 * The '<em><b>Hash Comparison</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Evaluates the cryptographic hash of a component against a set of pre-computed hashes of identified software.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #HASH_COMPARISON_VALUE
	 * @generated
	 * @ordered
	 */
	HASH_COMPARISON(4, "hashComparison", "hash-comparison"),

	/**
	 * The '<em><b>Instrumentation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Examines the call stack of running applications by intercepting and monitoring application logic without the need to modify the application.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #INSTRUMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	INSTRUMENTATION(5, "instrumentation", "instrumentation"),

	/**
	 * The '<em><b>Dynamic Analysis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Evaluates a running application.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #DYNAMIC_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMIC_ANALYSIS(6, "dynamicAnalysis", "dynamic-analysis"),

	/**
	 * The '<em><b>Filename</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Evaluates file name of a component against a set of known file names of identified software.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #FILENAME_VALUE
	 * @generated
	 * @ordered
	 */
	FILENAME(7, "filename", "filename"),

	/**
	 * The '<em><b>Attestation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A testimony to the accuracy of the identify of a component made by an individual or entity.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #ATTESTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ATTESTATION(8, "attestation", "attestation"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Any other technique.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(9, "other", "other");

	/**
	 * The '<em><b>Source Code Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Examines the source code without executing it.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #SOURCE_CODE_ANALYSIS
	 * @model name="sourceCodeAnalysis" literal="source-code-analysis"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_CODE_ANALYSIS_VALUE = 0;

	/**
	 * The '<em><b>Binary Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Examines a compiled binary through reverse engineering, typically via disassembly or bytecode reversal.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #BINARY_ANALYSIS
	 * @model name="binaryAnalysis" literal="binary-analysis"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_ANALYSIS_VALUE = 1;

	/**
	 * The '<em><b>Manifest Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Examines a package management system such as those used for building software or installing software.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #MANIFEST_ANALYSIS
	 * @model name="manifestAnalysis" literal="manifest-analysis"
	 * @generated
	 * @ordered
	 */
	public static final int MANIFEST_ANALYSIS_VALUE = 2;

	/**
	 * The '<em><b>Ast Fingerprint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Examines the Abstract Syntax Tree (AST) of source code or a compiled binary.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #AST_FINGERPRINT
	 * @model name="astFingerprint" literal="ast-fingerprint"
	 * @generated
	 * @ordered
	 */
	public static final int AST_FINGERPRINT_VALUE = 3;

	/**
	 * The '<em><b>Hash Comparison</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Evaluates the cryptographic hash of a component against a set of pre-computed hashes of identified software.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #HASH_COMPARISON
	 * @model name="hashComparison" literal="hash-comparison"
	 * @generated
	 * @ordered
	 */
	public static final int HASH_COMPARISON_VALUE = 4;

	/**
	 * The '<em><b>Instrumentation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Examines the call stack of running applications by intercepting and monitoring application logic without the need to modify the application.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #INSTRUMENTATION
	 * @model name="instrumentation"
	 * @generated
	 * @ordered
	 */
	public static final int INSTRUMENTATION_VALUE = 5;

	/**
	 * The '<em><b>Dynamic Analysis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Evaluates a running application.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #DYNAMIC_ANALYSIS
	 * @model name="dynamicAnalysis" literal="dynamic-analysis"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC_ANALYSIS_VALUE = 6;

	/**
	 * The '<em><b>Filename</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Evaluates file name of a component against a set of known file names of identified software.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #FILENAME
	 * @model name="filename"
	 * @generated
	 * @ordered
	 */
	public static final int FILENAME_VALUE = 7;

	/**
	 * The '<em><b>Attestation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         A testimony to the accuracy of the identify of a component made by an individual or entity.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #ATTESTATION
	 * @model name="attestation"
	 * @generated
	 * @ordered
	 */
	public static final int ATTESTATION_VALUE = 8;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Any other technique.
	 *                     
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 9;

	/**
	 * An array of all the '<em><b>Evidence Technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvidenceTechnique[] VALUES_ARRAY =
		new EvidenceTechnique[] {
			SOURCE_CODE_ANALYSIS,
			BINARY_ANALYSIS,
			MANIFEST_ANALYSIS,
			AST_FINGERPRINT,
			HASH_COMPARISON,
			INSTRUMENTATION,
			DYNAMIC_ANALYSIS,
			FILENAME,
			ATTESTATION,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Evidence Technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvidenceTechnique> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evidence Technique</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvidenceTechnique get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvidenceTechnique result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evidence Technique</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvidenceTechnique getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvidenceTechnique result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evidence Technique</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvidenceTechnique get(int value) {
		switch (value) {
			case SOURCE_CODE_ANALYSIS_VALUE: return SOURCE_CODE_ANALYSIS;
			case BINARY_ANALYSIS_VALUE: return BINARY_ANALYSIS;
			case MANIFEST_ANALYSIS_VALUE: return MANIFEST_ANALYSIS;
			case AST_FINGERPRINT_VALUE: return AST_FINGERPRINT;
			case HASH_COMPARISON_VALUE: return HASH_COMPARISON;
			case INSTRUMENTATION_VALUE: return INSTRUMENTATION;
			case DYNAMIC_ANALYSIS_VALUE: return DYNAMIC_ANALYSIS;
			case FILENAME_VALUE: return FILENAME;
			case ATTESTATION_VALUE: return ATTESTATION;
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
	private EvidenceTechnique(int value, String name, String literal) {
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
	
} //EvidenceTechnique
