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
 * A representation of the model object '<em><b>Premise Name Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getType <em>Type</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNameType()
 * @model extendedMetaData="name='PremiseName_._type' kind='mixed'"
 * @generated
 */
@ProviderType
public interface PremiseNameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNameType_Mixed()
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
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNameType_Code()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Code'"
	 * @generated
	 */
	Object getCode();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNameType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Type Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EGIS Building where EGIS occurs before Building, DES JARDINS occurs after COMPLEXE DES JARDINS
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Occurrence</em>' attribute.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1
	 * @see #isSetTypeOccurrence()
	 * @see #unsetTypeOccurrence()
	 * @see #setTypeOccurrence(TypeOccurrenceType1)
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNameType_TypeOccurrence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='TypeOccurrence'"
	 * @generated
	 */
	TypeOccurrenceType1 getTypeOccurrence();

	/**
	 * Sets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Occurrence</em>' attribute.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.TypeOccurrenceType1
	 * @see #isSetTypeOccurrence()
	 * @see #unsetTypeOccurrence()
	 * @see #getTypeOccurrence()
	 * @generated
	 */
	void setTypeOccurrence(TypeOccurrenceType1 value);

	/**
	 * Unsets the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeOccurrence()
	 * @see #getTypeOccurrence()
	 * @see #setTypeOccurrence(TypeOccurrenceType1)
	 * @generated
	 */
	void unsetTypeOccurrence();

	/**
	 * Returns whether the value of the '{@link oasis.names.tc.ciq.xsdschema.xAL.PremiseNameType#getTypeOccurrence <em>Type Occurrence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Occurrence</em>' attribute is set.
	 * @see #unsetTypeOccurrence()
	 * @see #getTypeOccurrence()
	 * @see #setTypeOccurrence(TypeOccurrenceType1)
	 * @generated
	 */
	boolean isSetTypeOccurrence();

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see oasis.names.tc.ciq.xsdschema.xAL.XALPackage#getPremiseNameType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':4' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // PremiseNameType
