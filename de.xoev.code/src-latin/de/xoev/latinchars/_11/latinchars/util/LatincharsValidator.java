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
package de.xoev.latinchars._11.latinchars.util;

import de.xoev.latinchars._11.latinchars.*;

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
 * @see de.xoev.latinchars._11.latinchars.LatincharsPackage
 * @generated
 */
public class LatincharsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LatincharsValidator INSTANCE = new LatincharsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.xoev.latinchars._11.latinchars";

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
	public LatincharsValidator() {
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
	  return LatincharsPackage.eINSTANCE;
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
			case LatincharsPackage.STRING_LATIN:
				return validateStringLatin((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringLatin(String stringLatin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateStringLatin_Pattern(stringLatin, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateStringLatin_Pattern
	 */
	public static final  PatternMatcher [][] STRING_LATIN__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([\t-\n\r -~\u00a1-\u00ac\u00ae-\u0107\u010a-\u011b\u011e-\u0123\u0126-\u0131\u0134-\u015b\u015e-\u016b\u016e-\u017e\u018f\u01a0-\u01a1\u01af-\u01b0\u01b7\u01cd-\u01d4\u01de-\u01df\u01e4-\u01f0\u01f4-\u01f5\u01fa-\u01ff\u0218-\u021b\u021e-\u021f\u022a-\u022b\u022e-\u0233\u0259\u0292\u1e02-\u1e03\u1e0a-\u1e0b\u1e10-\u1e11\u1e1e-\u1e21\u1e24-\u1e27\u1e30-\u1e31\u1e40-\u1e41\u1e44-\u1e45\u1e56-\u1e57\u1e60-\u1e63\u1e6a-\u1e6b\u1e80-\u1e85\u1e8c-\u1e93\u1e9e\u1ea0-\u1ea7\u1eaa-\u1eac\u1eae-\u1ec1\u1ec4-\u1ed3\u1ed6-\u1edd\u1ee4-\u1ef9\u20ac])|(M\u0302|N\u0302|m\u0302|n\u0302|D\u0302|d\u0302|J\u030c|L\u0302|l\u0302))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>String Latin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringLatin_Pattern(String stringLatin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(LatincharsPackage.Literals.STRING_LATIN, stringLatin, STRING_LATIN__PATTERN__VALUES, diagnostics, context);
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

} //LatincharsValidator
