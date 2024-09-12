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
package org.isotc211._2005.gco.util;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.isotc211._2005.gco.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.isotc211._2005.gco.GCOPackage
 * @generated
 */
public class GCOValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GCOValidator INSTANCE = new GCOValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.isotc211._2005.gco";

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
	public GCOValidator() {
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
	  return GCOPackage.eINSTANCE;
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
			case GCOPackage.ABSTRACT_OBJECT_TYPE:
				return validateAbstractObjectType((AbstractObjectType)value, diagnostics, context);
			case GCOPackage.ANGLE_PROPERTY_TYPE:
				return validateAnglePropertyType((AnglePropertyType)value, diagnostics, context);
			case GCOPackage.BINARY_PROPERTY_TYPE:
				return validateBinaryPropertyType((BinaryPropertyType)value, diagnostics, context);
			case GCOPackage.BINARY_TYPE:
				return validateBinaryType((BinaryType)value, diagnostics, context);
			case GCOPackage.BOOLEAN_PROPERTY_TYPE:
				return validateBooleanPropertyType((BooleanPropertyType)value, diagnostics, context);
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE:
				return validateCharacterStringPropertyType((CharacterStringPropertyType)value, diagnostics, context);
			case GCOPackage.CODE_LIST_VALUE_TYPE:
				return validateCodeListValueType((CodeListValueType)value, diagnostics, context);
			case GCOPackage.DATE_PROPERTY_TYPE:
				return validateDatePropertyType((DatePropertyType)value, diagnostics, context);
			case GCOPackage.DATE_TIME_PROPERTY_TYPE:
				return validateDateTimePropertyType((DateTimePropertyType)value, diagnostics, context);
			case GCOPackage.DECIMAL_PROPERTY_TYPE:
				return validateDecimalPropertyType((DecimalPropertyType)value, diagnostics, context);
			case GCOPackage.DISTANCE_PROPERTY_TYPE:
				return validateDistancePropertyType((DistancePropertyType)value, diagnostics, context);
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE:
				return validateGenericNamePropertyType((GenericNamePropertyType)value, diagnostics, context);
			case GCOPackage.INTEGER_PROPERTY_TYPE:
				return validateIntegerPropertyType((IntegerPropertyType)value, diagnostics, context);
			case GCOPackage.LENGTH_PROPERTY_TYPE:
				return validateLengthPropertyType((LengthPropertyType)value, diagnostics, context);
			case GCOPackage.LOCAL_NAME_PROPERTY_TYPE:
				return validateLocalNamePropertyType((LocalNamePropertyType)value, diagnostics, context);
			case GCOPackage.MULTIPLICITY_PROPERTY_TYPE:
				return validateMultiplicityPropertyType((MultiplicityPropertyType)value, diagnostics, context);
			case GCOPackage.MULTIPLICITY_RANGE_PROPERTY_TYPE:
				return validateMultiplicityRangePropertyType((MultiplicityRangePropertyType)value, diagnostics, context);
			case GCOPackage.OBJECT_REFERENCE_PROPERTY_TYPE:
				return validateObjectReferencePropertyType((ObjectReferencePropertyType)value, diagnostics, context);
			case GCOPackage.REAL_PROPERTY_TYPE:
				return validateRealPropertyType((RealPropertyType)value, diagnostics, context);
			case GCOPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case GCOPackage.MEASURE_PROPERTY_TYPE:
				return validateMeasurePropertyType((MeasurePropertyType)value, diagnostics, context);
			case GCOPackage.MEMBER_NAME_PROPERTY_TYPE:
				return validateMemberNamePropertyType((MemberNamePropertyType)value, diagnostics, context);
			case GCOPackage.MEMBER_NAME_TYPE:
				return validateMemberNameType((MemberNameType)value, diagnostics, context);
			case GCOPackage.MULTIPLICITY_RANGE_TYPE:
				return validateMultiplicityRangeType((MultiplicityRangeType)value, diagnostics, context);
			case GCOPackage.MULTIPLICITY_TYPE:
				return validateMultiplicityType((MultiplicityType)value, diagnostics, context);
			case GCOPackage.NUMBER_PROPERTY_TYPE:
				return validateNumberPropertyType((NumberPropertyType)value, diagnostics, context);
			case GCOPackage.RECORD_PROPERTY_TYPE:
				return validateRecordPropertyType((RecordPropertyType)value, diagnostics, context);
			case GCOPackage.RECORD_TYPE_PROPERTY_TYPE:
				return validateRecordTypePropertyType((RecordTypePropertyType)value, diagnostics, context);
			case GCOPackage.RECORD_TYPE_TYPE:
				return validateRecordTypeType((RecordTypeType)value, diagnostics, context);
			case GCOPackage.SCALE_PROPERTY_TYPE:
				return validateScalePropertyType((ScalePropertyType)value, diagnostics, context);
			case GCOPackage.SCOPED_NAME_PROPERTY_TYPE:
				return validateScopedNamePropertyType((ScopedNamePropertyType)value, diagnostics, context);
			case GCOPackage.TYPE_NAME_PROPERTY_TYPE:
				return validateTypeNamePropertyType((TypeNamePropertyType)value, diagnostics, context);
			case GCOPackage.TYPE_NAME_TYPE:
				return validateTypeNameType((TypeNameType)value, diagnostics, context);
			case GCOPackage.UNIT_OF_MEASURE_PROPERTY_TYPE:
				return validateUnitOfMeasurePropertyType((UnitOfMeasurePropertyType)value, diagnostics, context);
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE:
				return validateUnlimitedIntegerPropertyType((UnlimitedIntegerPropertyType)value, diagnostics, context);
			case GCOPackage.UNLIMITED_INTEGER_TYPE:
				return validateUnlimitedIntegerType((UnlimitedIntegerType)value, diagnostics, context);
			case GCOPackage.UOM_ANGLE_PROPERTY_TYPE:
				return validateUomAnglePropertyType((UomAnglePropertyType)value, diagnostics, context);
			case GCOPackage.UOM_AREA_PROPERTY_TYPE:
				return validateUomAreaPropertyType((UomAreaPropertyType)value, diagnostics, context);
			case GCOPackage.UOM_LENGTH_PROPERTY_TYPE:
				return validateUomLengthPropertyType((UomLengthPropertyType)value, diagnostics, context);
			case GCOPackage.UOM_SCALE_PROPERTY_TYPE:
				return validateUomScalePropertyType((UomScalePropertyType)value, diagnostics, context);
			case GCOPackage.UOM_TIME_PROPERTY_TYPE:
				return validateUomTimePropertyType((UomTimePropertyType)value, diagnostics, context);
			case GCOPackage.UOM_VELOCITY_PROPERTY_TYPE:
				return validateUomVelocityPropertyType((UomVelocityPropertyType)value, diagnostics, context);
			case GCOPackage.UOM_VOLUME_PROPERTY_TYPE:
				return validateUomVolumePropertyType((UomVolumePropertyType)value, diagnostics, context);
			case GCOPackage.DATE_TYPE:
				return validateDateType((XMLGregorianCalendar)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractObjectType(AbstractObjectType abstractObjectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractObjectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglePropertyType(AnglePropertyType anglePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(anglePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryPropertyType(BinaryPropertyType binaryPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryType(BinaryType binaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanPropertyType(BooleanPropertyType booleanPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacterStringPropertyType(CharacterStringPropertyType characterStringPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(characterStringPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeListValueType(CodeListValueType codeListValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeListValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatePropertyType(DatePropertyType datePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePropertyType(DateTimePropertyType dateTimePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTimePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPropertyType(DecimalPropertyType decimalPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decimalPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDistancePropertyType(DistancePropertyType distancePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(distancePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericNamePropertyType(GenericNamePropertyType genericNamePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericNamePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerPropertyType(IntegerPropertyType integerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthPropertyType(LengthPropertyType lengthPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lengthPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalNamePropertyType(LocalNamePropertyType localNamePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(localNamePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityPropertyType(MultiplicityPropertyType multiplicityPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiplicityPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityRangePropertyType(MultiplicityRangePropertyType multiplicityRangePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiplicityRangePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectReferencePropertyType(ObjectReferencePropertyType objectReferencePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectReferencePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealPropertyType(RealPropertyType realPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realPropertyType, diagnostics, context);
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
	public boolean validateMeasurePropertyType(MeasurePropertyType measurePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(measurePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberNamePropertyType(MemberNamePropertyType memberNamePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memberNamePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemberNameType(MemberNameType memberNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memberNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityRangeType(MultiplicityRangeType multiplicityRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiplicityRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityType(MultiplicityType multiplicityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiplicityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberPropertyType(NumberPropertyType numberPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordPropertyType(RecordPropertyType recordPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recordPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordTypePropertyType(RecordTypePropertyType recordTypePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recordTypePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRecordTypeType(RecordTypeType recordTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(recordTypeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalePropertyType(ScalePropertyType scalePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scalePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopedNamePropertyType(ScopedNamePropertyType scopedNamePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scopedNamePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeNamePropertyType(TypeNamePropertyType typeNamePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeNamePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeNameType(TypeNameType typeNameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeNameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitOfMeasurePropertyType(UnitOfMeasurePropertyType unitOfMeasurePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitOfMeasurePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedIntegerPropertyType(UnlimitedIntegerPropertyType unlimitedIntegerPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unlimitedIntegerPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlimitedIntegerType(UnlimitedIntegerType unlimitedIntegerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unlimitedIntegerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomAnglePropertyType(UomAnglePropertyType uomAnglePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uomAnglePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomAreaPropertyType(UomAreaPropertyType uomAreaPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uomAreaPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomLengthPropertyType(UomLengthPropertyType uomLengthPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uomLengthPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomScalePropertyType(UomScalePropertyType uomScalePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uomScalePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomTimePropertyType(UomTimePropertyType uomTimePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uomTimePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomVelocityPropertyType(UomVelocityPropertyType uomVelocityPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uomVelocityPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUomVolumePropertyType(UomVolumePropertyType uomVolumePropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uomVolumePropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType(XMLGregorianCalendar dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateType_MemberTypes(dateType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType_MemberTypes(XMLGregorianCalendar dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DATE.isInstance(dateType)) {
				if (xmlTypeValidator.validateDate(dateType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateType)) {
				if (xmlTypeValidator.validateGYearMonth(dateType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateType)) {
				if (xmlTypeValidator.validateGYear(dateType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DATE.isInstance(dateType)) {
				if (xmlTypeValidator.validateDate(dateType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateType)) {
				if (xmlTypeValidator.validateGYearMonth(dateType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateType)) {
				if (xmlTypeValidator.validateGYear(dateType, null, context)) return true;
			}
		}
		return false;
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

} //GCOValidator
