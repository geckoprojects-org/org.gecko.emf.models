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
package oasis.names.tc.ciq.xsdschema.xAL;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Premise Number Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getIndicator <em>Indicator</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberType <em>Number Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNumberType()
 * @model extendedMetaData="name='PremiseNumber_._type' kind='mixed'"
 * @generated
 */
@ProviderType
public interface PremiseNumberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNumberType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used by postal services to encode the name of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNumberType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

	/**
	 * Returns the value of the '<em><b>Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No. in House No.12, # in #12, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator</em>' attribute.
	 * @see #setIndicator(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNumberType_Indicator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Indicator'"
	 * @generated
	 */
	Object getIndicator();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getIndicator <em>Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator</em>' attribute.
	 * @see #getIndicator()
	 * @generated
	 */
	void setIndicator(Object value);

	/**
	 * Returns the value of the '<em><b>Indicator Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No. occurs before 12 No.12
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicator Occurrence</em>' attribute.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3
	 * @see #isSetIndicatorOccurrence()
	 * @see #unsetIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType3)
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNumberType_IndicatorOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='IndicatorOccurrence'"
	 * @generated
	 */
	IndicatorOccurrenceType3 getIndicatorOccurrence();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator Occurrence</em>' attribute.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.IndicatorOccurrenceType3
	 * @see #isSetIndicatorOccurrence()
	 * @see #unsetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @generated
	 */
	void setIndicatorOccurrence(IndicatorOccurrenceType3 value);

	/**
	 * Unsets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType3)
	 * @generated
	 */
	void unsetIndicatorOccurrence();

	/**
	 * Returns whether the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getIndicatorOccurrence <em>Indicator Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicator Occurrence</em>' attribute is set.
	 * @see #unsetIndicatorOccurrence()
	 * @see #getIndicatorOccurrence()
	 * @see #setIndicatorOccurrence(IndicatorOccurrenceType3)
	 * @generated
	 */
	boolean isSetIndicatorOccurrence();

	/**
	 * Returns the value of the '<em><b>Number Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Building 12-14 is "Range" and Building 12 is "Single"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Type</em>' attribute.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType
	 * @see #isSetNumberType()
	 * @see #unsetNumberType()
	 * @see #setNumberType(NumberTypeType)
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNumberType_NumberType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='NumberType'"
	 * @generated
	 */
	NumberTypeType getNumberType();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberType <em>Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Type</em>' attribute.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeType
	 * @see #isSetNumberType()
	 * @see #unsetNumberType()
	 * @see #getNumberType()
	 * @generated
	 */
	void setNumberType(NumberTypeType value);

	/**
	 * Unsets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberType <em>Number Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberType()
	 * @see #getNumberType()
	 * @see #setNumberType(NumberTypeType)
	 * @generated
	 */
	void unsetNumberType();

	/**
	 * Returns whether the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberType <em>Number Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Type</em>' attribute is set.
	 * @see #unsetNumberType()
	 * @see #getNumberType()
	 * @see #setNumberType(NumberTypeType)
	 * @generated
	 */
	boolean isSetNumberType();

	/**
	 * Returns the value of the '<em><b>Number Type Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 12 in BUILDING 12 occurs "after" premise type BUILDING
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Type Occurrence</em>' attribute.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1
	 * @see #isSetNumberTypeOccurrence()
	 * @see #unsetNumberTypeOccurrence()
	 * @see #setNumberTypeOccurrence(NumberTypeOccurrenceType1)
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNumberType_NumberTypeOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='NumberTypeOccurrence'"
	 * @generated
	 */
	NumberTypeOccurrenceType1 getNumberTypeOccurrence();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Type Occurrence</em>' attribute.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.NumberTypeOccurrenceType1
	 * @see #isSetNumberTypeOccurrence()
	 * @see #unsetNumberTypeOccurrence()
	 * @see #getNumberTypeOccurrence()
	 * @generated
	 */
	void setNumberTypeOccurrence(NumberTypeOccurrenceType1 value);

	/**
	 * Unsets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberTypeOccurrence()
	 * @see #getNumberTypeOccurrence()
	 * @see #setNumberTypeOccurrence(NumberTypeOccurrenceType1)
	 * @generated
	 */
	void unsetNumberTypeOccurrence();

	/**
	 * Returns whether the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getNumberTypeOccurrence <em>Number Type Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Type Occurrence</em>' attribute is set.
	 * @see #unsetNumberTypeOccurrence()
	 * @see #getNumberTypeOccurrence()
	 * @see #setNumberTypeOccurrence(NumberTypeOccurrenceType1)
	 * @generated
	 */
	boolean isSetNumberTypeOccurrence();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNumberType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNumberType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':7' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PremiseNumberType
