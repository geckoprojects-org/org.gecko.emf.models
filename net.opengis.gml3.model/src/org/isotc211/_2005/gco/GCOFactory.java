/*
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
package org.isotc211._2005.gco;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.isotc211._2005.gco.GCOPackage
 * @generated
 */
@ProviderType
public interface GCOFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GCOFactory eINSTANCE = org.isotc211._2005.gco.impl.GCOFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Angle Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Property Type</em>'.
	 * @generated
	 */
	AnglePropertyType createAnglePropertyType();

	/**
	 * Returns a new object of class '<em>Binary Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Property Type</em>'.
	 * @generated
	 */
	BinaryPropertyType createBinaryPropertyType();

	/**
	 * Returns a new object of class '<em>Binary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Type</em>'.
	 * @generated
	 */
	BinaryType createBinaryType();

	/**
	 * Returns a new object of class '<em>Boolean Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Property Type</em>'.
	 * @generated
	 */
	BooleanPropertyType createBooleanPropertyType();

	/**
	 * Returns a new object of class '<em>Character String Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Character String Property Type</em>'.
	 * @generated
	 */
	CharacterStringPropertyType createCharacterStringPropertyType();

	/**
	 * Returns a new object of class '<em>Code List Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code List Value Type</em>'.
	 * @generated
	 */
	CodeListValueType createCodeListValueType();

	/**
	 * Returns a new object of class '<em>Date Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Property Type</em>'.
	 * @generated
	 */
	DatePropertyType createDatePropertyType();

	/**
	 * Returns a new object of class '<em>Date Time Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Property Type</em>'.
	 * @generated
	 */
	DateTimePropertyType createDateTimePropertyType();

	/**
	 * Returns a new object of class '<em>Decimal Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Property Type</em>'.
	 * @generated
	 */
	DecimalPropertyType createDecimalPropertyType();

	/**
	 * Returns a new object of class '<em>Distance Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Distance Property Type</em>'.
	 * @generated
	 */
	DistancePropertyType createDistancePropertyType();

	/**
	 * Returns a new object of class '<em>Generic Name Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Name Property Type</em>'.
	 * @generated
	 */
	GenericNamePropertyType createGenericNamePropertyType();

	/**
	 * Returns a new object of class '<em>Integer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Property Type</em>'.
	 * @generated
	 */
	IntegerPropertyType createIntegerPropertyType();

	/**
	 * Returns a new object of class '<em>Length Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Property Type</em>'.
	 * @generated
	 */
	LengthPropertyType createLengthPropertyType();

	/**
	 * Returns a new object of class '<em>Local Name Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Name Property Type</em>'.
	 * @generated
	 */
	LocalNamePropertyType createLocalNamePropertyType();

	/**
	 * Returns a new object of class '<em>Multiplicity Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Property Type</em>'.
	 * @generated
	 */
	MultiplicityPropertyType createMultiplicityPropertyType();

	/**
	 * Returns a new object of class '<em>Multiplicity Range Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Range Property Type</em>'.
	 * @generated
	 */
	MultiplicityRangePropertyType createMultiplicityRangePropertyType();

	/**
	 * Returns a new object of class '<em>Object Reference Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Reference Property Type</em>'.
	 * @generated
	 */
	ObjectReferencePropertyType createObjectReferencePropertyType();

	/**
	 * Returns a new object of class '<em>Real Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Property Type</em>'.
	 * @generated
	 */
	RealPropertyType createRealPropertyType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Measure Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure Property Type</em>'.
	 * @generated
	 */
	MeasurePropertyType createMeasurePropertyType();

	/**
	 * Returns a new object of class '<em>Member Name Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Name Property Type</em>'.
	 * @generated
	 */
	MemberNamePropertyType createMemberNamePropertyType();

	/**
	 * Returns a new object of class '<em>Member Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member Name Type</em>'.
	 * @generated
	 */
	MemberNameType createMemberNameType();

	/**
	 * Returns a new object of class '<em>Multiplicity Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Range Type</em>'.
	 * @generated
	 */
	MultiplicityRangeType createMultiplicityRangeType();

	/**
	 * Returns a new object of class '<em>Multiplicity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicity Type</em>'.
	 * @generated
	 */
	MultiplicityType createMultiplicityType();

	/**
	 * Returns a new object of class '<em>Number Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Property Type</em>'.
	 * @generated
	 */
	NumberPropertyType createNumberPropertyType();

	/**
	 * Returns a new object of class '<em>Record Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Property Type</em>'.
	 * @generated
	 */
	RecordPropertyType createRecordPropertyType();

	/**
	 * Returns a new object of class '<em>Record Type Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Type Property Type</em>'.
	 * @generated
	 */
	RecordTypePropertyType createRecordTypePropertyType();

	/**
	 * Returns a new object of class '<em>Record Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Type Type</em>'.
	 * @generated
	 */
	RecordTypeType createRecordTypeType();

	/**
	 * Returns a new object of class '<em>Scale Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scale Property Type</em>'.
	 * @generated
	 */
	ScalePropertyType createScalePropertyType();

	/**
	 * Returns a new object of class '<em>Scoped Name Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scoped Name Property Type</em>'.
	 * @generated
	 */
	ScopedNamePropertyType createScopedNamePropertyType();

	/**
	 * Returns a new object of class '<em>Type Name Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Name Property Type</em>'.
	 * @generated
	 */
	TypeNamePropertyType createTypeNamePropertyType();

	/**
	 * Returns a new object of class '<em>Type Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Name Type</em>'.
	 * @generated
	 */
	TypeNameType createTypeNameType();

	/**
	 * Returns a new object of class '<em>Unit Of Measure Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Of Measure Property Type</em>'.
	 * @generated
	 */
	UnitOfMeasurePropertyType createUnitOfMeasurePropertyType();

	/**
	 * Returns a new object of class '<em>Unlimited Integer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unlimited Integer Property Type</em>'.
	 * @generated
	 */
	UnlimitedIntegerPropertyType createUnlimitedIntegerPropertyType();

	/**
	 * Returns a new object of class '<em>Unlimited Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unlimited Integer Type</em>'.
	 * @generated
	 */
	UnlimitedIntegerType createUnlimitedIntegerType();

	/**
	 * Returns a new object of class '<em>Uom Angle Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uom Angle Property Type</em>'.
	 * @generated
	 */
	UomAnglePropertyType createUomAnglePropertyType();

	/**
	 * Returns a new object of class '<em>Uom Area Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uom Area Property Type</em>'.
	 * @generated
	 */
	UomAreaPropertyType createUomAreaPropertyType();

	/**
	 * Returns a new object of class '<em>Uom Length Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uom Length Property Type</em>'.
	 * @generated
	 */
	UomLengthPropertyType createUomLengthPropertyType();

	/**
	 * Returns a new object of class '<em>Uom Scale Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uom Scale Property Type</em>'.
	 * @generated
	 */
	UomScalePropertyType createUomScalePropertyType();

	/**
	 * Returns a new object of class '<em>Uom Time Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uom Time Property Type</em>'.
	 * @generated
	 */
	UomTimePropertyType createUomTimePropertyType();

	/**
	 * Returns a new object of class '<em>Uom Velocity Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uom Velocity Property Type</em>'.
	 * @generated
	 */
	UomVelocityPropertyType createUomVelocityPropertyType();

	/**
	 * Returns a new object of class '<em>Uom Volume Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uom Volume Property Type</em>'.
	 * @generated
	 */
	UomVolumePropertyType createUomVolumePropertyType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GCOPackage getGCOPackage();

} //GCOFactory
