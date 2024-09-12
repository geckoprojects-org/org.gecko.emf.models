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
package org.isotc211._2005.gco.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.isotc211._2005.gco.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GCOFactoryImpl extends EFactoryImpl implements GCOFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GCOFactory init() {
		try {
			GCOFactory theGCOFactory = (GCOFactory)EPackage.Registry.INSTANCE.getEFactory(GCOPackage.eNS_URI);
			if (theGCOFactory != null) {
				return theGCOFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GCOFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCOFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GCOPackage.ANGLE_PROPERTY_TYPE: return createAnglePropertyType();
			case GCOPackage.BINARY_PROPERTY_TYPE: return createBinaryPropertyType();
			case GCOPackage.BINARY_TYPE: return createBinaryType();
			case GCOPackage.BOOLEAN_PROPERTY_TYPE: return createBooleanPropertyType();
			case GCOPackage.CHARACTER_STRING_PROPERTY_TYPE: return createCharacterStringPropertyType();
			case GCOPackage.CODE_LIST_VALUE_TYPE: return createCodeListValueType();
			case GCOPackage.DATE_PROPERTY_TYPE: return createDatePropertyType();
			case GCOPackage.DATE_TIME_PROPERTY_TYPE: return createDateTimePropertyType();
			case GCOPackage.DECIMAL_PROPERTY_TYPE: return createDecimalPropertyType();
			case GCOPackage.DISTANCE_PROPERTY_TYPE: return createDistancePropertyType();
			case GCOPackage.GENERIC_NAME_PROPERTY_TYPE: return createGenericNamePropertyType();
			case GCOPackage.INTEGER_PROPERTY_TYPE: return createIntegerPropertyType();
			case GCOPackage.LENGTH_PROPERTY_TYPE: return createLengthPropertyType();
			case GCOPackage.LOCAL_NAME_PROPERTY_TYPE: return createLocalNamePropertyType();
			case GCOPackage.MULTIPLICITY_PROPERTY_TYPE: return createMultiplicityPropertyType();
			case GCOPackage.MULTIPLICITY_RANGE_PROPERTY_TYPE: return createMultiplicityRangePropertyType();
			case GCOPackage.OBJECT_REFERENCE_PROPERTY_TYPE: return createObjectReferencePropertyType();
			case GCOPackage.REAL_PROPERTY_TYPE: return createRealPropertyType();
			case GCOPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GCOPackage.MEASURE_PROPERTY_TYPE: return createMeasurePropertyType();
			case GCOPackage.MEMBER_NAME_PROPERTY_TYPE: return createMemberNamePropertyType();
			case GCOPackage.MEMBER_NAME_TYPE: return createMemberNameType();
			case GCOPackage.MULTIPLICITY_RANGE_TYPE: return createMultiplicityRangeType();
			case GCOPackage.MULTIPLICITY_TYPE: return createMultiplicityType();
			case GCOPackage.NUMBER_PROPERTY_TYPE: return createNumberPropertyType();
			case GCOPackage.RECORD_PROPERTY_TYPE: return createRecordPropertyType();
			case GCOPackage.RECORD_TYPE_PROPERTY_TYPE: return createRecordTypePropertyType();
			case GCOPackage.RECORD_TYPE_TYPE: return createRecordTypeType();
			case GCOPackage.SCALE_PROPERTY_TYPE: return createScalePropertyType();
			case GCOPackage.SCOPED_NAME_PROPERTY_TYPE: return createScopedNamePropertyType();
			case GCOPackage.TYPE_NAME_PROPERTY_TYPE: return createTypeNamePropertyType();
			case GCOPackage.TYPE_NAME_TYPE: return createTypeNameType();
			case GCOPackage.UNIT_OF_MEASURE_PROPERTY_TYPE: return createUnitOfMeasurePropertyType();
			case GCOPackage.UNLIMITED_INTEGER_PROPERTY_TYPE: return createUnlimitedIntegerPropertyType();
			case GCOPackage.UNLIMITED_INTEGER_TYPE: return createUnlimitedIntegerType();
			case GCOPackage.UOM_ANGLE_PROPERTY_TYPE: return createUomAnglePropertyType();
			case GCOPackage.UOM_AREA_PROPERTY_TYPE: return createUomAreaPropertyType();
			case GCOPackage.UOM_LENGTH_PROPERTY_TYPE: return createUomLengthPropertyType();
			case GCOPackage.UOM_SCALE_PROPERTY_TYPE: return createUomScalePropertyType();
			case GCOPackage.UOM_TIME_PROPERTY_TYPE: return createUomTimePropertyType();
			case GCOPackage.UOM_VELOCITY_PROPERTY_TYPE: return createUomVelocityPropertyType();
			case GCOPackage.UOM_VOLUME_PROPERTY_TYPE: return createUomVolumePropertyType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GCOPackage.DATE_TYPE:
				return createDateTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GCOPackage.DATE_TYPE:
				return convertDateTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnglePropertyType createAnglePropertyType() {
		AnglePropertyTypeImpl anglePropertyType = new AnglePropertyTypeImpl();
		return anglePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryPropertyType createBinaryPropertyType() {
		BinaryPropertyTypeImpl binaryPropertyType = new BinaryPropertyTypeImpl();
		return binaryPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryType createBinaryType() {
		BinaryTypeImpl binaryType = new BinaryTypeImpl();
		return binaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType createBooleanPropertyType() {
		BooleanPropertyTypeImpl booleanPropertyType = new BooleanPropertyTypeImpl();
		return booleanPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType createCharacterStringPropertyType() {
		CharacterStringPropertyTypeImpl characterStringPropertyType = new CharacterStringPropertyTypeImpl();
		return characterStringPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType createCodeListValueType() {
		CodeListValueTypeImpl codeListValueType = new CodeListValueTypeImpl();
		return codeListValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatePropertyType createDatePropertyType() {
		DatePropertyTypeImpl datePropertyType = new DatePropertyTypeImpl();
		return datePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTimePropertyType createDateTimePropertyType() {
		DateTimePropertyTypeImpl dateTimePropertyType = new DateTimePropertyTypeImpl();
		return dateTimePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalPropertyType createDecimalPropertyType() {
		DecimalPropertyTypeImpl decimalPropertyType = new DecimalPropertyTypeImpl();
		return decimalPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DistancePropertyType createDistancePropertyType() {
		DistancePropertyTypeImpl distancePropertyType = new DistancePropertyTypeImpl();
		return distancePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericNamePropertyType createGenericNamePropertyType() {
		GenericNamePropertyTypeImpl genericNamePropertyType = new GenericNamePropertyTypeImpl();
		return genericNamePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerPropertyType createIntegerPropertyType() {
		IntegerPropertyTypeImpl integerPropertyType = new IntegerPropertyTypeImpl();
		return integerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LengthPropertyType createLengthPropertyType() {
		LengthPropertyTypeImpl lengthPropertyType = new LengthPropertyTypeImpl();
		return lengthPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalNamePropertyType createLocalNamePropertyType() {
		LocalNamePropertyTypeImpl localNamePropertyType = new LocalNamePropertyTypeImpl();
		return localNamePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityPropertyType createMultiplicityPropertyType() {
		MultiplicityPropertyTypeImpl multiplicityPropertyType = new MultiplicityPropertyTypeImpl();
		return multiplicityPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityRangePropertyType createMultiplicityRangePropertyType() {
		MultiplicityRangePropertyTypeImpl multiplicityRangePropertyType = new MultiplicityRangePropertyTypeImpl();
		return multiplicityRangePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjectReferencePropertyType createObjectReferencePropertyType() {
		ObjectReferencePropertyTypeImpl objectReferencePropertyType = new ObjectReferencePropertyTypeImpl();
		return objectReferencePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealPropertyType createRealPropertyType() {
		RealPropertyTypeImpl realPropertyType = new RealPropertyTypeImpl();
		return realPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasurePropertyType createMeasurePropertyType() {
		MeasurePropertyTypeImpl measurePropertyType = new MeasurePropertyTypeImpl();
		return measurePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberNamePropertyType createMemberNamePropertyType() {
		MemberNamePropertyTypeImpl memberNamePropertyType = new MemberNamePropertyTypeImpl();
		return memberNamePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberNameType createMemberNameType() {
		MemberNameTypeImpl memberNameType = new MemberNameTypeImpl();
		return memberNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityRangeType createMultiplicityRangeType() {
		MultiplicityRangeTypeImpl multiplicityRangeType = new MultiplicityRangeTypeImpl();
		return multiplicityRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiplicityType createMultiplicityType() {
		MultiplicityTypeImpl multiplicityType = new MultiplicityTypeImpl();
		return multiplicityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberPropertyType createNumberPropertyType() {
		NumberPropertyTypeImpl numberPropertyType = new NumberPropertyTypeImpl();
		return numberPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordPropertyType createRecordPropertyType() {
		RecordPropertyTypeImpl recordPropertyType = new RecordPropertyTypeImpl();
		return recordPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordTypePropertyType createRecordTypePropertyType() {
		RecordTypePropertyTypeImpl recordTypePropertyType = new RecordTypePropertyTypeImpl();
		return recordTypePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecordTypeType createRecordTypeType() {
		RecordTypeTypeImpl recordTypeType = new RecordTypeTypeImpl();
		return recordTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalePropertyType createScalePropertyType() {
		ScalePropertyTypeImpl scalePropertyType = new ScalePropertyTypeImpl();
		return scalePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopedNamePropertyType createScopedNamePropertyType() {
		ScopedNamePropertyTypeImpl scopedNamePropertyType = new ScopedNamePropertyTypeImpl();
		return scopedNamePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeNamePropertyType createTypeNamePropertyType() {
		TypeNamePropertyTypeImpl typeNamePropertyType = new TypeNamePropertyTypeImpl();
		return typeNamePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeNameType createTypeNameType() {
		TypeNameTypeImpl typeNameType = new TypeNameTypeImpl();
		return typeNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitOfMeasurePropertyType createUnitOfMeasurePropertyType() {
		UnitOfMeasurePropertyTypeImpl unitOfMeasurePropertyType = new UnitOfMeasurePropertyTypeImpl();
		return unitOfMeasurePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlimitedIntegerPropertyType createUnlimitedIntegerPropertyType() {
		UnlimitedIntegerPropertyTypeImpl unlimitedIntegerPropertyType = new UnlimitedIntegerPropertyTypeImpl();
		return unlimitedIntegerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlimitedIntegerType createUnlimitedIntegerType() {
		UnlimitedIntegerTypeImpl unlimitedIntegerType = new UnlimitedIntegerTypeImpl();
		return unlimitedIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomAnglePropertyType createUomAnglePropertyType() {
		UomAnglePropertyTypeImpl uomAnglePropertyType = new UomAnglePropertyTypeImpl();
		return uomAnglePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomAreaPropertyType createUomAreaPropertyType() {
		UomAreaPropertyTypeImpl uomAreaPropertyType = new UomAreaPropertyTypeImpl();
		return uomAreaPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomLengthPropertyType createUomLengthPropertyType() {
		UomLengthPropertyTypeImpl uomLengthPropertyType = new UomLengthPropertyTypeImpl();
		return uomLengthPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomScalePropertyType createUomScalePropertyType() {
		UomScalePropertyTypeImpl uomScalePropertyType = new UomScalePropertyTypeImpl();
		return uomScalePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomTimePropertyType createUomTimePropertyType() {
		UomTimePropertyTypeImpl uomTimePropertyType = new UomTimePropertyTypeImpl();
		return uomTimePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomVelocityPropertyType createUomVelocityPropertyType() {
		UomVelocityPropertyTypeImpl uomVelocityPropertyType = new UomVelocityPropertyTypeImpl();
		return uomVelocityPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UomVolumePropertyType createUomVolumePropertyType() {
		UomVolumePropertyTypeImpl uomVolumePropertyType = new UomVolumePropertyTypeImpl();
		return uomVolumePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GCOPackage getGCOPackage() {
		return (GCOPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GCOPackage getPackage() {
		return GCOPackage.eINSTANCE;
	}

} //GCOFactoryImpl
