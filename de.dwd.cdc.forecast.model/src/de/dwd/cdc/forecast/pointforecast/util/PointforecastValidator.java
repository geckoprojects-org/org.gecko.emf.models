/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package de.dwd.cdc.forecast.pointforecast.util;

import de.dwd.cdc.forecast.pointforecast.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.dwd.cdc.forecast.pointforecast.PointforecastPackage
 * @generated
 */
public class PointforecastValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PointforecastValidator INSTANCE = new PointforecastValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.dwd.cdc.forecast.pointforecast";

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
	public PointforecastValidator() {
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
	  return PointforecastPackage.eINSTANCE;
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
			case PointforecastPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case PointforecastPackage.FORECAST_TIME_STEPS_TYPE:
				return validateForecastTimeStepsType((ForecastTimeStepsType)value, diagnostics, context);
			case PointforecastPackage.FORECAST_TYPE:
				return validateForecastType((ForecastType)value, diagnostics, context);
			case PointforecastPackage.FORMAT_CFG_TYPE:
				return validateFormatCfgType((FormatCfgType)value, diagnostics, context);
			case PointforecastPackage.MODEL_TYPE:
				return validateModelType((ModelType)value, diagnostics, context);
			case PointforecastPackage.PRODUCT_DEFINITION_TYPE:
				return validateProductDefinitionType((ProductDefinitionType)value, diagnostics, context);
			case PointforecastPackage.REFERENCED_MODEL_TYPE:
				return validateReferencedModelType((ReferencedModelType)value, diagnostics, context);
			case PointforecastPackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case PointforecastPackage.PRODUCT_ID_TYPE:
				return validateProductIDType((ProductIDType)value, diagnostics, context);
			case PointforecastPackage.FLOAT_LIST:
				return validateFloatList((List<?>)value, diagnostics, context);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN:
				return validateFloatWithNewUndefSign(value, diagnostics, context);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0:
				return validateFloatWithNewUndefSignMember0((Float)value, diagnostics, context);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0_OBJECT:
				return validateFloatWithNewUndefSignMember0Object((Float)value, diagnostics, context);
			case PointforecastPackage.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1:
				return validateFloatWithNewUndefSignMember1((String)value, diagnostics, context);
			case PointforecastPackage.PRODUCT_ID_TYPE_OBJECT:
				return validateProductIDTypeObject((ProductIDType)value, diagnostics, context);
			case PointforecastPackage.UNDEF_CHAR:
				return validateUndefChar((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForecastTimeStepsType(ForecastTimeStepsType forecastTimeStepsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forecastTimeStepsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForecastType(ForecastType forecastType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forecastType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormatCfgType(FormatCfgType formatCfgType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formatCfgType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelType(ModelType modelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductDefinitionType(ProductDefinitionType productDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencedModelType(ReferencedModelType referencedModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencedModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductIDType(ProductIDType productIDType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatList(List<?> floatList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFloatList_ItemType(floatList, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Float List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatList_ItemType(List<?> floatList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = floatList.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN.isInstance(item)) {
				result &= validateFloatWithNewUndefSign(item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatWithNewUndefSign(Object floatWithNewUndefSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFloatWithNewUndefSign_MemberTypes(floatWithNewUndefSign, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Float With New Undef Sign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatWithNewUndefSign_MemberTypes(Object floatWithNewUndefSign, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0.isInstance(floatWithNewUndefSign)) {
				if (validateFloatWithNewUndefSignMember0((Float)floatWithNewUndefSign, tempDiagnostics, context)) return true;
			}
			if (PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1.isInstance(floatWithNewUndefSign)) {
				if (validateFloatWithNewUndefSignMember1((String)floatWithNewUndefSign, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER0.isInstance(floatWithNewUndefSign)) {
				if (validateFloatWithNewUndefSignMember0((Float)floatWithNewUndefSign, null, context)) return true;
			}
			if (PointforecastPackage.Literals.FLOAT_WITH_NEW_UNDEF_SIGN_MEMBER1.isInstance(floatWithNewUndefSign)) {
				if (validateFloatWithNewUndefSignMember1((String)floatWithNewUndefSign, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatWithNewUndefSignMember0(float floatWithNewUndefSignMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatWithNewUndefSignMember0Object(Float floatWithNewUndefSignMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatWithNewUndefSignMember1(String floatWithNewUndefSignMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUndefChar_MinLength(floatWithNewUndefSignMember1, diagnostics, context);
		if (result || diagnostics != null) result &= validateUndefChar_MaxLength(floatWithNewUndefSignMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductIDTypeObject(ProductIDType productIDTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUndefChar(String undefChar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUndefChar_MinLength(undefChar, diagnostics, context);
		if (result || diagnostics != null) result &= validateUndefChar_MaxLength(undefChar, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Undef Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUndefChar_MinLength(String undefChar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = undefChar.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(PointforecastPackage.Literals.UNDEF_CHAR, undefChar, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Undef Char</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUndefChar_MaxLength(String undefChar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = undefChar.length();
		boolean result = length <= 1;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(PointforecastPackage.Literals.UNDEF_CHAR, undefChar, length, 1, diagnostics, context);
		return result;
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

} //PointforecastValidator
