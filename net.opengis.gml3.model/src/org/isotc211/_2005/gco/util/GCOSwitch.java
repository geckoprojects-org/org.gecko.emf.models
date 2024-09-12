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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.isotc211._2005.gco.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.isotc211._2005.gco.GCOPackage
 * @generated
 */
public class GCOSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GCOPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCOSwitch() {
		if (modelPackage == null) {
			modelPackage = GCOPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GCOPackage.ABSTRACT_OBJECT_TYPE: {
				AbstractObjectType abstractObjectType = (AbstractObjectType)theEObject;
				T result = caseAbstractObjectType(abstractObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.ANGLE_PROPERTY_TYPE: {
				AnglePropertyType anglePropertyType = (AnglePropertyType)theEObject;
				T result = caseAnglePropertyType(anglePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.BINARY_PROPERTY_TYPE: {
				BinaryPropertyType binaryPropertyType = (BinaryPropertyType)theEObject;
				T result = caseBinaryPropertyType(binaryPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.BINARY_TYPE: {
				BinaryType binaryType = (BinaryType)theEObject;
				T result = caseBinaryType(binaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.BOOLEAN_PROPERTY_TYPE: {
				BooleanPropertyType booleanPropertyType = (BooleanPropertyType)theEObject;
				T result = caseBooleanPropertyType(booleanPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE: {
				CharacterStringPropertyType characterStringPropertyType = (CharacterStringPropertyType)theEObject;
				T result = caseCharacterStringPropertyType(characterStringPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.CODE_LIST_VALUE_TYPE: {
				CodeListValueType codeListValueType = (CodeListValueType)theEObject;
				T result = caseCodeListValueType(codeListValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.DATE_PROPERTY_TYPE: {
				DatePropertyType datePropertyType = (DatePropertyType)theEObject;
				T result = caseDatePropertyType(datePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.DATE_TIME_PROPERTY_TYPE: {
				DateTimePropertyType dateTimePropertyType = (DateTimePropertyType)theEObject;
				T result = caseDateTimePropertyType(dateTimePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.DECIMAL_PROPERTY_TYPE: {
				DecimalPropertyType decimalPropertyType = (DecimalPropertyType)theEObject;
				T result = caseDecimalPropertyType(decimalPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.DISTANCE_PROPERTY_TYPE: {
				DistancePropertyType distancePropertyType = (DistancePropertyType)theEObject;
				T result = caseDistancePropertyType(distancePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE: {
				GenericNamePropertyType genericNamePropertyType = (GenericNamePropertyType)theEObject;
				T result = caseGenericNamePropertyType(genericNamePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.INTEGER_PROPERTY_TYPE: {
				IntegerPropertyType integerPropertyType = (IntegerPropertyType)theEObject;
				T result = caseIntegerPropertyType(integerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.LENGTH_PROPERTY_TYPE: {
				LengthPropertyType lengthPropertyType = (LengthPropertyType)theEObject;
				T result = caseLengthPropertyType(lengthPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.LOCAL_NAME_PROPERTY_TYPE: {
				LocalNamePropertyType localNamePropertyType = (LocalNamePropertyType)theEObject;
				T result = caseLocalNamePropertyType(localNamePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.MULTIPLICITY_PROPERTY_TYPE: {
				MultiplicityPropertyType multiplicityPropertyType = (MultiplicityPropertyType)theEObject;
				T result = caseMultiplicityPropertyType(multiplicityPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.MULTIPLICITY_RANGE_PROPERTY_TYPE: {
				MultiplicityRangePropertyType multiplicityRangePropertyType = (MultiplicityRangePropertyType)theEObject;
				T result = caseMultiplicityRangePropertyType(multiplicityRangePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.OBJECT_REFERENCE_PROPERTY_TYPE: {
				ObjectReferencePropertyType objectReferencePropertyType = (ObjectReferencePropertyType)theEObject;
				T result = caseObjectReferencePropertyType(objectReferencePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.REAL_PROPERTY_TYPE: {
				RealPropertyType realPropertyType = (RealPropertyType)theEObject;
				T result = caseRealPropertyType(realPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.MEASURE_PROPERTY_TYPE: {
				MeasurePropertyType measurePropertyType = (MeasurePropertyType)theEObject;
				T result = caseMeasurePropertyType(measurePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.MEMBER_NAME_PROPERTY_TYPE: {
				MemberNamePropertyType memberNamePropertyType = (MemberNamePropertyType)theEObject;
				T result = caseMemberNamePropertyType(memberNamePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.MEMBER_NAME_TYPE: {
				MemberNameType memberNameType = (MemberNameType)theEObject;
				T result = caseMemberNameType(memberNameType);
				if (result == null) result = caseAbstractObjectType(memberNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.MULTIPLICITY_RANGE_TYPE: {
				MultiplicityRangeType multiplicityRangeType = (MultiplicityRangeType)theEObject;
				T result = caseMultiplicityRangeType(multiplicityRangeType);
				if (result == null) result = caseAbstractObjectType(multiplicityRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.MULTIPLICITY_TYPE: {
				MultiplicityType multiplicityType = (MultiplicityType)theEObject;
				T result = caseMultiplicityType(multiplicityType);
				if (result == null) result = caseAbstractObjectType(multiplicityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.NUMBER_PROPERTY_TYPE: {
				NumberPropertyType numberPropertyType = (NumberPropertyType)theEObject;
				T result = caseNumberPropertyType(numberPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.RECORD_PROPERTY_TYPE: {
				RecordPropertyType recordPropertyType = (RecordPropertyType)theEObject;
				T result = caseRecordPropertyType(recordPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.RECORD_TYPE_PROPERTY_TYPE: {
				RecordTypePropertyType recordTypePropertyType = (RecordTypePropertyType)theEObject;
				T result = caseRecordTypePropertyType(recordTypePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.RECORD_TYPE_TYPE: {
				RecordTypeType recordTypeType = (RecordTypeType)theEObject;
				T result = caseRecordTypeType(recordTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.SCALE_PROPERTY_TYPE: {
				ScalePropertyType scalePropertyType = (ScalePropertyType)theEObject;
				T result = caseScalePropertyType(scalePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.SCOPED_NAME_PROPERTY_TYPE: {
				ScopedNamePropertyType scopedNamePropertyType = (ScopedNamePropertyType)theEObject;
				T result = caseScopedNamePropertyType(scopedNamePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.TYPE_NAME_PROPERTY_TYPE: {
				TypeNamePropertyType typeNamePropertyType = (TypeNamePropertyType)theEObject;
				T result = caseTypeNamePropertyType(typeNamePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.TYPE_NAME_TYPE: {
				TypeNameType typeNameType = (TypeNameType)theEObject;
				T result = caseTypeNameType(typeNameType);
				if (result == null) result = caseAbstractObjectType(typeNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.UNIT_OF_MEASURE_PROPERTY_TYPE: {
				UnitOfMeasurePropertyType unitOfMeasurePropertyType = (UnitOfMeasurePropertyType)theEObject;
				T result = caseUnitOfMeasurePropertyType(unitOfMeasurePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE: {
				UnlimitedIntegerPropertyType unlimitedIntegerPropertyType = (UnlimitedIntegerPropertyType)theEObject;
				T result = caseUnlimitedIntegerPropertyType(unlimitedIntegerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.UNLIMITED_INTEGER_TYPE: {
				UnlimitedIntegerType unlimitedIntegerType = (UnlimitedIntegerType)theEObject;
				T result = caseUnlimitedIntegerType(unlimitedIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.UOM_ANGLE_PROPERTY_TYPE: {
				UomAnglePropertyType uomAnglePropertyType = (UomAnglePropertyType)theEObject;
				T result = caseUomAnglePropertyType(uomAnglePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.UOM_AREA_PROPERTY_TYPE: {
				UomAreaPropertyType uomAreaPropertyType = (UomAreaPropertyType)theEObject;
				T result = caseUomAreaPropertyType(uomAreaPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.UOM_LENGTH_PROPERTY_TYPE: {
				UomLengthPropertyType uomLengthPropertyType = (UomLengthPropertyType)theEObject;
				T result = caseUomLengthPropertyType(uomLengthPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.UOM_SCALE_PROPERTY_TYPE: {
				UomScalePropertyType uomScalePropertyType = (UomScalePropertyType)theEObject;
				T result = caseUomScalePropertyType(uomScalePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.UOM_TIME_PROPERTY_TYPE: {
				UomTimePropertyType uomTimePropertyType = (UomTimePropertyType)theEObject;
				T result = caseUomTimePropertyType(uomTimePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.UOM_VELOCITY_PROPERTY_TYPE: {
				UomVelocityPropertyType uomVelocityPropertyType = (UomVelocityPropertyType)theEObject;
				T result = caseUomVelocityPropertyType(uomVelocityPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GCOPackage.UOM_VOLUME_PROPERTY_TYPE: {
				UomVolumePropertyType uomVolumePropertyType = (UomVolumePropertyType)theEObject;
				T result = caseUomVolumePropertyType(uomVolumePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractObjectType(AbstractObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnglePropertyType(AnglePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryPropertyType(BinaryPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryType(BinaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanPropertyType(BooleanPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character String Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character String Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterStringPropertyType(CharacterStringPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code List Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code List Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeListValueType(CodeListValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatePropertyType(DatePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimePropertyType(DateTimePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalPropertyType(DecimalPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Distance Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Distance Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDistancePropertyType(DistancePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Name Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Name Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericNamePropertyType(GenericNamePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerPropertyType(IntegerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthPropertyType(LengthPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Name Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Name Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalNamePropertyType(LocalNamePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityPropertyType(MultiplicityPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Range Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Range Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityRangePropertyType(MultiplicityRangePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Reference Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Reference Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectReferencePropertyType(ObjectReferencePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealPropertyType(RealPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurePropertyType(MeasurePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Name Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Name Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberNamePropertyType(MemberNamePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberNameType(MemberNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityRangeType(MultiplicityRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityType(MultiplicityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberPropertyType(NumberPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordPropertyType(RecordPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Type Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Type Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTypePropertyType(RecordTypePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTypeType(RecordTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalePropertyType(ScalePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Name Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Name Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedNamePropertyType(ScopedNamePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNamePropertyType(TypeNamePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeNameType(TypeNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Of Measure Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Of Measure Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitOfMeasurePropertyType(UnitOfMeasurePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unlimited Integer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unlimited Integer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnlimitedIntegerPropertyType(UnlimitedIntegerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unlimited Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unlimited Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnlimitedIntegerType(UnlimitedIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uom Angle Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uom Angle Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUomAnglePropertyType(UomAnglePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uom Area Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uom Area Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUomAreaPropertyType(UomAreaPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uom Length Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uom Length Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUomLengthPropertyType(UomLengthPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uom Scale Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uom Scale Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUomScalePropertyType(UomScalePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uom Time Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uom Time Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUomTimePropertyType(UomTimePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uom Velocity Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uom Velocity Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUomVelocityPropertyType(UomVelocityPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uom Volume Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uom Volume Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUomVolumePropertyType(UomVolumePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GCOSwitch
