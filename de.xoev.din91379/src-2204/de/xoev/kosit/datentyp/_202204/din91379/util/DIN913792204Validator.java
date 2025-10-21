/**
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
package de.xoev.kosit.datentyp._202204.din91379.util;

import de.xoev.kosit.datentyp._202204.din91379.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.xoev.kosit.datentyp._202204.din91379.DIN913792204Package
 * @generated
 */
public class DIN913792204Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DIN913792204Validator INSTANCE = new DIN913792204Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.xoev.kosit.datentyp._202204.din91379";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIN913792204Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DIN913792204Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DIN913792204Package.DATATYPE_A:
				return validateDatatypeA((String)value, diagnostics, context);
			case DIN913792204Package.DATATYPE_B:
				return validateDatatypeB((String)value, diagnostics, context);
			case DIN913792204Package.DATATYPE_C:
				return validateDatatypeC((String)value, diagnostics, context);
			case DIN913792204Package.DATATYPE_D:
				return validateDatatypeD((String)value, diagnostics, context);
			case DIN913792204Package.DATATYPE_E:
				return validateDatatypeE((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeA(String datatypeA, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatatypeA_Pattern(datatypeA, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatatypeA_Pattern
	 */
	public static final  PatternMatcher [][] DATATYPE_A__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("( |\'|[,-\\.]|[A-Z]|[`-z]|~|\u00a8|\u00b4|\u00b7|[\u00c0-\u00d6]|[\u00d8-\u00f6]|[\u00f8-\u017e]|[\u0187-\u0188]|\u018f|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c8|\u02cc|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|\u2019|\u2021|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\u00c7\u0306|\u00db\u0304|\u00e7\u0306|\u00fb\u0304|\u00ff\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Datatype A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeA_Pattern(String datatypeA, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DIN913792204Package.Literals.DATATYPE_A, datatypeA, DATATYPE_A__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeB(String datatypeB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatatypeB_Pattern(datatypeB, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatatypeB_Pattern
	 */
	public static final  PatternMatcher [][] DATATYPE_B__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([ -~]|[\u00a1-\u00a3]|\u00a5|[\u00a7-\u00ac]|[\u00ae-\u00b7]|[\u00b9-\u00bb]|[\u00bf-\u017e]|[\u0187-\u0188]|\u018f|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c8|\u02cc|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|\u2019|\u2021|\u20ac|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\u00c7\u0306|\u00db\u0304|\u00e7\u0306|\u00fb\u0304|\u00ff\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Datatype B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeB_Pattern(String datatypeB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DIN913792204Package.Literals.DATATYPE_B, datatypeB, DATATYPE_B__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeC(String datatypeC, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatatypeC_Pattern(datatypeC, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatatypeC_Pattern
	 */
	public static final  PatternMatcher [][] DATATYPE_C__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([\t-\n]|\r|[ -~]|[\u00a0-\u00ac]|[\u00ae-\u017e]|[\u0187-\u0188]|\u018f|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c8|\u02cc|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|\u2019|\u2021|\u20ac|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\u00c7\u0306|\u00db\u0304|\u00e7\u0306|\u00fb\u0304|\u00ff\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Datatype C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeC_Pattern(String datatypeC, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DIN913792204Package.Literals.DATATYPE_C, datatypeC, DATATYPE_C__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeD(String datatypeD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatatypeD_Pattern(datatypeD, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatatypeD_Pattern
	 */
	public static final  PatternMatcher [][] DATATYPE_D__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([ -~]|[\u00a1-\u00ac]|[\u00ae-\u017e]|[\u0187-\u0188]|\u018f|\u0192|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|\u02b0|\u02b3|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c6|\u02c8|\u02cc|\u02dc|\u02e2|\u0386|[\u0388-\u038a]|\u038c|[\u038e-\u03a1]|[\u03a3-\u03ce]|\u1d48|\u1d57|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|[\u2018-\u201a]|[\u201c-\u201e]|[\u2020-\u2021]|\u2026|\u2030|[\u2032-\u2033]|[\u2039-\u203a]|\u2070|[\u2074-\u2079]|[\u207f-\u2089]|\u20ac|\u2122|\u221e|[\u2264-\u2265]|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\u00c7\u0306|\u00db\u0304|\u00e7\u0306|\u00fb\u0304|\u00ff\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Datatype D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeD_Pattern(String datatypeD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DIN913792204Package.Literals.DATATYPE_D, datatypeD, DATATYPE_D__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeE(String datatypeE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDatatypeE_Pattern(datatypeE, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDatatypeE_Pattern
	 */
	public static final  PatternMatcher [][] DATATYPE_E__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([\t-\n]|\r|[ -~]|[\u00a0-\u00ac]|[\u00ae-\u017e]|[\u0187-\u0188]|\u018f|\u0192|\u0197|[\u01a0-\u01a1]|[\u01af-\u01b0]|\u01b7|[\u01cd-\u01dc]|[\u01de-\u01df]|[\u01e2-\u01f0]|[\u01f4-\u01f5]|[\u01f8-\u01ff]|[\u0212-\u0213]|[\u0218-\u021b]|[\u021e-\u021f]|[\u0227-\u0233]|\u0259|\u0268|\u0292|\u02b0|\u02b3|[\u02b9-\u02ba]|[\u02be-\u02bf]|\u02c6|\u02c8|\u02cc|\u02dc|\u02e2|\u0386|[\u0388-\u038a]|\u038c|[\u038e-\u03a1]|[\u03a3-\u03ce]|\u040d|[\u0410-\u042a]|\u042c|[\u042e-\u044a]|\u044c|[\u044e-\u044f]|\u045d|\u1d48|\u1d57|[\u1e02-\u1e03]|[\u1e06-\u1e07]|[\u1e0a-\u1e11]|\u1e17|[\u1e1c-\u1e2b]|[\u1e2f-\u1e37]|[\u1e3a-\u1e3b]|[\u1e40-\u1e49]|[\u1e52-\u1e5b]|[\u1e5e-\u1e63]|[\u1e6a-\u1e6f]|[\u1e80-\u1e87]|[\u1e8c-\u1e97]|\u1e9e|[\u1ea0-\u1ef9]|[\u2018-\u201a]|[\u201c-\u201e]|[\u2020-\u2021]|\u2026|\u2030|[\u2032-\u2033]|[\u2039-\u203a]|\u2070|[\u2074-\u2079]|[\u207f-\u2089]|\u20ac|\u2122|\u221e|[\u2264-\u2265]|A\u030b|C(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|D\u0302|F(\u0300|\u0304)|G\u0300|H(\u0304|\u0326|\u0331)|J(\u0301|\u030c)|K(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fH|\u035fh)|L(\u0302|\u0325|\u0325\u0304|\u0326)|M(\u0300|\u0302|\u0306|\u0310)|N(\u0302|\u0304|\u0306|\u0326)|P(\u0300|\u0304|\u0315|\u0323)|R(\u0306|\u0325|\u0325\u0304)|S(\u0300|\u0304|\u031b\u0304|\u0331)|T(\u0300|\u0304|\u0308|\u0315|\u031b)|U\u0307|Z(\u0300|\u0304|\u0306|\u0308|\u0327)|a\u030b|c(\u0300|\u0304|\u0306|\u0308|\u0315|\u0323|\u0326|\u0328\u0306)|d\u0302|f(\u0300|\u0304)|g\u0300|h(\u0304|\u0326)|j\u0301|k(\u0300|\u0302|\u0304|\u0307|\u0315|\u031b|\u0326|\u035fh)|l(\u0302|\u0325|\u0325\u0304|\u0326)|m(\u0300|\u0302|\u0306|\u0310)|n(\u0302|\u0304|\u0306|\u0326)|p(\u0300|\u0304|\u0315|\u0323)|r(\u0306|\u0325|\u0325\u0304)|s(\u0300|\u0304|\u031b\u0304|\u0331)|t(\u0300|\u0304|\u0315|\u031b)|u\u0307|z(\u0300|\u0304|\u0306|\u0308|\u0327)|\u00c7\u0306|\u00db\u0304|\u00e7\u0306|\u00fb\u0304|\u00ff\u0301|\u010c(\u0315|\u0323)|\u010d(\u0315|\u0323)|\u0113\u030d|\u012a\u0301|\u012b\u0301|\u014d\u030d|\u017d(\u0326|\u0327)|\u017e(\u0326|\u0327)|\u1e32\u0304|\u1e33\u0304|\u1e62\u0304|\u1e63\u0304|\u1e6c\u0304|\u1e6d\u0304|\u1ea0\u0308|\u1ea1\u0308|\u1ecc\u0308|\u1ecd\u0308|\u1ee4(\u0304|\u0308)|\u1ee5(\u0304|\u0308))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Datatype E</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeE_Pattern(String datatypeE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DIN913792204Package.Literals.DATATYPE_E, datatypeE, DATATYPE_E__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DIN913792204Validator
